package object;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Door extends Entity {
	
	GamePanel gp;
	public OBJ_Door(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		type= type_obstacble;
		
		name = "Door";
		down1 = setup("/objects/door", gp.tileSize, gp.tileSize);
		description = "[" + name + "]";
		collision = true;
		
		solidArea.x = 0;
		solidArea.y = 16;
		solidArea.width = 40;
		solidArea.height = 32;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
	}
	public void interact() {
		gp.gameState = gp.dialogueState;
		gp.ui.currentDialogue = "You need a key to open this";
	}
}