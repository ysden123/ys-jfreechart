/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.jfree.data.xy.{XYDataset, XYSeriesCollection}

class YSXYSeriesCollection:
  val seriesCollection = new XYSeriesCollection()

  def addSeries(s: YSXYSeries): Unit =
    println("==>")
    seriesCollection.addSeries(s.series())

  def dataset():XYDataset = seriesCollection.clone().asInstanceOf[XYSeriesCollection]
