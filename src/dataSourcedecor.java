public class dataSourcedecor implements dataSource{
    private dataSource wrap;

    dataSourcedecor(dataSource source) {
        this.wrap = source;
    }

    @Override
    public void writeData(String data) {
        wrap.writeData(data);

    }

    @Override
    public String readData() {
        return wrap.readData();
    }
}
