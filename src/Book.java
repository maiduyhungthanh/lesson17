

public class Book {
    private int id;
    private String name;
    private String publishing;
    private int year;
    public Book(int id, String name, String publishing, int year) {
        this.id = id;
        this.name = name;
        this.publishing = publishing;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPublishing() {
        return publishing;
    }
    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + "-" + name + "- NXB" + publishing + "-" + year;
    }
}
