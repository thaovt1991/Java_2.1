package Week2.OOP.StopWatch;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public long getStartTime(){
        return this.startTime ;
    }
    public  long getStopTime(){
        return  this.stopTime ;
    }
    public boolean getRunning(){
        return this.running ;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }


    //elaspsed time in milliseconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
    @Override
    public  String toString() {
        long hour, minute , second ;
        hour = this.getElapsedTime() / 3600000 ;
        minute = (this.getElapsedTime() - hour* 3600000 ) / 60000 ;
        second = ( this.getElapsedTime() - hour* 3600000 - minute * 60000 ) / 1000 ;
        String h ="" , m = "", s="" ;

        if (hour < 10 ){
            h  = "0" + hour ;
        }else h += hour ;
        if (minute < 10) {
            m = "0" + minute ;
        }else  m +=  minute ;
        if ( second < 10 ) {
            s = "0" + second ;
        }else s += second ;
        return  "Time :  " + h + " : " + m + " : " + s +"" ;
    }
}


