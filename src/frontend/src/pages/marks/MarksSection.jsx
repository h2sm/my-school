import $ from "jquery";
import {Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow} from '@mui/material';
// import CustomModal from "../addon/CustomModal";
import SimpleTooltip from "../addon/SimpleTooltip";


export const MarksSection = () => {
    const TOKEN = "Bearer " + localStorage.getItem("jwtToken");
    let subjectsAndMarks = null;
    let subjectsMap = new Map;

    function createDataMap(subjectsAndMarksMap) {
        for (let subject of Object.keys(subjectsAndMarksMap)) {
            var marks = subjectsAndMarks[subject];
            subjectsMap.set(subject, marks);
        }
        return subjectsMap;
    }

    function doShit(map) {
        return (
            <TableContainer component={Paper}>
                <Table sx={{ minWidth: 650 }} aria-label="simple table">
                    <TableHead>
                        <TableRow>
                            <TableCell>Предмет</TableCell>
                            <TableCell align="left">Оценки</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {console.log(map)}
                        {Array.from(map).map(([key, [value]]) => (
                            <TableRow
                                key={key}
                                sx={{ '&:last-child td, &:last  -child th': { border: 0 } }}
                            >
                                <TableCell component="th" scope="row">{key}</TableCell>
                                <TableCell align="left">
                                    {console.log(value)}
                                    <SimpleTooltip obj={value}/>
                                </TableCell>
                                {/*<TableCell align="left">{key.description}</TableCell>*/}
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        );
    }

    const getMarks = () => {
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/marks/all",
            async: false,
            headers: {
                "Authorization": TOKEN,
            },
            success: function (response) {
                subjectsAndMarks = response;
            },
            error: function (d) {
                console.log(d);
            }
        });
    }
    //getMarks();
    //createDataMap(subjectsAndMarks)
   // doShit();
    return (
        <div>
            <h2>Успеваемость</h2>
            {getMarks()}
            {doShit(createDataMap(subjectsAndMarks))}
        </div>
    );

}
MarksSection.propTypes = {}