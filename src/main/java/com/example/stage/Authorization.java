
package com.example.stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    /**
     *
     * @author Denis
     */
    public class Authorization extends Stage {

        public Authorization() throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("/fx/AuthorizationFX.fxml"));

            Scene scene = new Scene(root);

            setTitle("Соединение с базой данных");
            setScene(scene);
            show();
        }
    }


