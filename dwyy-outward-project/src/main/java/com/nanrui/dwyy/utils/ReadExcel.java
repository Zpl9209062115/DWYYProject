package com.nanrui.dwyy.utils;

import com.nanrui.dwyy.bean.BDZ_Coord;
import com.nanrui.dwyy.bean.GS_BDZ;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadExcel {

    public BDZ_Coord readSourceData_BDZ_Coord(XSSFRow xssfRow) throws Exception {
        //获得最后一行的行号

        BDZ_Coord bdz_coord = new BDZ_Coord();

        XSSFCell OID = xssfRow.getCell(1);
        bdz_coord.setOID(getValue_Double(OID));

        XSSFCell SBMC = xssfRow.getCell(2);
        bdz_coord.setSBMC(getValue_String(SBMC));

        XSSFCell X_COORD = xssfRow.getCell(3);
        bdz_coord.setX_COORD(getValue_Double(X_COORD));

        XSSFCell Y_COORD = xssfRow.getCell(4);
        bdz_coord.setY_COORD(getValue_Double(Y_COORD));

        XSSFCell YXBH = xssfRow.getCell(6);
        bdz_coord.setYXBH(getValue_String(YXBH));

        XSSFCell SBZLX = xssfRow.getCell(7);
        bdz_coord.setSBZLX(getValue_Double(SBZLX));

        XSSFCell SSZRQ = xssfRow.getCell(8);
        bdz_coord.setSSZRQ(getValue_Double(SSZRQ));

        XSSFCell STATE_ID = xssfRow.getCell(9);
        bdz_coord.setSSZRQ(getValue_Double(STATE_ID));

        XSSFCell FHJD = xssfRow.getCell(10);
        bdz_coord.setFHJD(getValue_Double(FHJD));

        XSSFCell CONNECTION = xssfRow.getCell(11);
        bdz_coord.setCONNECTION(getValue_String(CONNECTION));

        XSSFCell SBID = xssfRow.getCell(12);
        bdz_coord.setSBID(getValue_String(SBID));

        XSSFCell DYDJ = xssfRow.getCell(13);
        bdz_coord.setDYDJ(getValue_Double(DYDJ));

        XSSFCell YXDW = xssfRow.getCell(15);
        bdz_coord.setYXDW(getValue_String(YXDW));

        XSSFCell FHDX = xssfRow.getCell(16);
        bdz_coord.setFHDX(getValue_Double(FHDX));

        XSSFCell SFBZ = xssfRow.getCell(17);
        bdz_coord.setSFBZ(getValue_String(SFBZ));

        XSSFCell BZDX = xssfRow.getCell(18);
        bdz_coord.setBZDX(getValue_String(BZDX));

        XSSFCell BZYS = xssfRow.getCell(19);
        bdz_coord.setBZYS(getValue_String(BZYS));

        XSSFCell BZFW = xssfRow.getCell(20);
        bdz_coord.setBZFW(getValue_String(BZFW));

        XSSFCell PLFS = xssfRow.getCell(21);
        bdz_coord.setPLFS(getValue_String(PLFS));

        XSSFCell DHZS = xssfRow.getCell(22);
        bdz_coord.setDHZS(getValue_String(DHZS));

        XSSFCell X = xssfRow.getCell(23);
        bdz_coord.setX(getValue_Double(X));

        XSSFCell Y = xssfRow.getCell(24);
        bdz_coord.setX(getValue_Double(Y));

        XSSFCell TYPE = xssfRow.getCell(25);
        bdz_coord.setTYPE(getValue_Double(TYPE));

        XSSFCell GRIDSIZE = xssfRow.getCell(26);
        bdz_coord.setGRIDSIZE(getValue_String(GRIDSIZE));

        XSSFCell BZXSZD = xssfRow.getCell(27);
        bdz_coord.setBZXSZD(getValue_String(BZXSZD));

        XSSFCell BZNR = xssfRow.getCell(28);
        bdz_coord.setBZNR(getValue_String(BZNR));

        XSSFCell SSDS = xssfRow.getCell(29);
        bdz_coord.setSSDS(getValue_String(SSDS));

        XSSFCell KZFHID = xssfRow.getCell(30);
        bdz_coord.setKZFHID(getValue_String(KZFHID));

        XSSFCell APPTYPE = xssfRow.getCell(31);
        bdz_coord.setAPPTYPE(getValue_Double(APPTYPE));

        XSSFCell RLBZ = xssfRow.getCell(32);
        bdz_coord.setRLBZ(getValue_String(RLBZ));

        XSSFCell SSKX = xssfRow.getCell(33);
        bdz_coord.setSSKX(getValue_String(SSKX));

        XSSFCell SSTQLX = xssfRow.getCell(34);
        bdz_coord.setSSTQLX(getValue_String(SSTQLX));

        XSSFCell SSTQ = xssfRow.getCell(35);
        bdz_coord.setSSTQ(getValue_String(SSTQ));

        XSSFCell YHBH = xssfRow.getCell(36);
        bdz_coord.setYHBH(getValue_String(YHBH));

        XSSFCell VERSIONID = xssfRow.getCell(37);
        bdz_coord.setVERSIONID(getValue_Double(VERSIONID));

        XSSFCell SSDKX = xssfRow.getCell(38);
        bdz_coord.setSSDKX(getValue_String(SSDKX));

        XSSFCell SSDKXZX = xssfRow.getCell(39);
        bdz_coord.setSSDKXZX(getValue_String(SSDKXZX));

        XSSFCell PBZRL = xssfRow.getCell(40);
        bdz_coord.setPBZRL(getValue_Double(PBZRL));

        XSSFCell SFYC = xssfRow.getCell(41);
        bdz_coord.setSFYC(getValue_String(SFYC));

        XSSFCell SFDXKGZ = xssfRow.getCell(42);
        bdz_coord.setSFDXKGZ(getValue_String(SFDXKGZ));

        return bdz_coord;
    }


    public BDZ_Coord readSourceData_BDZ_Coord(HSSFRow hssfRow) throws Exception {
        //获得最后一行的行号

        BDZ_Coord bdz_coord = new BDZ_Coord();

        HSSFCell OID = hssfRow.getCell(1);
        bdz_coord.setOID(getValue_Double(OID));

        HSSFCell SBMC = hssfRow.getCell(2);
        bdz_coord.setSBMC(getValue_String(SBMC));

        HSSFCell X_COORD = hssfRow.getCell(3);
        bdz_coord.setX_COORD(getValue_Double(X_COORD));

        HSSFCell Y_COORD = hssfRow.getCell(4);
        bdz_coord.setY_COORD(getValue_Double(Y_COORD));

        HSSFCell YXBH = hssfRow.getCell(6);
        bdz_coord.setYXBH(getValue_String(YXBH));

        HSSFCell SBZLX = hssfRow.getCell(7);
        bdz_coord.setSBZLX(getValue_Double(SBZLX));

        HSSFCell SSZRQ = hssfRow.getCell(8);
        bdz_coord.setSSZRQ(getValue_Double(SSZRQ));

        HSSFCell STATE_ID = hssfRow.getCell(9);
        bdz_coord.setSSZRQ(getValue_Double(STATE_ID));

        HSSFCell FHJD = hssfRow.getCell(10);
        bdz_coord.setFHJD(getValue_Double(FHJD));

        HSSFCell CONNECTION = hssfRow.getCell(11);
        bdz_coord.setCONNECTION(getValue_String(CONNECTION));

        HSSFCell SBID = hssfRow.getCell(12);
        bdz_coord.setSBID(getValue_String(SBID));

        HSSFCell DYDJ = hssfRow.getCell(13);
        bdz_coord.setDYDJ(getValue_Double(DYDJ));

        HSSFCell YXDW = hssfRow.getCell(15);
        bdz_coord.setYXDW(getValue_String(YXDW));

        HSSFCell FHDX = hssfRow.getCell(16);
        bdz_coord.setFHDX(getValue_Double(FHDX));

        HSSFCell SFBZ = hssfRow.getCell(17);
        bdz_coord.setSFBZ(getValue_String(SFBZ));

        HSSFCell BZDX = hssfRow.getCell(18);
        bdz_coord.setBZDX(getValue_String(BZDX));

        HSSFCell BZYS = hssfRow.getCell(19);
        bdz_coord.setBZYS(getValue_String(BZYS));

        HSSFCell BZFW = hssfRow.getCell(20);
        bdz_coord.setBZFW(getValue_String(BZFW));

        HSSFCell PLFS = hssfRow.getCell(21);
        bdz_coord.setPLFS(getValue_String(PLFS));

        HSSFCell DHZS = hssfRow.getCell(22);
        bdz_coord.setDHZS(getValue_String(DHZS));

        HSSFCell X = hssfRow.getCell(23);
        bdz_coord.setX(getValue_Double(X));

        HSSFCell Y = hssfRow.getCell(24);
        bdz_coord.setX(getValue_Double(Y));

        HSSFCell TYPE = hssfRow.getCell(25);
        bdz_coord.setTYPE(getValue_Double(TYPE));

        HSSFCell GRIDSIZE = hssfRow.getCell(26);
        bdz_coord.setGRIDSIZE(getValue_String(GRIDSIZE));

        HSSFCell BZXSZD = hssfRow.getCell(27);
        bdz_coord.setBZXSZD(getValue_String(BZXSZD));

        HSSFCell BZNR = hssfRow.getCell(28);
        bdz_coord.setBZNR(getValue_String(BZNR));

        HSSFCell SSDS = hssfRow.getCell(29);
        bdz_coord.setSSDS(getValue_String(SSDS));

        HSSFCell KZFHID = hssfRow.getCell(30);
        bdz_coord.setKZFHID(getValue_String(KZFHID));

        HSSFCell APPTYPE = hssfRow.getCell(31);
        bdz_coord.setAPPTYPE(getValue_Double(APPTYPE));

        HSSFCell RLBZ = hssfRow.getCell(32);
        bdz_coord.setRLBZ(getValue_String(RLBZ));

        HSSFCell SSKX = hssfRow.getCell(33);
        bdz_coord.setSSKX(getValue_String(SSKX));

        HSSFCell SSTQLX = hssfRow.getCell(34);
        bdz_coord.setSSTQLX(getValue_String(SSTQLX));

        HSSFCell SSTQ = hssfRow.getCell(35);
        bdz_coord.setSSTQ(getValue_String(SSTQ));

        HSSFCell YHBH = hssfRow.getCell(36);
        bdz_coord.setYHBH(getValue_String(YHBH));

        HSSFCell VERSIONID = hssfRow.getCell(37);
        bdz_coord.setVERSIONID(getValue_Double(VERSIONID));

        HSSFCell SSDKX = hssfRow.getCell(38);
        bdz_coord.setSSDKX(getValue_String(SSDKX));

        HSSFCell SSDKXZX = hssfRow.getCell(39);
        bdz_coord.setSSDKXZX(getValue_String(SSDKXZX));

        HSSFCell PBZRL = hssfRow.getCell(40);
        bdz_coord.setPBZRL(getValue_Double(PBZRL));

        HSSFCell SFYC = hssfRow.getCell(41);
        bdz_coord.setSFYC(getValue_String(SFYC));

        HSSFCell SFDXKGZ = hssfRow.getCell(42);
        bdz_coord.setSFDXKGZ(getValue_String(SFDXKGZ));

        return bdz_coord;
    }

    public Double disposeDoubleValue(HSSFCell cell){
        switch (cell.getCellType()) {
            case HSSFCell.CELL_TYPE_NUMERIC:
                return cell.getNumericCellValue();
            case HSSFCell.CELL_TYPE_BLANK:
                return 0.0;
            default:
                return 0.0;
        }
    }

    public String disposeStringValue(HSSFCell cell){
        switch (cell.getCellType()) {
            case HSSFCell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            case HSSFCell.CELL_TYPE_BLANK:
                return "";
            default:
                return "";
        }
    }

    /**
     * 读取excel中的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    public List<BDZ_Coord> readExcel_bdz_coord(String path) {
        if (path != null && !path.equals("")) {
            String ext = getExt(path);
            if (ext!=null && !ext.equals("")) {
                if (ext.equals("xls")) {
                    return readXls_BDZ_Coord_xls(path);
                } else if (ext.equals("xlsx")) {
                    return readXls_BDZ_Coord_xlsx(path);
                }
            }
        }
        return new ArrayList<BDZ_Coord>();
    }

    /**
     * 读取excel中的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    public List<GS_BDZ> readExcel_gs_bdz(String path) {
        if (path != null && !path.equals("")) {
            String ext = getExt(path);
            if (ext!=null && !ext.equals("")) {
                if (ext.equals("xls")) {
                    return readExcel_GS_BDZ_xls(path);
                } else if (ext.equals("xlsx")) {
                    return readExcel_GS_BDZ_xlsx(path);
                }
            }
        }
        return new ArrayList<GS_BDZ>();
    }

    /**
     * 获取文件扩展名
     * @param path
     * @return String
     * @author zhang 2015-08-17 23:26
     */
    private String getExt(String path) {
        if (path == null || path.equals("") || !path.contains(".")) {
            return null;
        } else {
            return path.substring(path.lastIndexOf(".") + 1, path.length());
        }
    }

    /**
     * 读取后缀为xlsx的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    private List<BDZ_Coord> readXls_BDZ_Coord_xlsx(String path) {

        XSSFWorkbook xssfWorkbook = null;
        try {
            InputStream is = new FileInputStream(path);
            xssfWorkbook = new XSSFWorkbook(is);
            dataDispose_bdz_coord_xlsx(xssfWorkbook);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 读取后缀为xls的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    private List<BDZ_Coord> readXls_BDZ_Coord_xls(String path) {

        HSSFWorkbook hssfWorkbook = null;
        try {
            InputStream is = new FileInputStream(path);
            hssfWorkbook = new HSSFWorkbook(is);
            return dataDispose_bdz_coord_xls(hssfWorkbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BDZ_Coord> dataDispose_bdz_coord_xlsx(XSSFWorkbook xssfWorkbook) throws Exception {
        List<BDZ_Coord> bdz_coordList = new ArrayList<>();
        BDZ_Coord bdz_coord = null;
        if (xssfWorkbook != null) {
            // Read the Sheet
            for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
                if (xssfSheet  == null) {
                    continue;
                }
                // Read the Row
                for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        bdz_coord = readSourceData_BDZ_Coord(xssfRow);
                        bdz_coordList.add(bdz_coord);
                    }
                }
            }
            return bdz_coordList;
        }else{
            return bdz_coordList;
        }
    }

    public List<BDZ_Coord> dataDispose_bdz_coord_xls(HSSFWorkbook hssfWorkbook) throws Exception {
        List<BDZ_Coord> bdz_coordList = new ArrayList<>();
        BDZ_Coord bdz_coord = null;
        if (hssfWorkbook != null) {
            // Read the Sheet
            for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
                HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                // Read the Row
                for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        bdz_coord = readSourceData_BDZ_Coord(hssfRow);
                        bdz_coordList.add(bdz_coord);
                    }
                }
            }
            return bdz_coordList;
        }else{
            return bdz_coordList;
        }
    }

    /**
     * 读取后缀为xlsx的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    private List<GS_BDZ> readExcel_GS_BDZ_xlsx(String path) {
        XSSFWorkbook xssfWorkbook = null;
        try {
            InputStream is = new FileInputStream(path);
            xssfWorkbook = new XSSFWorkbook(is);
            return dataDispose_gs_bdz_xlsx(xssfWorkbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取后缀为xls的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    public List<GS_BDZ> readExcel_GS_BDZ_xls(String path){
        List<GS_BDZ> gs_bdzArrayList = new ArrayList<>();
        HSSFWorkbook hssfWorkbook = null;
        try {
            InputStream is = new FileInputStream(path);
            hssfWorkbook = new HSSFWorkbook(is);
            return dataDispose_gs_bdz_xls(hssfWorkbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 读取后缀为xlsx的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    public List<GS_BDZ> dataDispose_gs_bdz_xlsx(XSSFWorkbook xssfWorkbook){
        List<GS_BDZ> gs_bdzArrayList = new ArrayList<>();
        GS_BDZ gs_bdz = null;
        if (xssfWorkbook != null) {
            // Read the Sheet
            for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
                if (xssfSheet == null) {
                    continue;
                }
                // Read the Row
                for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        gs_bdz = readSourceData_GS_BDZ_xlsx(xssfRow);
                        gs_bdzArrayList.add(gs_bdz);
                    }
                }
            }
            return gs_bdzArrayList;
        }else{
            return gs_bdzArrayList;
        }
    }

    /**
     * 读取后缀为xls的excel文件的数据
     * @param path
     * @return List<StudentBean>
     * @author zhang 2015-08-18 00:08
     */
    public List<GS_BDZ> dataDispose_gs_bdz_xls(HSSFWorkbook hssfWorkbook){
        List<GS_BDZ> gs_bdzArrayList = new ArrayList<>();
        GS_BDZ gs_bdz = null;
        if (hssfWorkbook != null) {
            // Read the Sheet
            for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
                HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                // Read the Row
                for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        gs_bdz = readSourceData_GS_BDZ(hssfRow);
                        gs_bdzArrayList.add(gs_bdz);
                    }
                }
            }
            return gs_bdzArrayList;
        }else{
            return gs_bdzArrayList;
        }
    }

    public GS_BDZ readSourceData_GS_BDZ_xlsx(XSSFRow xssfRow){
        if (xssfRow.getRowNum() == 163){
            System.out.println("====");
        }
        GS_BDZ gs_bdz = new GS_BDZ();

        XSSFCell pms_id_start = xssfRow.getCell(1);
        gs_bdz.setPms_id_start(getValue_String(pms_id_start));

        XSSFCell id_start = xssfRow.getCell(2);
        gs_bdz.setId_start(getValue_String(id_start));

        XSSFCell  dtdj_start = xssfRow.getCell(3);
        gs_bdz.setDtdj_start(getValue_String(dtdj_start));

        XSSFCell  name_start = xssfRow.getCell(4);
        gs_bdz.setName_start(getValue_String(name_start));

        XSSFCell  pms_id_end = xssfRow.getCell(5);
        gs_bdz.setPms_id_end(getValue_String(pms_id_end));

        XSSFCell  id_end = xssfRow.getCell(6);
        gs_bdz.setId_end(getValue_String(id_end));

        XSSFCell  dydj_end = xssfRow.getCell(7);
        gs_bdz.setDydj_end(getValue_String(dydj_end));

        XSSFCell  name_end = xssfRow.getCell(8);
        gs_bdz.setName_end(getValue_String(name_end));

        XSSFCell  line_id = xssfRow.getCell(9);
        gs_bdz.setLine_id(getValue_String(line_id));

        XSSFCell  line_name = xssfRow.getCell(10);
        gs_bdz.setLine_name(getValue_String(line_name));

        System.out.println(xssfRow.getRowNum());
        XSSFCell yyxl = xssfRow.getCell(11);
        gs_bdz.setYyxl(getValue_Double(yyxl));

        String city = "甘肃";
        gs_bdz.setCity(city);

        String cityCode = "gansu";
        gs_bdz.setCity_code(cityCode);

        return gs_bdz;
    }

    public GS_BDZ readSourceData_GS_BDZ(HSSFRow hssfRow){
        GS_BDZ gs_bdz = new GS_BDZ();

        HSSFCell pms_id_start = hssfRow.getCell(1);
        gs_bdz.setPms_id_start(getValue_String(pms_id_start));

        HSSFCell id_start = hssfRow.getCell(2);
        gs_bdz.setId_start(getValue_String(id_start));

        HSSFCell dtdj_start = hssfRow.getCell(3);
        gs_bdz.setDtdj_start(getValue_String(dtdj_start));

        HSSFCell name_start = hssfRow.getCell(4);
        gs_bdz.setName_start(getValue_String(name_start));

        HSSFCell pms_id_end = hssfRow.getCell(5);
        gs_bdz.setPms_id_end(getValue_String(pms_id_end));

        HSSFCell id_end = hssfRow.getCell(6);
        gs_bdz.setId_end(getValue_String(id_end));

        HSSFCell dydj_end = hssfRow.getCell(7);
        gs_bdz.setDydj_end(getValue_String(dydj_end));

        HSSFCell name_end = hssfRow.getCell(8);
        gs_bdz.setName_end(getValue_String(name_end));

        HSSFCell line_id = hssfRow.getCell(9);
        gs_bdz.setLine_id(getValue_String(line_id));

        HSSFCell line_name = hssfRow.getCell(10);
        gs_bdz.setLine_name(getValue_String(line_name));

        HSSFCell yyxl = hssfRow.getCell(11);
        gs_bdz.setYyxl(getValue_Double(yyxl));

        String city = "甘肃";
        gs_bdz.setCity(city);

        String cityCode = "gansu";
        gs_bdz.setCity_code(cityCode);

        return gs_bdz;
    }

    /**
     * 判断后缀为xls的excel文件的数据类型
     * @param hssfCell
     * @return String
     * @author zhang 2015-08-18 00:12
     */
    private String getValue_String(HSSFCell hssfCell) {
        if (null == hssfCell){
            return "";
        }else {
            if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
                return String.valueOf(hssfCell.getBooleanCellValue());
            } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
                return String.valueOf(hssfCell.getNumericCellValue());
            } else {
                return String.valueOf(hssfCell.getStringCellValue());
            }
        }

    }

    /**
     * 判断后缀为xls的excel文件的数据类型
     * @param xssfRow
     * @return String
     * @author zhang 2015-08-18 00:12
     */
    private String getValue_String(XSSFCell xssfRow) {
        if (null == xssfRow){
            return "";
        }else {
            if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
                return String.valueOf(xssfRow.getBooleanCellValue());
            } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
                return String.valueOf(xssfRow.getNumericCellValue());
            } else {
                return String.valueOf(xssfRow.getStringCellValue());
            }
        }

    }

    /**
     * 判断后缀为xls的excel文件的数据类型
     * @param hssfCell
     * @return String
     * @author zhang 2015-08-18 00:12
     */
    private Double getValue_Double(HSSFCell hssfCell) {
        if (null == hssfCell){
            return 0.0;
        } else {
            if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
                return 0.0;
            } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
                return hssfCell.getNumericCellValue();
            } else {
                return 0.0;
            }
        }
    }

    /**
     * 判断后缀为xls的excel文件的数据类型
     * @param xssfRow
     * @return String
     * @author zhang 2015-08-18 00:12
     */
    private Double getValue_Double(XSSFCell xssfRow) {
        if (null == xssfRow){
            return 0.0;
        } else {
            if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
                return 0.0;
            } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
                return xssfRow.getNumericCellValue();
            } else {
                return 0.0;
            }
        }
    }
}
