function getTimeAndDate() {
    const url = 'http://localhost:8080/sekta/api/dummy/';
    fetch(url)
    .then((resp) => resp.json())
    .then(function(data) {
     writeOutTime(data.time);
     writeOutDate(data.date);
     
  })
}

function writeOutTime(time) {
    const divOfTime = document.getElementById('time');
    divOfTime.innerHTML = time;
}

function writeOutDate(date) {
    const divOfDate = document.getElementById('date');
    divOfDate.innerHTML = date;
}

getTimeAndDate();