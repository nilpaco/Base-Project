package com.project.web.rest.dto;

import com.project.domain.Space;

/**
 * Created by nilpanescoll on 2/3/16.
 */


public class SpaceDTO {
    private Space space;
    private Boolean like;

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }
}
