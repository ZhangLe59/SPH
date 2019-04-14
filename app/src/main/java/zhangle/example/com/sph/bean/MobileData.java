package zhangle.example.com.sph.bean;

import java.io.Serializable;
import java.util.List;

public class MobileData implements Serializable {
    private String resourceid;
    private String limit;
    private String total;
    private List<RecordData> recordDataList;
    private LinkData linkdata;

}
