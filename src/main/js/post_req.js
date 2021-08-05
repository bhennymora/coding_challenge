import axios from 'axios';

export const post_req = (data) => {
    return new Promise((resolve, reject) => {
        const url = 'http://localhost:8080/analyse'
        const header = {
            "Content-Type": "application/json"
        }
        axios({
            method: 'post',
            url: url,
            data: data,
            headers: header
        })
        .then((res)=>{resolve(res);})
                .catch((err)=>{reject(err);})
        })
};
