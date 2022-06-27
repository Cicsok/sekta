class APICaller {
    constructor() {}

    static async getDateAndTimeInJson(url) {
        var dateAndTime = null;
        return dateAndTime = await fetch(url).then(response => response.json());
    }
}
