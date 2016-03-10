#!/usr/bin/env python

import sys
import os
import unittest
import glob
hw3 = __import__(glob.glob('hw3_*.py')[0].split('.')[0])

class SchedulerTestCase(unittest.TestCase):
    """Tests for FizzBuzz class"""
    def setUp(self):
        self.obj_student = hw3.Student()
        self.obj_course = hw3.Course()

    def tearDown(self):
        del self.obj_student
        del self.obj_course

    #2 points each test
    def test_first_name_is_string(self):
        """Test that first_name attribute is string"""
        self.assertIsInstance(self.obj_student.str_first_name, str)

    def test_first_name_default(self):
        """Test if default str_first_name attribute is Jon"""
        self.assertEqual("None", self.obj_student.str_first_name)

    def test_last_name_is_string(self):
        """Test that str_first_name attribute is string"""
        self.assertIsInstance(self.obj_student.str_last_name,str)

    def test_last_name_default(self):
        """Test if default str_last_name attribute is None"""
        self.assertEqual("None", self.obj_student.str_last_name)

    def test_middle_name_is_string(self):
        """Test that str_first_name attribute is string"""
        self.assertIsInstance(self.obj_student.str_middle_name,str)

    def test_middle_name_default(self):
        """Test if default str_middle_name attribute is None"""
        self.assertEqual("None", self.obj_student.str_middle_name)

    def test_student_id_is_string(self):
        """Test that str_first_name attribute is string"""
        self.assertIsInstance(self.obj_student.str_student_id,str)

    def test_student_id_default(self):
        """Test if default str_student_id attribute is None"""
        self.assertEqual("None", self.obj_student.str_student_id)

    def test_li_enrolled_courses_is_list(self):
        """Test if li_enrolled_courses is a list"""
        self.assertIsInstance(self.obj_student.li_enrolled_courses, list)

    def test_li_enrolled_courses_default(self):
        """Test the default of li_enrolled_courses is an empty list."""
        self.assertEqual([], self.obj_student.li_enrolled_courses)

    def test_student_string_conversion(self):
        """Test the string conversion method"""
        self.assertEqual("Name:None, None None\nStudentID:None\n\n\n", str(self.obj_student))

    def test_course_designator_is_string(self):
        """Test that str_first_name attribute is string"""
        self.assertIsInstance(self.obj_course.str_course_designator,str)

    def test_course_designator_default(self):
        """Test if default str_course_designator attribute is None"""
        self.assertEqual("tex001", self.obj_course.str_course_designator)

    def test_course_meeting_times_is_string(self):
        """Test that str_first_name attribute is string"""
        self.assertIsInstance(self.obj_course.str_course_meeting_times,str)

    def test_course_meeting_times_default(self):
        """Test if default str_course_meeting_times attribute is None"""
        self.assertEqual("None", self.obj_course.str_course_meeting_times)

    def test_li_enrolled_students_is_list(self):
        """Test if li_enrolled_students is a list"""
        self.assertIsInstance(self.obj_course.li_enrolled_students, list)

    def test_li_enrolled_students_default(self):
        """Test the default of li_enrolled_students is an empty list."""
        self.assertEqual([], self.obj_course.li_enrolled_students)

    def test_course_string_conversion(self):
        """Test the string conversion method"""
        self.assertEqual('tex001:', str(self.obj_course))


    #14 points for the file Schedule
    def test_graded_file(self):
        """Test that the file is output correctly"""
        hw3.main()
        try:
            with  open("Schedule") as in_file:
                if os.path.basename(in_file.name) != "Schedule":
                    raise IOError
                li_lines = in_file.readlines()

        except IOError:
            self.assertEqual(True, False, "File Schedule  not found!")
        self.assertEqual(['Name:Adama, Leland Joseph\n', 'StudentID:adama1l\n', '\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN08:M,W,F 2:00-2:55\n', 'OT02:T,Th  7:00-8:45\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Adama, William \n',
                          'StudentID:adama1w\n', '\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'OT02:T,Th  7:00-8:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Baltar, Gaius \n', 'StudentID:balta1g\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Besser, Joe \n', 'StudentID:besse1j\n', '\n', 'CS02:M,W   12:00-1:45\n',
                          'EN02:T,Th  9:00-10:45\n', 'PH03:T,Th  1:00-2:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Biggs, Gil John\n',
                          'StudentID:biggs1gj\n', '\n', 'CS01:M,W,F 11:00-11:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'MT03:M,W   5:00-6:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Bombadil, Tom \n', 'StudentID:bomba1t\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n', 'MT01:T,Th  11:00-12:45\n',
                          'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Brandybuck, Meriadoc \n', 'StudentID:brand1m\n', '\n', 'AR00:M,W,F 8:00-8:55\n',
                          'CS02:M,W   12:00-1:45\n', 'EN01:M,W,F 10:00-10:55\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Carpenter, Molly \n',
                          'StudentID:carpe1m\n', '\n', 'CS01:M,W,F 11:00-11:55\n', 'EN01:M,W,F 10:00-10:55\n',
                          'MT01:T,Th  11:00-12:45\n', 'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Clegane, Sandor \n', 'StudentID:clega1s\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS02:M,W   12:00-1:45\n', 'MT03:M,W   5:00-6:45\n',
                          'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Corey, Carl \n', 'StudentID:corey1c\n', '\n', 'AR00:M,W,F 8:00-8:55\n',
                          'CS01:M,W,F 11:00-11:55\n', 'EN01:M,W,F 10:00-10:55\n', 'MT01:T,Th  11:00-12:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Cottle, Sherman \n',
                          'StudentID:cottl1s\n', '\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'MT03:M,W   5:00-6:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Crusher, Wesley \n', 'StudentID:crush1w\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n',
                          'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Dane, Alexander \n', 'StudentID:dane1a\n', '\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN02:T,Th  9:00-10:45\n', 'MT03:M,W   5:00-6:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:DeRita, Curly Joe\n',
                          'StudentID:derit1cj\n', '\n', 'CS02:M,W   12:00-1:45\n', 'MT01:T,Th  11:00-12:45\n',
                          'PH03:T,Th  1:00-2:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', "Name:e'Drien, Morrolan \n", 'StudentID:edrie1m\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n', 'EN01:M,W,F 10:00-10:55\n',
                          'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Fine, Lary \n', 'StudentID:fine1l\n', '\n', 'CS01:M,W,F 11:00-11:55\n',
                          'EN01:M,W,F 10:00-10:55\n', 'MT03:M,W   5:00-6:45\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Flaumel, Evelyn \n',
                          'StudentID:flaum1e\n', '\n', 'CS02:M,W   12:00-1:45\n', 'EN02:T,Th  9:00-10:45\n',
                          'MT01:T,Th  11:00-12:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Graystone, Zoe \n', 'StudentID:grays1z\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Gruber, Hans \n', 'StudentID:grube1h\n', '\n', 'AR00:M,W,F 8:00-8:55\n',
                          'CS02:M,W   12:00-1:45\n', 'EN08:M,W,F 2:00-2:55\n', 'MT01:T,Th  11:00-12:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Hego, Damask \n',
                          'StudentID:hego1d\n', '\n', 'CS02:M,W   12:00-1:45\n', 'EN02:T,Th  9:00-10:45\n',
                          'MT01:T,Th  11:00-12:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Howard, Curly \n', 'StudentID:howar1c\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n', 'CS02:M,W   12:00-1:45\n',
                          'EN01:M,W,F 10:00-10:55\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Howard, Moe \n', 'StudentID:howar1m\n', '\n', 'CS01:M,W,F 11:00-11:55\n',
                          'CS02:M,W   12:00-1:45\n', 'EN02:T,Th  9:00-10:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Howard, Shemp \n',
                          'StudentID:howar1s\n', '\n', 'AR00:M,W,F 8:00-8:55\n', 'EN02:T,Th  9:00-10:45\n',
                          'PH03:T,Th  1:00-2:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Lannister, Tyrion \n', 'StudentID:lanni1t\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n', 'EN02:T,Th  9:00-10:45\n',
                          'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:McCoy, Ebenezar \n', 'StudentID:mccoy1e\n', '\n', 'CS02:M,W   12:00-1:45\n',
                          'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:McCoy, Leonard \n',
                          'StudentID:mccoy1l\n', '\n', 'CS01:M,W,F 11:00-11:55\n', 'EN02:T,Th  9:00-10:45\n',
                          'MT03:M,W   5:00-6:45\n', 'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Montoya, Inigo \n', 'StudentID:monto1i\n', '\n',
                          'CS01:M,W,F 11:00-11:55\n', 'EN02:T,Th  9:00-10:45\n', 'MT03:M,W   5:00-6:45\n',
                          'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Murphy, Alexander James\n', 'StudentID:murph1a\n', '\n', 'AR00:M,W,F 8:00-8:55\n',
                          'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n', 'OT02:T,Th  7:00-8:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Roslin, Laura \n',
                          'StudentID:rosli1l\n', '\n', 'AR00:M,W,F 8:00-8:55\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN08:M,W,F 2:00-2:55\n', 'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Rugen, Tyrone \n', 'StudentID:rugen1t\n', '\n',
                          'CS02:M,W   12:00-1:45\n', 'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n',
                          'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Scott, Montgomery \n', 'StudentID:scott1m\n', '\n', 'EN02:T,Th  9:00-10:45\n',
                          'MT01:T,Th  11:00-12:45\n', 'OT02:T,Th  7:00-8:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Sobchak, Walter \n',
                          'StudentID:sobch1w\n', '\n', 'AR00:M,W,F 8:00-8:55\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN01:M,W,F 10:00-10:55\n', 'MT01:T,Th  11:00-12:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Solo, Han \n', 'StudentID:solo1h\n', '\n',
                          'CS01:M,W,F 11:00-11:55\n', 'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n',
                          'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Stark, Arya \n', 'StudentID:stark1a\n', '\n', 'CS01:M,W,F 11:00-11:55\n',
                          'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Tai, Durga Besadii\n',
                          'StudentID:tai1db\n', '\n', 'CS01:M,W,F 11:00-11:55\n', 'EN01:M,W,F 10:00-10:55\n',
                          'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Taltos, Vlad \n', 'StudentID:talto1v\n', '\n',
                          'CS02:M,W   12:00-1:45\n', 'EN02:T,Th  9:00-10:45\n', 'MT01:T,Th  11:00-12:45\n',
                          'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Targaryen, Daenerys \n', 'StudentID:targa1d\n', '\n', 'CS02:M,W   12:00-1:45\n',
                          'EN01:M,W,F 10:00-10:55\n', 'MT03:M,W   5:00-6:45\n', 'PH03:T,Th  1:00-2:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Tharen, Bria \n',
                          'StudentID:thare1b\n', '\n', 'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n',
                          'CS02:M,W   12:00-1:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Tigh, Ellen \n', 'StudentID:tigh1e\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'MT03:M,W   5:00-6:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Tigh, Saul \n', 'StudentID:tigh1s\n', '\n', 'CS05:M,W,F 3:00-3:55\n',
                          'EN08:M,W,F 2:00-2:55\n', 'OT02:T,Th  7:00-8:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Tiure, Jaba Desilijic\n',
                          'StudentID:tiure1jd\n', '\n', 'AR00:M,W,F 8:00-8:55\n', 'CS01:M,W,F 11:00-11:55\n',
                          'EN02:T,Th  9:00-10:45\n', 'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n', 'Name:Took, Pregrin \n', 'StudentID:took1p\n', '\n',
                          'AR00:M,W,F 8:00-8:55\n', 'MT01:T,Th  11:00-12:45\n', 'MT03:M,W   5:00-6:45\n',
                          'PH03:T,Th  1:00-2:45\n', '\n', 'cut here\n', '------------------------\n', '\n',
                          'Name:Watson, John \n', 'StudentID:watso1j\n', '\n', 'EN01:M,W,F 10:00-10:55\n',
                          'EN02:T,Th  9:00-10:45\n', 'MT03:M,W   5:00-6:45\n', 'PH05:T,Th  3:00-4:45\n', '\n',
                          'cut here\n', '------------------------\n', '\n', 'Name:Zarek, Thomas \n',
                          'StudentID:zarek1t\n', '\n', 'CS05:M,W,F 3:00-3:55\n', 'EN08:M,W,F 2:00-2:55\n',
                          'OT02:T,Th  7:00-8:45\n', 'PH05:T,Th  3:00-4:45\n', '\n', 'cut here\n',
                          '------------------------\n', '\n'], li_lines)
	
if __name__ == '__main__':
    unittest.main()
