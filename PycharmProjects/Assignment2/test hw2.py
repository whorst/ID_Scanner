#!/usr/bin/env python

import unittest
import glob

hw2 = __import__(glob.glob('hw2_*.py')[0].split('.')[0])

class FizzBuzzTestCase(unittest.TestCase):
    """Tests for FizzBuzz class"""
    def setUp(self):
        self.stu = hw2.Student()

    def tearDown(self):
        del self.stu

    #3 points each test
    def test_fname_is_string(self):
        """Test that fname attribute is string"""
        self.assertIsInstance(self.stu.str_fname,str)

    def test_fname_default(self):
        """Test if default str_fname attribute is Jon"""
        self.assertEqual(self.stu.str_fname, "Jon")

    def test_lname_is_string(self):
        """Test that str_fname attribute is string"""
        self.assertIsInstance(self.stu.str_lname,str)

    def test_lname_default(self):
        """Test if default str_lname attribute is Doe"""
        self.assertEqual(self.stu.str_lname, "Doe")

    def test_grade_is_string(self):
        """Test that str_grade attribute is string"""
        self.assertIsInstance(self.stu.str_grade,str)

    def test_grade_default(self):
        """Test if default str_grade attribute is F"""
        self.assertEqual(self.stu.str_grade, "E")

    def test_grade_bad_input(self):
        """Use invalid input when setting the grade"""
        self.stu.str_grade = "F"
        self.assertEqual(self.stu.str_grade, "E")
        self.stu.str_grade = {"bill":[0, 0, 40, 35, 0, 35, 0, 35, 13, 15, 18, 0, 20]}
        self.assertEqual(self.stu.str_grade, "E")
        self.stu.str_grade = 100.0
        self.assertEqual(self.stu.str_grade, "E")
        self.stu.str_grade = ["bill", 0, 0, 40, 35, 0, 35, 0, 35, 13, 15, 18, 0, 20]
        self.assertEqual(self.stu.str_grade, "E")

    def test_init_params(self):
        """Ensure __init__ takes parameters"""
        self.stu = hw2.Student("Bill", "Goat", 890, [280, 250, 40, 35, 30, 35, 40, 35, 13, 15, 18, 20, 20])

    def test_student_string_conversion(self):
        """Check that the proper string is returned"""
        self.assertEqual("Jon Doe:E", str(self.stu))

    def test_grading_scale(self):
        """Test that the grading scale is set correctly."""
        self.stu.str_grade=["100", 120]
        self.assertEqual(self.stu.str_grade, "A")
        self.stu.str_grade=[100, 92]
        self.assertEqual(self.stu.str_grade, "A")
        self.stu.str_grade=[100, 90]
        self.assertEqual(self.stu.str_grade, "A-")
        self.stu.str_grade=[100, 88]
        self.assertEqual(self.stu.str_grade, "B+")
        self.stu.str_grade=[100, 82]
        self.assertEqual(self.stu.str_grade, "B")
        self.stu.str_grade=[100, 80]
        self.assertEqual(self.stu.str_grade, "B-")
        self.stu.str_grade=[100, 78]
        self.assertEqual(self.stu.str_grade, "C+")
        self.stu.str_grade=[100, 72]
        self.assertEqual(self.stu.str_grade, "C")
        self.stu.str_grade=[100, 70]
        self.assertEqual(self.stu.str_grade, "C-")
        self.stu.str_grade=[100, 68]
        self.assertEqual(self.stu.str_grade, "D+")
        self.stu.str_grade=[100, 62]
        self.assertEqual(self.stu.str_grade, "D")
        self.stu.str_grade=[100, 60]
        self.assertEqual(self.stu.str_grade, "D-")
        self.stu.str_grade=[100, 59]
        self.assertEqual(self.stu.str_grade, "E")

    def test_grade_rounding(self):
        """Check that the grade is rounded correctly"""
        self.stu.str_grade=[1000, 915]
        self.assertEqual(self.stu.str_grade, "A")
        self.stu.str_grade=[1000, 895]
        self.assertEqual(self.stu.str_grade, "A-")
        self.stu.str_grade=[1000, 875]
        self.assertEqual(self.stu.str_grade, "B+")
        self.stu.str_grade=[1000, 815]
        self.assertEqual(self.stu.str_grade, "B")
        self.stu.str_grade=[1000, 795]
        self.assertEqual(self.stu.str_grade, "B-")
        self.stu.str_grade=[1000, 775]
        self.assertEqual(self.stu.str_grade, "C+")
        self.stu.str_grade=[1000, 715]
        self.assertEqual(self.stu.str_grade, "C")
        self.stu.str_grade=[1000, 695]
        self.assertEqual(self.stu.str_grade, "C-")
        self.stu.str_grade=[1000, 675]
        self.assertEqual(self.stu.str_grade, "D+")
        self.stu.str_grade=[1000, 615]
        self.assertEqual(self.stu.str_grade, "D")
        self.stu.str_grade=[1000, 595]
        self.assertEqual(self.stu.str_grade, "D-")
        self.stu.str_grade=[1000, 585]
        self.assertEqual(self.stu.str_grade, "E")

    def test_grade_summation(self):
        """Check that the grade is rounded correctly"""
        self.stu.str_grade=[1000, 300, 300, 45, 40, 50, 50, 40, 50, 20, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "A")
        self.stu.str_grade=[1000, 280, 250, 45, 40, 50, 50, 40, 50, 20, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "A-")
        self.stu.str_grade=[1000, 280, 250, 45, 40, 50, 50, 40, 35, 20, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "B+")
        self.stu.str_grade=[1000, 280, 250, 40, 35, 30, 35, 40, 35, 13, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "B")
        self.stu.str_grade=[1000, 260, 250, 40, 35, 30, 35, 40, 35, 13, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "B-")
        self.stu.str_grade=[1000, 230, 250, 40, 35, 30, 35, 40, 35, 13, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "C+")
        self.stu.str_grade=[1000, 200, 250, 40, 35, 30, 35, 40, 35, 13, 15, 18, 20, 20]
        self.assertEqual(self.stu.str_grade, "C")
        self.stu.str_grade=[1000, 220, 200, 40, 35, 30, 35, 40, 35, 13, 15, 18, 10, 20]
        self.assertEqual(self.stu.str_grade, "C-")
        self.stu.str_grade=[1000, 190, 200, 40, 35, 30, 30, 40, 35, 13, 15, 18, 10, 20]
        self.assertEqual(self.stu.str_grade, "D+")
        self.stu.str_grade=[1000, 190, 200, 30, 35, 30, 30, 40, 35, 13, 15, 18, 10, 20]
        self.assertEqual(self.stu.str_grade, "D")
        self.stu.str_grade=[1000, 190, 180, 30, 35, 30, 30, 40, 0, 13, 15, 18, 0, 20]
        self.assertEqual(self.stu.str_grade, "D-")
        self.stu.str_grade=[1000, 190, 180, 30, 35, 0, 30, 0, 0, 13, 15, 10, 0, 20]
        self.assertEqual(self.stu.str_grade, "E")
        self.stu.str_grade=[1000, 190, 180, 30, 35, 0, 30, 0, 0, 13, 15, 10, 0, "A"]
        self.assertEqual(self.stu.str_grade, "E")


    #14 points for the file Graded
    def test_graded_file(self):
        """Test that the file is output correctly"""
        hw2.main()
        try:
            li_lines = open("Graded").readlines()
        except IOError:
            self.assertEqual(True, False, "File not found!")
        self.assertEqual(['Joe Besser:B\n', 'Tom Bombadil:B\n', 'Meriadoc Brandybuck:B\n', 'Molly Carpenter:A\n',
                          'Sandor Clegane:B-\n', 'Carl Corey:C\n', 'Wesley Crusher:C\n', 'Hego Damask:C-\n',
                          'Curly Joe DeRita:B\n', 'Harry Dresden:C\n', "Morrolan e'Drien:C\n", 'Lary Fine:B-\n',
                          'Evelyn Flaumel:C+\n', 'Curly Howard:C+\n', 'Moe Howard:B+\n', 'Shemp Howard:B\n',
                          'Tyrion Lannister:C\n', 'Ebenezar McCoy:A\n', 'Leonard McCoy:B\n', 'Inigo Montoya:C\n',
                          'Tyrone Rugen:C+\n', 'Montgomery Scott:A-\n', 'Han Solo:B\n', 'Arya Stark:C+\n',
                          'Durga Besadii Tai:C\n', 'Vlad Taltos:B\n', 'Daenerys Targaryen:B+\n', 'Bria Tharen:B\n',
                          'Jabba Desilijic Tiure:B\n', 'Pregrin Took:C\n', 'John Watson:A\n'],li_lines)
	
if __name__ == '__main__':
    unittest.main()