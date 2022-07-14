class HomePageLoader {
    constructor() { }

    load() {
        console.log("ENTERD LOAD()!!")
        this.loadHeader();
        this.loadFooter();
    }

    loadHeader() {
        this.loadNavBarTogglerButton();
        this.loadNavBarItems();
    }

    loadFooter() {
        this.loadFooterLinks();
    }

    loadNavBarTogglerButton(){
        let navBarTogglerButtonMakerghj = new NavBarTogglerButtonMaker();
        navBarTogglerButtonMakerghj.make();
    }

    loadNavBarItems(){
        let navBarItemsMaker = new NavBarItemsMaker(header.singleNavBarItems, header.dropDownNavBarItems);
        navBarItemsMaker.make();
    }

    loadFooterLinks(){
        let footerLinksMaker = new FooterLinksMaker(footer.footerLinks);
        footerLinksMaker.make();
    }
}

let homePageLoader = new HomePageLoader();
console.log("I made homePageLoader");
homePageLoader.load();
