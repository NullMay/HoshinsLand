import axios from "axios";
import {AUTH_ERROR, AUTH_REQUEST, AUTH_SUCCESS} from "@/constants/mutationNames";

export default {
    state: {
        loading: false,
        status: '',
        user: {},
    },
    namespaced: true,
    mutations: {
        [AUTH_REQUEST]: state => {
            state.loading = true;
            console.log(state);
        },
        [AUTH_SUCCESS]: (state, payload) => {
            state.loading = false;
            state.status = 'success';
            state.user = payload;
            console.log(state);
        },
        [AUTH_ERROR]: state => {
            state.loading = false;
            state.status = 'error';
            state.user = {}
            console.log(state);
        }
    },
    actions: {
        async register ({commit}, user) {
            try {
                commit(AUTH_REQUEST)
                await axios.post('http://localhost:8080/registration', user);
                commit(AUTH_SUCCESS, user)
            } catch (e) {
                commit(AUTH_ERROR)
            }
        }
    }
}