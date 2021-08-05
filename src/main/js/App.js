import React, { Component } from "react";
import ReactDOM from "react-dom";
import { post_req } from "./post_req";

export class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            myList: {}
        };
    }
    componentDidMount() {
        let data = {
            identifier: "1",
            startDateTime: "2021-08-05T08:28:44+00:00",
            endDateTime: "2021-08-05T08:28:44+00:00",
            stockPrices: [
                10, 7, 5, 8, 11, 9
            ]
        }
        post_req(data)
            .then((resp)=>{this.setState({myList:resp.data})})
            .catch((err)=>{console.log('here is my err',err)})
    }
    render() {
        return (
            <div>
                Buy: {this.state.myList.buy} <br/>
                Sell: {this.state.myList.sell} <br/>
                Profit: {this.state.myList.profit} <br/>
            </div>
        )
    }
}

export default App;

ReactDOM.render(<App />, document.querySelector("#app"));