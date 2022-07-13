import $ from "jquery";
import {Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow} from '@mui/material';


export const MarksSection = () => {
    const TOKEN = "Bearer " + localStorage.getItem("jwtToken");
    let marks = null;

    function createData(
        subject: string,
        marks: number[],
    ) {
        return { subject, marks };
    }
    const rows = [
        createData('Матеша', [159, 6.0, 24, 4.0]),
        createData('Англиш', [237, 9.0, 37, 4.3]),
    ];
    function doShit() {
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
                        {rows.map((row) => (
                            <TableRow
                                key={row.subject}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell component="th" scope="row">
                                    {row.subject}
                                </TableCell>
                                <TableCell align="left">{row.marks.toString()}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        );
    }


    function createRow(row) {

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
                marks = response;
                console.log(response);
            },
            error: function (d) {
                console.log(d);
            }
        });
    }
    getMarks();
    doShit();
    console.log(marks);
    return (
        <div>
            <h2>Оценки</h2>
            {doShit()}
        </div>
    );

}
MarksSection.propTypes = {}