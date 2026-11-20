package first.robot;

public class Account {
    private String username;

    /**
     * Creates a username based on the parameter requestedName. If the
     * username is unavailable, appends successive integers, beginning
     * with 1, to requestedName until an available username is found,
     * as described in part (a).
     */
    public Account(String requestedName) {
        int counter = 1;
        if (isAvailable(requestedName)){
            this.username = requestedName;
        }
        else {
            while (!isAvailable(requestedName + counter)) {
                counter++;
            }

            this.username = requestedName + counter;
        }
    }

    /**
     * Returns true if the parameter str is an available username;
     * returns false otherwise.
     */
    public static boolean isAvailable(String str)
    { /* implementation not shown */ }

    /**
     * Returns a shortened version of username with each hyphen ("-")
     * and the character before it removed, as described in part (b)
     * Preconditions: username does not start or end with a hyphen.
     * username does not contain consecutive hyphens.
     * username.length() >= 2
     * Postcondition: username is unchanged.
     */
    public String getShortenedName() {
        String initialName = this.username;
        int index = initialName.indexOf("-");

        while(index != -1){
            initialName = initialName.substring(0,index-1);

            index = initialName.indexOf("-");
        }

        return initialName;
    }
}