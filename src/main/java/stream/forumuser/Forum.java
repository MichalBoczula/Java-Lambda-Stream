package stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public List<ForumUser> getUserList(List<ForumUser> forumUsersList){
                return new ArrayList<>(forumUsersList);
    }
}
