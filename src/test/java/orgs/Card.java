package orgs;

import lombok.Getter;
import lombok.Setter;


public class    Card {

    public Creditcard getCrCard() {
        return crCard;
    }

    public void setCrCard(Creditcard crCard) {
        this.crCard = crCard;
    }

    public Debitcard getDbCard() {
        return dbCard;
    }

    public void setDbCard(Debitcard dbCard) {
        this.dbCard = dbCard;
    }

    private Creditcard crCard;
    private Debitcard dbCard;
}
