public class Journal implements LibraryResource {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Journal: " + title);
    }

    @Override
    public String getType() {
        return "Journal";
    }
}