<template>
  <div class="previousBtn">
      <button @click="toPrevious" v-if="frinedId > 1">前の人へ</button>
  </div>
</template>

<script>
export default {
  name: "PreviousButton",
  props: ["frinedId"],
  methods: {
    toPrevious() {
        this.$emit('toPrevious');
    },
  },
};
</script>