package orgs;

import lombok.Getter;
import lombok.Setter;

public class Creditcard {


    private LoanAccount axis;

    public LoanAccount getAxis() {
        return axis;
    }

    public LoanAccount getHdfc() {
        return hdfc;
    }

    public void setAxis(LoanAccount axis) {
        this.axis = axis;
    }

    public void setHdfc(LoanAccount hdfc) {
        this.hdfc = hdfc;
    }

    private LoanAccount hdfc;
}
