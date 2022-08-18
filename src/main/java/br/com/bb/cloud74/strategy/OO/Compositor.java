package br.com.bb.cloud74.strategy.OO;

public interface Compositor {
    Integer Compose(Coord[] natural, Coord[] stretch, Coord[] shrink,
                    Integer componentCount, Integer lineWidth, Integer[] breaks);
    //Compositor();
}
