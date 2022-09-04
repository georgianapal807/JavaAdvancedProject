public class Grade {
    private Integer value;
    private Course course;

    public Grade(Integer value, Course course) {
        this.value = value;
        this.course = course;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "value=" + value +
                ", course=" + course +
                '}';
    }
}
