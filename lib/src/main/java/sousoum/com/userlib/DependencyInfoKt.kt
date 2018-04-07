package sousoum.com.userlib

import sousoum.com.dependencylib.Info

/**
 * Dependency information.
 */
public class DependencyInfoKt {

    private val libInfo = Info()

    /**
     * Gets the dependency version.
     *
     * @return the version string
     */
    public fun getDependencyVersion(): String {
        return libInfo.version()
    }

    /**
     * Uses a dependency function.
     *
     * @return a string
     */
    public fun useDependencyFunction(): String {
        return libInfo.v2Function()
    }
}