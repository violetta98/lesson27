package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class CompositeGraphic implements Graphic {

    private List<Graphic> mChildGraphics = new ArrayList<>();

    @Override
    public void print() {
        for (Graphic graphic : mChildGraphics)
            graphic.print();
    }

    // add graphic to the composition
    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    // remove graphic from the composition
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }

}
