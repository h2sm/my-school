import TimeTable from "react-timetable-events";

export const TimetableSection = ({}) => {
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
        wednesday: [],
        thursday: [],
        friday: [],
    }} style={{ height: '500px' }}>

    </TimeTable>
}