<template>
  <div class="registration">
    <form @submit.prevent="register">
      <label>
        <p class="label-txt">ENTER YOUR EMAIL</p>
        <input type="text" class="input" v-model="email">
        <div class="line-box">
          <div class="line"></div>
        </div>
      </label>
      <label>
        <p class="label-txt">ENTER YOUR NAME</p>
        <input type="text" class="input" v-model="name">
        <div class="line-box">
          <div class="line"></div>
        </div>
      </label>
      <label>
        <p class="label-txt">ENTER YOUR PASSWORD</p>
        <input type="password" class="input" v-model="password">
        <div class="line-box">
          <div class="line"></div>
        </div>
      </label>
      <button class="btn btn-success" type="submit">Register</button>
    </form>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        name: "",
        email: "",
        password: "",
      }
    },
    name: 'Registration',
    methods: {
      register: async function () {
        let data = {
          username: this.name,
          email: this.email,
          password: this.password,
        }
        await this.$store.dispatch('auth/register', data);
      }
    }

  }
</script>

<style>
  body {
    background: #c9e5aa;
  }
  form {
    width: 30%;
    margin: auto;
    background: #efefef;
    padding: 60px 120px 80px 120px;
    text-align: center;
    -webkit-box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
    box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
  }
  label {
    display: block;
    position: relative;
    margin: 40px 0px;
  }
  .label-txt {
    position: absolute;
    top: -1.6em;
    padding: 10px;
    font-family: sans-serif;
    font-size: .8em;
    letter-spacing: 1px;
    color: rgb(120,120,120);
    transition: ease .3s;
  }
  .input {
    width: 100%;
    padding: 10px;
    background: transparent;
    border: none;
    outline: none;
  }

  .line-box {
    position: relative;
    width: 100%;
    height: 2px;
    background: #BCBCBC;
  }

  .line {
    position: absolute;
    width: 0%;
    height: 2px;
    top: 0px;
    left: 50%;
    transform: translateX(-50%);
    background: #8BC34A;
    transition: ease .6s;
  }
  .btn:focus {
    outline: none;
    box-shadow: none;
  }
  .input:focus + .line-box .line {
    width: 100%;

}

</style>
