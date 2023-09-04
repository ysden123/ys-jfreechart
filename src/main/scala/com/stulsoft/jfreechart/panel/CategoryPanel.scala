/*
 * Copyright (c) 2023. StulSoft
 */

package com.stulsoft.jfreechart.panel

import com.stulsoft.jfreechart.data.YSCategoryDataset
import org.jfree.chart.{ChartFactory, ChartPanel, JFreeChart}
import org.jfree.chart.plot.PlotOrientation

import scala.swing.{Graphics2D, Panel}

class CategoryPanel[RK, CK](title: String,
                            categoryAxisLabel: String,
                            valueAxisLabel: String,
                            dataset: YSCategoryDataset[RK, CK],
                            orientation: PlotOrientation = PlotOrientation.VERTICAL,
                            showLegend: Boolean = true,
                            showTooltips: Boolean = true,
                            urls: Boolean = false) extends Panel:
  private val lineChart: JFreeChart = ChartFactory.createLineChart(
    title,
    categoryAxisLabel,
    valueAxisLabel,
    dataset.dataset(),
    orientation,
    showLegend,
    showTooltips,
    urls
  )

  private val chartPanel = new ChartPanel(lineChart)

  override def paint(g: Graphics2D): Unit =
    chartPanel.setBounds(bounds.x, bounds.y, bounds.width, bounds.height)
    chartPanel.paintComponent(g)

end CategoryPanel
