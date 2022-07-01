externalFilesLoader();

function externalFilesLoader(){
    addJsFiles();
    addCssFiles();
}

function addJsFiles(){
    jsLoader('dummy-endpoint-caller.js');
    jsLoader('dummy-content-displayer.js');
    jsLoader('dummy-page-loader.js');
    jsLoader('https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js')
}

function addCssFiles(){
    cssLoader('https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css')
    cssLoader('dummy-style.css');
}

function cssLoader(cssLink){
    const parent = document.getElementsByTagName('head')[0];
    const link = document.createElement('link');
    link.rel = 'stylesheet';
    link.href = cssLink;
    parent.appendChild(link);
}

function jsLoader(jsLink){
    const parent = document.getElementsByTagName('head')[0];
    const script = document.createElement('script');
    script.src = jsLink;
    script.setAttribute('async', "");
    parent.appendChild(script);
}