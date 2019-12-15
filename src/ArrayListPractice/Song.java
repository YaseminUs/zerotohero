package ArrayListPractice;

public class Song {

    String Title;
    double Duration;
    String Singer;
    String Writer;

    public Song(String Title,double Duration,String Singer,String Writer){
        this.Title=Title;
        this.Duration=Duration;
        this.Singer=Singer;
        this.Writer=Writer;
    }


    public String getTitle()
    {
        return Title;
    }
    public void setTitle(String Title)
    {
        this.Title=Title;
    }
    public double getDuration(){
        return Duration;
    }
    public void setDuration(double Duration){
        this.Duration=Duration;
    }
    public String getSinger(){
        return Singer;
    }
    public void setSinger(String Singer){
        this.Singer=Singer;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        this.Writer = Writer;
    }



}
