package br.msc.sendfiletoip.util;

import com.zebra.sdk.comm.Connection;
import com.zebra.sdk.comm.ConnectionException;
import com.zebra.sdk.comm.TcpConnection;

public class PrintHelper {

    public static void sendZplOverTcp(String theIpAddress, String labelToString) throws ConnectionException {
        // Instantiate connection for ZPL TCP port at given address
        Connection thePrinterConn = new TcpConnection(theIpAddress, TcpConnection.DEFAULT_ZPL_TCP_PORT);

        try {
            // Open the connection - physical connection is established here.
            thePrinterConn.open();

            // This example prints "This is a ZPL test." near the top of the label.
            // String zplData = "^XA^FO20,20^A0N,25,25^FDThis is a ZPL test.^FS^XZ";

            String zplData = labelToString;

            // Send the data to printer as a byte array.
            thePrinterConn.write(zplData.getBytes());
        } catch (ConnectionException e) {
            // Handle communications error here.
            e.printStackTrace();
        } catch (Exception e) {
            String em = e.getMessage();
        } finally {
            // Close the connection to release resources.
            thePrinterConn.close();
        }
    }



}
