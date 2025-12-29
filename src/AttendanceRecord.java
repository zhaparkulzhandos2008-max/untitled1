class AttendanceRecord {
    private Student student;
    private boolean present;

    public AttendanceRecord(Student student, boolean present) {
        this.student = student;
        this.present = present;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isPresent() {
        return present;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttendanceRecord)) return false;
        AttendanceRecord that = (AttendanceRecord) o;
        return student.equals(that.student);
    }

    @Override
    public int hashCode() {
        return student.hashCode();
    }

    @Override
    public String toString() {
        return student.getName() + " present: " + present;
    }
}