package com.sivalabs.youtube;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public record VideoInfo(String title,
                        @JsonIgnore
                        String description,
                        String publishedAt,
                        String duration,
                        String url,
                        List<String> tags) {}