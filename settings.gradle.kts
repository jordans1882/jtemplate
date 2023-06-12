rootProject.name = "jtemplate"

include("utilities")
include("app")
include("list")

for (project in rootProject.children) {
    project.projectDir = file("src/${project.name}")
}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}


// pluginManagement {
//     // Include 'plugins build' to define convention plugins.
//     includeBuild("build-logic")
// }

// toolchainManagement {
//   jvm {
//     javaRepositories {
//       repository("foojay") {
//         resolverClass.set(org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java)
//       }
//     }
//   }
// }


rootProject.name = "jtemplate"
include("app", "list", "utilities")
