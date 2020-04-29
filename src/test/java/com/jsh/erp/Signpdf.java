package com.jsh.erp;

public class Signpdf {

    //新盖章接口访问
   /* public static String signPdf(String path){
        byte[] bytes = PdfUtil.pdftoBase(new File(path));
        ElectronicSealWebServiceImplService ele = new ElectronicSealWebServiceImplService();
        ElectronicSealWebService eleservice = ele.getEsignWebServicePort();
        ResponseWrapper resWrapper = eleservice.sign(SEAL_WSCD,new String(bytes),480,650);
        try {
            if(resWrapper.getCode() == 1){
                PdfUtil.decoderBase64File((String) resWrapper.getData(),path);
                System.out.println("盖章成功！");
                return (String) resWrapper.getData();
            }else {
                System.out.println("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg());
                LogsReaderWriter.writeIntoFile("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg(), Constant.LOG_PATH, true);
                return null;
            }
        } catch (Exception e) {
            LogsReaderWriter.writeIntoFile("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg(), Constant.LOG_PATH, true);
            e.printStackTrace();
            return null;
        }
    }
    public static byte[] signPdf(byte[] bytes){
        String byteStr = DatatypeConverter.printBase64Binary(bytes);
        ElectronicSealWebServiceImplService ele = new ElectronicSealWebServiceImplService();
        ElectronicSealWebService eleservice = ele.getEsignWebServicePort();
        ResponseWrapper resWrapper = eleservice.sign(SEAL_WSCD,byteStr,480,650);
        try {
            if(resWrapper.getCode() == 1){
                String base64Code = (String) resWrapper.getData();
                byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
//            PdfUtil.decoderBase64File((String) resWrapper.getData(),path);
                System.out.println("盖章成功！");
                return buffer;
            }else {
                System.out.println("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg());
                LogsReaderWriter.writeIntoFile("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg(), Constant.LOG_PATH, true);
                return null;
            }
        } catch (Exception e) {
            LogsReaderWriter.writeIntoFile("盖章失败：code："+ resWrapper.getCode() + "  msg:" + resWrapper.getMsg(), Constant.LOG_PATH, true);
            e.printStackTrace();
            return null;
        }
    }*/

}
