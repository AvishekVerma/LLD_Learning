package designPatterns.prototype;

public class Client {

    public static void main(String[] args) {

        Student st = new Student();
        st.setName("Avishek");
        st.setAge(28);
        st.setBatchName("wrwkljwj");
        st.setAverageBatchPsp(78);

        Student copy = st.clone();

        Student intellignetStudent = new IntelligentStudent();
        intellignetStudent.setAge(12);
        intellignetStudent.setName("Prity");

        Student copyOfIs = intellignetStudent.clone();

    }
}
