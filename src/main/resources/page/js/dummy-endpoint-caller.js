class DummyRESTAPICaller {
    constructor() {}

    static async getData() {
        // The four constants should be placed into the constructor, but this 'getData' is a static method
        const serverOrigin = window.location.origin;
        const apiPrefix = "/sekta/api";
        const resourcePrefix = "/dummy";
        const url = serverOrigin + apiPrefix + resourcePrefix;
        return await fetch(url).then(response => response.json());
    }
}