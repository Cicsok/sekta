class DummyPageLoader {
    constructor() {}

    static async load() {
        let dateOrTime = await DummyRESTAPICaller.getData('http://localhost:8080/sekta/api/dummy');
        DummyPageContentPopulator.displayDateTime('time', dateOrTime.time);
        DummyPageContentPopulator.displayDateTime('date', dateOrTime.date);
    }
}

DummyPageLoader.load();