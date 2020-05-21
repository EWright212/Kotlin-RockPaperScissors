Rock Paper Scissors 


General IDE

1. Generated folders that you should ignore (don't put them into GIT)
- .gradle
- .idea

2. Generate Gradle files with command: `gradle wrapper --gradle-version 6.4.1 --distribution-type all`
-  gradlew (unix/linux/mac)
- gradlew.bat (windows)
- gradle directory (this is where you can change Gradle version)

3. You have to configure Gradle project descriptors:
- build.gradle.kts !!!
- gradle.properties (optional)
- settings.gradle.kts (maybe optional)

4. Gradle imposes a directory structure:
- production code: `src/main/kotlin` `(src/main/java)`
- test code: `src/test/kotlin` `(src/test/java)`

5. Program correctness:
- like in Ruby: syntax correctness + tests (your logic)
- unlike in Ruby: syntax check is fully separated from logic check
- you have to compile (check syntax), and only then you can run tests (check logic)