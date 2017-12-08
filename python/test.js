function fileSelect2(e) {
    e = e || window.event;
    var files = this.files;
    var p = document.getElementById('preview2');
    for(var i = 0, f; f = files[i]; i++) {
        var reader = new FileReader();
        reader.onload = (function(file) {
            return function(e) {
                var span = document.createElement('span');
                span.innerHTML = '<img style="padding: 0 10px;" width="100" src="'+ this.result +'" alt="'+ file.name +'" />';
                p.insertBefore(span, null);
            };
        })(f);
        //读取文件内容
        reader.readAsDataURL(f);
    }
}
