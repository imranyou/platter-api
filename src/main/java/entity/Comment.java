package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by iyousuf.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

    private Long id;
    private String description;
    private int upVote;
    private int downVote;

    public Comment(Long id, String description, int upVote, int downVote) {
        this.id = id;
        this.description = description;
        this.upVote = upVote;
        this.downVote = downVote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                '}';
    }
}
