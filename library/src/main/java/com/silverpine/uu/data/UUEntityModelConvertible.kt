package com.silverpine.uu.data

/**
 * Interface that defines a contract for converting entity objects to model objects.
 *
 * This interface is typically implemented by data layer entities (e.g., Room database entities)
 * to provide a standardized way of converting them to domain model objects.
 *
 * @param ModelType The type of model object that this entity can be converted to.
 *
 * @sample
 * ```
 * data class UserEntity(
 *     val id: Long,
 *     val name: String
 * ) : UUEntityModelConvertible<UserModel> {
 *     override val asModel: UserModel
 *         get() = UserModel(id, name)
 * }
 * ```
 */
interface UUEntityModelConvertible<ModelType>
{
    /**
     * Converts this entity to its corresponding model object.
     *
     * @return The model representation of this entity.
     */
    val asModel: ModelType
}

/**
 * Extension property that converts a list of entities to a list of model objects.
 *
 * This property provides a convenient way to convert collections of entities that implement
 * [UUEntityModelConvertible] to their corresponding model types.
 *
 * @param ModelType The type of model object that the entities can be converted to.
 * @return A list of model objects converted from the entities.
 *
 * @sample
 * ```
 * val userEntities: List<UserEntity> = // ... get entities
 * val userModels: List<UserModel> = userEntities.asModels
 * ```
 */
inline val <reified ModelType> List<UUEntityModelConvertible<ModelType>>.asModels: List<ModelType>
    get() = map { it.asModel }
