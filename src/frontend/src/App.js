import logo from './logo.svg';
import './App.css';
import {TimetableSection} from "./pages/TimetableSection";
import {Login} from "./pages/login/Login";
import {useState} from "react";
import {MarksSection} from "./pages/MarksSection";

function App() {
    const [token, setToken] = useState('');
    if (token === '') {
        return (
            <div className="App">
                <header className="App-header">
                    <Login setToken={setToken}/>
                </header>
            </div>
        );
    } else {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <TimetableSection token={token}/>
                    <MarksSection/>
                </header>
            </div>
        );
    }
}

export default App;
