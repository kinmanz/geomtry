import lombok.Builder;
import lombok.Value;


public class PoligonCreator {

    private int paddingLeft;
    private int paddingBottom;


    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
    }
}
