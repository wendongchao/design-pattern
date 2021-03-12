package decorative;

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore(){
        System.out.println("语文高分 11，数学高分 12");
    }
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }

}
