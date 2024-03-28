import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    
    System.out.print("Game Start\n");
    Game.round();

    @Override
    public void start(Stage primaryStage) {
        Image backgroundImage = new Image("file:images/Fond.jpeg");

        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);

        Button surrenderButton = new Button("Surrender");
        Button hitButton = new Button("Hit");
        Button standButton = new Button("Stand");

        VBox buttonBox = new VBox(10, surrenderButton, hitButton, standButton);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonBox.setTranslateY(-20);

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundImageView, buttonBox);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Blackjack");
        primaryStage.show();
    }
}
