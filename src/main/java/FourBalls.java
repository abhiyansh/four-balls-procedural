import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_DIAMETER = 25;

    int ballCount = 4;
    int[] ballPositionX = new int[ballCount];

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int ballIndex = 0; ballIndex < ballCount; ballIndex++) {
            int centerX = getCenterX(ballIndex);
            int centerY = getCenterY(ballIndex);

            drawCircle(centerX, centerY);

            incrementBallPosition(ballIndex, ballIndex+1);
        }
    }

    private int getCenterY(int ballIndex) {
        return (HEIGHT * (ballIndex+1)) / (ballCount + 1);
    }

    private int getCenterX(int ballIndex) {
        return ballPositionX[ballIndex];
    }

    private void drawCircle(int centerX, int centerY) {
        ellipse(centerX, centerY, BALL_DIAMETER, BALL_DIAMETER);
    }

    private void incrementBallPosition(int ballIndex, int incrementValue){
        ballPositionX[ballIndex]+=incrementValue;
    }
}
