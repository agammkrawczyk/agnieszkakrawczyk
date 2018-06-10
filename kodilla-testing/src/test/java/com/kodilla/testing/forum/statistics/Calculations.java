package com.kodilla.testing.forum.statistics;

public class Calculations  {
    private int userQuanitity;
    private int postsQuanitity;
    private int commentsQuanitity;
    private double averagePostsOfUsers;
    private double averageCommmentsOfUsers;
    private double averageCommmentsOfPosts;


   public void calculateAdvStatistics(Statistics statistics) {
       userQuanitity = statistics.usersNames().size();
       postsQuanitity = statistics.postsCount();
       commentsQuanitity = statistics.commentsCount();
       if (userQuanitity > 0) {
           averagePostsOfUsers = postsQuanitity / userQuanitity;
       } else {
           averagePostsOfUsers = 0;
       }
       if (userQuanitity > 0) {
           averageCommmentsOfUsers = commentsQuanitity / userQuanitity;
       } else {
           averageCommmentsOfUsers = 0;
       }
       if (postsQuanitity > 0) {
           averageCommmentsOfPosts = commentsQuanitity / postsQuanitity;
       } else {
           averageCommmentsOfPosts = 0;
       }
   }

}
