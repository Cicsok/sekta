class BootstrapJSLoader {

    constructor() {

    }

    load(jsURLs) {
        jsURLs.forEach((integrity,jsURL) => {
            this.loadSingleItem(jsURL, integrity);
         })
    }

   loadSingleItem(jsURL, integrity) {
        const script = document.createElement('script');
        script.src = jsURL;
        script.setAttribute('integrity', integrity);
        script.setAttribute('crossorigin', "anonymous");
        script.setAttribute('async', 'false');
        script.setAttribute('defer', '');
        document.head.appendChild(script);
    }
}