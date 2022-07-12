import PropTypes from "prop-types";
import {useState} from "react";
import $ from 'jquery';

export const Login = ({setToken}) => {
    const [login, setLogin] = useState('')
    const [password, setPassword] = useState('')

    function handleLogin(e) {
        setLogin(e.target.value);
    }

    function handlePassword(e){
        setPassword(e.target.value);
    }

    function handleSubmit(event) {
        const data = {
            username: login,
            password: password,
            rememberMe: true,
        };
        console.log(data);
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/authenticate",
            data: JSON.stringify(data),
            contentType: "application/json",
            success: function (response) {
                localStorage.setItem("jwtToken", response.id_token);
                setToken(response.id_token);
            },
            error: function (d) {
                setToken('');
                console.log(d);
            }
        });
        setToken(true);
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
    setToken: PropTypes.string,
}