/*
 *
 *  Copyright 2020 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package springfox.test.contract.swagger.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.util.List;

public class Country {

  @JsonProperty(access = Access.READ_ONLY)
  private Long populatuion;

  private List<Region> regions;

  public Long getPopulatuion() {
    return populatuion;
  }

  public void setPopulatuion(Long populatuion) {
    this.populatuion = populatuion;
  }

  public List<Region> getRegions() {
    return regions;
  }

  public void setRegions(List<Region> regions) {
    this.regions = regions;
  }

}
