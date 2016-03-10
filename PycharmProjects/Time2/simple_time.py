#!/usr/bin/env python

# Time calculator
# Author: cps280s
# Created: 19Jan2016
# Modified:21Jan2016
# Changes: Logic for coversion to 24 hour format

import re

class simple_time(object):
    """A class to compute simple time math"""

    def __init__(self):
        """Constructor function"""
        self.str_start_Time = "9:00AM"
        self.str_end_Time = "5:00PM"
        self.fl_duration = 8.00



    @property
    def fl_duration(self):
        return self.__fl_duration

    @fl_duration.setter
    def fl_duration(self,fl_dur):
        if not isinstance(fl_dur,float):
            self.__fl_duration = fl_dur

    @fl_duration.setter
    def str_start_Time(self):
        self.str_start_Time

    @fl_duration.setter
    def str_start_Time(self,str_time):
        #Valid input
        self.check_time_format(str_time)
        self.__str_start_Time = str_time

    def check_time_format(self, str_time):
        """A method to convert 12hour time to 24hour time"""
        # Validate input is in form of [0]1:00[am,AM,a.m,A.M,pm,PM,p.m,P.M.]
        if not re.match("\d{1,2}:\d{2}\s?[aApP]?\.?\s?[mM]?\.?$", str_time):
            raise SyntaxError("Invalid time format")
        # Eliminate am or pm above 12, 00, or 0
        elif re.match("([1-9][3-9]|0{1,2}):\d{2}\s?[aApP]{1}\.?\s?[mM]{1}\.?$", str_time):
            raise SyntaxError("Invalid time format")

    def to_24(self,str_12hr):
        self.check_time_format()


        # Check for AM, PM or already 24hour
        if "AM" in str_12hr.upper().replace(".", ""):
            li_time = str_12hr.split(":")
            str_hr = li_time[0]
            str_min = li_time[1][0:2]
            if len(str_hr) == 1:
                str_hr = "0" + str_hr
            elif str_hr == "12":
                str_hr = "00"
            str_24hr = str_hr + ":" + str_min

        elif "PM" in str_12hr.upper().replace(".", ""):
            li_time = str_12hr.split(":")
            int_hr = int(li_time[0])
            str_min = li_time[1][0:2]
            if not int_hr == 12:
                int_hr += 12
            str_24hr = str(int_hr) + ":" + str_min
        else:
            str_24hr = str_12hr

        return str_24hr

    def to_decimal(self, str_time):
        """Convert time to decimal"""
        str_time = self.to_24(str_time)
        li_time = str_time.split(":")
        fl_time = float(li_time[0])       #Our Float Time
        fl_time += float(li_time[1])/60
        return fl_time