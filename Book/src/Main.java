public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Сказки","Пушкин",1830,200);
        Book book2 = new Book("Рассказы","Лермонтов",1900,150);
        Book book3 = new Book("Стихи","Ломоносов",1840,60);
        book1.isBig();
        book2.isBig();
        book3.isBig();

        book1.matches("Пушкин");
        book2.matches("Есенин");
        book3.matches("Стихи");

        System.out.println(book1.estimatePrice());
        System.out.println(book2.estimatePrice());
        System.out.println(book3.estimatePrice());


    }
}
