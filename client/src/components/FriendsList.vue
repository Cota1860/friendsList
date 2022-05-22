<template>
  <div class="friendsList">
    <ul>
      <li v-for="friend in friends" :key="friend.frinedId">
        <router-link class="router-link" :to="{path: `/detail/${friend.friendId}/${friends.length}`, params: {friendId: friend.friendId, length: friends.length} }">{{ friend.friendName }}</router-link>
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
  },
  beforeUpdate(){
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
  padding-left: 0;
}
li {
  text-align: center;
  padding: 5px;
}

.router-link {
  text-decoration: none;
  color: black;
}

.router-link:hover {
  color:forestgreen;
}

</style>