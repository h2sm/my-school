import TimeTable from "react-timetable-events";
import {useState} from "react";
import $ from "jquery";
import PropTypes from "prop-types";

export const TimetableSection = ({token}) => {
    const [timetable, setTimetable] = useState(null);

    const getTimetable = () =>{
        console.log(token);
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/timetable",
            headers: {
                "Authorization": "Bearer " + localStorage.getItem("jwtToken")
            },
            // data: JSON.stringify(data),
            // contentType: "application/json",
            success: function (response) {
                setTimetable(response);
                console.log(response)
            },
            error: function (d) {
                console.log(d);
            }
        });
    }
    return timetable === null ? getTimetable() :timetable
    //     <TimeTable events={{
    //     monday: [
    //         {
    //             id: 1,
    //             name: "Custom Event 1",
    //             type: "custom",
    //             startTime: new Date("2018-02-23T11:30:00"),
    //             endTime: new Date("2018-02-23T13:30:00"),
    //         },
    //     ],
    //     tuesday: [],
    //     wednesday: [],
    //     thursday: [],
    //     friday: [],
    // }} style={{ height: '500px' }}>
    //
    // </TimeTable>
}
TimetableSection.propTypes={
    token: PropTypes.string,
}