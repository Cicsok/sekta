class NavBarTogglerButton {
    constructor(){}

    make(){
        const button = this.addAttribute();
        this.addIcon(button);
    }

    addAttribute(){
        const parent = document.getElementsByClassName("navbar-toggler-style")[0];
        
        parent.setAttribute("type", "button");
        parent.setAttribute("data-bs-toggle", "collapse");
        parent.setAttribute("data-bs-target", "#navbarNavDropdown");
        parent.setAttribute("aria-controls", "navbarNavDropdown");
        parent.setAttribute("aria-expanded", "false");
        parent.setAttribute("aria-label", "Toggle navigation");

        return parent;
    }

    addIcon(parent){
        const icon = document.createElement("span");
        icon.classList.add ("navbar-toggler-icon");
        parent.append(icon);
    }
}