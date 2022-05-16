<template>
  <div class="addFrom">
    <form id="register" @submit="checkForm">
      <label>名前</label>
      <input type="text" v-model="friendDetail.name" />

      <label>誕生日</label>
      <input
        type="number"
        v-model.number="friendDetail.birthday"
        placeholder="例 19981122（半角数字８ケタ）"
      />

      <label>好きな食べ物</label>
      <input type="text" v-model="friendDetail.food" />
      <label>好きな動物</label>
      <input type="text" v-model="friendDetail.animal" />
      <label>コメント</label>
      <textarea
        v-model="friendDetail.comment"
        id="comment"
        cols="30"
        rows="5"
      ></textarea>
      <input type="submit" value="登録する">
    </form>

    <div>
      {{ friendDetail.name }}
      {{ friendDetail.birthday }}
      {{ friendDetail.food }}
      {{ friendDetail.animal }}
      {{ friendDetail.comment }}
    </div>
  </div>
</template>

<script>
export default {
  name: "addForm",
  data() {
    return {
      friendDetail: {
        id: null,
        name: null,
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
          console.log("sebmitted!")
      }
  }
};
</script>