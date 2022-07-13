externalFilesLoader();

function externalFilesLoader() {
    addCssFiles();
    addJsFiles();
}

function addJsFiles() {
    jsLoader('./ui-components-maker/navbar-toggler-button-maker.js')
    jsLoader('home-page-settings.js');
    jsLoader('./ui-components-maker/header.js');
    jsLoader('./ui-components-maker/footer.js');
    jsLoader('home-page-loader.js');
    jsLoader('dummy-endpoint-caller.js');
    jsLoader('dummy-content-displayer.js');
    jsLoader('dummy-page-loader.js');
    addBootstrapJS('https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js', 'sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB');
    addBootstrapJS('https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js', 'sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13')
}

function addCssFiles() {
    addBootstrapCSS('https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css');
    cssLoader('dummy-style.css');
}

function cssLoader(cssLink) {
    const parent = document.getElementsByTagName('head')[0];
    const link = document.createElement('link');
    link.rel = 'stylesheet';
    link.href = cssLink;
    parent.appendChild(link);
}

function jsLoader(jsLink) {
    const parent = document.getElementsByTagName('head')[0];
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = jsLink;
    parent.appendChild(script);
}

function addBootstrapCSS(cssLink){
    const parent = document.getElementsByTagName('head')[0];
    const link = document.createElement('link');
    link.href = cssLink;
    link.rel = 'stylesheet';
    link.setAttribute('integrity', "sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3");
    link.setAttribute('crossorigin', "anonymous");
    parent.appendChild(link);
}

function addBootstrapJS(jsLink, integrity){
    const parent = document.getElementsByTagName('head')[0];
    const script = document.createElement('script');
    script.src = jsLink;
    script.setAttribute('integrity', integrity);
    script.setAttribute('crossorigin', "anonymous");
    parent.appendChild(script);
}