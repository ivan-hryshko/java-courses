package com.javarush.test.level25.lesson05.home01;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread target){
        setDaemon(true);
        this.thread = target;
    }
    public void run() {
        State state = thread.getState();
        System.out.println(state);
        while (state != State.TERMINATED) {
            if (state != thread.getState()) {
                state = thread.getState();
                System.out.println(state);
            }
        }
    }
}
