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
        #Valid input
        self.assertIsNone(self.time_obj.check_time_format("00:05"))
        self.assertIsNone(self.time_obj.check_time_format("23:52"))
        self.assertIsNone(self.time_obj.check_time_format("1:05AM"))
        self.assertIsNone(self.time_obj.check_time_format("1:05A.M."))
        self.assertIsNone(self.time_obj.check_time_format("1:05 A M"))
        self.assertIsNone(self.time_obj.check_time_format("1:05am"))
        self.assertIsNone(self.time_obj.check_time_format("1:05a.m."))
        self.assertIsNone(self.time_obj.check_time_format("1:05 a m"))
        self.assertIsNone(self.time_obj.check_time_format("5:45PM"))
        self.assertIsNone(self.time_obj.check_time_format("5:45P.M."))
        self.assertIsNone(self.time_obj.check_time_format("5:45 P M"))
        self.assertIsNone(self.time_obj.check_time_format("5:45pm"))
        self.assertIsNone(self.time_obj.check_time_format("5:45p.m."))
        self.assertIsNone(self.time_obj.check_time_format("5:45p m"))
        #Invalid input
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

    def test_fl_duration_takes_only_float(self):
        """Test if ValueError raised if fl_duration set to non-float"""
        with self.assertRaises(ValueError):
            self.time_obj.fl_duration = "v"
        with self.assertRaises(ValueError):
            self.time_obj.fl_duration = 42
        with self.assertRaises(ValueError):
            self.time_obj.fl_duration = []
        with self.assertRaises(ValueError):
            self.time_obj.fl_duration = {}

    def test_fl_duration_is_float(self):
        """Test that fl_duration attribute is a float"""
        self.assertIsInstance(self.time_obj.fl_duration,float,"incorrect type for attribute fl_duration")

    def test_default_fl_duration_is_eight_point_zero(self):
        """Test if fl_duration attribute is 8.0"""
        self.assertEquals(self.time_obj.fl_duration, 8.0,
                          "incorrect default value for attribute fl_duration")

    # Test that times are converted to float correctly
    def test_to_decimal(self):
        self.assertEqual(self.time_obj.to_decimal("4:15am"), 4.25)
        self.assertEqual(self.time_obj.to_decimal("4:15pm"), 16.25)
        self.assertEqual(self.time_obj.to_decimal("17:37"), 17.0 + (37.0/60.0) )

    # Test that 1:10am to 3:25pm is 14 hours and 15 min
    def test_calculate_duration(self):
        """Test that the calculation between times is correct"""
        self.time_obj.str_start_Time = "1:10am"
        self.time_obj.str_end_Time = "3:25P.M."
        self.time_obj.calculate_duration()
        self.assertEqual(self.time_obj.fl_duration, 14.25)

    # Test that 1:10am  plus 14 hours and 15 min is 3:25pm
    def test_calculate_offset(self):
        """Test that the calculation of offset is correct"""
        self.time_obj.str_start_Time = "1:10am"
        self.time_obj.fl_duration = 14.25
        self.time_obj.calculate_end_time()
        self.assertEqual(self.time_obj.str_end_Time, "3:25pm")

if __name__ == '__main__':
    unittest.main()