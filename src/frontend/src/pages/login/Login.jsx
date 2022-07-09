import PropTypes from "prop-types";
import {useState} from "react";

export const Login = ({setLogged}) => {
    const [login, setLogin] = useState('')
    const [password, setPassword] = useState('')

    function handleLogin(e) {
        setLogin(e.target.value);
    }

    function handlePassword(e){
        setPassword(e.target.value);
    }

    function handleSubmit(event) {
        alert('Отправленное: ' + login + ' ' + password);
        setLogged(true);
        event.preventDefault();
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                Имя:
                <input type="text" value={login} onChange={handleLogin}/>
            </label>
            <p/>
            <label>
                Пароль:
                <input type="password" value={password} onChange={handlePassword}/>
            </label>
            <p/>
            <input type="submit" value="Отправить"/>
        </form>
    );

}

Login.propTypes = {
    setLogged: PropTypes.func,
}