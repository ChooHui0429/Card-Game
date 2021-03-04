package src;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
 
public class Main extends Application{

    // Declaration of Stage and all scene in UI
    Stage window;
    Scene startScene, playerInfoMenu, availableCardRound1, roundDisplay, scoreBoard, availableCard, congratMenu;
    static int round = 0;

     public static void main(String[] args){
         launch(args);// Main method to launch whole UI
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Declaration of main stage in UI
        window = primaryStage;

        // Start Scene
        // Start Scene Container
        GridPane paneStart = new GridPane();
        paneStart.setAlignment(Pos.CENTER);
        paneStart.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        paneStart.setHgap(5.5);
        paneStart.setVgap(5.5);

        // Logo input in Start Scene
        ImageView logo = new ImageView("image\\icon\\StartPic.png");

        // Start Button in Start Scene
        Button btnStartGameStartScene = new Button("START");
        Button btnExit = new Button("EXIT");
        HBox startButtonBox = new HBox(btnStartGameStartScene, btnExit);
        startButtonBox.setSpacing(10);
        startButtonBox.setAlignment(Pos.CENTER);

        // Create Vbox to make the layout of the scene more neatly
        VBox startLayout = new VBox(logo, startButtonBox);
        startLayout.setSpacing(5);
        startLayout.setAlignment(Pos.CENTER);
        paneStart.add(startLayout, 0, 0);

        // Insert container to Start Scene
        startScene = new Scene(paneStart, 350, 200);

        // Player info menu
        // Player info menu Container
        GridPane panePlayerInfoMenu = new GridPane();
        panePlayerInfoMenu.setAlignment(Pos.CENTER);
        panePlayerInfoMenu.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        panePlayerInfoMenu.setHgap(5.5);
        panePlayerInfoMenu.setVgap(5.5);

        // Player info menu Tile
        ImageView playerInfoMenuTitle = new ImageView("image\\icon\\playerInfoPic.png");
        playerInfoMenuTitle.setFitHeight(125);
        playerInfoMenuTitle.setFitWidth(275);

        // Player info menu field
        Label labelPlayerName1 = new Label("Player 1 Name :");
        Label labelPlayerName2 = new Label("Player 2 Name :");
        Label labelPlayerName3 = new Label("Player 3 Name :");

        TextField textPlayerName1 = new TextField();
        TextField textPlayerName2 = new TextField();
        TextField textPlayerName3 = new TextField();

        HBox boxPlayerInfo1 = new HBox(labelPlayerName1, textPlayerName1);
        boxPlayerInfo1.setSpacing(10);
        boxPlayerInfo1.setAlignment(Pos.CENTER);
        HBox boxPlayerInfo2 = new HBox(labelPlayerName2, textPlayerName2);
        boxPlayerInfo2.setSpacing(10);
        boxPlayerInfo2.setAlignment(Pos.CENTER);
        HBox boxPlayerInfo3 = new HBox(labelPlayerName3, textPlayerName3);
        boxPlayerInfo3.setSpacing(10);
        boxPlayerInfo3.setAlignment(Pos.CENTER);

        // Player info menu Button Pane
        Button btnStartGamePlayerInfo = new Button("START");
        VBox layoutPlayerInfoMenu = new VBox(playerInfoMenuTitle,boxPlayerInfo1, boxPlayerInfo2, boxPlayerInfo3, btnStartGamePlayerInfo);
        layoutPlayerInfoMenu.setSpacing(10);
        layoutPlayerInfoMenu.setAlignment(Pos.CENTER_RIGHT);

        panePlayerInfoMenu.add(layoutPlayerInfoMenu, 0, 1);

        // Insert container to scene Player info menu
        playerInfoMenu = new Scene(panePlayerInfoMenu, 350, 280);

        // available card menu for round 1
        // available card menu for round 1 Tile
        ImageView availableCardRound1Title1 = new ImageView("image\\icon\\3PlayerPhase.png");
        availableCardRound1Title1.setFitHeight(125);
        availableCardRound1Title1.setFitWidth(275);
        ImageView availableCardRound1Title2 = new ImageView("image\\icon\\availableCard.png");
        availableCardRound1Title2.setFitHeight(75);
        availableCardRound1Title2.setFitWidth(175);
    
        //Player Card display
        Label R1playerName1 = new Label();
        ///Imageview
        HBox R1player1 = new HBox(R1playerName1);
        Label R1playerName2 = new Label();
        ///Imageview
        HBox R1player2 = new HBox(R1playerName2);
        Label R1playerName3 = new Label();
        ///Imageview
        HBox R1player3 = new HBox(R1playerName3);

        // Button available card menu for round 1
        Button btnStartGame1R = new Button("START");
        Button btnShuffle1R = new Button("SHUFFLE");
        HBox R1Button = new HBox(btnStartGame1R, btnShuffle1R);
        R1Button.setSpacing(5);
        R1Button.setAlignment(Pos.CENTER);

        // Create Vbox to make the layout of the scene more neatly
        VBox layoutAvailableCardRound1 = new VBox(availableCardRound1Title1, availableCardRound1Title2, R1player1, R1player2, R1player3, R1Button);
        layoutAvailableCardRound1.setSpacing(10);
        layoutAvailableCardRound1.setAlignment(Pos.CENTER);

        // UI for available card menu for round 1
        availableCardRound1 = new Scene(layoutAvailableCardRound1, 350, 400);

        // Round display
        // Title Round
        Label title1Round = new Label();
        Label title2Round = new Label("CARDS AT HAND");
        VBox titleRound = new VBox(title1Round, title2Round);
        titleRound.setSpacing(10);
        titleRound.setAlignment(Pos.CENTER);
        titleRound.setBorder(new Border(
                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)
            )
        );

