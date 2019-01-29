package com.luzza.graphql.tutorial;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }
    
    public Link createLink(String url, String description, String rating) {
        Link newLink = new Link(url, description, rating);
        linkRepository.saveLink(newLink);
        return newLink;
    }
}