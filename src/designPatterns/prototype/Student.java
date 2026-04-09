package designPatterns.prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private int psp;
    private int averageBatchPsp;
    private String batchName;
    private int counter;

    public Student(){

    }

    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.averageBatchPsp = st.averageBatchPsp;
        this.batchName = st.batchName;
        this.counter = st.counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(int averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
