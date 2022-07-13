class NavBarTogglerButtonMaker {
    constructor(){}

    make(){
        let button = this.addAttribute();
        this.addIcon(button);
    }

    addAttribute(){
        let parent = document.getElementsByClassName("navbar-toggler-style")[0];
        
        parent.setAttribute("type", "button");
        parent.setAttribute("data-bs-toggle", "collapse");
        parent.setAttribute("data-bs-target", "#navbarNavDropdown");
        parent.setAttribute("aria-controls", "navbarNavDropdown");
        parent.setAttribute("aria-expanded", "false");
        parent.setAttribute("aria-label", "Toggle navigation");

        return parent;
    }

    addIcon(parent){
        let icon = document.createElement("span");
        icon.classList.add ("navbar-toggler-icon");
        parent.append(icon);
    }
}