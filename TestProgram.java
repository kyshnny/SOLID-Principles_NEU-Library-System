public class TestProgram {
    public static void main(String[] args) {

        Student student = new Student("Sarah");

        LibraryResource book = new Book();
        LibraryResource journal = new Journal();
        LibraryResource thesis = new Thesis();
        LibraryResource audioBook = new AudioBook(); // future extension

        student.borrowResource(book, "Java Programming");
        student.borrowResource(journal, "AI Research Journal");
        student.borrowResource(thesis, "Software Engineering Thesis");
        student.borrowResource(audioBook, "Clean Code Audio");
    }
}