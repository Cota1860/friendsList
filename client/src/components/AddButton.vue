<template>
    <div class="addBtn">
        <nav>
            <button @click="toAddPage">追加する</button>
        </nav>
    </div>
</template>

<script>
export default {
    name: 'addButton',
    methods: {
        toAddPage() {
            this.$router.push("/detail/add")
        }
    }
}
</script>