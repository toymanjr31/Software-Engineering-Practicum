package pastpaperbank;

public class PastPaper {
    public byte subjectid;
    public String year;
    public String lecturer;
    
    public String subjectName(){
        String subject = null;
        switch(subjectid){
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
    public static void main(String[] args){
        PastPaper SE1 = new PastPaper();
        SE1.lecturer = "Isna Asfi Mudzolifah";
        SE1.year = "2019";
        SE1.subjectid = 4;
        System.out.println(SE1.subjectName());
    }
}
