package Design_Patterns.Factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setRefreshRate(){
        System.out.println("Refresh rate is set");
    }

    public void setTheme(){
        System.out.println("Theme is set");
    }

    public void collectData(){
        System.out.println("Data is being collected");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
