package de.muffinanddonut.jnincurses;

public class JniNcurses {
    static {System.loadLibrary("jnincurses");}
    public native synchronized void init();
    public native synchronized void print(String str, int x, int y);
    public native synchronized void refresh();
    public native synchronized void deleteln();
    public native synchronized void attron(int attribute);
    public native synchronized void attroff(int attribute);
    public native synchronized int[] getmaxyx();
    public native synchronized int getch();
    public native synchronized void move(int x, int y);
    public native synchronized void clear();
    public native synchronized void dispose();
}
