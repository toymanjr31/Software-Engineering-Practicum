package pastpaperbank;

public class PastPaper {
    public int subjectID;
    public String year;
    public String lecturer;
    
    public PastPaper(int subjectID, String year, String lecturer){
        this.subjectID = subjectID;
        this.year = year;
        this.lecturer = lecturer;
    }
    public int getsubjectID(){
        return subjectID;
    }
    public String getYear(){
        return year;
    }
    public String getLecturer(){
        return lecturer;
    }
    public String getsubjectName(){
        String subject = null;
        switch(subjectID){
            case 1:{
                subject = "Programming 1";
                break;
            }
            case 2:{
                subject = "Programming 2";
                break;
            }
            case 3:{
                subject = "Database";
                break;
            }
            case 4:{
                subject = "Software Engineering";
                break;
            }
        }
        return subject;
    }
}
