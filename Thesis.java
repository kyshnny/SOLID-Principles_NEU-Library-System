public class Thesis implements LibraryResource {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Thesis: " + title);
    }

    @Override
    public String getType() {
        return "Thesis";
    }
}