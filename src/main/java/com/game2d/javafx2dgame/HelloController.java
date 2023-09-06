package com.game2d.javafx2dgame;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView background1;

    @FXML
    private ImageView background2;

    @FXML
    private ImageView player;

    private final int BG_WIDTH = 715;

    private ParallelTransition parallelTransition;
    @FXML
    void initialize() {
        TranslateTransition bgOneTransition = new TranslateTransition(Duration.millis(5000), background1);
        bgOneTransition.setFromX(0);
        bgOneTransition.setToX(BG_WIDTH * -1);
        bgOneTransition.setInterpolator(Interpolator.LINEAR);
//        bgOneTransition.play();

        TranslateTransition bgTwoTransition = new TranslateTransition(Duration.millis(5000), background2);
        bgTwoTransition.setFromX(0);
        bgTwoTransition.setToX(BG_WIDTH * -1);
        bgTwoTransition.setInterpolator(Interpolator.LINEAR);
//        bgTwoTransition.play();

        parallelTransition = new ParallelTransition(bgOneTransition, bgTwoTransition);
        parallelTransition.setCycleCount(Animation.INDEFINITE);
        parallelTransition.play();
    }

}
