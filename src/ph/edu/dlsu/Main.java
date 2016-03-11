package ph.edu.dlsu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        MediaPlayer player = new MediaPlayer(new Media(getClass().getResource("GameofThronesTheme.mp4").toExternalForm()));
        MediaView mediaView = new MediaView(player);

        root.getChildren().add(mediaView);

        Scene scene = new Scene(root, 1024, 768);

        stage.setScene(scene);
        stage.show();

        player.play();
    }
}
