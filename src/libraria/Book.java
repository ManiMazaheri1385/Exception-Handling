package libraria;

public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        if (title == null || title.equals("")) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        if (pageCount < 1) {
            throw new IllegalArgumentException("Page count must be positive.");
        }
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        if (pageCount == 1) {
            return title + " (" + pageCount + "page)";
        }
        return title + " (" + pageCount + "pages)";
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

}
