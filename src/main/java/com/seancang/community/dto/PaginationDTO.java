package com.seancang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious = true;
    private boolean showFirstPage = true;
    private boolean showEndPage = true;
    private boolean showNext = true;
    private Integer totalPage;
    //当前页
    private Integer page;

    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer totalcount, Integer page, Integer size) {

        if (totalcount % size == 0) {
            totalPage = totalcount / size;
        } else {
            totalPage = totalcount / size + 1;
        }
        if (page < 1) {
            page = 1;
        }
        if (page > totalPage) {
            page = totalPage;
        }
        this.page = page;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }


        //是否展示前页按钮
        if (page == 1) {
            showPrevious = false;
        }
        //是否展示后页按钮
        if (page == totalPage) {
            showNext = false;
        }

        //是否展示首页按钮
        if (pages.contains(1)) {
            showFirstPage = false;
        }

        //是否展示末页按钮
        if (pages.contains(totalPage)) {
            showEndPage = false;
        }
    }
}
