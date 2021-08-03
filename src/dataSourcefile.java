import java.io.*;


public class dataSourcefile implements dataSource{
    private String namaBarang;

    public dataSourcefile(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Override
    public void writeData(String data) {
        File file = new File(namaBarang);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(namaBarang);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
