package cn.howe.ujs.model;

public class WrapPolice extends Tbpolice {
    private String onTimeStr;
    private String offTimeStr;
    private String weekend;

    public String getOnTimeStr() {
        return onTimeStr;
    }

    public void setOnTimeStr(String onTimeStr) {
        this.onTimeStr = onTimeStr;
    }

    public String getOffTimeStr() {
        return offTimeStr;
    }

    public void setOffTimeStr(String offTimeStr) {
        this.offTimeStr = offTimeStr;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }
}
