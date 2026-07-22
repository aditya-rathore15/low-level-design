package patterns.decorator;

public class EncryptionDecorator implements DataSource{
    private DataSource dataSource;

    public EncryptionDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        dataSource.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = dataSource.readData();
        return encryptedData;
    }

    private String encrypt(String data) {
        return "Encrypted(" + data + ")";
    }

    private String decrypt(String data) {
        return data.replace("Encrypted(", "").replace(")", "");
    }

}
