class WriteOutDataOnDummyPage {  
    constructor() {}

    static writeOutDateOrTime(id, data) {
        document.getElementById(id).innerHTML = data; 
    }
}
