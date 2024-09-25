package Bookstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BuyerPage extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(SellerPage.class.getResource("/Bookstore/scenes/BuyingProcess.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 1200);
            stage.setTitle("Selling Category");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }

}
