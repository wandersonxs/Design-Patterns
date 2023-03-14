package behavioral.strategy;

import behavioral.strategy.renderers.Renderer;

public class ImageManager {

    private Renderer rendererStrategy;
    public void setRendererStrategy(Renderer rendererStrategy) {
       this.rendererStrategy = rendererStrategy;
    }

    public void showImage(){
        this.rendererStrategy.showImage();
    }

}
