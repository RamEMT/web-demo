const BASE_URL = "http://localhost:8080/api"
let detailUrl = BASE_URL + "/detail"

$(function () {
    let filmId = getQueryString("filmId");
    let params = {
        filmId: filmId
    }
    $.get(detailUrl, params, function (result) {
        if (result.status === 200) {

        }
    })
})


function getQueryString(name) {
    let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    let r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}