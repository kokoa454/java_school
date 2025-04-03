public class Test {
    public static void main(String[] args) throws Exception {
    //     class Sushi {
    //         String name;
    //         int price;
    //         String type;

    //         Sushi(String name, int price, String type) {
    //             this.name = name;
    //             this.price = price;
    //             this.type = type;
    //         }

    //         public void printInfo() {
    //             System.out.println(name + " 値段: " + price + "円 種類: " + type);
    //         }
    //     }

    //     Sushi tuna = new Sushi("マグロ", 100, "赤身");
    //     Sushi seaBream = new Sushi("鯛", 100, "白身");

    //     tuna.printInfo();
    //     seaBream.printInfo();

        class Member {
            String name;
            int posno;
            String address;

            Member(String name, int posno, String address) {
                this.name = name;
                this.posno = posno;
                this.address = address;
            }

            public void printInfo() {
                System.out.println("名前: " + name);
                System.out.println("郵便番号: " + posno);
                System.out.println("住所: " + address);
            }
        }

        Member taro = new Member("太郎", 1111111, "浜松市A区-1");
        taro.printInfo();
    }
}
