package patterns.decorator;

public class CompressionDecorator implements DataSource {
    private DataSource source;

    public CompressionDecorator(DataSource source) {
        this.source = source;
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        source.writeData(compressedData);
    }

    @Override
    public String readData() {
        String compressedData = source.readData();
        return decompress(compressedData);
    }

    private String compress(String data) {
        return "Compressed(" + data + ")";
    }

    private String decompress(String data) {
        return data.replace("Compressed(", "").replace(")", "");
    }
}
