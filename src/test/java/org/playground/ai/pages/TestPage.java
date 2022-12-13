package org.playground.ai.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.playground.ai.utilities.Driver;

public class TestPage {

    public TestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "loss-test")
    public WebElement testLoss;

    @FindBy(xpath = "//canvas[@data-dataset='xor']")
    public WebElement exclusiveDataset;

    @FindBy(xpath = "(//div[@class='mdl-slider__background-lower'])[2]")
    public WebElement noiseSlider;

    @FindBy(id = "canvas-xSquared")
    public WebElement xSquaredFeature;

    @FindBy(id = "canvas-ySquared")
    public WebElement ySquaredFeature;

    @FindBy(xpath = "(//i[@class='material-icons'])[6]")
    public WebElement removeNeoron1;

    @FindBy(xpath = "(//i[@class='material-icons'])[8]")
    public WebElement removeNeoron2;

    @FindBy(id = "learningRate")
    public WebElement learningRateSelect;

    public Select selectLearningRate() {
        return new Select(learningRateSelect);
    }

    @FindBy(id = "play-pause-button")
    public WebElement runSimulation;

    @FindBy(xpath = "//i[.='pause']")
    public WebElement pause;

    @FindBy(id = "iter-number")
    public WebElement epochNumber;


}
