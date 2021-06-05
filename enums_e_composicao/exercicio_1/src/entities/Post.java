package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(){
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Integer addLikes(Integer likes){
        return this.likes += likes;
    }

    public Integer removeLikes(Integer likes){
        return this.likes -= likes;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

//    public void listComment(){
//        for(Comment c : comments) {
//            System.out.println(c.getText());
//        }
//        System.out.println();
//    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title.toUpperCase() + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();

//        return title.toUpperCase()
//                + "\n"
//                + likes
//                + " Likes - "
//                + sdf.format(moment)
//                + "\n"
//                + content
//                + "\n"
//                + "Comments: ";
    }
}