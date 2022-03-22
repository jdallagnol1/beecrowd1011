/*
 * Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this code.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Please visit Gherkin By Example at https://github.com/gherkin-by-example
 * if you need additional information or have any questions.
 */
package br.masmangan.beecrowd.bee1011;

import br.masmangan.beecrowd.bee1011.Sphere;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.math.BigDecimal;
import java.math.RoundingMode;


import static org.junit.Assert.assertEquals;

public class SphereSteps {

    public static final double DELTA = 0.0001;

    private final Sphere s1 = new Sphere();
    private double actual;

    @Given("pi is {double}")
    public void pi_is(double pi) {
        assertEquals(pi, Sphere.PI, DELTA);
    }
    @Given("radius is {double}")
    public void radius_is(double radius) {
        s1.setRadius(radius);
    }
    @When("volume is calculated")
    public void volume_is_calculated() {
    
    double vol = s1.getVolume();
    BigDecimal bd = BigDecimal.valueOf(vol);
    bd = bd.setScale(3, RoundingMode.HALF_UP);
    actual = bd.doubleValue();

    }
    @Then("result should be A={double}")
    public void result_should_be_a(double a) {
        assertEquals(a, actual, DELTA);
    }

}
