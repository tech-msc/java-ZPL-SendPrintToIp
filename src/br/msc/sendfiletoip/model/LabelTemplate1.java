package br.msc.sendfiletoip.model;

import br.msc.sendfiletoip.util.LabelReader;

public class LabelTemplate1 {

    public LabelTemplate1(LabelDataParams labelData, Printer printer ) {
        this.labelData = labelData;
        this.printer = printer;
        // Config Label (get ZPL file )
        Config();
    }


    // Printer Params
    private Printer printer;

    // Label Params
    private LabelDataParams labelData;

    // Label File to String (ZPL format)
    private String labelDataString;

    private String labelToPrinter;

    private void Config(){
        labelDataString = new LabelReader().GetLabel();
        labelToPrinter = this.labelData.ConfigDataToZPL(labelDataString);
    }

    public void PrintZPL(){
        printer.PrintToIp(this.labelToPrinter);
    }

    //Todo: Implements
    //public void IsValid(){}

}

