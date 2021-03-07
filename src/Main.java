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
    String p1Name, p2Name, p3Name;

     public static void main(String[] args){
         launch(args);// Main method to launch whole UI
         
    }

    // To return te path way of image from the variable name
    public String imagePath(String cardName){
        return "image\\pokerCard\\" + cardName + ".png";
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Declaration of class
        Game game = new Game();

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
        GridPane paneAvailableCardR1 = new GridPane();
        paneAvailableCardR1.setAlignment(Pos.CENTER);
        paneAvailableCardR1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        paneAvailableCardR1.setHgap(5.5);
        paneAvailableCardR1.setVgap(5.5);

        // Button available card menu for round 1
        Button btnStartGame1R = new Button("START");
        Button btnShuffle1R = new Button("SHUFFLE");
        HBox R1Button = new HBox(btnStartGame1R, btnShuffle1R);
        R1Button.setSpacing(5);
        R1Button.setAlignment(Pos.CENTER);


        // Create Vbox to make the layout of the scene more neatly
        VBox layoutAvailableCardRound1 = new VBox(availableCardRound1Title1, availableCardRound1Title2, paneAvailableCardR1, R1Button);
        layoutAvailableCardRound1.setSpacing(10);
        layoutAvailableCardRound1.setAlignment(Pos.CENTER);

        // UI for available card menu for round 1
        availableCardRound1 = new Scene(layoutAvailableCardRound1, 1200, 550);

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
        GridPane paneRound = new GridPane();
        paneRound.setAlignment(Pos.CENTER);
        paneRound.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        paneRound.setHgap(5.5);
        paneRound.setVgap(5.5);

        //Button for round display
        Button btnNextRound = new Button("NEXT");
        //Vbox for whole display
        VBox layoutRoundDisplay = new VBox(titleRound, paneRound, btnNextRound);
        layoutRoundDisplay.setSpacing(10);
        layoutRoundDisplay.setAlignment(Pos.CENTER);
        // Insert VBox to scene Round display
        roundDisplay = new Scene(layoutRoundDisplay, 500, 400);

        // Score Board
        // Score Board Title
        ImageView scoreBoardTitle = new ImageView("image\\icon\\score.png");
        scoreBoardTitle.setFitHeight(125);
        scoreBoardTitle.setFitWidth(275);

        // Score for each player
        Label scoreBoardPlayer1 = new Label();
        Label scoreBoardPlayer2 = new Label();
        Label scoreBoardPlayer3 = new Label();

        // Button for Score Board
        Button btnNextScoreBoard = new Button("NEXT");
        // UI of Score Board
        VBox layoutScoreBoard = new VBox(scoreBoardTitle, scoreBoardPlayer1, scoreBoardPlayer2, scoreBoardPlayer3, btnNextScoreBoard);
        layoutScoreBoard.setSpacing(10);
        layoutScoreBoard.setAlignment(Pos.CENTER);
        scoreBoard = new Scene(layoutScoreBoard, 350, 280);

        // available card menu after round 1
        // available card menu after round 1 Title
        ImageView availableCardTitle1 = new ImageView("image\\icon\\3PlayerPhase.png");
        availableCardTitle1.setFitHeight(125);
        availableCardTitle1.setFitWidth(275);
        ImageView availableCardTitle2 = new ImageView("image\\icon\\availableCard.png");
        availableCardTitle2.setFitHeight(75);
        availableCardTitle2.setFitWidth(175);
    
        //Player Card display
        GridPane paneAvailableCard = new GridPane();
        paneAvailableCard.setAlignment(Pos.CENTER);
        paneAvailableCard.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        paneAvailableCard.setHgap(5.5);
        paneAvailableCard.setVgap(5.5);

        // Button available card menu for after round 1
        Button btnStartGame = new Button("START");

        // Create Vbox to make the layout of the scene more neatly
        VBox layoutAvailableCard = new VBox(availableCardTitle1, availableCardTitle2, paneAvailableCard, btnStartGame);
        layoutAvailableCard.setSpacing(10);
        layoutAvailableCard.setAlignment(Pos.CENTER);

        // UI for available card menu for after round 1
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
            textPlayerName1.setText("");
            textPlayerName2.setText("");
            textPlayerName3.setText("");
            window.setMaximized(false);
            window.setScene(playerInfoMenu);
        });
        btnExit.setOnAction(a -> {
            System.exit(0);
        });

        // Handle Button for Player info menu
        btnStartGamePlayerInfo.setOnAction(a -> {
            Player p1 = new Player(textPlayerName1.getText());
            Player p2 = new Player(textPlayerName2.getText());
            Player p3 = new Player(textPlayerName3.getText());
            game.addPlayer(p1);
            game.addPlayer(p2);
            game.addPlayer(p3);
            game.dealCards();
            Label R1playerName1 = new Label(game.players.get(0).name + " : "); 
            Label R1playerName2 = new Label(game.players.get(1).name  + " : "); 
            Label R1playerName3 = new Label(game.players.get(2).name  + " : "); 
            paneAvailableCardR1.add(R1playerName1, 0, 0);
            paneAvailableCardR1.add(R1playerName2, 0, 1);
            paneAvailableCardR1.add(R1playerName3, 0, 2);
            
            for(int i=0; i < game.players.get(0).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(0).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 0);
            }
            for(int i=0; i < game.players.get(1).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(1).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 1);
            }
            for(int i=0; i < game.players.get(2).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(2).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 2);
            }  
            window.setScene(availableCardRound1);
            window.setMaximized(true);
        });

        // Handle Button for available card menu for round 1
        btnStartGame1R.setOnAction(a ->{
            if (game.sceneSwitch < 3){
                paneAvailableCardR1.getChildren().clear();
                paneAvailableCardR1.getChildren().clear();
                paneAvailableCardR1.getChildren().clear();
                Label roundPlayerName1 = new Label(game.players.get(0).name + " : ");
                Label roundPlayerName2 = new Label(game.players.get(1).name + " : ");
                Label roundPlayerName3 = new Label(game.players.get(2).name + " : ");
                paneRound.add(roundPlayerName1, 0, 0);
                paneRound.add(roundPlayerName2, 0, 1);
                paneRound.add(roundPlayerName3, 0, 2);
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 1);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(2).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 2);
                } 
                Label roundPlayerScore1 = new Label(" Point = " + game.players.get(0).getHand().getScore());
                Label roundPlayerScore2 = new Label(" Point = " + game.players.get(1).getHand().getScore());
                Label roundPlayerScore3 = new Label(" Point = " + game.players.get(2).getHand().getScore());
                paneRound.add(roundPlayerScore1, 6, 0);
                paneRound.add(roundPlayerScore2, 6, 1);
                paneRound.add(roundPlayerScore3, 6, 2);
                Image win = new Image("image\\icon\\win.png", 20, 0, true, true);
                ImageView displayWin = new ImageView(win);
                for(int i=0; i < game.players.size(); i++){
                    if (game.getRoundWinner().equals(game.players.get(i))){
                        paneRound.add(displayWin, 7, i);
                    }
                }
                game.next();
                title1Round.setText("ROUND " + game.round);
                window.setMaximized(false);
                window.setScene(roundDisplay);
            }
            else{
                paneAvailableCardR1.getChildren().clear();
                paneAvailableCardR1.getChildren().clear();
                paneAvailableCardR1.getChildren().clear();
                Label roundPlayerName1 = new Label(game.players.get(0).name + " : ");
                Label roundPlayerName2 = new Label(game.players.get(1).name + " : ");
                paneRound.add(roundPlayerName1, 0, 0);
                paneRound.add(roundPlayerName2, 0, 1);

                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 1);
                }
                Label roundPlayerScore1 = new Label(" Point = " + game.players.get(0).getHand().getScore());
                Label roundPlayerScore2 = new Label(" Point = " + game.players.get(1).getHand().getScore());
                paneRound.add(roundPlayerScore1, 6, 0);
                paneRound.add(roundPlayerScore2, 6, 1);
                Image win = new Image("image\\icon\\win.png", 20, 0, true, true);
                ImageView displayWin = new ImageView(win);
                for(int i=0; i < game.players.size(); i++){
                    if (game.getRoundWinner().equals(game.players.get(i))){
                        paneRound.add(displayWin, 7, i);
                    }
                }
                game.next();
                title1Round.setText("ROUND " + game.round);
                window.setMaximized(false);
                window.setScene(roundDisplay); 
            }
        });

        btnShuffle1R.setOnAction(a -> {
            game.shuffle();
            Label R1playerName1 = new Label(game.players.get(0).name + " : "); 
            Label R1playerName2 = new Label(game.players.get(1).name  + " : "); 
            Label R1playerName3 = new Label(game.players.get(2).name  + " : "); 
            paneAvailableCardR1.add(R1playerName1, 0, 0);
            paneAvailableCardR1.add(R1playerName2, 0, 1);
            paneAvailableCardR1.add(R1playerName3, 0, 2);
            
            for(int i=0; i < game.players.get(0).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(0).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 0);
            }
            for(int i=0; i < game.players.get(1).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(1).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 1);
            }
            for(int i=0; i < game.players.get(2).getHandArray().size(); i++){
                Image cardView = new Image(imagePath(game.players.get(2).getHandArray().get(i)), 50, 0, true, true);
                ImageView cardDisplay = new ImageView(cardView);
                paneAvailableCardR1.add(cardDisplay, i+1, 2);
            }  
            window.setScene(availableCardRound1);
        });
        
        // Handle Button for round display
        btnNextRound.setOnAction(a ->{
            if(game.sceneSwitch < 4){
                paneRound.getChildren().clear();
                paneRound.getChildren().clear();
                paneRound.getChildren().clear();
                scoreBoardPlayer1.setText(game.players.get(0).name + " = " + game.players.get(0).totalScore);
                scoreBoardPlayer2.setText(game.players.get(1).name + " = " + game.players.get(1).totalScore);
                scoreBoardPlayer3.setText(game.players.get(2).name + " = " + game.players.get(2).totalScore);
                window.setScene(scoreBoard);
            }
            else{
                paneRound.getChildren().clear();
                paneRound.getChildren().clear();
                scoreBoardPlayer1.setText(game.players.get(0).name + " = " + game.players.get(0).totalScore);
                scoreBoardPlayer2.setText(game.players.get(1).name + " = " + game.players.get(1).totalScore);
                scoreBoardPlayer3.setText("");
                window.setScene(scoreBoard);
            }
        });

        // Handle Button for Score Board
        btnNextScoreBoard.setOnAction(a ->{
            if (game.sceneSwitch < 3){
                Label playerName1 = new Label(game.players.get(0).name + " : ");
                Label playerName2 = new Label(game.players.get(1).name + " : ");
                Label playerName3 = new Label(game.players.get(2).name + " : ");
                paneAvailableCard.add(playerName1, 0, 0);
                paneAvailableCard.add(playerName2, 0, 1);
                paneAvailableCard.add(playerName3, 0, 2);

                for(int i=0; i < game.players.get(0).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHandArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCard.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < game.players.get(1).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHandArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCard.add(cardDisplay, i+1, 1);
                }
                for(int i=0; i < game.players.get(2).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(2).getHandArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCard.add(cardDisplay, i+1, 2);
                }
                window.setScene(availableCard);
                window.setMaximized(true);
            }
            else if(game.sceneSwitch == 3){
                game.next();
                congratText.setText(game.players.get(0).name + " and " + game.players.get(1).name + " proceed to 2-Player Phase");
                window.setScene(congratMenu);
            }
            else if(game.sceneSwitch == 8 && game.round == 4){
                game.nextPhase();
                congratText.setText(game.players.get(0).name + " win te game.");
                window.setScene(congratMenu);
            }
            else{
                Label playerName1 = new Label(game.players.get(0).name + " : ");
                Label playerName2 = new Label(game.players.get(1).name + " : ");
                paneAvailableCard.add(playerName1, 0, 0);
                paneAvailableCard.add(playerName2, 0, 1);

                for(int i=0; i < game.players.get(0).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHandArray().get(i)), 40, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCard.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < game.players.get(1).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHandArray().get(i)), 40, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCard.add(cardDisplay, i+1, 1);
                }
                Image phase2 = new Image("image\\icon\\2PlayerPhase.png");
                availableCardTitle1.setImage(phase2);
                window.setScene(availableCard);
                window.setMaximized(true);
            }
        
        });

        // Handle Button for Available card after round 1
        btnStartGame.setOnAction(a ->{
            if (game.sceneSwitch < 3){
                paneAvailableCard.getChildren().clear();
                paneAvailableCard.getChildren().clear();
                paneAvailableCard.getChildren().clear();
                Label roundPlayerName1 = new Label(game.players.get(0).name + " : ");
                Label roundPlayerName2 = new Label(game.players.get(1).name + " : ");
                Label roundPlayerName3 = new Label(game.players.get(2).name + " : ");
                paneRound.add(roundPlayerName1, 0, 0);
                paneRound.add(roundPlayerName2, 0, 1);
                paneRound.add(roundPlayerName3, 0, 2);

                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 1);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(2).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 2);
                }
                Label roundPlayerScore1 = new Label(" Point = " + game.players.get(0).getHand().getScore());
                Label roundPlayerScore2 = new Label(" Point = " + game.players.get(1).getHand().getScore());
                Label roundPlayerScore3 = new Label(" Point = " + game.players.get(2).getHand().getScore());
                paneRound.add(roundPlayerScore1, 6, 0);
                paneRound.add(roundPlayerScore2, 6, 1);
                paneRound.add(roundPlayerScore3, 6, 2);
                Image win = new Image("image\\icon\\win.png", 20, 0, true, true);
                ImageView displayWin = new ImageView(win);
                for(int i=0; i < game.players.size(); i++){
                    if (game.getRoundWinner().equals(game.players.get(i))){
                        paneRound.add(displayWin, 7, i);
                    }
                }
                game.next();
                title1Round.setText("ROUND " + game.round);
                window.setMaximized(false);
                window.setScene(roundDisplay);
            }
            else{
                paneAvailableCard.getChildren().clear();
                paneAvailableCard.getChildren().clear();
                Label roundPlayerName1 = new Label(game.players.get(0).name + " : ");
                Label roundPlayerName2 = new Label(game.players.get(1).name + " : ");
                paneRound.add(roundPlayerName1, 0, 0);
                paneRound.add(roundPlayerName2, 0, 1);

                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < 5; i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHand().getCardsArray().get(i)), 50, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneRound.add(cardDisplay, i+1, 1);
                }
                Label roundPlayerScore1 = new Label(" Point = " + game.players.get(0).getHand().getScore());
                Label roundPlayerScore2 = new Label(" Point = " + game.players.get(1).getHand().getScore());
                paneRound.add(roundPlayerScore1, 6, 0);
                paneRound.add(roundPlayerScore2, 6, 1);

                Image win = new Image("image\\icon\\win.png", 20, 0, true, true);
                ImageView displayWin = new ImageView(win);
                for(int i=0; i < game.players.size(); i++){
                    if (game.getRoundWinner().equals(game.players.get(i))){
                        paneRound.add(displayWin, 7, i);
                    }
                }
                game.next();
                title1Round.setText("ROUND " + game.round);
                window.setMaximized(false);
                window.setScene(roundDisplay); 
            }
        });

        // Handle Button for Congrat Menu
        congratNext.setOnAction(a ->{
            if(game.sceneSwitch == 4){
                paneAvailableCard.getChildren().clear();
                paneAvailableCard.getChildren().clear();
                paneAvailableCard.getChildren().clear();
                Label R1playerName1 = new Label(game.players.get(0).name + " : ");
                Label R1playerName2 = new Label(game.players.get(1).name + " : ");
                paneAvailableCardR1.add(R1playerName1, 0, 0);
                paneAvailableCardR1.add(R1playerName2, 0, 1);

                for(int i=0; i < game.players.get(0).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(0).getHandArray().get(i)), 40, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCardR1.add(cardDisplay, i+1, 0);
                }
                for(int i=0; i < game.players.get(1).getHandArray().size(); i++){
                    Image cardView = new Image(imagePath(game.players.get(1).getHandArray().get(i)), 40, 0, true, true);
                    ImageView cardDisplay = new ImageView(cardView);
                    paneAvailableCardR1.add(cardDisplay, i+1, 1);
                }
                Image phase2 = new Image("image\\icon\\2PlayerPhase.png");
                availableCardRound1Title1.setImage(phase2);
                window.setScene(availableCardRound1);
                window.setMaximized(true);
            }
            else{
                game.gameEnd();
                window.setScene(startScene);
                window.setMaximized(true);     
            }
        });
    }
 
}