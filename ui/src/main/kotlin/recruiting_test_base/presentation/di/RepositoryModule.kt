package recruiting_test_base.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import recruiting_test_base.data.datasource.local.SampleLocalSource
import recruiting_test_base.data.datasource.remote.SampleRemoteSource
import recruiting_test_base.data.repository.SampleRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun providesSampleRepository(
        localSource: SampleLocalSource,
        remoteSource: SampleRemoteSource
    ): SampleRepository = SampleRepository(localSource, remoteSource)
}