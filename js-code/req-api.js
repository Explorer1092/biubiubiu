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
console.log(materialInfo());