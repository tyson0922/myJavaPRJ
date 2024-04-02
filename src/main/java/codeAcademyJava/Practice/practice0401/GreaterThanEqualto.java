package codeAcademyJava.Practice.practice0401;

public class GreaterThanEqualto {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);
    }
}
