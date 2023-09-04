/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.data

import org.jfree.data.xy.XYSeries
class YSXYSeries(name:String):
  private val xySeries: XYSeries  = new XYSeries(name)

  def add(x:Number, y:Number): Unit =
    println("==>addValue")
    xySeries.add(x,y)
    
  def series():XYSeries = xySeries.clone().asInstanceOf[XYSeries]

