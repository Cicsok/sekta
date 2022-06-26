async function getDateAndTimeInJson() {
    var dateAndTime = null;
    const url = 'http://localhost:8080/sekta/api/dummy/';
    return dateAndTime = await fetch(url).then(response => response.json());
}