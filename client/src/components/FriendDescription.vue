<template>
  <div class="description">
    <div class="detail">
      <div class="tag">
        <p class="name-tag">名前:</p>
        <p>誕生日:</p>
        <p>好きな食べ物:</p>
        <p>好きな動物:</p>
        <p>コメント:</p>
      </div>
      <div class="content">
        <p class="name">{{ friendDetail.name }}</p>
        <p>{{ friendDetail.birthday }}</p>
        <p>{{ friendDetail.food }}</p>
        <p>{{ friendDetail.animal }}</p>
        <p>{{ friendDetail.comment }}</p>
      </div>
    </div>
    
    <div class="btn-div">
      <previous-button
        :id="this.$route.params.id"
        @toPrevious="toPreviousFriend"
        class="btn"
      />
      <next-button
        :id="this.$route.params.id"
        :length="this.$route.params.length"
        @toNext="toNextFriend"
        class="btn"
      />
    </div>
  </div>
</template>

<script>
import ApiClient from "../api/index.js";
import NextButton from "@/components/NextButton.vue";
import PreviousButton from "@/components/PreviousButton.vue";

export default {
  name: "FriendDescription",
  components: {
    NextButton,
    PreviousButton,
  },
  data() {
    return {
      friendDetail: {},
    };
  },
  methods: {
    getDetail() {
      ApiClient.get(
        "/friend/" + this.$route.params.id,
        (res) => (this.friendDetail = res)
      );
    },
    toPreviousFriend() {
      const previousId = Number(this.$route.params.id) - 1;
      this.$router.push(`/detail/${previousId}/${this.$route.params.length}`);
      this.getDetail(previousId);
    },
    toNextFriend() {
      const nextId = Number(this.$route.params.id) + 1;
      this.$router.push(`/detail/${nextId}/${this.$route.params.length}`);
      this.getDetail(nextId);
    },
  },
  created() {
    this.getDetail();
  },
};
</script>

<style>
.detail {
  display: flex;
}

.tag {
  width: 40%;
  text-align: right;
  padding-right: 20px;
}
.content {
  width: 60%;
  text-align: left;
  
}

.name-tag {
  margin-bottom: 20px;
}

.name {
  font-size: 30px;
  margin: 0;
}
.btn-div {
  display: flex;
  justify-content: center;
}
.btn > button {
  color: #fff;
  background-color: #20b2aa;
  border-radius: 100vh;
  border: none;
}
</style>