        //Player Card display
        Label roundPlayerName1 = new Label();
        ///Imageview
        HBox roundPlayer1 = new HBox(roundPlayerName1);
        Label roundPlayerName2 = new Label();
        ///Imageview
        HBox roundPlayer2 = new HBox(roundPlayerName2);
        Label roundPlayerName3 = new Label();
        ///Imageview
        HBox roundPlayer3 = new HBox(roundPlayerName3);

        //Button for round display
        Button btnNextRound = new Button("NEXT");
        //Vbox for whole display
        VBox layoutRoundDisplay = new VBox(titleRound, roundPlayer1, roundPlayer2, roundPlayer3, btnNextRound);
        layoutRoundDisplay.setSpacing(10);
        layoutRoundDisplay.setAlignment(Pos.CENTER);
        // Insert VBox to scene Round display
        roundDisplay = new Scene(layoutRoundDisplay, 350, 280);

        // Score Board
        // Score Board Title
        ImageView scoreBoardTitle = new ImageView("image\\icon\\score.png");
        scoreBoardTitle.setFitHeight(125);
        scoreBoardTitle.setFitWidth(275);

        // Score for each player
        Label scorePlayer1 = new Label();
        Label scorePlayer2 = new Label();
        Label scorePlayer3 = new Label();

        // Button for Score Board
        Button btnNextScoreBoard = new Button("NEXT");
        // UI of Score Board
        VBox layoutScoreBoard = new VBox(scoreBoardTitle, scorePlayer1, scorePlayer2, scorePlayer3, btnNextScoreBoard);
        layoutScoreBoard.setSpacing(10);
        layoutScoreBoard.setAlignment(Pos.CENTER);
        scoreBoard = new Scene(layoutScoreBoard, 350, 280);

        // available card menu after round 1
        // available card menu after round 1 Tile
        ImageView availableCardTitle1 = new ImageView("image\\icon\\3PlayerPhase.png");
        availableCardTitle1.setFitHeight(125);
        availableCardTitle1.setFitWidth(275);
        ImageView availableCardTitle2 = new ImageView("image\\icon\\availableCard.png");
        availableCardTitle2.setFitHeight(75);
        availableCardTitle2.setFitWidth(175);
    
