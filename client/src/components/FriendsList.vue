<template>
  <div class="friendsList">
    <ul>
      <li v-for="friend in friends" :key="friend.id">
        <router-link :to="{path: `/detail/${friend.id}/${friends.length}`, params: {id: friend.id, length: friends.length} }">{{ friend.id }} {{ friend.name }}</router-link>
      </li>
    </ul>
  </div>
</template>

<script>
import ApiClient from '../api/index.js'

export default {
   name: 'FriendsList',
    data() {
    return {
      friends: {},
    }
  },
  created() {
    ApiClient.get(
      '/friend',
      res => this.friends = res
      )
  }
}
</script>

<style scoped>
ul {
  list-style: none;
}
</style>