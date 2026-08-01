import java.lang.reflect.*;

class Main {
    public static void main(String[] args) {
        // Class reflection
        Student student1 = new Student();
        Author author = student1.getClass().getAnnotation(Author.class);

        System.out.println("Student information: ");
        System.out.println("Student data: " + "name: " + author.name() + ", date: " + author.date());

        // Members reflection
        for(Field field: student1.getClass().getDeclaredFields()) {
            author = field.getAnnotation(Author.class);
            System.out.println("Members: " + field.getName() + ": " + author.name());
        }

        // Methods reflection
        for(Method method: student1.getClass().getDeclaredMethods()) {
            author = method.getAnnotation(Author.class);
            System.out.println("Methods: " + method.getName() + " : " + author.name());
        }
    }
}
