package javaexercises.practice.operators;

public class Exercise18 {
    public static void main(String[] args) {

        boolean isAdmin = false;
        boolean isModerator = true;
        boolean isPremium = false;

        boolean isAdminOrModerator = isAdmin || isModerator;
        boolean isAdminAndModerator = isAdmin && isModerator;
        boolean isPremiumOrModerator = isPremium || isModerator;

        System.out.println(!isPremium);
        System.out.println("This is Admin or Moderator? " + isAdminOrModerator);
        System.out.println("This is Admin and Moderator? " + isAdminAndModerator);
        System.out.println("This is Premium or Moderator? " + isPremiumOrModerator);
    }
}
