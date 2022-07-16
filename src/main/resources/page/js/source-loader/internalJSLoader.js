class InternalJSLoader {

    constructor() {
    }

    static load(scriptURLs) {
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
            InternalJSLoader.recursiveFunctionCall(index+1, scriptURLs);
        }
        script.src = scriptURLs[index];

        document.head.appendChild(script);
    }

    static recursiveFunctionCall(index, scriptURLs) {
        InternalJSLoader.loadSingleItem(index, scriptURLs);
    }
}