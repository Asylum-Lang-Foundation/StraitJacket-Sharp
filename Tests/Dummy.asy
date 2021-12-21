fn getString() -> string => "Help!";

fn main() {
    string myStr = "Hello World!";
    myStr = getString();
    println(myStr);
}