package pl.edu.agh.to2.frazeusz.pattern_matcher.matcher.regex;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class ListMatchingStrategy implements IMatchingStrategy {

    private List<IMatchingStrategy> strategies = new LinkedList<>();

    @Override
    public String format(String pattern) {
        return null;
    }

    @Override
    public Pattern compile(String pattern) {
        return null;
    }
}
