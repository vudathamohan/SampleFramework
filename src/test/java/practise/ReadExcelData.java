package practise;

import miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\user\\eclipse-workspace\\Sample\\src\\main\\resources\\binaries\\testdata.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}