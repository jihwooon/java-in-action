package core;

import java.util.ArrayList;

public class Network {

    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void deactivate() {
            members.remove(this);
        }

        public void addFriend(Member newFriends) {
            friends.add(newFriends);
        }

        public String toString() {
            StringBuilder result = new StringBuilder(name);
            result.append(" with friends");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }
    }

    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public String toString() {
        return members.toString();
    }

    public static void main(String[] args) {
        Network myFace = new Network();
        Network tooter = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.new Member("Wilma");
        // 네트워크에 등록되지 않은 객체다.
        // 이 문제를 피하려면 생성자를 비공개로 만들어야 한다.
        fred.addFriend(wilma);

        Network.Member barney = tooter.enroll("Barney");
        fred.addFriend(barney);
        System.out.println(myFace);
        // 다른 네트워크에 속한 친구를 추가할 수 없게 하려면
        // belongsTo를 호출해야 한다.
        System.out.println(barney.belongsTo(myFace));
    }
}


