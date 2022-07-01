class HomePageLoader {
    constructor() { }

    loadHomePage() {
        this.loadHeader();
        this.loadFooter();
    }

    loadHeader() {
        new NavBarItems(header.singleNavBarItems, header.dropDownNavBarItems);
    }

    loadFooter() {
        new FooterLinks(footer.footerLinks);
    }
}

let homePageLoader = new HomePageLoader;
homePageLoader.loadHomePage();