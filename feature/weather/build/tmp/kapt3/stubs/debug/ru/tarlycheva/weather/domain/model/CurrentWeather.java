package ru.tarlycheva.weather.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lru/tarlycheva/weather/domain/model/CurrentWeather;", "", "temp_c", "", "condition", "Lru/tarlycheva/weather/domain/model/ConditionWeather;", "(Ljava/lang/Double;Lru/tarlycheva/weather/domain/model/ConditionWeather;)V", "getCondition", "()Lru/tarlycheva/weather/domain/model/ConditionWeather;", "getTemp_c", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/Double;Lru/tarlycheva/weather/domain/model/ConditionWeather;)Lru/tarlycheva/weather/domain/model/CurrentWeather;", "equals", "", "other", "hashCode", "", "toString", "", "weather_debug"})
public final class CurrentWeather {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temp_c = null;
    @org.jetbrains.annotations.Nullable()
    private final ru.tarlycheva.weather.domain.model.ConditionWeather condition = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.tarlycheva.weather.domain.model.CurrentWeather copy(@org.jetbrains.annotations.Nullable()
    java.lang.Double temp_c, @org.jetbrains.annotations.Nullable()
    ru.tarlycheva.weather.domain.model.ConditionWeather condition) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CurrentWeather() {
        super();
    }
    
    public CurrentWeather(@org.jetbrains.annotations.Nullable()
    java.lang.Double temp_c, @org.jetbrains.annotations.Nullable()
    ru.tarlycheva.weather.domain.model.ConditionWeather condition) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemp_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.tarlycheva.weather.domain.model.ConditionWeather component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.tarlycheva.weather.domain.model.ConditionWeather getCondition() {
        return null;
    }
}