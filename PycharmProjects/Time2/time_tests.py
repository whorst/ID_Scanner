#!/usr/bin/env python

# Test time calculator
# Author: cps280s
# Created: 14Jan2016
# Modified: 19Jan2016
# Changes:

import unittest
import simple_time


class testTimeMethods(unittest.TestCase):
    """A class to test the methods of the time calculator"""
    def setUp(self):
        self.time_obj = simple_time.simple_time()
    def tearDown(self):
        del self.time_obj
    # Test that times are converted to 24hour format correctly
    def test24(self):
        """Test that the method to convert to 24hour format works correctly"""

        self.assertEqual(self.time_obj.to_24("4:00PM"), "16:00")
        self.assertEqual(self.time_obj.to_24("12:25 AM"), "00:25")
        self.assertEqual(self.time_obj.to_24("12:25 p.m."), "12:25")
        self.assertEqual(self.time_obj.to_24("00:45"), "00:45")

    def test_validation(self):
        """Test that validation method works correctly"""
        self.assertIsNone(self.time_obj.check_time_format("23:52"))
        self.assertIsNone(self.time_obj.check_time_format("00:05"))
        self.assertIsNone(self.time_obj.check_time_format("5:45PM"))
        self.assertIsNone(self.time_obj.check_time_format("1:05a.m."))
        self.assertIsNone(self.time_obj.check_time_format("5:45PM"))
        self.assertIsNone(self.time_obj.check_time_format("5:45P.M."))
        self.assertIsNone(self.time_obj.check_time_format("1:05a.m."))
        self.assertIsNone(self.time_obj.check_time_format("5:45PM"))
        with self.assertRaises(SyntaxError):
            self.time_obj.check_time_format("13:05a.m.")
        with self.assertRaises(SyntaxError):
            self.time_obj.check_time_format("00:30am")
        with self.assertRaises(SyntaxError):
            self.time_obj.check_time_format("0:30am")
        with self.assertRaises(SyntaxError):
            self.time_obj.check_time_format("noon")

    def test_start_time_is_str(self):
        """Test that str_start_time attribute is a string"""
        self.assertIsInstance(self.time_obj.str_start_Time,str,"incorrect type for attribute str_start_time")

    def test_start_time_is_zero(self):
        """Test if default str_start_time attribute is 9:00AM"""
        self.assertEquals(self.time_obj.str_start_Time, "9:00AM",
                          "incorrect default value for attribute str_start_time")

    def test_end_time_is_str(self):
        """Test that str_end_time attribute is a string"""
        self.assertIsInstance(self.time_obj.str_end_Time,str,"incorrect type for attribute str_end_time")

    def test_end_time_is_zero(self):
        """Test if default str_end_time attribute is 5:00PM"""
        self.assertEquals(self.time_obj.str_end_Time, "5:00PM",
                          "incorrect default value for attribute str_end_time")
    def test_fl_duration_is_float(self):
        """Test that fl_duration attribute is a float"""
        self.assertIsInstance(self.time_obj.fl_duration,float,"incorrect type for attribute fl_duration")

    def test_default_fl_duration_is_eight_point_zero(self):
        """Test if fl_duration attribute is 8.0"""
        self.assertEquals(self.time_obj.fl_duration, 8.0,"incorrect default value for attribute fl_duration")

    #tEST THAT TIMES ARE CONVERTED TO FLOAT CORRECTLY
    def test_to_decimal(self):
        self.assrtEqaul(self.time_obj.to_decimal("4:15am"), 4.25)
        self.assrtEqaul(self.time_obj.to_decimal("4:15am"), 16.25)
        self.assrtEqaul(self.time_obj.to_decimal("17:37"), 17.0+(37.0/60.0))


    def test_num_takes_only_float(self):
         """Test if ValueError raised if num set to non-int"""
         with self.assertRaises(ValueError):
             self.fb.num = "v"
         with self.assertRaises(ValueError):
             self.fb.num = 42
         with self.assertRaises(ValueError):
             self.fb.num = []
         with self.assertRaises(ValueError):
             self.fb.num = {}

    # Test that times are converted to decimal correctly

    # Test that times are converted from decimal correctly

    # Test invalid duration input

    # Test invalid input type

    # Test that 1:10am to 3:25pm is 14 hours and 15 min

    #Test that 1:10am to 3:25pm is 14 hours and 15 min
    def test_calculate(self):
        """Test that the calculation between times is correct"""
        self.time_obj.str_start_Time = "1:10am"
        self.time_obj.str_end_Time = "3:25P.M."
        self.time_obj.calculate_duration()
        self.time_obj.calculate_duration()
        self.assertEqual(self.time_obj.calculate_duration(),14.25)

if __name__ == '__main__':
    unittest.main()