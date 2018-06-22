package com.kodilla.stream.forumuser;
import java.util.List;
import java.util.ArrayList;


public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add( new ForumUser( 1, "mama", 'F', 5, 12, 1984, 10 ) );
        theUserList.add( new ForumUser( 2, "tata", 'M', 5, 10, 1983, 5 ) );
        theUserList.add( new ForumUser( 3, "Maurycy", 'M', 27, 12, 2014, 3 ) );
        theUserList.add( new ForumUser( 4, "Winenty", 'M', 23, 4, 2017, 1 ) );
        theUserList.add( new ForumUser( 5, "uncle", 'M', 28, 11, 1983, 3 ) );
        theUserList.add( new ForumUser( 6, "aunt", 'F', 23, 7, 1987, 5 ) );
        theUserList.add( new ForumUser( 7, "grandpapa", 'M', 12, 11, 1956, 0 ) );
        theUserList.add( new ForumUser( 8, "grandmma", 'F', 1, 1, 1961, 1 ) );
    }

        public List<ForumUser> getUserList(){
            return new ArrayList<>(theUserList );
        }

    }
