<template>
  <div>
    <svg-icon icon-class="question" @click="goto"/>
  </div>
</template>

<script>
export default {
  name: 'LCMSDoc',
  data() {
    return {
      url: 'http://doc.longjinbin.vip/longjinbin-vue'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>