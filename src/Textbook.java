public class Textbook extends Book implements IKho , IMuon{

    private int page;
    private String status;
    private int amount;
    private int borrow;

    public Textbook(int id, String name, String publishing, int year, int page, String status, int amount, int borrow) {
        super(id, name, publishing, year);
        this.page = page;
        this.status = status;
        this.amount = amount;
        this.borrow = borrow;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }

    @Override
    public int inventory() {
        // TODO Auto-generated method stub
        return amount - borrow;
    }

    @Override
    public String location() {
        // TODO Auto-generated method stub
        if (getYear() < 2000) {
            return " Kho sách cũ ";
        }
        if (getYear() >= 2000) {
            return " Kho sách mới";
        }
        return "";
        
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()   +"-" +status+" - "+page +" trang-Số lượng ban đầu : " +amount +"-Tồn kho : " + inventory()  +"-"+ location ();
    }
}
