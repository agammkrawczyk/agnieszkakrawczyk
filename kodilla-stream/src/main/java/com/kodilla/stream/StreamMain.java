package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum= new Forum();

        Map<Integer,ForumUser>theResultStringofUsers=theForum.getUserList().stream()


       .filter(ForumUser -> ForumUser.getBirthYear() < LocalDate.now().getYear() -20 )
                .filter(ForumUser-> ForumUser.getSex()=='M')
                .filter( ForumUser->ForumUser.getPostsQuantity()>0 )
                .collect( Collectors.toMap( ForumUser::getIdentifier,ForumUser->ForumUser ) );


        System.out.println(theResultStringofUsers);
    }

}




