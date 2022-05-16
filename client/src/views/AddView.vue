<template>
  <div class="addPage">
    <header-bar />
    <h1>Add Page</h1>
    <add-form/>

  </div>
</template>

<script>
import HeaderBar from "@/components/HeaderBar.vue";
import AddForm from '@/components/AddForm.vue';
export default {
  components: {
    HeaderBar,
    AddForm,
  },
};
</script>

