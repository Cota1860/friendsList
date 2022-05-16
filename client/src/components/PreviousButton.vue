<template>
  <div class="previousBtn">
      <button @click="toPrevious" v-if="id > 1">前の人へ</button>
  </div>
</template>

<script>
export default {
  name: "PreviousButton",
  props: ["id"],
  methods: {
    toPrevious() {
        this.$emit('toPrevious');
    },
  },
};
</script>