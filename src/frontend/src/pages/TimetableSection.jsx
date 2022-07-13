import TimeTable from "react-timetable-events";
import $ from "jquery";

export const TimetableSection = () => {
    const TOKEN = "Bearer " + localStorage.getItem("jwtToken");
    let table = null;

    function parseTableDay(table) {
        console.log(table)
        table.forEach(i => {
            i.endTime = new Date(i.endTime).toUTCString();
            i.startTime = new Date(i.startTime).toUTCString();
        })
        console.log(table)
        return table;
    }

    const getTimetable = () => {
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/timetable",
            async: false,
            headers: {
                "Authorization": TOKEN,
            },
            success: function (response) {
                table = response;
            },
            error: function (d) {
                console.log(d);
            }
        });
        return <div>
            <h2 style={{textAlign: "center"}}> Расписание</h2>
            <table cellPadding={5} style={{fontSize: 15}} border={2}>
                <tbody>
                <tr>
                    <th>Понедельник</th>
                    <th>Вторник</th>
                    <th>Среда</th>
                    <th>Четверг</th>
                    <th>Пятница</th>
                    <th>Суббота</th>
                    <th>Воскресенье</th>
                </tr>
                <tr>
                    <th>
                        {table.monday.map((item, i) => (
                            <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>
                        ))}
                    </th>
                    <th>
                        {table.tuesday.map((item, i) => (
                            <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>
                        ))}
                    </th>
                    <th>
                        {table.wednesday.map((item, i) => (
                            <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>
                        ))}
                    </th>
                    <th>
                        {table.thursday.map((item, i) => (
                            <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>
                        ))}
                    </th>
                    <th>
                        {table.friday.map((item, i) => (
                            <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>
                        ))}
                    </th>
                    <th>
                        {/*{table.friday.map((item, i) => (*/}
                        {/*    <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>*/}
                        {/*))}*/}
                    </th>
                    <th>
                        {/*{table.friday.map((item, i) => (*/}
                        {/*    <a>{item.name.subjectName}<br/> {item.startTime} - {item.endTime} <br/></a>*/}
                        {/*))}*/}
                    </th>
                </tr>
                </tbody>
            </table>
        </div>
    }
    return getTimetable();
}
TimetableSection.propTypes = {}