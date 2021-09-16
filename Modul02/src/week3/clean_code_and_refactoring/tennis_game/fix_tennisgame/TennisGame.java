package week3.clean_code_and_refactoring.tennis_game.fix_tennisgame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isScoreEqual = player1Score == player2Score;
        boolean isFinalScore = player1Score >= 4 || player2Score >= 4;
        if (isScoreEqual) return getDisplayScoreEqual(player1Score);
        if (isFinalScore) return getDisplayFinalGame(player1Name,player2Name,player1Score, player2Score);
        String displayPlayerScore = player1Name + " " + getDisplayPlayerScore(player1Score)
                                   + " - "
                                   + getDisplayPlayerScore(player2Score) + " " + player2Name;
        return displayPlayerScore;

    }

    public static String getDisplayScoreEqual(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getDisplayFinalGame(String player1Name, String player2Name, int player1Score, int player2Score) {
        int distanceScore = player1Score - player2Score;
        if (distanceScore == 1) return "Advantage player : "+ player1Name;
        if (distanceScore == -1) return "Advantage player : "+ player2Name;
        if (distanceScore >= 2) return "Win for player " + player1Name ;
        return "Win for player "+ player2Name;
    }

    public static String getDisplayPlayerScore(int playerScore){
        String str ="" ;
        switch (playerScore) {
            case 0:
                str = "Love";
                break;
            case 1:
                str ="Fifteen";
                break;
            case 2:
                str = "Thirty";
                break;
            case 3:
                str = "Forty";
                break;
        }
        return str ;
    }
}
