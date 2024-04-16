package orgs;

public class LoanAccount {

    public String getHouseLoan() {
        return houseLoan;
    }

    public void setHouseLoan(String houseLoan) {
        this.houseLoan = houseLoan;
    }

    public String getLandLoan() {
        return landLoan;
    }

    public void setLandLoan(String landLoan) {
        this.landLoan = landLoan;
    }

    private String houseLoan;
    private String landLoan;
}
