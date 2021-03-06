package edu.prahlad.patterns2.behavioural.strategy;

import edu.prahlad.patterns2.behavioural.strategy.soln.*;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",
                new JPEGCompressor(),
                new HighContrastFilter());
        imageStorage.store("a",
                new PngCompressor(),
                new BlackAndWhiteFilter());
    }
}
