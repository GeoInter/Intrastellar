package thb.fbi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * \brief JavaFX App
 * 
 * starts the application
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("simulator"), 640, 480);
        scene.getStylesheets().add(this.getClass().getResource("/thb/fbi/css/temp.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Intrastellar - an ARMv8 Thumb Simulator");
        stage.setMaximized(true);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}