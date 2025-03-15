package lab1;

public class Date {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getData(){
        if(this.month>=13){
            return "Error";
        }

        if(this.day>=31){
            return "Error";
        }

        return +this.year+ "-" + this.month +"-"+this.day;


    }

}
