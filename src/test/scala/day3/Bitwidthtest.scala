package day3
import chisel3._
import org.scalatest._
import chiseltest._

class bitwidthtests extends FreeSpec with ChiselScalatestTester{
    "bitwidth Test" in { 
        test(new bitwidth ()){ c=>
        c.io.input.poke(4.U)
        c.clock.step(1)
        c.io.output.expect(4.S)}}}