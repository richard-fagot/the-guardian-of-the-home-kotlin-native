plugins {
    kotlin("multiplatform") version "1.3.50" 
    application
}

application {
    mainClassName = "home.guardian.Main"
}

repositories {
    jcenter() 
}

kotlin {
 
  linuxArm32Hfp("raspberrypi") {
    binaries {
      executable()
    }
  }
 
  mingwX64("native") {
    binaries {
      executable()
    }
  }
}

tasks.withType<Wrapper> {
  gradleVersion = "5.6.2"
  distributionType = Wrapper.DistributionType.ALL
}
