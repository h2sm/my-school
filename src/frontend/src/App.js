import logo from './logo.svg';
import './App.css';
import {TimetableSection} from "./pages/TimetableSection";
import {Login} from "./pages/login/Login";
import {useState} from "react";

function App() {
    const [logged, setLogged] = useState(false);
    if (logged === false) {
        return (
            <div className="App">
                <header className="App-header">
                    <Login setLogged={setLogged}/>
                </header>
            </div>
        );
    } else {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <p>
                        Edit <code>src/App.js</code> and save to reload.
                    </p>
                    <TimetableSection/>
                </header>
            </div>
        );
    }
}

export default App;
