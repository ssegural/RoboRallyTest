
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Board;
import model.GameMaster;

public class StepsDefinitions {

	GameMaster gamemaster = new GameMaster();

	@Given("a number of players {int}")
	public void a_number_of_players(Integer int1) {
		gamemaster.createPlayer(int1);

	}

	@And("board difficulty {int}")
	public void board_difficulty(Integer int2) {
		gamemaster.setDifficulty(int2);
	}

	@When("gamedstarted is true")
	public void gamedstarted_is_true() {
		gamemaster.setGameStarted(true);
	}

	@Then("we succesfully initialize the board")
	public void we_succesfully_initialize_the_board() {
		assertTrue(gamemaster.isGameStarted());
	}

}
