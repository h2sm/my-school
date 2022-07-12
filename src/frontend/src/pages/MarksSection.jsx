import PropTypes from 'prop-types';
import $ from "jquery";

export const MarksSection = () => {
    const TOKEN = "Bearer " + localStorage.getItem("jwtToken");
    let marks = null;

    const getMarks = () => {
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/marks/all",
            async: false,
            headers: {
                "Authorization": TOKEN,
            },
            success: function (response) {
                marks = response;
                console.log(response);
            },
            error: function (d) {
                console.log(d);
            }
        });
    }
    getMarks();
    console.log(marks);
}
MarksSection.propTypes = {}