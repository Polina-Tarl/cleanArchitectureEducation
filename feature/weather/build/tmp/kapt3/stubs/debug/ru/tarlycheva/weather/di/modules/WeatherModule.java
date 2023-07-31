package ru.tarlycheva.weather.di.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lru/tarlycheva/weather/di/modules/WeatherModule;", "", "()V", "provideWeatherApi", "Lru/tarlycheva/weather/domain/api/WeatherService;", "retrofit", "Lretrofit2/Retrofit;", "provideWeatherRepository", "Lru/tarlycheva/weather/domain/repository/IWeatherDataRepository;", "api", "provideWeatherUseCase", "Lru/tarlycheva/weather/domain/useCase/IWeatherDataUseCase;", "weatherDataRepository", "Lru/tarlycheva/weather/data/repository/WeatherDataRepository;", "weather_debug"})
@dagger.Module()
public final class WeatherModule {
    @org.jetbrains.annotations.NotNull()
    public static final ru.tarlycheva.weather.di.modules.WeatherModule INSTANCE = null;
    
    private WeatherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.tarlycheva.weather.domain.api.WeatherService provideWeatherApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.tarlycheva.weather.domain.repository.IWeatherDataRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull()
    ru.tarlycheva.weather.domain.api.WeatherService api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.tarlycheva.weather.domain.useCase.IWeatherDataUseCase provideWeatherUseCase(@org.jetbrains.annotations.NotNull()
    ru.tarlycheva.weather.data.repository.WeatherDataRepository weatherDataRepository) {
        return null;
    }
}