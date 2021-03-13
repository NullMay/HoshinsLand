import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import store from './store/index.js'

const app = createApp(App);
app.use(store, axios);
app.use(router);
app.mount('#app')
