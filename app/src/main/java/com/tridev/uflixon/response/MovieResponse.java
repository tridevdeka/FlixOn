package com.tridev.uflixon.response;

import com.google.gson.annotations.SerializedName;
import com.tridev.uflixon.models.Movie;

import java.util.ArrayList;

public class MovieResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("total_pages")
    private int total_pages;

    @SerializedName("total_results")
   private int total_results;

    @SerializedName("results")
    private ArrayList<Movie> results;


    public MovieResponse(int page, int total_pages, int total_results, ArrayList<Movie> results) {
        this.page = page;
        this.total_pages = total_pages;
        this.total_results = total_results;
        this.results = results;
    }


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public ArrayList<Movie> getResults() {
        return results;
    }

    public void setResults(ArrayList<Movie> results) {
        this.results = results;
    }
}
