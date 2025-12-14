plugins {
    id("dev.kikugie.stonecutter")
    id("org.jetbrains.changelog") version "2.2.0"
}
// Build target switched to match requested Fabric server version
stonecutter active "1.21.10"

changelog {
    path = rootProject.file("CHANGELOG.md").path
}
