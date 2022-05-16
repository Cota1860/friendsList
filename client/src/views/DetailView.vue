<template>
  <div class="detailPage">
    <header-bar/>
    <friend-description/>
  </div>
</template>

<script>
import HeaderBar from '@/components/HeaderBar.vue'
import FriendDescription from '@/components/FriendDescription.vue'

export default ({
  components: {
    HeaderBar,
    FriendDescription
  },
})
</script>

