package com.stbasarab.lab3.shapes

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PathEffect


private const val STROKE_WITH = 10f

abstract class Shape(
  private val paintColor: Int,
  private val fillColor: Int,
  private val effect: PathEffect?
) {
  protected var startX = 0f
  protected var startY = 0f
  protected var endX = 0f
  protected var endY = 0f

  protected val paint = Paint().apply {
    style = Paint.Style.STROKE
    color = paintColor
    isAntiAlias
    isDither
    strokeWidth = STROKE_WITH
    strokeCap = Paint.Cap.ROUND
    pathEffect = effect
  }

  protected fun setStrokeStyle() {
    paint.style = Paint.Style.STROKE
    paint.color = paintColor
  }

  protected fun setFillStyle() {
    paint.style = Paint.Style.FILL
    paint.color = fillColor
  }

  fun onTouchDown(x: Float, y: Float) {
    startX = x
    startY = y
  }

  fun onTouchUp(x: Float, y: Float) {
    endX = x
    endY = y
  }

  abstract fun draw(canvas: Canvas)
}