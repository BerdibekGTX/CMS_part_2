interface Page {
    void render();
}

interface Widget {
    void render();
}

interface Comment {
    void show();
}

class BlogPage implements Page {
    public void render() {
        System.out.println("Rendering blog page");
    }
}

class BlogWidget implements Widget {
    public void render() {
        System.out.println("Rendering blog widget");
    }
}

class BlogComment implements Comment {
    public void show() {
        System.out.println("Showing blog comment");
    }
}

// Конкретные продукты для новостей
class NewsPage implements Page {
    public void render() {
        System.out.println("Rendering news page");
    }
}

class NewsWidget implements Widget {
    public void render() {
        System.out.println("Rendering news widget");
    }
}

class NewsComment implements Comment {
    public void show() {
        System.out.println("Showing news comment");
    }
}

interface CMSFactory {
    Page createPage();
    Widget createWidget();
    Comment createComment();
}


class BlogFactory implements CMSFactory {
    public Page createPage() {
        return new BlogPage();
    }

    public Widget createWidget() {
        return new BlogWidget();
    }

    public Comment createComment() {
        return new BlogComment();
    }
}

class NewsFactory implements CMSFactory {
    public Page createPage() {
        return new NewsPage();
    }

    public Widget createWidget() {
        return new NewsWidget();
    }

    public Comment createComment() {
        return new NewsComment();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        CMSFactory factory = new BlogFactory();
        Page page = factory.createPage();
        Widget widget = factory.createWidget();
        Comment comment = factory.createComment();
        page.render();
        widget.render();
        comment.show();

        System.out.println("---");

        factory = new NewsFactory();
        page = factory.createPage();
        widget = factory.createWidget();
        comment = factory.createComment();
        page.render();
        widget.render();
        comment.show();
    }
}
