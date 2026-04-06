public class AudioBook implements LibraryResource {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Audio Book: " + title);
    }

    @Override
    public String getType() {
        return "AudioBook";
    }
}