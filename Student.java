public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource, String title) {
        System.out.println(name + " is borrowing a " + resource.getType());
        resource.borrow(title);
    }
}