package datastructures.linkedlist.singlylinkedlist.socialmediafriend;

public class UseSocialMediaApp {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        // Adding users
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 27);
        sm.addUser(3, "Charlie", 22);
        sm.addUser(4, "David", 30);

        // Adding friend connections
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        // Display friends
        sm.displayFriends(1);
        sm.displayFriends(3);

        // Find mutual friends
        sm.findMutualFriends(1, 3);
        sm.findMutualFriends(1, 4);

        // Search for a user
        sm.searchUser("Alice");
        sm.searchUser("3");

        // Count friends for each user
        sm.countFriends();

        // Remove friend connection
        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}

