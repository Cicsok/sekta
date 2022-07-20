class BootstrapCSSLoader {

    constructor() {

    }

    load(cssURLs) {
        cssURLs.forEach(cssUrl => this.loadSingleItem(cssUrl));
    }

   loadSingleItem(cssURL) {
        const parent = document.getElementsByTagName('head')[0];
        const link = document.createElement('link');
        link.href = cssURL;
        link.rel = 'stylesheet';
        link.setAttribute('integrity', "sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3");
        link.setAttribute('crossorigin', "anonymous");
        parent.appendChild(link);
    }
}