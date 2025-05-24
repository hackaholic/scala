
/* 
| Use Case             | Syntax Style                       | Returns                      |
| -------------------- | ---------------------------------- | ---------------------------- |
| Side effects only    | `for (...) { ... }`                | `Unit`                       |
| Yield new collection | `for (...) yield expr`             | Transformed collection       |
| Yield with block     | `for (...) yield { expr1; expr2 }` | `expr2` result per iteration |

 */

@main
def mapYield = 
    val nums = List(1, 2, 3)

    val doubles = 
        for i <- nums yield i*2
    
    println(doubles)



