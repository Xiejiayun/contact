//package nju.software.web.gson;
//
//
//import java.io.PrintWriter;
//
//
//import javax.servlet.http.HttpServletResponse;
//
//
//import com.google.gson.Gson;
//
///**
// * Created by lab on 16-2-18.
// */
//public class ResponseBuilder {
//
//    /**
//     * 默认的字符集
//     */
//
//    private static final String DEFAULT_CHARSET = "utf-8";
//
//    /**
//     * 返回Json格式的结果
//     *
//     * @param response http响应对象
//     * @param content  响应内容
//     * @throws Exception
//     */
//
//    public void writeJsonResponse(HttpServletResponse response, String content)
//
//            throws Exception {
//
//        response.addHeader("Content-Type", "application/json;charset="
//
//                + DEFAULT_CHARSET);
//
//        PrintWriter writer = response.getWriter();
//
//        writer.write(content);
//
//    }
//
//
//    public void writeJsonResponse(HttpServletResponse response, Object obj)
//
//            throws Exception {
//
//// TODO Auto-generated method stub
//
//        Gson gson = new Gson();
//
//        String strJson = gson.toJson(obj);
//
//        writeJsonResponse(response, strJson);
//
//    }
//
//
//}
