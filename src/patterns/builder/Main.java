package patterns.builder;

public class Main {

    public static void main(String[] args) {

        HttpRequest request = new HttpRequest.Builder()
                .url("https://api.example.com")
                .method("POST")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer token")
                .body("{\"key\":\"value\"}")
                .build();

        System.out.println(request);
    }
}