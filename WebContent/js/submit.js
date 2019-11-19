$(document).ready(function () {

    $("#searchBt").click(function () {

        var year = $("#year").text();
        var month = $("#month").text();
        var title = $("#key").val();

        if ($("#type").text() == "类型" || $("#type").text() == "不限") {
            $("#batype").attr("name", null);
        } else {
            $("#batype").attr("name", "ba.type");
            $("#batype").attr("value", $("#type").text());
        }
        var date = "";
        if (year != "年" && year != "不限") {
            date = year + "-";
            if (month != "不限" && month != "月") {
                date += month + "-" + "01";
            } else {
                date += "01-" + "01";
            }
        }

        if (date == "") {
            $("#badate").attr("name", null);
        } else {
            $("#badate").attr("name", "ba.releaseTime");
            $("#badate").attr("value", date);
        }

        if (title == "") {
            $("#key").attr("name", null);
        } else {
            $("#key").attr("name", "ba.title");
        }

        $("#serach").submit();
    });


});