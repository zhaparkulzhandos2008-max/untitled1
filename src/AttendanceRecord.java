class AttendanceRecord {
    private Student student;
    private boolean present;


    public AttendanceRecord(Student student, boolean present) {
        this.student = student;
        this.present = present;
    }


    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }


    public boolean isPresent() { return present; }
    public void setPresent(boolean present) { this.present = present; }


    @Override
    public String toString() {
        return "AttendanceRecord{student=" + student.getName() + ", present=" + present + "}";
    }
}