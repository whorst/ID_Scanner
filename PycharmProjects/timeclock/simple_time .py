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
        #Validate input
        if not isinstance(fl_dur, float):
            raise ValueError
        self.__fl_duration = fl_dur

    @property
    def str_start_Time(self):
        return self.__str_start_Time

    @str_start_Time.setter
    def str_start_Time(self, str_time):
        #Validate Input
        self.check_time_format(str_time)
        self.__str_start_Time = str_time

    @property
    def str_end_Time(self):
        return self.__str_end_Time

    @str_end_Time.setter
    def str_end_Time(self, str_time):
        #Validate Input
        self.check_time_format(str_time)
        self.__str_end_Time = str_time

    def check_time_format(self, str_time):
        """Validate the time is in the correct format"""
        # Validate input is in form of [0]1:00[am,AM,a.m,A.M,pm,PM,p.m,P.M.]
        if not re.match("\d{1,2}:\d{2}\s?[aApP]?\.?\s?[mM]?\.?$", str_time):
            raise SyntaxError("Invalid time format")
        # Eliminate am or pm above 12, 00, or 0
        elif re.match("([1-9][3-9]|0{1,2}):\d{2}\s?[aApP]{1}\.?\s?[mM]{1}\.?$", str_time):
            raise SyntaxError("Invalid time format")

    def to_24(self, str_12hr):
        """A method to convert 12hour time to 24hour time"""
        #Check format
        self.check_time_format(str_12hr)


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
        """Convert time into decimal"""
        str_time = self.to_24(str_time)
        li_time = str_time.split(":")
        fl_time = float(li_time[0])
        fl_time += float(li_time[1])/60.0
        return fl_time

    def calculate_duration(self):
        """Calculate the duration between two times"""
        fl_start = self.to_decimal(self.str_start_Time) #self refers to the object that's being used.
        fl_end = self.to_decimal(self.str_end_Time) #self refers to the object that's being used.
        fl_time = fl_start-fl_end
        self.fl_duration=fl_time #This calls the setter method

    def calculate_end_time(self):
        '''Use the start time and duration to calculate end time'''
        fl_start = self.to_decimal(self.str_start_Time) #self refers to the object that's being used.
        fl_end = fl_start+self.fl_duration
        self.str_end_Time = self.decimal_to_string_time(fl_end,)


    def decimal_to_string_time(self, fl_time, bol_24 = False): #the third parameter is a boolean
        """Convert a float to a string time"""
        if not isinstance(fl_time, float) or (fl_time < 0.0) or (fl_time > 24.0) or (fl_time > 24.0): #The not only applies to what follows it
            raise ValueError
        int_hour = int(fl_time)
        str_meridiem = "PM"
        str_hour = str(int_hour)
        if int_hour > 12:
            str_hour = str(int_hour - 12)
        elif int_hour == 0:
            str_hour = "12"
        if int_hour < 12:
            str_meridiem = "AM"
        fl_min = fl_time - int_hour
        str_min = str(fl_min*60)
        str_time ="%s:%s %s" %(str_hour + str_min + str_meridiem)
        if bol_24:
            str_time = self.to_24(str_time)
        return str_time

