class JavascriptFilesAdder {

    jsFiles = ['bootstrapCSSLoader.js', 'bootstrapJSLoader.js', 'internalJSLoader.js'];
    
    constructor(){
        this.addJsFiles(this.jsFiles);
    }

     addJsFiles(jsFile) {
                 var i = 0;
        for(let src of jsFile){

            this.createScripts(src);
            console.log(i);
            i++;
        } 
    }

    createScripts(src){
        let parent = document.head;
        let script = document.createElement('script');
        // script.type = 'text/javascript';
        script.src = src;
        parent.appendChild(script);
    }
}

let scriptsAdder = new JavascriptFilesAdder();