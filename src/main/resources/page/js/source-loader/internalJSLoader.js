class InternalJSLoader {

    constructor() {

    }

    load(scriptURLs) {
        console.log(scriptURLs);
        const startIndex = 0;
        this.loadSingleItem(startIndex, scriptURLs);
    }

    loadSingleItem(index, scriptURLs) {
        console.log(index);
        if (index >= scriptURLs.length) {
            return false;
        }

        var script = document.createElement('script');
        script.onload = function() {
            console.log("Script loaded: ", scriptURLs[index]);
            this.caller.callRecursiveFunction(index+1, scriptURLs);
        }
        script.src = scriptURLs[index];

        document.head.appendChild(script);
    }

    caller = function RecursiveFunctionCaller() {
        function callRecursiveFunction(index, scriptURLs) {
            this.loadSingleItem(index, scriptURLs);
        }
    }
}