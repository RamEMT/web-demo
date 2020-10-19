const BASE_URL = "http://localhost:8080/api"
const BASE_IMG_URL = "http://119.23.190.71:8089/im/"

let INDEX_URL = BASE_URL + "/index"



$(function () {
    $.get(INDEX_URL, function (result) {
        if (result.status === 200) {
            //显示分类信息
            showCateLogData(result.data.cateLogs)
            showRecommendMovies(result.data.films)
            showRecommendTvPlays(result.data.tvPlays)
            showRecommendAnime(result.data.anime)
            showTopMovies(result.data.topMovies)

        } else {
            alert("系统繁忙!请稍后再试!!!")
        }
    });


    function showCateLogData(cateLogs) {
         // <li class="nav-item">
         //     <a class="nav-link" href="detail.html?cateId="></a>
         // </li>
        for (const cate of cateLogs) {
            $("#cate").append(
                $("<li class='nav-item'>").append(
                    $("<a>").addClass("nav-link")
                        .attr("href", "cate.html?cateId=" + cate.id)
                        .text(cate.name)
                )
            )
        }
    }


    //显示推荐的影片信息
    function showRecommendMovies(films) {
        for (const film of films) {
            $("#recommend_movies").append(
                $('<li class="float-left">').append(
                    $("<a>")
                    .attr("href", "detail.html?filmId=" + film.id)
                    .append($('<div class="t_img" title="">')
                        .append(
                            $('<img class="lazy rounded img-fluids">')
                                .attr("data-original", BASE_IMG_URL + film.image)
                                .attr("src",BASE_IMG_URL + film.image)
                        )
                    )
                ).append(
                    $('<div class="t_info">').append(
                        $('<a>').attr("href","detail.html?filmId=" + film.id).append(
                            $('<p style="color:#00AFE4;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;">').text(film.name)
                        )
                    ).append($("<p>").text(film.typeName + "-" + film.onDecade))
                )
            )
        }
    }

    //显示推荐的电视剧信息
        // <li class="float-left">
        //     <a href="xl/detail.html?film_id=">
        //         <div class="t_img" title="${li.name}">
        //             <img class="lazy rounded img-fluids"
        //                  data-original=""/>
        //         </div>
        //     </a>
        //     <div class="t_info">
        //         <p style="color:#00AFE4;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;">
        //             电影名称
        //         </p>
        //         <p>typeName-li.onDecade</p>
        //     </div>
        // </li>
    function showRecommendTvPlays(tvPlays) {
        for (const tvPlay of tvPlays) {
            $("#tvPlays").append(
                $('<li class="float-left">').append(
                    $("<a>").attr("href","detail.html?film_id="+tvPlay.id).append(
                        $('<div class="t_img" title="${li.name}">').append(
                            $('<img class="lazy rounded img-fluids data-original="/>')
                                .attr("src",BASE_IMG_URL+tvPlay.image)
                        )
                    )
                ).append(
                    $('<div class="t_info">').append(
                        $("<a>").append(
                            $("<p>").css("color","#00AFE4")
                                .css("overflow","hidden").css("white-space","nowrap")
                                .css("text-overflow","ellipsis").text(tvPlay.name)
                        )
                    ).append(
                        $("<p>").text(tvPlay.typeName+" - "+tvPlay.onDecade)
                    )
                )
            )
        }
    }

    //显示动漫的推荐信息
    function showRecommendAnime(animation) {
        for (const anime of animation) {
            $("#anime").append(
                $('<li class="float-left">').append(
                    $("<a>").attr("href","detail.html?film_id="+anime.id).append(
                        $('<div class="t_img" title="${li.name}">').append(
                            $('<img class="lazy rounded img-fluids data-original="/>')
                                .attr("src",BASE_IMG_URL+anime.image)
                        )
                    )
                ).append(
                   $('<div class="t_info">').append(
                       $("<a>").attr("href","detail.html?film_id="+anime.id).append(
                           $("<p>").css("color","#00AFE4")
                               .css("overflow","hidden").css("white-space","nowrap")
                               .css("text-over-flow","ellipsis").text(anime.name)
                       )
                   ).append(
                       $("<p>").text(anime.typeName+" - "+anime.onDecade)
                   )
                )
            )
        }
    }

    // <li class=""><span class="ph1">1</span> <a
    //     href="./detail.html?film_id=" target="_blank"
    //     title="美丽人生">美丽人生<span style="float: right;margin-right: 10px;">10-10</span></a>
    //     <div class="tips">
    //         <div class="tipscont">
    //             <img src="public/static/upload/filmPic/1476102109462.jpg"
    //                  style="border:1px solid #ddd;padding: 4px;background: white;"
    //                  width="200px" height="288px" alt="美丽人生">
    //         </div>
    //     </div>
    // </li>
    function showTopMovies(topMovies) {
        let index = 1;
        for (const topMovie of topMovies) {
            $("#topMovies").append(
                $("<li>").append(
                    $('<span class="ph1">').text(++index)
                ).append(
                    $("<a>").attr("href","detail.html?film_id="+topMovie.id)
                        .text(topMovie.name).append(
                        $("<span>").css("float","right").css("margin-right","10px")
                            .text(topMovie.updateTime.substring(5,10))
                    )
                ).append(
                    $('<div class="tips">').append(
                        $('<div class="tipscont">').append(
                            $('<img style="border:1px solid #ddd;padding: 4px;background: white;width=200px;height=288px">')
                                .attr("href",BASE_IMG_URL+topMovie.image)
                        )
                    )
                )
            )
        }
    }
})
