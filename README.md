# Spek 2.x example in maven kotlin project [![Build Status](https://travis-ci.org/daggerok/kotlin-spek-maven-example.svg?branch=master)](https://travis-ci.org/daggerok/kotlin-spek-maven-example)

```bash
mvn clean ; mvn test -U ; mvn versions:display-property-updates
```

Read [1.x -> 2.x migration guide](https://spekframework.org/migration/) for details

NOTE:

for some reasons we have to use deprecated API from
`org.junit.platform:junit-platform-surefire-provider:1.3.2`
dependency:

```
 +-------------------------------------------------------------------------------+
 | WARNING:                                                                      |
 | The junit-platform-surefire-provider has been deprecated and is scheduled to  |
 | be removed in JUnit Platform 1.4. Please use the built-in support in Maven    |
 | Surefire >= 2.22.0 instead.                                                   |
 | » https://junit.org/junit5/docs/current/user-guide/#running-tests-build-maven |
 +-------------------------------------------------------------------------------+
```

But seems like it's okay...

_see branches:_

* [1.x](https://github.com/daggerok/kotlin-spek-maven-example/tree/1.x)
* [2.x](https://github.com/daggerok/kotlin-spek-maven-example/tree/2.x)
