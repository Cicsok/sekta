class InternalJSLoader {

    constructor() {

    }

    load(scriptURLs) {
        console.log(scriptURLs);
        const startIndex = 0;
        InternalJSLoader.loadSingleItem(startIndex, scriptURLs);
    }

    static loadSingleItem(index, scriptURLs) {
        console.log(index);
        if (index >= scriptURLs.length) {
            return false;
        }

        var script = document.createElement('script');

        script.onload = function() {
            console.log("Script loaded: ", scriptURLs[index]);
            InternalJSLoader.loadSingleItem(index+1, scriptURLs);
        }

        script.src = scriptURLs[index];

        document.head.appendChild(script);
    }
}