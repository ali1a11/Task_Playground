package org.playground.ai.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.playground.ai.pages.TestPage;
import org.playground.ai.utilities.BrowserUtils;
import org.playground.ai.utilities.ConfigurationReader;
import org.playground.ai.utilities.Driver;

public class StepDefinitions {
    TestPage testPage = new TestPage();


    @Given("The user is on the webpage")
    public void the_user_is_on_the_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Report the test loss value in console \\(h)")
    public void report_the_test_loss_value_in_console_h() {
        String testLoss = testPage.testLoss.getText();
        System.out.println("Test loss value = " + testLoss);
    }

    @When("Change dataset to exclusive as shown in \\(a)")
    public void change_dataset_to_exclusive_as_shown_in_a() {
        BrowserUtils.sleep(1);
        testPage.exclusiveDataset.click();

    }

    @When("Change noise to {int} percent \\(b)")
    public void change_noise_to_percent_b(Integer noiceLevel) {
        BrowserUtils.sleep(1);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(testPage.noiseSlider).dragAndDropBy(testPage.noiseSlider, noiceLevel * 2, 0).perform();
        BrowserUtils.sleep(1);
    }

    @When("Select two more features \\(c)")
    public void select_two_more_features_c() {

        testPage.xSquaredFeature.click();
        BrowserUtils.sleep(1);
        testPage.ySquaredFeature.click();
        BrowserUtils.sleep(1);
    }

    @When("Remove one neuron \\(d) and \\(e)")
    public void remove_one_neuron_d_and_e() {
        testPage.removeNeoron1.click();
        BrowserUtils.sleep(1);
        testPage.removeNeoron2.click();
        BrowserUtils.sleep(1);
    }

    @When("Change learning rate to {double} \\(f)")
    public void change_learning_rate_to_f(Double learningRate) {

        String learningR = "" + learningRate;
        testPage.selectLearningRate().selectByValue(learningR);
    }

    @When("Click to run the simulation \\(g)")
    public void click_to_run_the_simulation_g() {
        testPage.runSimulation.click();
    }


    @When("Wait until epoch is more than {double} \\(i)")
    public void wait_until_epoch_is_more_than_i(Double num) {

        String actual = "";
        for (int i = 0; i < 500; i++) {

            actual = testPage.epochNumber.getText();

            actual = actual.replace(",", ".");

            double actualEpochNumber = Double.parseDouble(actual);

            if (actualEpochNumber > 0.3) {

                testPage.pause.click();
                System.out.println("Epoch value = " +  " " + actualEpochNumber);
                break;
            }

        }
    }
}
