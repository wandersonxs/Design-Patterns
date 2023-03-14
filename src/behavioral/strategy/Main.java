package behavioral.strategy;

import behavioral.strategy.renderers.LaptopRenderer;
import behavioral.strategy.renderers.SmartphoneRenderer;
import behavioral.strategy.renderers.TVRenderer;

public class Main {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setRendererStrategy(new TVRenderer());
        imageManager.showImage();

        imageManager.setRendererStrategy(new LaptopRenderer());
        imageManager.showImage();

        imageManager.setRendererStrategy(new SmartphoneRenderer());
        imageManager.showImage();

    }
}
