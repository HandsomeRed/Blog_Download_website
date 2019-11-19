$(document).ready(function () {
    $('.select').on('click', '.placeholder', function (e) {
        var parent = $(this).closest('.select');
        if (!parent.hasClass('is-open')) {
            parent.addClass('is-open');
            $('.select.is-open').not(parent).removeClass('is-open');
        } else {
            parent.removeClass('is-open');
        }
        e.stopPropagation();
    }).on('click', 'ul>li', function () {
        var parent = $(this).closest('.select');
        parent.removeClass('is-open').find('.placeholder').text($(this).text());
    });

    $('body').on('click', function () {
        $('.select.is-open').removeClass('is-open');
    });
});

$(document).ready(function () {
    $('.select1').on('click', '.placeholder', function (e) {
        var parent = $(this).closest('.select1');
        if (!parent.hasClass('is-open')) {
            parent.addClass('is-open');
            $('.select1.is-open').not(parent).removeClass('is-open');
        } else {
            parent.removeClass('is-open');
        }
        e.stopPropagation();
    }).on('click', 'ul>li', function () {
        var parent = $(this).closest('.select1');
        parent.removeClass('is-open').find('.placeholder').text($(this).text());
    });

    $('body').on('click', function () {
        $('.select1.is-open').removeClass('is-open');
    });
});