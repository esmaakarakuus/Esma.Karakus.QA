package utilities;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class Log {

    private static final Logger LOGGER = LogManager.getLogger ( );

    public static void pass(String message) {

        LOGGER.info (message);
        Allure.step (message);
    }

    public static void fail(String message) {

        LOGGER.error (message);
        Allure.step (message, Status.FAILED);
        Assert.fail (message);
    }
}
