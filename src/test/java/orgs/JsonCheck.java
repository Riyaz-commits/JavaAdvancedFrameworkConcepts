package orgs;

import io.restassured.RestAssured;
import org.checkerframework.checker.units.qual.C;

public class JsonCheck {

    public static void main(String[] args) {
        Card c = new Card();

        Creditcard cr = new Creditcard();
        LoanAccount la = new LoanAccount();
        la.setHouseLoan("CANFIN HOME");
        la.setLandLoan("MargaDarsi");
        cr.setAxis(la);
        Debitcard dc = new Debitcard();
        dc.setMasterCard("Vijayawada branch");
        dc.setVisa("VISA Guntur");
        cr.setHdfc(la);

        c.setCrCard(cr);
        c.setDbCard(dc);
Bank b = new Bank();
b.setCards(c);
        RestAssured.given().log().all().body(b).when().get().prettyPeek();
    }

}

