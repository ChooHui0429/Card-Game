package src;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
 
public class Main extends Application{

    // Declaration of Stage and all scene in UI
    Stage window;
    Scene startScene, playerInfoMenu, phase3P1RMenu;

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

        // 3 player phase available card menu for round 1
        // 3 player phase available card menu container
        GridPane pane3PphaseAvailableCardRound1 = new GridPane();
        pane3PphaseAvailableCardRound1.setAlignment(Pos.CENTER);
        pane3PphaseAvailableCardRound1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane3PphaseAvailableCardRound1.setHgap(5.5);
        pane3PphaseAvailableCardRound1.setVgap(5.5);

        // 3 player phase available card menu Tile
        ImageView availableCard3PRound1Title1 = new ImageView("image\\icon\\3PlayerPhase.png");
        availableCard3PRound1Title1.setFitHeight(125);
        availableCard3PRound1Title1.setFitWidth(275);
        ImageView availableCard3PRound1Title2 = new ImageView("image\\icon\\availableCard.png");
        availableCard3PRound1Title2.setFitHeight(75);
        availableCard3PRound1Title2.setFitWidth(175);
        
        //Player Card display
        Label playerName1 = new Label();

        /*for(i=0, i < , i++){
            ImageView player1Card[i] = 
        }*/
        HBox phase3P1Rplayer1 = new HBox(playerName1);

        Label playerName2 = new Label();
        /*for(i=0, i < , i++){
            ImageView player2Card[i] = 
        }*/
        HBox phase3P1Rplayer2 = new HBox(playerName2);

        Label playerName3 = new Label();
        /*for(i=0, i < , i++){
            ImageView player2Card[i] = 
        }*/
        HBox phase3P1Rplayer3 = new HBox(playerName3);

        // Button for 3 player phase available card menu for round 1
        Button btnStartGame3P1R = new Button("START");
        Button btnShuffle3P1R = new Button("SHUFFLE");
        HBox phase3P1RButton = new HBox(btnStartGame3P1R, btnShuffle3P1R);
        phase3P1RButton.setSpacing(5);
        phase3P1RButton.setAlignment(Pos.CENTER);

        // Create Vbox to make the layout of the scene more neatly
        VBox layoutAvailableCard3PRound1 = new VBox(availableCard3PRound1Title1, availableCard3PRound1Title2, phase3P1Rplayer1, phase3P1Rplayer2, phase3P1Rplayer3, phase3P1RButton);
        layoutAvailableCard3PRound1.setSpacing(10);
        layoutAvailableCard3PRound1.setAlignment(Pos.CENTER);
        pane3PphaseAvailableCardRound1.add(layoutAvailableCard3PRound1, 0, 0);

        // Insert container to scene Player info menu
        phase3P1RMenu = new Scene(pane3PphaseAvailableCardRound1, 350, 280);


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

        // Handle Button fot Player info menu
        btnStartGamePlayerInfo.setOnAction(a -> {
            window.setScene(phase3P1RMenu);
        });
    }
 
}