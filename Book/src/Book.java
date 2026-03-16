public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, String author, int releaseYear, int pages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            System.out.println("Книга большая");
            return true;
        } else {
            System.out.println("Книга маленькая");
            return false;
        }
    }

    public boolean matches(String word) {
        if (word.contains(title) || word.contains(author)) {
            System.out.println("Книга нашлась");
            return true;
        } else {
            System.out.println("Книга не найдена");
            return false;
        }
    }

    public int estimatePrice() {
        int price = pages * 3;
        if (price < 250) {
            System.out.println("Цена ниже 250");
            return price;
        } else
            return price;
    }
}










