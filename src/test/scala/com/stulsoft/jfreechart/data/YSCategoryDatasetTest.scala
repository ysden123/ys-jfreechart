/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.scalatest.flatspec.AnyFlatSpec
import scala.runtime.RichDouble

class YSCategoryDatasetTest extends AnyFlatSpec:
  "YSCategoryDataset" should "add a value" in {
    val ds = YSCategoryDataset[String,Double]()
    ds.addValue(1.0, "category 1", 10)
    ds.addValue(2.0, "category 1", 20)
    ds.addValue(10.0, "category 1", 100)
    ds.addValue(11.0, "category 1", 120)

    val dataset = ds.dataset()
    assertResult(4)(dataset.getColumnCount)
    assertResult(1)(dataset.getRowCount)
    assertResult(2.0)(dataset.getValue("category 1", RichDouble(20.0)))
    assertResult(11.0)(dataset.getValue(0, 3))
  }
