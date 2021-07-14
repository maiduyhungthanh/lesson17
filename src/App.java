public class App {
    public static void main(String[] args) throws Exception {
        Readjson readjson = new Readjson();
        System.out.println("Kho Sách Giao Khoa");
        readjson.getData();
        System.out.println();
        System.out.println("Kho Đồ Án");
        readjson.getProject();
        System.out.println();
        System.out.println("Tài Liệu Điện Tử");
        readjson.getElectronic();
    }
}
