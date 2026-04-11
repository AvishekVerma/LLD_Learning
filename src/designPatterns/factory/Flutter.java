package designPatterns.factory;

public class Flutter {
    private final SupportedPlatforms supportedPlatform;

    public Flutter(SupportedPlatforms supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Setting Theme");
    }

    public void setRefershRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(){

        return UIFactoryFactory.getUIFactoryFromPlatform(supportedPlatform);
    }
}
