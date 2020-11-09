package pastpaperbank;

public class PastPaper {
    public String subject;
    public String year;
    public String lecturer;
    
    public PastPaper(String subject, String year, String lecturer){
        this.subject = subject;
        this.year = year;
        this.lecturer = lecturer;
    }
    public String getSubject(){
        return subject;
    }
    public String getYear(){
        return year;
    }
    public String getLecturer(){
        return lecturer;
    }
}
