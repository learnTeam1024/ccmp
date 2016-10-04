package com.pro.bs.result;

import java.util.HashMap;
import java.util.Map;

/**
 * MapResult，具有Map功能
 */
public class MapResult<K, V> extends BaseResult {

  private static final long serialVersionUID = 7444857640252579657L;

  //data field
  private Map<K, V> data;

  /**
   * @return the data
   */
  public Map<K, V> getData() {
    return data;
  }

  /**
   * @param data the data to set
   */
  public void setData(Map<K, V> data) {
    this.data = data;
  }

  /**
   * 增加一个k/v
   *
   * @param key
   * @param val
   * @return MapResult<K, V>
   */
  public MapResult<K, V> add(K key, V val) {
    if (data == null) {
      data = new HashMap<K, V>();
    }
    data.put(key, val);
    return this;
  }

}
