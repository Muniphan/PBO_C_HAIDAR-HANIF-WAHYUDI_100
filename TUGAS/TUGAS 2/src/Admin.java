class Admin {
    String username = "admin100";
    String password = "password100";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
    public void displayInfo() {
    }
}