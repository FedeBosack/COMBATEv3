package view;

import java.util.ArrayList;
import model.Territorio;

public interface Observer {
	public void update(ArrayList <Territorio> territorios);
}
