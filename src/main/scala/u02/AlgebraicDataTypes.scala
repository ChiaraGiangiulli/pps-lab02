package u02

import u02.AlgebraicDataTypes.WeekDay.Friday

object AlgebraicDataTypes extends App :

  enum Person: // a sum type defined by enumerating various cases
    case Student(name: String, year: Int)
    case Teacher(name: String, course: String)

  def name(p: Person): String = p match
    case Person.Student(n, _) => n
    case Person.Teacher(n, _) => n

  println(name(Person.Student("mario", 2015)))

  enum WeekDay: // a Java-like enumeration
    case Monday, Tuesday, Wednesday, Thursday, Friday

  def preferredDay(d: WeekDay): Boolean = d match
    case WeekDay.Friday => true
    case _ => false
    //d == WeekDay.Friday // could have used matching instead


  println(preferredDay(Friday))

  // A LinkedList of Int
  enum IntList: // a recursive type
    case Cons(head: Int, tail: IntList)
    case Nil

  def sum(l: IntList): Int = l match
    case IntList.Cons(h, t) => h + sum(t)
    case _ => 0

  println(sum(IntList.Cons(10, IntList.Cons(20, IntList.Nil))))