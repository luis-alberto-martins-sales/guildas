package br.com.bb.cloud74.strategy.OO;

import java.util.Collection;

public class Composition {
    private Collection<Component> _components;
    private Compositor _compositor;
    private Integer _componentCount;
    private Integer _lineWidth;
    private Collection<Integer> _lineBreaks;
    private Integer _lineCount;

    Composition(Compositor _compositor) {
        this._compositor=_compositor;
    }

    void Repair(){
        Coord[] natural = null;
        Coord[] stretch = null;
        Coord[] shrink = null;
        Integer componentCount = null;
        Integer lineWidth = null;
        Integer[] breaks = null;

        // prepara os arrays com os tamanhos deejados dos componentes
        // ...

        // determina onde estão as quebras
        Integer breakCount;
        breakCount = _compositor.Compose(natural, stretch,shrink,
                componentCount,lineWidth,breaks);

        // dispõe os componentes de acordo com as quebras
        // ...
    }
}
