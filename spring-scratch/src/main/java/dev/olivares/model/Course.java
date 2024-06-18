package dev.olivares.model;

// we are creating a new modal which will be our objects that we are pulling from the database
public class Course {

    // we are going to set up an encapsulated java bean
    // to do this we need to private our properties and utilize setters and getters
    private int courseId;
    private String title;
    private String description;
    private String link;

    // Our constructor
    public Course(int courseId, String title, String description, String Link) {
        this.setCourseId(courseId);
        this.setTitle(title);
        this.setDescription(description);
        this.setLink(Link);
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String description() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
