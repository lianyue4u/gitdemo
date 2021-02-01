package com.shenzhi.belina.entity;

/*
* 密封类(预览）
*/
public sealed class Person permits Teacher, Student,Worker {


}

final class Teacher extends Person {
}

sealed class Student extends Person permits MiddleSchoolStudent,Pupils{
}

final class MiddleSchoolStudent extends Student {
}

final class Pupils extends Student {
}

non-sealed class Worker extends Person {

class RailwayWorker extends Worker{}


}