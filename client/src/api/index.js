import axios from "axios";

export default class ApiClient {
    /*static createInstance() {
        const api = axios.create({
            baseURL: 'http://localhost:8081'
        })
    }*/

    static async get(url, callback) {
        const api = axios.create({
            baseURL: 'http://localhost:8081'
        })
        await api.get(url)
        .then(res => {
            return callback(res.data)
        })
        .catch (error => {
            const status = error.status;
            const message = error.message;
            console.log(`Error! HTTPstatus: ${status}  Message: ${message}`);
            return Promise.reject(error)
        })        
    }

    static async delete(url, callback) {
        const api = axios.create({
            baseURL: 'http://localhost:8081'
        })
        await api.delete(url)
        .then(res => {
            return callback(res.data)
        })
        .catch(error => {
            const status = error.status;
            const message = error.message;
            console.log(`Error! HTTPstatus: ${status}  Message: ${message}`);
            return Promise.reject(error)
        })
    }

    static async post(url, newFriend, callback = () => {}) {
        const api = axios.create({
            baseURL: 'http://localhost:8081'
        })
        await api.post(url, newFriend)
        .then(res => {
            return callback(res.data)
        })
        .catch(error => {
            const status = error.status;
            const message = error.message;
            console.log(`Error! HTTPstatus: ${status}  Message: ${message}`);
            return Promise.reject(error)
        })
    }

    static async put(url, updatedFriend, callback = () => {}) {
        const api = axios.create({
            baseURL: 'http://localhost:8081'
        })
        await api.post(url, updatedFriend)
        .then(res => {
            return callback(res.data)
        })
        .catch(error => {
            const status = error.status;
            const message = error.message;
            console.log(`Error! HTTPstatus: ${status}  Message: ${message}`);
            return Promise.reject(error)
        })
    }
}
