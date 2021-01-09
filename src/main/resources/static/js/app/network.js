function sendLoginRequest(id , passwd) {

    var xhr = new XMLHttpRequest()
    var data = {email: id, pass: passwd}

    xhr.onload = function () {
        if (xhr.status === 200 || xhr.status === 201) {

            var jsonResponse = JSON.parse(xhr.responseText);
            console.log('--------------------')
            console.log('request code 200')
            console.log(jsonResponse.errCd);
            console.log(jsonResponse.errMsg);
            console.log(jsonResponse.result);
            console.log('--------------------')

            //내용 초기화
            document.getElementById('user_id').value = ""
            document.getElementById('user_passwd').value = ""

            if (jsonResponse.result == null){
                alert('null data')
            }else{
                alert('로그인이 완료 되었습니다.')
            }
        } else {
            console.log('--------------------')
            console.log('add fail')
            console.log('--------------------')

            alert('서버와 통신이 정상적이지 않습니다.\n다시 시도해주세요.')
            console.error(xhr.responseText);
        }
    };

    xhr.open('GET', 'http://15.165.238.146:8080/getapiuser?email=' + id);
    xhr.setRequestHeader('Content-Type', 'application/json'); // 컨텐츠타입을 json으로
    xhr.send(); // 데이터를 stringify해서 보냄
    // xhr.send(JSON.stringify()); // 데이터를 stringify해서 보냄

}