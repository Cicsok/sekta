class NavBarItems {
    constructor(singleNavBarItems, dropDownNavBarItems) {
        this.singleNavBarItems = singleNavBarItems;
        this.dropDownNavBarItems = dropDownNavBarItems;
        this.addSingleItems(singleNavBarItems);
        this.addDropDownItems(dropDownNavBarItems);
    }

    addSingleItems(singleNavBarItems) {
        for (let [linkName, href] of Object.entries(singleNavBarItems)) {
            let singleNavItem = this.createSingleItems(linkName, href);
            document.getElementById('navbar-items').append(singleNavItem);
        }
    }

    createSingleItems(linkName, href) {
        let singleNavItem = document.createElement("li");
        singleNavItem.classList.add("nav-item");
        let link = document.createElement("a");
        link.classList.add("nav-link", "active");
        link.href = href;
        link.innerHTML = linkName;
        link.target = '_blank';
        singleNavItem.append(link);
        link.onclick = function () {
            console.log('You clicked to ' + linkName + '!');
        }
        return singleNavItem;
    }

    addDropDownItems(dropDownNavBarItems) {
        for (let [dropDownName, links] of Object.entries(dropDownNavBarItems)) {
            let dropDownLink = this.createDropDownLink(dropDownName);
            let dropDownMenu = this.createDropDownMenu();
            dropDownLink.append(dropDownMenu);
            document.getElementById("navbar-items").append(dropDownLink);
            for (let [linkName, href] of Object.entries(links)) {
                let dropDownItems = this.createDropDownItems(linkName, href);
                dropDownMenu.append(dropDownItems);
            }
        }
    }

    createDropDownLink(dropDownName) {
        let dropDownLinkContainer = document.createElement("li");
        dropDownLinkContainer.classList.add("nav-item", "dropdown");
        let dropDownLink = document.createElement("a");
        dropDownLink.classList.add("nav-link", "dropdown-toggle");
        dropDownLink.id = "navbarDropdownMenuLink";
        dropDownLink.setAttribute("role", "button");
        dropDownLink.setAttribute("data-bs-toggle", "dropdown");
        dropDownLink.setAttribute("aria-expanded", "false");
        dropDownLink.innerHTML = dropDownName;
        dropDownLinkContainer.append(dropDownLink);
        return dropDownLinkContainer;
    }

    createDropDownItems(linkName, href, parent) {
        let dropDownItems = this.createDropDownItems(linkName, href);
        return dropDownItems;
    }

    createDropDownMenu() {
        let dropDownMenu = document.createElement("ul");
        dropDownMenu.classList.add("dropdown-menu");
        dropDownMenu.setAttribute("aria-labelledby", "navbarDropdownMenuLink");
        return dropDownMenu;
    }

    createDropDownItems(linkName, href) {
        let dropDownItem = document.createElement("li");
        let dropDownLink = document.createElement("a");
        dropDownLink.classList.add("dropdown-item");
        dropDownLink.href = href;
        dropDownLink.innerHTML = linkName;
        dropDownLink.href = href;
        dropDownLink.target = '_blank';
        dropDownLink.onclick = function () {
            alert('You clicked to ' + linkName);
        }
        dropDownItem.append(dropDownLink);
        return dropDownItem;
    }
}