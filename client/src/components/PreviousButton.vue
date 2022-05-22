<template>
  <div class="previousBtn">
      <button @click="toPrevious" v-if="friendId > 1">前の人へ</button>
  </div>
</template>

<script>
export default {
  name: "PreviousButton",
  props: ["friendId"],
  methods: {
    toPrevious() {
        this.$emit('toPrevious');
    },
  },
};
</script>