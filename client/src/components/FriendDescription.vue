<template>
  <div class="description">
    <div>
      <p id="name">名前: </p><h1>{{ friendDetail.name }}</h1>
      <p>誕生日: {{ friendDetail.birthday }}</p>
      <p>好きな食べ物: {{ friendDetail.food }}</p>
      <p>好きな動物: {{ friendDetail.animal }}</p>
      <p>コメント: {{ friendDetail.comment }}</p>
    </div>
    <div class="btn">
      <previous-button :id="this.$route.params.id" @toPrevious="toPreviousFriend"/>
      <next-button :id="this.$route.params.id" :length="this.$route.params.length" @toNext="toNextFriend"/>
    </div>
  </div>
</template>

<script>
import ApiClient from '../api/index.js'
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
      '/friend/' + this.$route.params.id,
      res => this.friendDetail = res
      )
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
  }
};
</script>

<style scoped>
#id {
  display: inline;
}
</style>