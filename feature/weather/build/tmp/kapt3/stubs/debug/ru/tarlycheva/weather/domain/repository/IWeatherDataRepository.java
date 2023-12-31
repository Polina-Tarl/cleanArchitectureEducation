package ru.tarlycheva.weather.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lru/tarlycheva/weather/domain/repository/IWeatherDataRepository;", "", "getWeatherData", "Lretrofit2/Response;", "Lru/tarlycheva/weather/domain/model/WeatherData;", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "weather_debug"})
public abstract interface IWeatherDataRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<ru.tarlycheva.weather.domain.model.WeatherData>> continuation);
}