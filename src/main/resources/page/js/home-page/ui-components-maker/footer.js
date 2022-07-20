class FooterLinksMaker {
    constructor(links) {
        this.links = links;

    }

    make(){
        this.addFooterLinks(this.links);
    }

    addFooterLinks(links) {
        for (let [linkName, href] of Object.entries(links)) {
            parent = document.getElementById("footer");
            let footerLink = this.createFooterLinks(linkName, href);
            parent.append(footerLink);
        }
    }

    createFooterLinks(linkName, href) {
        let linkWrapper = document.createElement("div");
        let link = document.createElement("a");
        link.href = href;
        link.classList.add("footer-link");
        link.target = '_blank';
        link.innerHTML = linkName;
        link.onclick = function () {
            alert('You clicked to ' + linkName + '!');
        }
        linkWrapper.append(link);
        return linkWrapper;
    }
}

console.log('FooterLinksMaker ran! 4');