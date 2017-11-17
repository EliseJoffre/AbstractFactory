package fr.unilim.iut.abstractFactory;

import fr.unilim.iut.abstractFactory.color.Blue;
import fr.unilim.iut.abstractFactory.color.Color;
import fr.unilim.iut.abstractFactory.color.Green;
import fr.unilim.iut.abstractFactory.color.Red;
import fr.unilim.iut.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}
}