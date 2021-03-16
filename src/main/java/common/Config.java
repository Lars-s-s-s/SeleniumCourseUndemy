package common;

public class Config {

    /**
     * Указываем браузер и платформу для теста
     * CHROME_LINUX64
     * CHROME_MAC64
     * CHROME_WINDOWS
     * */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
    /*
    * Очищать куки браузера после итерации
    * */
    public static final Boolean CLEAR_COOKIES = true;
    /*
    * Сохранять ли браузер открытым после сценария/теста
    * */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
