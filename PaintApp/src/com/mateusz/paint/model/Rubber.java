package com.mateusz.paint.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Rubber extends Shape
{

	private List<Point> points = new ArrayList<>();

	public Rubber(int x, int y, int x2, int y2, Color c)
	{
		super(x, y, x2, y2, c);
		points.add(new Point(x, y));
	}

	@Override
	public void render(Graphics g)
	{
		g.setColor(Color.WHITE);

		for (Point p : points)
		{
			g.fillRect((int) p.getX(), (int) p.getY(), 25, 25);
		}
	}

	public void addPoint(Point p)
	{
		points.add(p);
	}
}