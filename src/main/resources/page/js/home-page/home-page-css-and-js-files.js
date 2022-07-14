window.onload = function externalFilesLoader(){
       addCssFiles();
       addJsFiles();
}

//  window.onload = function loadScripts() {
//        let sources = ['./ui-components-maker/navbar-toggler-button-maker.js','home-page-settings.js','./ui-components-maker/header.js', './ui-components-maker/footer.js', 'home-page-loader.js'];
//     sources.forEach(src => {
//         var script = document.createElement('script');
//         script.src = src;
//         script.async = false; //<-- the important part
//         document.body.append( script ); //<-- make sure to append to body instead of head
//     });

    
// }

function externalFilesLoader() {

}

function addJsFiles() {
    addJsToHead('./ui-components-maker/navbar-toggler-button-maker.js');
    addJsToHead('home-page-settings.js');
    addJsToHead('./ui-components-maker/header.js');
    addJsToHead('./ui-components-maker/footer.js');
    addJsToBody('home-page-loader.js');
    addBootstrapJS('https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js', 'sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB');
    addBootstrapJS('https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js', 'sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13')

}

function addCssFiles() {
    addBootstrapCSS('https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css');
}

function cssLoader(cssLink) {
    const parent = document.getElementsByTagName('head')[0];
    const link = document.createElement('link');
    link.rel = 'stylesheet';
    link.href = cssLink;
    parent.appendChild(link);
}

function addJsToHead(jsLink) {
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = jsLink;
    script.setAttribute('async', 'false');
    document.head.appendChild(script);
}

function addJsToBody(jsLink){
const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = jsLink;
    script.setAttribute('async', 'false');
    script.setAttribute('defer', '');
    document.body.appendChild(script);
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
    const script = document.createElement('script');
    script.src = jsLink;
    script.setAttribute('integrity', integrity);
    script.setAttribute('crossorigin', "anonymous");
    script.setAttribute('async', 'false');
    script.setAttribute('defer', '');
    document.body.appendChild(script);
}
console.log('CSS AND JS FILES 0!!!');
