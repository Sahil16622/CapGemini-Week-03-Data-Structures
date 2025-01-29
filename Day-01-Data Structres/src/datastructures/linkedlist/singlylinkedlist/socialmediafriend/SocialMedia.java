package datastructures.linkedlist.singlylinkedlist.socialmediafriend;


import java.util.*;


class SocialMedia {
    private User head;

    // Add a new user to the list
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + name);
    }

    // Find user by ID
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friends.contains(userId2)) {
            user1.friends.add(userId2);
            user2.friends.add(userId1);
            System.out.println(user1.name + " and " + user2.name + " are now friends.");
        } else {
            System.out.println("They are already friends.");
        }
    }

    // Remove a friend connection
    public void removeFriend(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (user1.friends.contains(userId2)) {
            user1.friends.remove(Integer.valueOf(userId2));
            user2.friends.remove(Integer.valueOf(userId1));
            System.out.println("Friendship removed between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("They are not friends.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        if (user.friends.isEmpty()) {
            System.out.println("No friends added.");
            return;
        }

        for (int friendId : user.friends) {
            User friend = findUserById(friendId);
            System.out.println(friend.name + " (ID: " + friendId + ")");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        Set<Integer> mutualFriends = new HashSet<>(user1.friends);
        mutualFriends.retainAll(user2.friends);

        System.out.println("Mutual Friends between " + user1.name + " and " + user2.name + ":");
        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int friendId : mutualFriends) {
                User friend = findUserById(friendId);
                System.out.println(friend.name + " (ID: " + friendId + ")");
            }
        }
    }

    // Search for a user by Name or User ID
    public void searchUser(String query) {
        User temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(query) || String.valueOf(temp.userId).equals(query)) {
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + ")");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friend(s).");
            temp = temp.next;
        }
    }
}

