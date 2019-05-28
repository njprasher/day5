package com.neeraj.college;

public class Student extends Person
{
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String result;

    public Student()
    {
    }

    public Student(float[] marks, float totalMarks, float percentage, String result) {
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
    }

    public float[] getMarks() {
            return marks;
        }

        public void setMarks(float[] marks) {
            this.marks = marks;
        }

        public float getTotalMarks() {
            return totalMarks;
        }

        public float getPercentage() {
            return percentage;
        }

        public String getResult() {
            return result;
        }

        public void calculateTotal()
        {
            this.totalMarks = 0.0f;
            for (int i = 0; i<this.marks.length; i++)
            {
                this.totalMarks = this.totalMarks + marks[i];
            }
        }

        public void calculatePercentage()
        {
            this.percentage = 0.0f;
            this.percentage=this.totalMarks/this.marks.length;
        }

        public void calculateResult()
        {
            int passedSubjects = 0;
            for(int i = 0; i < marks.length; i++)
            {
                if (this.percentage>=50.0f)
                {
                    passedSubjects++;
                }
            }

            if (passedSubjects<=3) this.result = "Fail";

            else{

                if (this.percentage>=94.0f)
                {
                    this.result = "A+";
                }
                else if (this.percentage>=87.0f)
                {
                    this.result = "A";
                }
                else if (this.percentage>=80.0f)
                {
                    this.result = "A-";
                }
                else if (this.percentage>=77.0f)
                {
                    this.result = "B+";
                }
                else if (this.percentage>=73.0f)
                {
                    this.result = "B";
                }
                else if (this.percentage>=70.0f)
                {
                    this.result = "B-";
                }
                else if (this.percentage>=67.0f)
                {
                    this.result = "C+";
                }
                else if (this.percentage>=63.0f)
                {
                    this.result = "C";
                }
                else if (this.percentage>=60.0f)
                {
                    this.result = "C-";
                }
                else if (this.percentage>=50.0f)
                {
                    this.result = "D";
                }
                else this.result = "F";
            }
        }

        public void displayStudentInformation()
        {



            float[] marksToShow = this.getMarks();

            System.out.println(
                    "---------------------------------- \n" +
                            "      ------STUDENT INFO------      \n" +
                            "---------------------------------- \n" +
                            "Student ID : " + this.getId() + "\n" +
                            "Full Name : " + this.getFullname() + "\n" +
                            "Gender : " + this.getGender() + "\n" +
                            "Birth Date : " + this.getBirthDate() + "\n" );

            for(int i = 0; i < this.marks.length; i++)
            {
                System.out.println("Subject [1" + i +"] : " + marksToShow[i] + "");
            }

            System.out.println(
                    "Total Marks : " + this.totalMarks + "\n" +
                            "Percentage : " + this.percentage + "\n" +
                            "Result : " + this.result + "\n"
            );

        }

    }
