<template>
  <div class="headerBar">
    <nav>
      <router-link to="/" v-if="!(this.$route.path == '/')">Top page</router-link>
    </nav>
    <h1 v-if="this.$route.path == '/'">FriendsList</h1>
  </div>
</template>

<script>
export default {
  name: "HeaderBar",
};
</script>