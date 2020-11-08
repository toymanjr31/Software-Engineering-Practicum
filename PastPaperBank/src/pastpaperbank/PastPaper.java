package pastpaperbank;

public class PastPaper {
    public byte subjectID;
    public String year;
    public String lecturer;
    public boolean verificationStatus; 
    
    public String subjectName(){
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
