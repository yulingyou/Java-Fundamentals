package bites.examples;

public class StoryBuilder {
    String plot;

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder("string,");
        storyBuilder.addPlotline("plot");
        System.out.println(storyBuilder.getPlot());
    }

    public StoryBuilder(String plot){
        this.plot = plot;
    }
    public void addPlotline(String addStr){
        this.plot += addStr;
    }

    public String getPlot(){
        return this.plot;
    }
}
