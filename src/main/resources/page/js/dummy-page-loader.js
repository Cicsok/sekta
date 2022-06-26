pageLoader();

async function pageLoader() {
    let dateAndTime = await getDateAndTimeInJson();
    writeOutDateOrTime('time', dateAndTime.time);
    writeOutDateOrTime('date', dateAndTime.date);
}