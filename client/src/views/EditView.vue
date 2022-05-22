<template>
  <div class="editPage">
    <header-bar />
    <h1>Edit Page</h1>
    <p>{{ this.$route.params.friendId }}</p>
    <form id="update">
      <label>名前</label>
      <input type="text" v-model="upadatedFriend.friendName" />

      <label>誕生日</label>
      <input
        type="number"
        v-model.number="upadatedFriend.birthday"
        placeholder="例 19981122（半角数字８ケタ）"
      />

      <label>好きな食べ物</label>
      <input type="text" v-model="upadatedFriend.food" />
      <label>好きな動物</label>
      <input type="text" v-model="upadatedFriend.animal" />
      <label>コメント</label>
      <textarea
        v-model="upadatedFriend.comment"
        id="comment"
        cols="30"
        rows="5"
      ></textarea>
      <input type="submit" value="更新する" @click="updateFriend">
    </form>

    <div>{{ upadatedFriend.friendName }}</div>
  </div>
</template>

<script>
import HeaderBar from "@/components/HeaderBar.vue";
import ApiClient from '@/api';

export default {
  components: {
    HeaderBar,
  },
  data() {
    return {
      upadatedFriend: {
        friendName: null,
        birthday: null,
        food: null,
        animal: null,
        comment: null
      }
    }
  },
  methods: {
    updateFriend() {
        ApiClient.put(`/friend/${this.$route.params.friendId}/edit`, this.upadatedFriend);
        this.$router.push("/");
    }
  }
};
</script>



