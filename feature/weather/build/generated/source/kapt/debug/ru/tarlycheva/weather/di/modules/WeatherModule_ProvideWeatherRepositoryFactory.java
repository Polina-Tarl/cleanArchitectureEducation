// Generated by Dagger (https://dagger.dev).
package ru.tarlycheva.weather.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import ru.tarlycheva.weather.domain.api.WeatherService;
import ru.tarlycheva.weather.domain.repository.IWeatherDataRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherModule_ProvideWeatherRepositoryFactory implements Factory<IWeatherDataRepository> {
  private final Provider<WeatherService> apiProvider;

  public WeatherModule_ProvideWeatherRepositoryFactory(Provider<WeatherService> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public IWeatherDataRepository get() {
    return provideWeatherRepository(apiProvider.get());
  }

  public static WeatherModule_ProvideWeatherRepositoryFactory create(
      Provider<WeatherService> apiProvider) {
    return new WeatherModule_ProvideWeatherRepositoryFactory(apiProvider);
  }

  public static IWeatherDataRepository provideWeatherRepository(WeatherService api) {
    return Preconditions.checkNotNullFromProvides(WeatherModule.INSTANCE.provideWeatherRepository(api));
  }
}
