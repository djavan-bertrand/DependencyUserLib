package sousoum.com.userlib;

import android.support.annotation.NonNull;

import sousoum.com.dependencylib.Info;

/**
 * Dependency information.
 */
public class DependencyInfo {
    private final Info libInfo = new Info();

    /**
     * Gets the dependency version.
     *
     * @return the version string
     */
    @NonNull
    public String getDependencyVersion() {
        return libInfo.version();
    }

    /**
     * Uses a dependency function.
     *
     * @return a string
     */
    @NonNull
    public String useDependencyFunction() {
        return libInfo.v2Function();
    }
}
