/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.panel

import com.stulsoft.jfreechart.data.YSCategoryDataset
import org.jfree.chart.{ChartFactory, ChartPanel}
import org.jfree.chart.plot.{PlotOrientation, XYPlot}
import org.jfree.data.xy.XYDataset

import scala.swing.{Graphics2D, Panel}

class XYSeriesPanel(title: String,
                    xAxisLabel: String,
                    valueAxisLabel: String,
                    dataset: XYDataset,
                    orientation: PlotOrientation = PlotOrientation.VERTICAL,
                    showLegend: Boolean = true,
                    showTooltips: Boolean = true,
                    urls: Boolean = false)  extends Panel:
  private val chart = ChartFactory.createXYLineChart(
    title,
    xAxisLabel,
    valueAxisLabel,
    dataset,
    orientation,
    showLegend,
    showTooltips,
    urls
  )

  private val chartPanel = new ChartPanel(chart)

//  private val plot:XYPlot=chart.getXYPlot

  override def paint(g: Graphics2D): Unit =
    chartPanel.setBounds(bounds.x, bounds.y, bounds.width, bounds.height)
    chartPanel.paintComponent(g)
end XYSeriesPanel
