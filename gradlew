#!/usr/bin/env sh
# Minimal Gradle wrapper script
set -e

PRG="$0"
PRGDIR=$(dirname "$PRG")

exec java -classpath "$PRGDIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
