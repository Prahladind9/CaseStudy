package edu.prahlad.patterns2.behavioural.strategy.soln;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
