package entity;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by iyousuf.
 */
public class Space {

    private long id;

    private boolean isGeneral;

    private ArrayList<User> lstUsers;

    private ArrayList<Comment> lstComments;

    private Idea post;


    public Space(long id, boolean isGeneral, ArrayList<User> lstUsers, ArrayList<Comment> lstComments, Idea post) {
        this.id = id;
        this.isGeneral = isGeneral;
        this.lstUsers = lstUsers;
        this.lstComments = lstComments;
        this.post = post;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public void setGeneral(boolean general) {
        isGeneral = general;
    }

    public ArrayList<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(ArrayList<User> lstUsers) {
        this.lstUsers = lstUsers;
    }

    public ArrayList<Comment> getLstComments() {
        return lstComments;
    }

    public void setLstComments(ArrayList<Comment> lstComments) {
        this.lstComments = lstComments;
    }

    public Idea getPost() {
        return post;
    }

    public void setPost(Idea post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Space{" +
                "id=" + id +
                ", isGeneral=" + isGeneral +
                ", lstUsers=" + lstUsers +
                ", lstComments=" + lstComments +
                ", post=" + post +
                '}';
    }
}
