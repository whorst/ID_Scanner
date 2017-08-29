from tkinter import Tk, Label, Button, Entry
import datetime

class MyFirstGUI:
    def __init__(self, master):
        self.xnum = 0
        self.ynum = 3
        self.master = master
        master.title("The ΣΑΕ Attendance Software")

        Label(master, text="").grid(row=1, column=1, padx=75, pady=70)
        Label(master, text="Please Swipe Your ID").grid(row=1, column=2, padx=75, pady=70)
        Label(master, text="").grid(row=1, column=3, padx=70, pady=70)

        self.entry_e1 = Entry(master)
        self.entry_e1.grid(row=2, column=2, pady=35)
        button_submit_id_number = Button(master, text="Submit").grid(row=3, column=2)
        button_submit_id_number.bind("<Button>",lambda event, self = self: self.add_to_grid(self))



        # self.label = Label(master, text="This is our first GUI!")
        # self.label.pack()
        #
        # self.greet_button = Button(master, text="Greet", command=self.greet)
        # self.greet_button.pack()
        #
        # self.close_button = Button(master, text="Close", command=master.quit)
        # self.close_button.pack()

    def add_to_grid(self):
        print("lol")
        card_number = self.entry_e1.get()
        print(card_number)
        # Label(self.master, text=card_number).grid(row=self.xnum, column=self.ynum)


root = Tk()
root.minsize(width=600, height=600)
my_gui = MyFirstGUI(root)
root.mainloop()