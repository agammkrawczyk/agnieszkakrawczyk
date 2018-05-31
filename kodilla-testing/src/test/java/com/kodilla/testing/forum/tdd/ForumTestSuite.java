package com.kodilla.testing.forum.tdd;
import org.assertj.core.api.Assert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.*;

import static org.assertj.core.api.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


        @Test
        public void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

            //When
            forumUser.addPost("mrsmith",
                    "Hello everyone, this is my first contribution here!");

            //Then
            assertEquals( 1, forumUser.getPostsQuantity() );
        }

            @Test
            public void testAddComment(){
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");

                //When
                forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

                //Then
                assertEquals(1, forumUser.getCommentsQuantity());
            }

            @Test
            public void testGetPost() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");
                forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

                //When
                ForumPost retrievedPost;
                retrievedPost = forumUser.getPost(0);

                //Then
                assertEquals(thePost, retrievedPost);
            }

            @Test
            public void testGetComment() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");
                ForumComment theComment = new ForumComment(thePost, "mrsmith",
                        "Thank you for all good words!");
                forumUser.addComment(thePost, theComment.getAuthor(),
                        theComment.getCommentBody());

                //When
                ForumComment retrievedComment = forumUser.getComment(0);

                //Then
                assertEquals(theComment, retrievedComment);
            }

            @Test
            public void testRemovePostNotExisting() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");

                //When
                boolean result = forumUser.removePost(thePost);

                //Then
                assertFalse(result);
            }

            @Test
            public void testRemoveCommentNotExisting() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");
                ForumComment theComment = new ForumComment(thePost, "mrsmith",
                        "Thank you for all good words!");

                //When
                boolean result = forumUser.removeComment(theComment);

                //Then
                assertFalse(result);
            }
            @Test
            public void testRemovePost() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");
                forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

                //When
                boolean result = forumUser.removePost(thePost);

                //Then
                assertTrue(result);
                assertEquals(0, forumUser.getPostsQuantity());
            }

            @Test
            public void testRemoveComment() {
                //Given
                ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                ForumPost thePost = new ForumPost("Hello everyone, " +
                        "this is my first contribution here!", "mrsmith");
                ForumComment theComment = new ForumComment(thePost, "mrsmith",
                        "Thank you for all good words!");
                forumUser.addComment(thePost, theComment.getAuthor(),
                        theComment.getCommentBody());

                //When
                boolean result = forumUser.removeComment(theComment);

                //Then
                assertTrue(result);
                assertEquals(0, forumUser.getCommentsQuantity());
            }


        }











