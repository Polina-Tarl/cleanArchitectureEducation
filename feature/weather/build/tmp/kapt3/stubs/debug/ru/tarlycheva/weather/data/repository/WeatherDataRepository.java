package ru.tarlycheva.weather.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lru/tarlycheva/weather/data/repository/WeatherDataRepository;", "Lru/tarlycheva/weather/domain/repository/IWeatherDataRepository;", "api", "Lru/tarlycheva/weather/domain/api/WeatherService;", "(Lru/tarlycheva/weather/domain/api/WeatherService;)V", "getWeatherData", "Lretrofit2/Response;", "Lru/tarlycheva/weather/domain/model/WeatherData;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "weather_debug"})
public final class WeatherDataRepository implements ru.tarlycheva.weather.domain.repository.IWeatherDataRepository {
    private final ru.tarlycheva.weather.domain.api.WeatherService api = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.tarlycheva.weather.data.repository.WeatherDataRepository.Companion Companion = null;
    private static final java.lang.String WEATHER_API_KEY = "93f35c51aad44beba6a191310232807";
    
    @javax.inject.Inject()
    public WeatherDataRepository(@org.jetbrains.annotations.NotNull()
    ru.tarlycheva.weather.domain.api.WeatherService api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.tarlycheva.weather.domain.model.WeatherData>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/tarlycheva/weather/data/repository/WeatherDataRepository$Companion;", "", "()V", "WEATHER_API_KEY", "", "weather_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}