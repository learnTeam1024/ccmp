package com.pro.bs.result;

/**
 * 简单的返回类，继承 <code>BaseResult</code>
 *
 */
public class PlainResult<T> extends BaseResult {

  private static final long serialVersionUID = -7348340262762007793L;

  /**
   * 调用返回的数据
   */
  private T data;

  /**
   * @return the data
   */
  public T getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(T data) {
    this.data = data;
  }


}