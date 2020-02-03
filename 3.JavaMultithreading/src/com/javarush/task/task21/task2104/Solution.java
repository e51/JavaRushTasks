package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    public boolean equals(Solution n) {
//        return n.first.equals(first) && n.last.equals(last);
//    }
//
//    public int hashCode() {
//        return 31 * first.hashCode() + last.hashCode();
//    }
//


    @Override
    public int hashCode() {
        if (first == null || last == null) return 0;
        return 31 * first.hashCode() + last.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Solution guest = (Solution) obj;

        return (first == guest.first || (first != null && first.equals(guest.first))) && (last == guest.last || (last != null && last.equals(guest.last)));
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
