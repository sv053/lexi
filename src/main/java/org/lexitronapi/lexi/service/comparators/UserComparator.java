package org.lexitronapi.lexi.service.comparators;

import org.lexitronapi.lexi.entities.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
