import gpdraw.*;
public class KochCurve {
	
	private SketchPadWithNoDelay paper;
	private DrawingTool pen;
	
	
	public KochCurve(int paperW, int paperH, int x, int y){
	
		paper = new SketchPadWithNoDelay(paperW, paperH, x, y);
		pen = new DrawingTool(paper);
		pen.up();
		pen.move(-paperW/ 4, paperH/4);
		pen.setDirection(0);
		
		pen.down();
	}
	public void drawKochCurve(double level, double length){
		
		if(level < 1){
			pen.forward(length);
			
		}else{
			drawKochCurve(level-1, length/3);
			pen.turnLeft(60);
			drawKochCurve(level-1, length/3);
			pen.turnRight(120);
			drawKochCurve(level-1, length/3);
			pen.turnLeft(60);
			drawKochCurve(level-1, length/3);
			
			
		}
	}
	public void drawSnowflake(int level, int length){
		drawKochCurve(level -1, length);
		pen.turnRight(120);
		drawKochCurve(level -1, length);
		pen.turnRight(120);
		drawKochCurve(level -1, length);
		
	}
	
}





