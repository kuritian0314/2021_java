package com.hwt.entity;

public class Course {
    private int courseId;
    private String courseName;
    private String teacher;

    public Course(int courseId, String courseName, String teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("courseId=").append(courseId);
        sb.append(", courseName='").append(courseName).append('\'');
        sb.append(", teacher='").append(teacher).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
