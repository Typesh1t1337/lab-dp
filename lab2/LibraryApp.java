package lab2;

public class LibraryApp {
    public static void main(String[] args) {
        Storage storage = new InMemoryStorage();
        NotificationService emailService = new EmailNotificationService();

        User student = new Student();
        User librarian = new Librarian();
        User admin = new Admin();

        LibraryItem book = new Book("Pure code Architecture");
        LibraryItem magazine = new Magazine("Play Boy");
        LibraryItem  book2 = new Book("dfdfkkdfkfd");


        ((Librarian) librarian).addBook(storage, book);
        emailService.sendNotification(((Librarian) librarian).getUserId(), "Book added: " + book.getTitle());


        ((Student) student).borrowBook(book);
        emailService.sendNotification(((Student) student).getUserId(), "You borrowed: " + book.getTitle());


        ((Student) student).returnBook(book);
        emailService.sendNotification(((Student) student).getUserId(), "You returned: " + book.getTitle());

        ((Student) student).borrowBook(magazine);
        emailService.sendNotification(((Student) student).getUserId(), "Yow borrowed: " + magazine.getTitle());
    }
}

