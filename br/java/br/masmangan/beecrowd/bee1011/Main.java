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

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Sphere s1;
        Scanner s;

        s1 = new Sphere();
        s = new Scanner(in);

        s1.setRadius(s.nextDouble());

        s.close();

        out.printf("A=%.3f%n", s1.getVolume());

    }

}
