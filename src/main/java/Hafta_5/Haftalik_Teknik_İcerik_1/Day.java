package Hafta_5.Haftalik_Teknik_İcerik_1;

public enum Day{
    PAZARTESİ("09.00 - 17.00"),
    SALI("09.00 - 17.00"),
    ÇARŞAMBA("09.00 - 17.00"),
    PERŞEMBE("09.00 - 17.00"),
    CUMA("09.00 - 17.00"),
    CUMARTESİ("09.00 - 13.00"),
    PAZAR("KAPALI");

    private String workingHours;

    Day (String workingHours){
        this.workingHours = workingHours;
    }

    public String getWorkingHours(){
        return workingHours;
}
}
