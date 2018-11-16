package teste;

import br.msc.sendfiletoip.model.LabelDataParams;
import br.msc.sendfiletoip.model.LabelTemplate1;
import br.msc.sendfiletoip.model.Printer;

public class ConsoleTeste {

    public static void main(String[] a)
    {
//        LabelReader reader = new LabelReader();
//
//        String label = reader.GetLabel();
//
//        if( Strings.IsNullOrEmpty(label) )
//        {
//            System.out.println("Vazio");
//        }
//        else System.out.println("Valor: " + label.toString());
//
//
//        try {
//            PrintHelper.sendZplOverTcp("127.0.0.1",label);
//        }
//        catch (ConnectionException cexp)
//        {
//            String cexpm = cexp.getMessage();
//            System.out.println("Erro: " + cexpm);
//        }
        Printer printer = new Printer("127.0.0.1", "ZT-XYZ");

        LabelDataParams ldp = new LabelDataParams(
                "myCompany1",
                "company@email.com",
                "Fortaleza",
                "60833-005",
                "9876543210");

        LabelTemplate1 lb = new LabelTemplate1(ldp,printer);

        lb.PrintZPL();

    }



}