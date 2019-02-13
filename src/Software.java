public final class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){

    }

    public Software(String programmer, String platform, String os) {
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String toString() {
        return super.toString() +
                "Platform:           " + platform + "\n" +
                "OS:                 " + os + "\n";
    }

    @Override
    public boolean equals(Object s){
        Software s1 = (Software) s;
        if (getProgrammer()==(s1.getProgrammer())){
            return true;
        } else {
            return false;
        }
    }
}