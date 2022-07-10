class DummyPageLoader {
    constructor() {}

    static async load() {
        let dateOrTime = await DummyRESTAPICaller.getData();
        DummyPageContentPopulator.displayDateTime('time', dateOrTime.time);
        DummyPageContentPopulator.displayDateTime('date', dateOrTime.date);
    }
}

DummyPageLoader.load();