package br.msc.sendfiletoip.model;

import br.msc.sendfiletoip.assertion.Strings;
import br.msc.sendfiletoip.util.PrintHelper;
import com.zebra.sdk.comm.ConnectionException;

public class Printer {

    private String Ip;
    private String PrinterName;

    public Printer(String ip, String printerName)
    {
        Ip = ip;

        if(Strings.IsNullOrEmpty(printerName)) printerName = "unknown";
        else PrinterName = printerName;

    }


    public void PrintToIp(String labelStringData){

        try {
            PrintHelper
                    .sendZplOverTcp( this.Ip, labelStringData);

        }
        catch (ConnectionException e)
        {
            String em = e.getMessage();
//            JOptionPane pane = JOptionPane.showMessageDialog();
        }

    }


    //Todo: Implements
    //public void IsValid(){}

}
