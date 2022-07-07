class DummyPageContentPopulator {  
    constructor() {}

    static displayDateTime(id, data) {
        document.getElementById(id).innerHTML = data; 
    }
}