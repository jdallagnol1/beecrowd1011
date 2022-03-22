#
# Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
# 
# This software is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This code is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this code.  If not, see <https://www.gnu.org/licenses/>.
#	
# Please visit Gherkin By Example at https://github.com/gherkin-by-example 
# if you need additional information or have any questions.
@domain
Feature: Sphere

Narrative:

As a mathematics student
I want to calculate the of a sphere given it's radius
So i can know if i am studying right


Scenario Outline: Calculate the volume of a sphere given radius

  Given pi is 3.14159
  And radius is <r>
  When volume is calculated
  Then result should be <a>

Examples:
|  r |  a |
| 5.00 | A=523.598 |
| 10.00 | A=4188.787 |
| 7.00 | A=1436.754 |
