package edu.prahlad.patterns2.behavioural.strategy.soln;

public class HighContrastFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high contrast filter");
    }
}
