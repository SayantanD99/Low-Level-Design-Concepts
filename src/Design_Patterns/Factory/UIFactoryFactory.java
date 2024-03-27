package Design_Patterns.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform) {
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case MAC -> new MacUIFactory();
        };
    }
}
