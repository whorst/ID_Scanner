#!/usr/bin/env python

import StringIO
import sys
import unittest
import glob
fb = __import__(glob.glob('hw1_*.py')[0].split('.')[0])

class FizzBuzzTestCase(unittest.TestCase):
    """Tests for FizzBuzz class"""
    def setUp(self):
        self.fb = fb.FizzBuzz()
    def tearDown(self):
        del self.fb
    def test_num_is_int(self):
        """Test that num attribute is an integer"""
        self.assertIsInstance(self.fb.num,int,"incorrect type for attribute num")
    def test_num_is_zero(self):
        """Test if default num attribute is 0"""
        self.assertEquals(self.fb.num, 0, "incorrect default value for attribute num")
    def test_fbn_is_str(self):
        """Test that str attribute is string"""
        self.assertIsInstance(self.fb.fbn, str, "incorrect type for attribute str")
    def test_fbn_is_FizzBuzz(self):
        """Test if default str attribute is "FizzBuzz" """
        self.assertEqual(self.fb.fbn, "FizzBuzz", "incorrect default value for attribute str")
    def test_num_takes_only_int(self):
        """Test if ValueError raised if num set to non-int"""
        with self.assertRaises(ValueError):
            self.fb.num = "v"
    def test_fbn_is_Fizz(self):
        """Test if fbn is "Fizz" when num is divisibile by 3"""
        self.fb.num = 42
        self.assertEqual(self.fb.fbn, "Fizz", "incorrect fbn value for multiple of 3")
    def test_fbn_is_Buzz(self):
        """Test if fbn is "Buzz" when num is divisibile by 5"""
        self.fb.num = 10
        self.assertEqual(self.fb.fbn, "Buzz", "incorrect fbn value for multiple of 5")
    def test_fbn_is_number(self):
        """Test if fbn is string of number for num not divisible by 3 or 5"""
        self.fb.num = 8675309
        self.assertEqual(self.fb.fbn, "8675309", "incorrect fbn value for non multiple")
    def test_default_to_string(self):
        """Test that the to string retruns the expected value for defaults"""
        self.assertEqual(str(self.fb), "The number is 0 and fbn is FizzBuzz", "incorrect string conversion")
    def test_to_string(self):
        """Test that the to string retruns the expected value for non defaults"""
        self.fb.num = 8675309
        self.assertEqual(str(self.fb), "The number is 8675309 and fbn is 8675309", 'incorrect string conversion')
    def test_main(self):
        """Test that main prints out the correct values for numbers 0-50 on a single line"""
        stdout = sys.stdout
        cap = StringIO.StringIO()
        sys.stdout = cap 
        fb.main()
        sys.stdout = stdout
        self.assertEqual(cap.getvalue(), 'FizzBuzz\n1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\n')

	
if __name__ == '__main__':
    unittest.main()
