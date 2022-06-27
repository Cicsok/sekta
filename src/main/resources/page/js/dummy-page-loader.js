class DummyPageLoader {
    constructor() {}

    static async pageLoader() {
        let dateAndTime = await APICaller.getDateAndTimeInJson('http://localhost:8080/sekta/api/dummy');
        WriteOutDataOnDummyPage.writeOutDateOrTime('time', dateAndTime.time);
        WriteOutDataOnDummyPage.writeOutDateOrTime('date', dateAndTime.date);
    }
}

DummyPageLoader.pageLoader()