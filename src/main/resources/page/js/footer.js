class FooterLinks {
    constructor(links) {
        this.links = links;
        this.addFooterLinks(links);
    }

    addFooterLinks(links) {
        for (let [linkName, href] of Object.entries(links)) {
            parent = document.getElementById("footer");
            let footerLink = this.createFooterLinks(linkName, href);
            parent.append(footerLink);
        }
    }

    createFooterLinks(linkName, href) {
        let link = document.createElement("a");
        link.href = href;
        link.classList.add("d-block");
        link.target = '_blank';
        link.innerHTML = linkName;
        link.onclick = function () {
            alert('You clicked to ' + linkName + '!');
        }
        return link;
    }
}