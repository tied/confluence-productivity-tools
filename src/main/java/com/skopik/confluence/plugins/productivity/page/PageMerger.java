package com.skopik.confluence.plugins.productivity.page;

import com.atlassian.confluence.pages.Page;

import java.util.List;

/**
 * Created by skopa01 on 9/5/2016.
 */
public interface PageMerger {

    String mergePageBody(List<Page> pages);

}
