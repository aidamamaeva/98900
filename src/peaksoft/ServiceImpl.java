                    package peaksoft;

                    import java.time.LocalDate;
                    import java.time.Period;
                    import java.util.Calendar;

                    public class ServiceImpl implements Service {
                        private Student[] students = new Student[10];

                        public ServiceImpl(Student[] students) {
                            this.students = students;
                        }

                        @Override
                        public void updateStudent(Long id, String name, String lastName) {
                            for (int i = 0; i < students.length; i++) {
                                if (students[i] != null && students[i].getId()==id) {
                                    students[i].setName(name);
                                    students[i].setLastName(lastName);
                                    System.out.println(students[i]);
                                    break;
                                }
                                else{
                                    System.out.println("Student is not found");
                                    break;
                                }
                            }
                            }


                        @Override
                        public Student getStudentById(Long id) {for (int i = 0; i < students.length; i++) {
                            if (students[i] != null && students[i].getId()==id) {
                                System.out.println(students[i]);
                                return students[i];

                            }}

                                System.out.println("Student is not found");



                            return null;
                        }

                        @Override
                        public Boolean getName(String name) {
                            boolean isTrue = false;
                            for (int i = 0; i < students.length; i++) {
                                if (students[i] != null && students[i].getName()==name) {
                                    isTrue = true;}}
                            System.out.println(isTrue);
                         return null;
                        }


                        @Override
                        public int getCountAge(int age) {
                            int currentYear = 2023;
                            int counter = 0;
                            for (int i = 0; i < students.length; i++) {
                                Student student = students[i];
                                if(student!=null){
                                    int dateOfBirth = student.getYearOfBirth();
                                    int ageOfStudent = currentYear - dateOfBirth;
                                    if(ageOfStudent==age){
                                        counter++;
                                    }
                                }
                            }
                            System.out.println(counter);
                         return counter;
                        }


                        @Override
                        public Student[] getAllStudents() {

                            for (int i = 0; i < students.length; i++) {
                                if(students[i]!=null){
                                    System.out.println(students[i].getName());
                                }
                            }
                        return null;
                        }}
