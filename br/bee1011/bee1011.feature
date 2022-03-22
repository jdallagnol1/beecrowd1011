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
@system
Feature: Bee1011 CLI

Narrative:

As a mathematics student
I want to calculate the of a sphere given it's radius
So i can know if i am studying right



Scenario: Calculate the volume of a sphere given radius 5.00

Given input is
"""
5.000
"""
When program runs
Then output should be
"""
A=523.598

"""

Scenario: Run program with input 10.00

Given input is
"""
10.000
"""
When program runs
Then output should be
"""
A=4188.787

"""

Scenario: Run program with input 7.00

Given input is
"""
7.000
"""
When program runs
Then output should be
"""
A=1436.754

"""