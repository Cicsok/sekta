externalFilesLoader();

function externalFilesLoader(){
    addJsFiles();
    addCssFiles();
}

function addJsFiles(){
    jsLoader('dummy-endpoint-caller.js');
    jsLoader('dummy-content-displayer.js');
    jsLoader('dummy-page-loader.js');
}

function addCssFiles(){
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
    parent.appendChild(script);
}