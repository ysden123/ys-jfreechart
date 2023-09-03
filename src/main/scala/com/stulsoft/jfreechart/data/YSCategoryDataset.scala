/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.jfree.data.category.{CategoryDataset, DefaultCategoryDataset}

/**
 * Wrapper for JFreeChart CategoryDataset class
 */
class YSCategoryDataset:
  private val data = new DefaultCategoryDataset

  def dataset(): CategoryDataset =
/*
    println("==>dataset")
    println(s"""data.getColumnCount=${data.getColumnCount}""")
    println(s"""data.getRowCount=${data.getRowCount}""")
    println(s"""data.getValue("schools", 1980.0)=${data.getValue("schools", 1980.0)}""")
*/

    data.clone().asInstanceOf[CategoryDataset]
  def addValue(value: Double, rowKey: String, columnKey: Double): Unit =
    data.addValue(value, rowKey, columnKey)

  def addValue(value: Double, rowKey: Int, columnKey: Double): Unit =
    data.addValue(value, rowKey, columnKey)


