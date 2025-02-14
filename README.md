# bulldog-hacks-project

A discord bot written in Java and designed to help students with language classes and music

# Project Setup

## Dependencies

JDK version: openjdk-21
Maven version: 3.8.6

## Compile Bot

```sh
mvn compile
```

## Run Bot

```sh
mvn package
java -cp target/bulldoghacks-1.0-SNAPSHOT.jar com.bulldoghacks.app.App
```

## Run Tests

```sh
mvn test
```

# Todo

JDA dependency is already added to maven but main function needs to be updated to basic discord bot

# Branching/Contribution Convention

When adding a new feature to the bot follow the following steps

main may be replaced with master depending on git setup

1. git switch main
2. git pull main
3. git switch -c feature-myfeature
4. work on branch
5. git add and commit
6. git switch main
7. git pull origin
8. git merge feature-myfeature
9. resolve any conflicts
10. git push origin

# Resources

- [JDA discord](https://github.com/discord-jda/JDA)
