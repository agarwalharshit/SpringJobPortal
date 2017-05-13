package sjsu.cmpe275.jobprotal.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
