package week4.day2.student;

public final class StudentGroup {

    private Student[] students = new Student[10];
    private int size;

    public void addStudent(Student student){
        if(students.length <= size){
            copyArray();
        }
        students[size++] = student;
    }

    private void copyArray() {
        Student[] newStudents = new Student[this.students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }

    public Student[] getStudents(){
        return students.clone();
    }

    public boolean removeStudent(String name) {
        if(name == null) return false;

        for (int i = 0; i < students.length; i++) {
            if(name.equals(students[i].getName())){
                Student[] newStudents = new Student[students.length * 2];
                System.arraycopy(students, 0, newStudents, 0, i);
                System.arraycopy(students, i + 1, newStudents, i, students.length - 1);
                students = newStudents;
                return true;
            }
        }
        return false;
    }

}
