package datastructures.linkedlist.singlylinkedlist.socialmediafriend;

import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends; // List of Friend IDs
    User next; // Pointer to the next user in the list

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

