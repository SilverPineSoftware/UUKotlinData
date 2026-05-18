# UUKotlinData

Database and persistence helpers for Silverpine UU Android apps — entity/model mapping and Room type converters.

## Maven coordinates

| Artifact | Coordinates |
|----------|-------------|
| Data | `com.silverpine.uu:uu-data-ktx` |

Published to [Maven Central](https://central.sonatype.com/search?q=com.silverpine.uu) under the `com.silverpine.uu` group.

## What's included

### Entity ↔ model mapping

- **`UUEntityModelConvertible<ModelType>`** — contract for Room (or other) entities to expose an `asModel` property.
- **`List<UUEntityModelConvertible<T>>.asModels`** — batch conversion to domain models.

### Room type converters

- **`UUJsonObjectConverter`** — persist structured objects as JSON in SQLite columns.
- **`UUIntSetConverter`** — store `Set<Int>` in Room databases.

Built on **`uu-core-ktx`** for JSON and shared utilities.

## Gradle dependency

```kotlin
dependencies {
    implementation("com.silverpine.uu:uu-data-ktx:<version>")
}
```

Typically used together with:

```kotlin
implementation("com.silverpine.uu:uu-core-ktx:<version>")
```

## Requirements

- Android Room (consumer-defined schema and DAOs)
- UU Kotlin build catalog (`uu_build`) and GitHub Packages credentials for `UUKotlinBuild`
- `uu_min_sdk` / `uu_target_sdk` aligned with your UU Gradle properties

## Changes in this release

- Room converters for JSON objects and integer sets.
- Entity-to-model mapping helpers for cleaner data/domain separation.
- Dokka-generated API documentation published to Maven Central.
- CI unit and instrumented test workflows via shared UU GitHub Actions.

---

For prior versions and snapshots, see [GitHub Releases](https://github.com/SilverpineSoftware/UUKotlinData/releases).
