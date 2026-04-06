public class Book implements LibraryResource {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Book: " + title);
    }

    @Override
    public String getType() {
        return "Book";
    }
}