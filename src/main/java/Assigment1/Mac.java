package Assigment1;

public class Mac extends OS{

    private boolean hasSecurity;
    private boolean hasCloud;

    public Mac(String name, int price, boolean hasSecurity, boolean hasCloud) {
        super(name, price);
        this.hasSecurity = hasSecurity;
        this.hasCloud = hasCloud;

    }

    public boolean isHasSecurity() {
        return hasSecurity;
    }

    public void setHasSecurity(boolean hasSecurity) {
        this.hasSecurity = hasSecurity;
    }

    public boolean isHasCloud() {
        return hasCloud;
    }

    public void setHasCloud(boolean hasCloud) {
        this.hasCloud = hasCloud;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "hasSecurity=" + hasSecurity +
                ", hasCloud=" + hasCloud +
                '}';
    }
}
