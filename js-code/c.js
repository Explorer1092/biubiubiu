/**
 * Created by Shen on 2017/7/6.
 */
// $(document).ready(function() {
//     $(document).click(function(){
//         $("button").click(function(){
//             $.getJSON("b.json", function (result) {
//                 $.each(result,function(i,field) {
//                     $("p").append(field + "");
//                 });
//             });
//         });
//     });
// });
// <button>add</button>
var entries = [
    {
        "term": "CALAMITY",
        "part": "n.",
        "definition": "A more than commonly plain and..."
    },
    {
        "term": "CANNIBAL",
        "part": "n.",
        "definition": "A gastronome of the old school who..."
    },
    {
        "term":"CHILDHOOD",
        "part":"n.",
        "definition":"The period of human life intermediate..."
    }
    //省略的内容
];
var html = '';
$.each(entries, function() {
    html += '<div class="entry">';
    html += '<h3 class="term">' + this.term + '</h3>';
    html += '<div class="part">' + this.part + '</div>';
    html += '<div class="definition">' + this.definition + '</div>';
    html += '</div>';
});
$('#dictionary').html(html);