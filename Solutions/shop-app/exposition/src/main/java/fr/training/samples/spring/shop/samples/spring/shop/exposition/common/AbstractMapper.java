package fr.training.samples.spring.shop.samples.spring.shop.exposition.common;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Abstract implementation of a bean mapper
 * 
 * @param <T> The source class
 * @param <S> The target class
 */
public abstract class AbstractMapper<T, S> {

	/**
	 * @param entity entity
	 * @return the mapped entity
	 */
	public abstract T mapToDto(S entity);

	/**
	 * @param dto dto
	 * @return the mapped entity
	 */
	public abstract S mapToEntity(T dto);

	/**
	 * @param entityList entityList
	 * @return a List of the mapped entity
	 */
	public List<T> mapToDtoList(List<S> entityList) {
		return entityList.stream().filter(Objects::nonNull).map(this::mapToDto).collect(Collectors.toList());
	}

	/**
	 * @param entityList entityList
	 * @return a Set of the mapped entity
	 */
	public Set<T> mapToDtoSet(Set<S> entityList) {
		return entityList.stream().filter(Objects::nonNull).map(this::mapToDto).collect(Collectors.toSet());
	}

	/**
	 * @param dtoList dtoList
	 * @return a List of the mapped entity
	 */
	public List<S> mapToEntityList(List<T> dtoList) {
		return dtoList.stream().filter(Objects::nonNull).map(this::mapToEntity).collect(Collectors.toList());
	}

	/**
	 * @param dtoList dtoList
	 * @return a Set of the mapped entity
	 */
	public Set<S> mapToEntitySet(Set<T> dtoList) {
		return dtoList.stream().filter(Objects::nonNull).map(this::mapToEntity).collect(Collectors.toSet());
	}
}
