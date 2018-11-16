package br.msc.sendfiletoip.model;

public class LabelDataParams {
    private String companyName;
    private String companyEmail;
    private String companyCity;
    private String companyZipCode;
    private String barcode;



    private final String companyNameZPLParam = "__company__";
    private final String companyEmailZPLParam = "__address@company__";
    private final String companyCityZPLParam = "__city__";
    private final String companyZipCodeZPLParam = "__zip_code__";
    private final String barcodeZPLParam = "__barcode__";




    public LabelDataParams(String companyName ,String companyEmail, String companyCity, String companyZipCode, String barcode) {
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.companyCity = companyCity;
        this.companyZipCode = companyZipCode;
        this.barcode = barcode;

    }


    // label params to file
    public String ConfigDataToZPL(String labelDataString){
        String _label = labelDataString
                .replace(companyNameZPLParam, companyName)
                .replace(companyEmailZPLParam,companyEmail)
                .replace(companyCityZPLParam,companyCity)
                .replace(companyZipCodeZPLParam,companyZipCode)
                .replace(barcodeZPLParam, barcode);

        return  _label;
    }

    //Todo: Implements
    //public void IsValid(){}
}
