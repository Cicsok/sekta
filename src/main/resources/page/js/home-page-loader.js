class HomePageLoader {
    constructor() { }

    load() {
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
homePageLoader.load();