import TimeTable from "react-timetable-events";
import $ from "jquery";
import PropTypes from "prop-types";

export const TimetableSection = () => {
    const TOKEN = "Bearer " + localStorage.getItem("jwtToken");
    let table = null;

    const getTimetable = () => {
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/timetable",
            headers: {
                "Authorization": TOKEN,
            },
            success: function (response) {
                table = response;
                console.log(response)
            },
            error: function (d) {
                console.log(d);
            }
        });
    }

    function renderTimetable() {
        if (table !== null) {
            return <TimeTable events={{
                     monday: [
                         {
                             id: 1,
                             name: "Custom Event 1",
                             type: "custom",
                             startTime: new Date("2018-02-23T11:30:00"),
                             endTime: new Date("2018-02-23T13:30:00"),
                         },
                    ],
                    tuesday: [],
                    wednesday:[],
                    thursday:[],
                    friday:[],
            }} style={{height: '500px', width:'500px'}}/>
        }
        console.log(table);
    }

    return table === null ? getTimetable() : renderTimetable()
}
TimetableSection.propTypes = {
}