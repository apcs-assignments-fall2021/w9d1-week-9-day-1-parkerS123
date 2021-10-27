public class clientbasketball {

    public static void main(String[] args) {

        basketball player = new basketball(0, "Curry", 30);

        System.out.println(player.getNumber());
        player.score(2);
        System.out.println(player.getPoints());
        player.changename("Lin");
        System.out.println(player.getLastname());
        System.out.println(player.toString());
    }
}
