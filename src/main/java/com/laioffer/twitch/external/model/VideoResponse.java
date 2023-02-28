package com.laioffer.twitch.external.model;

import com.laioffer.twitch.external.model.Video;

import java.util.List;

public record VideoResponse(
        List<Video> data
) {
}
