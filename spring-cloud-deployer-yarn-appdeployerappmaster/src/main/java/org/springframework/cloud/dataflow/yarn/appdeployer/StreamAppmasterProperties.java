/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.dataflow.yarn.appdeployer;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties passed from a deployer into an appmaster.
 *
 * @author Janne Valkealahti
 */
@ConfigurationProperties(value = "spring.cloud.deployer.yarn.appmaster")
public class StreamAppmasterProperties {

	private String artifact;

	public String getArtifact() {
		return artifact;
	}

	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}
}
