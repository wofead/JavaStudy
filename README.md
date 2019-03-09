# JavaStudy
用Java实现各种数据结构
## 字符串的连接
在同步的情况下 StringBuilder好于“+”、contact、StringBuffer和StringUtils.join
在异步的情况下使用StringBuffer 因为它是线程安全的
    
        String a = "dfda"
        String b = "ddsaf"
        String hello = a + b
        String helloC = a.contact(b)
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        StringBuffer helloBuffer = stringBuffer.append("hello");
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");
        StringBuilder helloBuilder = stringBuilder.append("hello");
        String []str = {"ewqe","fera"};
        String result = StringUtils.join(str,",") //ewqe,fera
        