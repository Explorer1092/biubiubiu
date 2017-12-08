/**
 * Created by Shen on 2017/7/6.
 */
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
// js必须这样才能打印
console.log(randomColor());