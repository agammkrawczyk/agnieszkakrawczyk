package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQuantity;

    public ForumUser(final int identifier, final String userName, final char sex, final int day, final int month, final int year, final int postsQuantity) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of( year, month, day );
        this.postsQuantity = postsQuantity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthYear() {
        return birthDate.getYear();
    }

    public int getBirthMonth() {
        return birthDate.getMonthValue();
    }

    public int getBirthDay() {
        return birthDate.getDayOfMonth();
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "Username: " + userName + ", sex: " + sex + ", birth date: " + birthDate + ", posts quantity: " + postsQuantity;

    }

}
