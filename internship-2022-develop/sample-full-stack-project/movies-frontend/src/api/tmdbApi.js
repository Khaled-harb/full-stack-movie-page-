import axiosClient from "./axiosClient";

export const category = {
    movie: 'movie',
    tv: 'tv'
}

export const movieType = {
    upcoming: 'upcoming',
    popular: 'popular',
    top_rated: 'top_rated'
}

export const tvType = {
    popular: 'popular',
    top_rated: 'top_rated',
    on_the_air: 'on_the_air'
}

const tmdbApi = {
    getMoviesList: (type, params) => {
        const url ="https://api.themoviedb.org/3/movie/popular?api_key=a97243d7813d31446f6c43284e6854d5&page=1"
        return axiosClient.get(url, params);
    },
    search: (title, params) => {
        const url = `https://api.themoviedb.org/3/search/movie?api_key=a97243d7813d31446f6c43284e6854d5&query=${title}`
        return axiosClient.get(url, params);
    },
    detail: (id, params) => {
        const url = `https://api.themoviedb.org/3/movie/${id}?api_key=a97243d7813d31446f6c43284e6854d5`
        return axiosClient.get(url)
    }
}

export default tmdbApi;