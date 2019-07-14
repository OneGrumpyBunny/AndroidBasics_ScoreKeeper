package android.example.com.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * GLOBALS
     */
    int usaScore = 0;
    int usaCard = 0;
    int nedScore = 0;
    int nedCard = 0;
    String winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamUSA(usaScore);
        displayForTeamNED(nedScore);
        displayCardsForTeamUSA(usaCard);
        displayCardsForTeamNED(nedCard);
    }

    /**
     * increment score for USA
     */

    public void addOneForTeamUSA(View v) {
        usaScore = usaScore + 1;
        displayForTeamUSA(usaScore);
    }

    /**
     * increment score for NED
     */

    public void addOneForTeamNED(View v) {
        nedScore = nedScore + 1;
        displayForTeamNED(nedScore);
    }

    /**
     * increment cards for USA
     */

    public void addCardsForTeamUSA(View v) {
        usaCard = usaCard + 1;
        displayCardsForTeamUSA(usaCard);
    }

    /**
     * increment cards for NED
     */

    public void addCardsForTeamNED(View v) {
        nedCard = nedCard + 1;
        displayCardsForTeamNED(nedCard);
    }


    /**
     * Determines the winning team.
     */
    public void WinningTeam(View v) {
        TextView scoreView = (TextView) findViewById(R.id.winning_team);

        if (usaScore > nedScore) {
            winner = "USA WINS!";
        } else {
            winner = "NED WINS!";
        }
        if (usaScore == nedScore) {
            winner = "It's a tie!";
        }
        displayWinningTeam(winner);
    }

    /**
     * resets the score and card counters
     */
    public void resetScore(View v) {
        usaScore = 0;
        usaCard = 0;
        nedScore = 0;
        nedCard = 0;
        winner = "";
        displayForTeamUSA(usaScore);
        displayCardsForTeamUSA(usaCard);
        displayForTeamNED(nedScore);
        displayCardsForTeamNED(nedCard);
        displayWinningTeam(winner);
    }

    /**
     * Displays the given score for Team USA.
     */
    public void displayForTeamUSA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_USA_score);
        String pts = score + " pts";
        scoreView.setText(pts);
    }

    /**
     * Displays the given cards for Team USA.
     */
    public void displayCardsForTeamUSA(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_USA_card);
        String yellowCard = cards + " cards";
        scoreView.setText(yellowCard);
    }

    /**
     * Displays the given score for Team NED.
     */
    public void displayForTeamNED(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_NED_score);
        String pts = score + " pts";
        scoreView.setText(pts);
    }

    /**
     * Displays the given cards for Team NED.
     */
    public void displayCardsForTeamNED(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_NED_card);
        String yellowCard = cards + " cards";
        scoreView.setText(yellowCard);
    }

    /**
     * Displays the winning team.
     */
    public void displayWinningTeam(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.winning_team);
        scoreView.setText(winner);
    }
}
