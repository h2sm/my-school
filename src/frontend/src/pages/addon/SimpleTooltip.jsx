import React from "react";
import Popup from "reactjs-popup";
import "./css/index.css";
import PropTypes from "prop-types";

export const SimpleTooltip = (obj) => {
    console.log(obj);
    return (
        <Popup
            trigger={open => (
                <button className="button">{obj.obj.mark}</button>
            )}
            position="left center"
            closeOnDocumentClick
        >
            <span> Заметка: {obj.obj.description} </span>
            <br/>
            <span> Дата: {new Date(obj.obj.date).toLocaleDateString()} </span>
            <br/>
            <span> Д/З: {obj.obj.lesson.givenHomework} </span>
        </Popup>

    )
}

SimpleTooltip.propTypes = {
    obj: PropTypes.array,
}

export default SimpleTooltip;
