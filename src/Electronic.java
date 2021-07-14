public class Electronic extends Book implements IElectronic{
    private long capacity;
    private long dowload;
    private long price;
    public Electronic(int id, String name, String publishing, int year, long capacity, long dowload, long price) {
        super(id, name, publishing, year);
        this.capacity = capacity;
        this.dowload = dowload;
        this.price = price;
    }
    public long getCapacity() {
        return capacity;
    }
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    public long getDowload() {
        return dowload;
    }
    public void setDowload(long dowload) {
        this.dowload = dowload;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    @Override
    public long total() {
        // TODO Auto-generated method stub
        price = 1000;
        return capacity*dowload*price;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+capacity+"KB-Số lượt tải "+dowload+"-Tổng tiền :" +total()+" VNĐ";
    }
    
}
