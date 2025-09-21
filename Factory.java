interface Page {
    void render();
}


class BlogPage implements Page {
    public void render() {
        System.out.println("Rendering blog page");
    }
}

class NewsPage implements Page {
    public void render() {
        System.out.println("Rendering news page");
    }
}


abstract class PageCreator {
    abstract Page createPage();

    public void displayPage() {
        Page page = createPage();
        page.render();
    }
}

class BlogPageCreator extends PageCreator {
    Page createPage() {
        return new BlogPage();
    }
}

class NewsPageCreator extends PageCreator {
    Page createPage() {
        return new NewsPage();
    }
}

public class Factory {
    public static void main(String[] args) {
        PageCreator creator = new BlogPageCreator();
        creator.displayPage();

        creator = new NewsPageCreator();
        creator.displayPage();
    }
}
