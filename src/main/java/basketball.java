public class basketball {

    private int points;
    private String lastname;
    private int number;

    public basketball(int p, String l, int n){
        points = p;
        lastname = l;
        number = n;
    }

    public int getNumber(){
        return number;
    }

    public int getPoints(){
        return points;
    }

    public String getLastname(){
        return lastname;
    }

    public void score(int x){
        points = points + x;
    }

    public void changename(String newname){
        lastname = newname;
    }

    public String toString(){
        String alldata = "Your number is " + number + " and the name on your jersey is " + lastname + " and you've scored this many points: " + points;
        return alldata;
    }








}
