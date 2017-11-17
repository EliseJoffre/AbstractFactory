package fr.unilim.iut.abstractFactory;

import fr.unilim.iut.abstractFactory.color.Color;
import fr.unilim.iut.abstractFactory.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}