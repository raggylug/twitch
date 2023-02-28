package com.laioffer.twitch.external.model;

import java.util.List;

public record GameResponse(
        List<com.laioffer.twitch.external.model.Game> data
) {
}
