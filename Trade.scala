abstract class Trade(val id:String, val symbol:String, val qty:Int, var price:Double){

  require(price > 0 && qty >0)

  def price_(value: Double) = { if (value >= 0) price = value }
  def value() = {
    qty*price
  }

  def isExecutable()

  override def toString = s"Trade{$id, $symbol, $qty, $price}"

  def verifyQty(quantity:Int) ={
    quantity match {
      case 0 => println("Zero")
      case quantity if (quantity < 0) => println("ice")
      case _ => println("None")
    }
  }
}

//object Trade{
//  def apply(id:String, symbol: String,qty:Int, price:Double):Trade = {
//     require(price > 0 && qty >0)
//      new Trade(id, symbol,qty,price)
//  }
//}


//case class Trade( id:String,  symbol:String,  qty:Int,  price:Double ){
////  def apply(id:String, symbol: String,qty:Int, price:Double) = Trade(id, symbol,qty,price)
//}

