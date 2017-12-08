一、创建一个bean，取名Info
```java
Public class Info {
    private String name;
    private  int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Info(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Info() {
    }
}
```

二、创建一个dao，取名InfoDao
```java
public class InfoDao extends BaseDao{
    /**
     * 获取材料信息统计
     * @return
     */
    public ArrayList<Info> getInfoForMaterial(){
        ArrayList<Info> infos = new ArrayList<Info>();
        Connection con = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try{
            con = super.getConnection();
            psmt =con.prepareStatement("SELECT cm.materialName,COUNT(1) FROM cupmaterials AS cm INNER JOIN cups AS cu ON cm.materialId = cu.cupmaterialid GROUP BY cu.cupmaterialid");
            rs = psmt.executeQuery();
            while(rs.next()){
                String name = rs.getString(1);
                int count = rs.getInt(2);
                Info info = new Info(name,count);
                infos.add(info);
            }
        }catch (Exception ex){
            System.out.print("加载材质统计信息失败，原因是："+ex.getMessage());
        }finally {
            super.closeAll(rs,psmt,con);
        }
        return infos;
    }
 
```
三、在jsp页面：<canvasid="myChart-material" width="200" height="200"></canvas>

四、Servlet：
```jspx
request.setCharacterEncoding("utf-8");

        ArrayList<Info> infos=newInfoDao().getInfoForCharacter();

        String result=newJSONArray(infos).toString();

 

       response.setContentType("text/plain;charset=utf-8");

       response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();

           out.print(result);
```
五、js部分：
```javascript
//产生随机色*************************************************************************
function  randomColor(){
    //颜色字符串
    var colorStr="";
    //字符串的每一字符的范围
    var randomArr=['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'];
    //产生一个六位的字符串
    for(var i=0;i<6;i++){
        //15是范围上限，0是范围下限，两个函数保证产生出来的随机数是整数
        colorStr+=randomArr[Math.ceil(Math.random()*(15-0)+0)];
    }
    return colorStr;
}

//页面加载时调用函数**************************************************
$(function(){
    materialInfo()；
});
 
function materialInfo(){
    $.get(
        'getInfoForMaterial.do',
        function(result){
            var arr=[];
            for(var i = 0;i<result.length;i++){
                var json = {};
                json.value = result[i].count;
                json.color = "#"+randomColor();
                json.highlight ="#"+randomColor();
                json.label=result[i].name;
                arr.push(json);
            }
            var pieData = arr;

            var ctx = document.getElementById("myChart-material").getContext("2d");
            window.myPie = new Chart(ctx).Pie(pieData,{
                //responsive : true
            });
            myPie.defaults = {
                segmentShowStroke : true,
                segmentStrokeColor : "#fff",
                segmentStrokeWidth : 2,
                animation : true,
                animationSteps : 100,
                animationEasing : "easeOutBounce",
                animateRotate : true,
                animateScale : false,
                onAnimationComplete : null
            };
        },
        'json'
    );
}
 ```