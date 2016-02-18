/**
 * Created by lab on 16-2-17.
 */
$(document).ready(function () {

    $(document).on('click', '#savecontact', function () {
        var username = $("input[name='username']").val();
        var gender = $("input[name='gender']").val();
        var grade = $("input[name='grade']").val();
        var phone = $("input[name='phone']").val();
        $.ajax({
            method: "POST",
            url: "createStudent.do",
            data: {username: username, gender: gender, grade: grade, phone: phone},
            success: function (msg) {
                $("#alert").html("<div class='alert alert-success fade in'><strong>添加用户成功!</strong></div>").show();
            },
            error: function (msg) {
                $("#alert").html("<div class='alert alert-danger fade in'><strong>添加用户失败!</strong></div>").show();
            }
        }).done(function (msg) {
            //console.log("Data Saved: " + msg);
        });
    });

    $(document).on('click', '.delete', function () {
        var stuid = $(this).data("stuid");
        $.ajax({
            method: "POST",
            url: "deleteStudent.do",
            data: {stuid: stuid},
            success: function (msg) {
                $(".alert").alert("abc");
            },
            error: function (msg) {
                $(".alert").alert();
            }
        }).done(function (msg) {
            //console.log("Data Saved: " + msg);
        });
    });



});

