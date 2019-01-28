package class5oop;

public class TimePromezhutok {
    int sec;
    int min;
    int hrs;

    public TimePromezhutok(int sec) {
        boolean InitError = false;
        int hours = Math.round(sec / 3600);
        if (hours > 24) {
            InitError = true;
        }
        int minutes = Math.round((sec - (sec % 3600)) / 60);
        if (minutes > 60) {
            InitError = true;
        }
        int seconds = (sec % 3600) % 60;
        if (seconds > 60) {
            InitError = true;
        }
        if (!InitError) {
            this.hrs = hours;
            this.min = minutes;
            this.sec = seconds;
        } else {
            throw new RuntimeException();
        }
    }

    public TimePromezhutok( int sec, int min, int hrs){
            this(sec+min*60+hrs*3600);
        }
    }
