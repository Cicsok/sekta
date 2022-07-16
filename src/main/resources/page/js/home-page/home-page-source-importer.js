let internalScriptURLs = [
    './ui-components-maker/navbar-toggler-button-maker.js',
    'home-page-settings.js',
    './ui-components-maker/header.js',
    './ui-components-maker/footer.js',
    'home-page-loader.js'
];

let bootstrapJSURLs = new Map([
       ['https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js', 'sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB'],
       ['https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js', 'sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13']
]);

let bootstrapCSSURLs = [
    'https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css'
];

loadExternalFiles();
loadInternalFiles();

function loadInternalFiles() {
    const internalJSLoader = new InternalJSLoader();
    console.log(internalScriptURLs);
    InternalJSLoader.load(internalScriptURLs);
}

function loadExternalFiles() {
    const bootstrapJSLoader = new BootstrapJSLoader();
    bootstrapJSLoader.load(bootstrapJSURLs);

    const bootstrapCSSLoader = new BootstrapCSSLoader();
    bootstrapCSSLoader.load(bootstrapCSSURLs);
}