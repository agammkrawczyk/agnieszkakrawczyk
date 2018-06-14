package com.kodilla.testing.forum.statistics;

public class Calculations {
    private double userQuanitity;
    private double postsQuanitity;
    private double commentsQuanitity;
    private double averagePostsOfUsers;
    private double averageCommmentsOfUsers;
    private double averageCommmentsOfPosts;


    public void calculateAdvStatistics(Statistics statistics) {
        userQuanitity = statistics.usersNames().size();
        postsQuanitity = statistics.postsCount();
        commentsQuanitity = statistics.commentsCount();
        if (userQuanitity > 0) {
            averagePostsOfUsers = postsQuanitity / userQuanitity;
            averageCommmentsOfUsers = commentsQuanitity / userQuanitity;
        } else {
            averagePostsOfUsers = 0;
            averageCommmentsOfUsers = 0;
        }
        if (postsQuanitity > 0) {
            averageCommmentsOfPosts = commentsQuanitity / postsQuanitity;
        } else {
            averageCommmentsOfPosts = 0;
        }
    }

    public double getUserQuanitity() {
        return userQuanitity;
    }

    public double getPostsQuanitity() {
        return postsQuanitity;
    }

    public double getCommentsQuanitity() {
        return commentsQuanitity;
    }

    public double getAveragePostsOfUsers() {
        return averagePostsOfUsers;
    }

    public double getAverageCommmentsOfUsers() {
        return averageCommmentsOfUsers;
    }

    public double getAverageCommmentsOfPosts() {
        return averageCommmentsOfPosts;
    }
}
