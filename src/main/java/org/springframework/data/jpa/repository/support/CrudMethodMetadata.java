/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jpa.repository.support;

import java.util.Map;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.query.JpaEntityGraph;

/**
 * Interface to abstract {@link CrudMethodMetadata} that provide the {@link LockModeType} to be used for query
 * execution.
 * 
 * @author Oliver Gierke
 * @author Thomas Darimont
 */
public interface CrudMethodMetadata {

	/**
	 * Returns the {@link LockModeType} to be used.
	 * 
	 * @return
	 */
	LockModeType getLockModeType();

	/**
	 * Returns all query hints to be applied to queries executed for the CRUD method.
	 * 
	 * @return
	 */
	Map<String, Object> getQueryHints();

	/**
	 * Returns the {@link JpaEntityGraph} to be used.
	 * 
	 * @return
	 * @since 1.8
	 */
	JpaEntityGraph getEntityGraph();
}
