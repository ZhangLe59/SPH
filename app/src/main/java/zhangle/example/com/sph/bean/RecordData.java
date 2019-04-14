package zhangle.example.com.sph.bean;

import java.io.Serializable;

public class RecordData implements Serializable {
    private String id;
    private String quarter;
    private String volumeofmobiledata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getVolumeofmobiledata() {
        return volumeofmobiledata;
    }

    public void setVolumeofmobiledata(String volumeofmobiledata) {
        this.volumeofmobiledata = volumeofmobiledata;
    }

    @Override
    public String toString() {
        return "RecordData{" +
                "id='" + id + '\'' +
                ", quarter='" + quarter + '\'' +
                ", volumeofmobiledata='" + volumeofmobiledata + '\'' +
                '}';
    }

    public RecordData(String id, String quarter, String volumeofmobiledata) {
        this.id = id;
        this.quarter = quarter;
        this.volumeofmobiledata = volumeofmobiledata;
    }
}


