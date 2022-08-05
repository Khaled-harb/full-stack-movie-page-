const apiConfig = {
    baseUrl: 'https://api.themoviedb.org/3/',
    apiKey: 'a97243d7813d31446f6c43284e6854d5',
    originalImage: (imgPath) => `https://image.tmdb.org/t/p/original/${imgPath}`,
    w500Image: (imgPath) => `https://image.tmdb.org/t/p/w500/${imgPath}`
}

export default apiConfig;