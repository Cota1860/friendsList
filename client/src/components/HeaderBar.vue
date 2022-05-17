<template>
  <div class="headerBar">
    <nav class="name-router">
      <router-link class="name-router" to="/" v-if="!(this.$route.path == '/')">Top Page</router-link>
    </nav>
    <h1 v-if="this.$route.path == '/'">FriendsList</h1>
  </div>
</template>

<script>
export default {
  name: "HeaderBar",
};
</script>

<style>
nav {
  display: flex;
  justify-content: center;
}
nav > a {
  display: block;
  width: fit-content;
  margin: 30px;
  text-decoration: none;
  color: #fff;
  background-color: #20b2aa;
  border-radius: 100vh;
  box-shadow:0 3px 0 0 rgb(47, 49, 48);
}
nav > a:hover {
  box-shadow: 10px;
  box-shadow:0 2px 0 0 #005400;
  transform: translateY(-2px);
}
</style>