package com.helloscala

import android.app.Activity
import android.os.Bundle

class MyAndroidActivity extends Activity {
	
	//object Derivative {

		type Environment = String => Int
		
		abstract class Tree
		//case class Sum(l: Tree, r: Tree) extends Tree
		//case class Var(n: String) extends Tree
		//case class Const(v: Int) extends Tree
	
		case class Sum(l: Tree, r: Tree) extends Tree {
			override def toString(): String = l.toString + " + " + r.toString 
		}
		
		case class Var(n: String) extends Tree {
			override def toString(): String = n
		}
		
		case class Const(v: Int) extends Tree {
			override def toString(): String = v.toString 
		}
		
		def eval(t: Tree, env: Environment): Int = t match {
			case Sum(l, r) => eval(l, env) + eval(r, env) // LHS + RHS
			case Var(n) => env(n)
			case Const(v) => v
		}
		
		def derive(t: Tree, v: String): Tree = t match {
			case Sum(l, r) => Sum(derive(l, v), derive(r, v))
			case Var(n) if (v == n) => Const(1)
			case _ => Const(0)
		}
	//}
	
    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        
        val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y"))) // x + x + 7 + y
		val env: Environment = { case "x" => 5 case "y" => 7 }
		//println("Expression: " + exp)
    }
}

