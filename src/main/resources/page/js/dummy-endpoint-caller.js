class DummyRESTAPICaller {
    constructor() {}

    static async getData() {
        const url = 'http://localhost:8080/sekta/api/dummy';
        return await fetch(url).then(response => response.json());
    }
}