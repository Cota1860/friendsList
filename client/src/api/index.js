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
}
