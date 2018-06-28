package stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int id, String userName, char gender, LocalDate birthDate, int postNumber) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
