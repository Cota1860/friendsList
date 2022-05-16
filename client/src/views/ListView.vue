<template>
  <div class="listpage">
    <header-bar/>
    <add-button/>
    <friends-list/>
  </div>
</template>

<script>
import HeaderBar from '@/components/HeaderBar.vue'
import FriendsList from '@/components/FriendsList.vue'
import AddButton from '@/components/AddButton.vue'

export default {
  components: {
    HeaderBar,
    FriendsList,
    AddButton
  },
}
</script>


