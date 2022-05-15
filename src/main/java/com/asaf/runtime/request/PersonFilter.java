package com.asaf.runtime.request;

import java.util.Set;
import javax.validation.constraints.Min;

/** Object Used to List Person */
public class PersonFilter {

  @Min(value = 0)
  private Integer currentPage;

  private Set<String> id;

  @Min(value = 1)
  private Integer pageSize;

  /** @return currentPage */
  public Integer getCurrentPage() {
    return this.currentPage;
  }

  /**
   * @param currentPage currentPage to set
   * @return PersonFilter
   */
  public <T extends PersonFilter> T setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return (T) this;
  }

  /** @return id */
  public Set<String> getId() {
    return this.id;
  }

  /**
   * @param id id to set
   * @return PersonFilter
   */
  public <T extends PersonFilter> T setId(Set<String> id) {
    this.id = id;
    return (T) this;
  }

  /** @return pageSize */
  public Integer getPageSize() {
    return this.pageSize;
  }

  /**
   * @param pageSize pageSize to set
   * @return PersonFilter
   */
  public <T extends PersonFilter> T setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return (T) this;
  }
}
