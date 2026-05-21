import java.util.Arrays;

public class WorkShop {


    public static void main(String[] args) {
        Friend[] friends = new Friend[6];
        friends[0] = new Friend("Вася", 18);
        friends[1] = new Friend("Катя",19);
        friends[2] = new Friend("Дима",20);
        friends[3] = new Friend("Даня", 23);
        friends[4]= new Friend("Миша",24);
        friends[5]= new Friend("Кирилл", 25);

        System.out.println("My friends: " + Arrays.toString(friends));
    }
}

class Friend {

    String isFriendFromSchool;

    float hoursSpentTogetherLastWeek;

    public Friend(String isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "isFriendFromSchool=" + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
}