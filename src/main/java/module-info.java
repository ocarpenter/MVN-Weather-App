module WeatherWhisper {
	requires java.desktop;
	requires java.net.http;
	requires org.json;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens org.example.application to javafx.graphics, javafx.fxml;
}
