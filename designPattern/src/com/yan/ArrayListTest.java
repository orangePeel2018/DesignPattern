package com.yan;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("----------学生信息录入系统----------");
            System.out.println("----------1.录入信息----------");
            System.out.println("----------2.修改信息----------");
            System.out.println("----------3.删除信息----------");
            System.out.println("----------4.添加学生----------");
            System.out.println("----------5.查看学生----------");
            System.out.println("----------6.退出系统----------");
            System.out.println("----------46293工作室合作研发----------");
            String x = sc.next();
            if(x.charAt(0)>='1' && x.charAt(0)<='6') {
                switch (x) {
                    case "1":
                        System.out.println("录入学生的个数:");
                        int y = sc.nextInt();
                        boolean addflag = arraylistAdd(array, y);
                        if (addflag == true) {
                            System.out.println("信息录入成功，返回界面");
                        } else {
                            while (!addflag) {
                                System.out.println("信息录入失败，请重新录入");
                                addflag = arraylistAdd(array, y);
                            }
                        }
                        traversalArrayList(array);
                        break;

                    case "2":
                        //先遍历集合
                        if (array.isEmpty() == true) {
                            System.out.println("系统暂无信息,返回登录界面后请按1");
                            break;
                        } else {
                            traversalArrayList(array);
                            boolean changeflag = changeMethod(array);
                            if (changeflag == true) {
                                System.out.println("信息修改成功，返回界面");
                                break;
                            } else {
                                while (!changeflag) {
                                    System.out.println("信息修改失败，请重新修改");
                                    changeflag = changeMethod(array);
                                }
                                break;
                            }
                        }

                    case "3":
                        if (array.isEmpty() == true) {
                            System.out.println("系统暂无信息,返回登录界面后请按1");
                            break;
                        } else {
                            traversalArrayList(array);
                            boolean deleteflag = deleteMethod(array);
                            if (deleteflag == true) {
                                System.out.println("删除成功");
                                break;
                            } else {
                                while (deleteflag != true) {
                                    System.out.println("删除失败请,重新删除");
                                    deleteflag = deleteMethod(array);
                                }
                                System.out.println("删除成功");
                                break;
                            }
                        }

                    case "4":
                        if (array.isEmpty() == true) {
                            System.out.println("系统暂无信息,返回登录界面后请按1");
                            break;
                        } else {
                            traversalArrayList(array);
                            boolean flag = false;
                            while (!flag) {
                                System.out.println("请输入要添加学生的个数:");
                                int z = sc.nextInt();
                                flag = arraylistAdd(array, z);

                            }
                            break;
                        }


                    case "5":
                        if (array.isEmpty() == true) {
                            System.out.println("系统暂无信息,返回登录界面后请按1");
                            break;
                        } else {
                            traversalArrayList(array);
                            break;
                        }

                    case "6":
                        System.exit(0);
                }
            }else{
                System.out.println("你的选择有误，请输入1-6");
                continue;
            }
        }
        }





    public static boolean arraylistAdd(ArrayList<Student> array, int x) {
        Student s = new Student();
        Scanner scs = new Scanner(System.in);
        if(x<0) {
            return false;
        }else{
            for (int i = 0; i < x; i++) {
                System.out.println("请录入第" + (i + 1) + "个学生的信息:");
                System.out.println("请录入第" + (i + 1) + "个学生的姓名:");
                String name = scs.next();
                s.setName(name);
                System.out.println("请录入第" + (i + 1) + "个学生的年龄:");
                String age = scs.next();
                s.setAge(age);
                array.add(s);
                System.out.println("录入第" + (i + 1) + "个学生的信息录入完毕");
            }
                }
        return true;
    }


    public static boolean changeMethod(ArrayList<Student> array) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入要修改的第几个学生的信息:");
        int y = sc1.nextInt();
        if (y < 0) {
            return false;
        }
        System.out.println("请输入学生的姓名:");
        String name = sc1.next();
        System.out.println("请输入学生的年龄:");
        String age = sc1.next();
        Student scs = new Student(name, age);
        array.set(y - 1, scs);

        return true;
    }

    public static boolean deleteMethod(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要删除第几个学生:");
        int x = sc.nextInt();
        if (x > array.size() - 1 || x < 0) {
            return false;
        }
        array.remove(x - 1);
        return true;
    }


    public static void traversalArrayList(ArrayList<Student> array) {
        System.out.println("系统录入了" + array.size() + "个学生信息");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println("第" + (i + 1) + "个学生名字:" + s.getName() + "," + "年龄:" + s.getAge());
        }
    }
}