        //Player Card display
        Label playerName1 = new Label();
        ///Imageview
        HBox player1 = new HBox(playerName1);
        Label playerName2 = new Label();
        ///Imageview
        HBox player2 = new HBox(playerName2);
        Label playerName3 = new Label();
        ///Imageview
        HBox player3 = new HBox(playerName3);

        // Button available card menu for round 1
        Button btnStartGame = new Button("START");

        // Create Vbox to make the layout of the scene more neatly
        VBox layoutAvailableCard = new VBox(availableCardTitle1, availableCardTitle2, player1, player2, player3, btnStartGame);
        layoutAvailableCard.setSpacing(10);
        layoutAvailableCard.setAlignment(Pos.CENTER);

        // UI for available card menu for round 1
        availableCard = new Scene(layoutAvailableCard, 350, 400);

        // Congrat Menu
        // UI for congrat Menu
        ImageView congratTitle = new ImageView("image\\icon\\congrat.png");
        Label congratText = new Label();
        Button congratNext = new Button("NEXT");
        VBox congratUI = new VBox(congratTitle, congratText, congratNext);
        congratUI.setSpacing(10);
        congratUI.setAlignment(Pos.CENTER);
        congratMenu = new Scene(congratUI, 700, 280);


        // Display of Main Menu
        window.setTitle("Poker Card Game");
        window.getIcons().add(new Image("image\\icon\\logo.png"));
        window.setScene(startScene);
        window.setMaximized(true);
        window.show();

        // Handle Button for Start Scene
        btnStartGameStartScene.setOnAction(a -> {
            window.setMaximized(false);
            window.setScene(playerInfoMenu);
        });
        btnExit.setOnAction(a -> {
            System.exit(0);
        });

        // Handle Button for Player info menu
        btnStartGamePlayerInfo.setOnAction(a -> {
            window.setScene(availableCardRound1);
        });

        // Handle Button for available card menu for round 1
        btnStartGame1R.setOnAction(a ->{
            if (round < 3){
                round = round + 1;
                title1Round.setText("ROUND " + round);
                window.setScene(roundDisplay);
            }
            else{
                round = round + 1;
                int phase2PRound = round - 3;
                title1Round.setText("ROUND " + phase2PRound);
                window.setScene(roundDisplay); 
            }
        });

        // Handle Button for round display
        btnNextRound.setOnAction(a ->{
            window.setScene(scoreBoard);
        });

        // Handle Button for Score Board
        btnNextScoreBoard.setOnAction(a ->{
            if (round < 3){
                window.setScene(availableCard);
            }
            else if(round == 3){
                congratText.setText("1P and 2P proceed to 2-Player Phase");
                window.setScene(congratMenu);
            }
            else if(round == 7){
                congratText.setText("1P win the game.");
                window.setScene(congratMenu);
            }
            else{
                Image phase2 = new Image("image\\icon\\2PlayerPhase.png");
                availableCardTitle1.setImage(phase2);
                window.setScene(availableCard);
            }
            
        });

        // Handle Button for Available card after round 1
        btnStartGame.setOnAction(a ->{
            if (round < 3){
                round = round + 1;
                title1Round.setText("ROUND " + round);
                window.setScene(roundDisplay);
            }
            else{
                round = round + 1;
                int phase2PRound = round - 3;
                title1Round.setText("ROUND " + phase2PRound);
                window.setScene(roundDisplay); 
            }
        });

        // Handle Button for Congrat Menu
        congratNext.setOnAction(a ->{
            if(round == 3){
                Image phase2 = new Image("image\\icon\\2PlayerPhase.png");
                availableCardRound1Title1.setImage(phase2);
                window.setScene(availableCardRound1);
            }
            else{
                window.setMaximized(true);
                window.setScene(startScene);
            }
        });
    }
 
}