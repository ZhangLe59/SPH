package zhangle.example.com.sph.bean;

import java.io.Serializable;

public class ResultData implements Serializable {
    private String helpdata;
    private String successcode;
    private MobileData mobiledata;

    public ResultData(String helpdata, String successcode, MobileData mobiledata) {
        this.helpdata = helpdata;
        this.successcode = successcode;
        this.mobiledata = mobiledata;
    }

    public String getHelpdata() {
        return helpdata;
    }

    public void setHelpdata(String helpdata) {
        this.helpdata = helpdata;
    }

    public String getSuccesscode() {
        return successcode;
    }

    public void setSuccesscode(String successcode) {
        this.successcode = successcode;
    }

    public MobileData getMobiledata() {
        return mobiledata;
    }

    public void setMobiledata(MobileData mobiledata) {
        this.mobiledata = mobiledata;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "helpdata='" + helpdata + '\'' +
                ", successcode='" + successcode + '\'' +
                ", mobiledata=" + mobiledata +
                '}';
    }
}

