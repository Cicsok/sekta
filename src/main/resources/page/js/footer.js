class FooterLinks {
    constructor(links) {
        this.links = links;
        this.addFooterLinks(links);
    }

    addFooterLinks(links) {
        for (let [linkName, href] of Object.entries(links)) {
            this.createFooterLinks(linkName, href);
        }
    }

    createFooterLinks(linkName, href) {
        parent = document.getElementById("footer");
        let link = document.createElement("a");
        link.href = href;
        link.classList.add("d-block");
        link.target = '_blank';
        link.innerHTML = linkName;
        link.onclick = function () {
            alert('You clicked to ' + linkName + '!');
        }
        parent.append(link);
    }
}