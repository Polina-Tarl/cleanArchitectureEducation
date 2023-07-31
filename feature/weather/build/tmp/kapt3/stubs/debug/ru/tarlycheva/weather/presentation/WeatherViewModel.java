package ru.tarlycheva.weather.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/tarlycheva/weather/presentation/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherDataUseCase", "Lru/tarlycheva/weather/domain/useCase/IWeatherDataUseCase;", "(Lru/tarlycheva/weather/domain/useCase/IWeatherDataUseCase;)V", "_loading", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "_weatherData", "Lru/tarlycheva/weather/domain/model/WeatherData;", "loading", "Landroidx/lifecycle/LiveData;", "getLoading", "()Landroidx/lifecycle/LiveData;", "weatherData", "getWeatherData", "", "city", "", "initLoading", "Companion", "weather_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final ru.tarlycheva.weather.domain.useCase.IWeatherDataUseCase weatherDataUseCase = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> _loading = null;
    private final androidx.lifecycle.MutableLiveData<ru.tarlycheva.weather.domain.model.WeatherData> _weatherData = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.tarlycheva.weather.presentation.WeatherViewModel.Companion Companion = null;
    private static final java.lang.String CITY_DEFAULT = "Sochi";
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    ru.tarlycheva.weather.domain.useCase.IWeatherDataUseCase weatherDataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.tarlycheva.weather.domain.model.WeatherData> getWeatherData() {
        return null;
    }
    
    private final void initLoading() {
    }
    
    private final void getWeatherData(java.lang.String city) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/tarlycheva/weather/presentation/WeatherViewModel$Companion;", "", "()V", "CITY_DEFAULT", "", "weather_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}