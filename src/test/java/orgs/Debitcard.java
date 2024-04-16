package orgs;

import lombok.Getter;
import lombok.Setter;

public class Debitcard {


    private String masterCard;

    public String getMasterCard() {
        return masterCard;
    }

    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    private String visa;
}
