class DummyRESTAPICaller {

    serverOrigin = window.location.origin;
    apiPrefix = "/sekta/api";
    resourcePrefix = "/dummy";
    url = this.serverOrigin + this.apiPrefix + this.resourcePrefix;

    constructor() {}

    async getData() {
        return await fetch(this.url).then(response => response.json());
    }
}