class DummyPageLoader {
    constructor() {}

    static async load() {
        let apiCaller = new DummyRESTAPICaller();
        let dateOrTime = await apiCaller.getData();
        DummyPageContentPopulator.displayDateTime('time', dateOrTime.time);
        DummyPageContentPopulator.displayDateTime('date', dateOrTime.date);
    }
}

DummyPageLoader.load();