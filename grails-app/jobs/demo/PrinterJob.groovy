package demo

class PrinterJob {
    static triggers = {
      simple repeatInterval: 2000l // execute job once in 2 seconds
    }

    def execute() {
        println 'PrinterJob Is Running...'
    }
}
