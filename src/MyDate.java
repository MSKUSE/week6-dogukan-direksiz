public class MyDate {
    public int day;
    public int month;
    public int year;
    public MyDate(int Day ,int Month, int Year) {
        this.day = Day;
        this.month = Month;
        this.year = Year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   /*
    public void incrementDay(int amount) {
        if (this.month == 2 && this.day == 28){
            this.month = 3;
            this.day = 1;
        } else if () {

        }

    }
    /*
    */

    public void incrementDay(){
        this.day++;
    }

    public void incrementYear(int amount) {
        this.year += amount;
    }

    public void incrementYear(){
        this.year++;
    }

    public void incrementMonth(int amount) {
        this.month += amount;
    }

    public void incrementMonth(){
        this.month++;
    }

    public void decrementDay(int amount) {
        this.day -= amount;

    }

    public void decrementDay(){
        this.day--;
    }

    public void decrementYear(int amount) {
        this.year -= amount;
    }

    public void decrementYear(){
        this.year--;
    }

    public void decrementMonth(int amount) {
        this.month -= amount;
    }

    public void decrementMonth(){
        this.month--;

    }

    public boolean isBefore(MyDate anotherDate) {
        boolean before = false;
        if (this.year < anotherDate.year) {
            before = true;
        } else if (this.year == anotherDate.year && this.month < anotherDate.month) {
            before = true;

        } else if (this.year == anotherDate.year && this.month == anotherDate.month) {
            if (this.day < anotherDate.day) {
                before = true;
            } else{
                before = false;
            }
        } else{
            before = false;
        }
        return before;
    }

    public boolean isAfter(MyDate anotherDate) {
        boolean after = false;
        if (this.year > anotherDate.year) {
            after = true;
        } else if (this.year == anotherDate.year && this.month > anotherDate.month) {
            after = true;

        } else if (this.year == anotherDate.year && this.month == anotherDate.month) {
            if (this.day > anotherDate.day) {
                after = true;
            } else {
                after = false;
            }

        }else{
            after = false;
        }
        return after;
    }
    /*
    public void dayDifference(MyDate anotherDate) {
        int differece;
        if (this.year < anotherDate.year || this.year > anotherDate.year) {
            if (this.day == anotherDate.day && this.month == anotherDate.month) {
                differece = this.year - anotherDate.year;
            } else if () {

            }
        }
    }
    */

    @Override
    public String toString() {
        return
                 year +
                "-" + day +
                "-" + month
                ;
    }


}
