package com.rock.fhctool.model.http


case class Header(name: String, value: String){
  override def toString = s"$name: $value"
}

case class Headers(headers:Seq[Header]){
  override def toString = {
    headers match {
      case null => ""
      case _ => headers.map{header => header.toString}.mkString("\n")
    }
  }
}

object Header{
  def apply(str:String):Option[Header] = {
      val r = "^([^:]+)\\:\\s*([^:]+)$".r
      str match {
        case "" => Some(Header("",""))
        case _ => None
      }
  }
}
object Headers{
  def unapply = {
    
  }
}