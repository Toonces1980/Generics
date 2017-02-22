package pajerowski.tony;

/**
 * Created by anthonypajerowski on 2/22/17.
 */
public class TrialClass {

    public static void main(String[] args) {
        MyArrayList<String> inty = new MyArrayList<String>();
        MyArrayList otherWay = new MyArrayList();
        inty.add("frog");
        inty.add("goat");
        inty.add("horse");
        System.out.println(inty.get(0));
        System.out.println(inty.get(1));
        System.out.println(inty.get(2));
        System.out.println(inty.size());
        otherWay.add("alien");
        otherWay.add("martian:");
        otherWay.add("earthling");
        System.out.println(otherWay.get(2));
        System.out.println(otherWay.size());

    }
}

