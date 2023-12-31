package ru.tarlycheva.weather.data.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lru/tarlycheva/weather/data/useCase/WeatherDataUseCase;", "Lru/tarlycheva/weather/domain/useCase/IWeatherDataUseCase;", "weatherDataRepository", "Lru/tarlycheva/weather/domain/repository/IWeatherDataRepository;", "(Lru/tarlycheva/weather/domain/repository/IWeatherDataRepository;)V", "getWeatherData", "Lretrofit2/Response;", "Lru/tarlycheva/weather/domain/model/WeatherData;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "weather_debug"})
public final class WeatherDataUseCase implements ru.tarlycheva.weather.domain.useCase.IWeatherDataUseCase {
    private final ru.tarlycheva.weather.domain.repository.IWeatherDataRepository weatherDataRepository = null;
    
    @javax.inject.Inject()
    public WeatherDataUseCase(@org.jetbrains.annotations.NotNull()
    ru.tarlycheva.weather.domain.repository.IWeatherDataRepository weatherDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.tarlycheva.weather.domain.model.WeatherData>> continuation) {
        return null;
    }
}