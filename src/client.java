public class client {
    public static void main(String[] args) {
        String rekordBarang = "Nama Barang,Harga\nKursi,Rp. 150,000\nMeja,Rp. 250,000";
        dataSourcedecor encoded = new kompresiDecor(
                new enkripsiDecor(
                        new dataSourcefile("out/OutputDemo.txt")));
        encoded.writeData(rekordBarang);
        dataSource plain = new dataSourcefile("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(rekordBarang);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
