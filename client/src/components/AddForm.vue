<template>
  <div class="addFrom">
    <form id="register" @submit="checkForm">
      <label>名前</label>
      <input type="text" v-model="newFriendDetail.friendName" />

      <label>誕生日</label>
      <input
        type="number"
        v-model.number="newFriendDetail.birthday"
        placeholder="例 19981122（半角数字８ケタ）"
      />

      <label>好きな食べ物</label>
      <input type="text" v-model="newFriendDetail.food" />
      <label>好きな動物</label>
      <input type="text" v-model="newFriendDetail.animal" />
      <label>コメント</label>
      <textarea
        v-model="newFriendDetail.comment"
        id="comment"
        cols="30"
        rows="5"
      ></textarea>
      <input type="submit" value="登録する" @click="registerFriend">
    </form>

    <div>
      {{ newFriendDetail.friendName }}
      {{ newFriendDetail.birthday }}
      {{ newFriendDetail.food }}
      {{ newFriendDetail.animal }}
      {{ newFriendDetail.comment }}
    </div>
  </div>
</template>

<script>
import ApiClient from '@/api';
export default {
  name: "addForm",
  data() {
    return {
      newFriendDetail: {
        friendName: null,
        birthday: null,
        food: null,
        animal: null,
        comment: null,
      },
      errors: []
    };
  },
  methods: {
      checkForm () {
          console.log("submitted!")
      },
      registerFriend() {
        ApiClient.post("/friend/add", this.newFriendDetail);
        this.$router.push("/");
      }
  }
};
</script>