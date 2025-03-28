package Library;

public class Books {  
    private String id;  
    private String title;  
    private String writer;  
    private String category;  
    private String status; // "Available" or "Checked Out"  

    public Books(String id, String title, String writer, String category, String status) {  
        this.id = id;  
        this.title = title;  
        this.writer = writer;  
        this.category = category;  
        this.status = status;  
    }  

    // Getters and Setters  
    public String getId() {  
        return id;  
    }  

    public String getTitle() {  
        return title;  
    }  

    public String getWriter() {  
        return writer;  
    }  

    public String getCategory() {  
        return category;  
    }  

    public String getStatus() {  
        return status;  
    }  

    public void setTitle(String title) {  
        this.title = title;  
    }  

    public void setWriter(String writer) {  
        this.writer = writer;  
    }  

    public void setCategory(String category) {  
        this.category = category;  
    }  

    public void setStatus(String status) {  
        this.status = status;  
    }  

    @Override  
    public String toString() {  
        return "ID: " + id + ", Title: " + title + ", Writer: " + writer + ", Category: " + category + ", Status: " + status;  
    }
}  
