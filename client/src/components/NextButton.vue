<template>
  <div class="nextBtn">
      <button @click="toNext" v-show="friendNumber">次の人へ</button>
  </div>
</template>

<script>
export default {
  name: "NextButton",
  props: ["friendId", "length"],
  methods: {
    toNext() {
        this.$emit('toNext');
    },
  },
  computed: {
    friendNumber: function() {
      if (Number(this.friendId) >= Number(this.length)) {
        return false;
      } else {
        return true;
      }
    }
  }
};
</script>