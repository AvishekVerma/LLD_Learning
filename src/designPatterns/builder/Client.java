package designPatterns.builder;

public class Client {

    public static void main(String[] args) {

//        Builder builder = new Builder();
//        builder.setName("abc");
//        builder.setAge(13);
//        builder.setPhone("34567890");
//
//        Student student = new Student(builder);
//        System.out.println(student.getAge());
//        System.out.println(student.getName());

//        Builder builder = Student.getBuilder();
//        builder.setName("abc");
//        builder.setAge(13);
//        builder.setPhone("34567890");
//
//        Student student = builder.build();

        Student student = Student.getBuilder()
                .setName("Avishek")
                .setAge(28)
                .setBatchName("2k26")
                .setPhone("8209876557")
                .build();

        System.out.println(student.getName());
    }
}
