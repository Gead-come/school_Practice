package interAddrese.tcp4;

import java.util.UUID;

public class UUIDT {
    public static void main(String[] args) {

        String name = UUID.randomUUID().toString().replace("-", "");
        System.out.println(name);
    }
}
