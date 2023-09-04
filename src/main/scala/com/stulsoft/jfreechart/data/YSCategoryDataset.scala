/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.jfree.data.category.{CategoryDataset, DefaultCategoryDataset}

/**
 * Wrapper for JFreeChart CategoryDataset class
 */
class YSCategoryDataset[RK, CK]():
  private val data = new DefaultCategoryDataset

  def dataset(): CategoryDataset =
    data.clone().asInstanceOf[CategoryDataset]

  def addValue(value: java.lang.Number, rowKey: Comparable[RK], columnKey: Comparable[CK]): Unit =
    data.addValue(value, rowKey, columnKey)