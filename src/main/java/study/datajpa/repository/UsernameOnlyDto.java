package study.datajpa.repository;

public class UsernameOnlyDto {

    public final String username;

    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
