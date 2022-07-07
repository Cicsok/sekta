class DummyRESTAPICaller {
    constructor() {}

    static async getData(url) {
        return await fetch(url).then(response => response.json());
    }
}