package br.msc.sendfiletoip.assertion;

public class Strings {
    public static boolean IsNullOrEmpty(String string)
    {
        if(string == null || string.isEmpty()) return true;
        else return false;
    }
}
