package recruiting_test_base.presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import recruiting_test_base.data.api.SampleService
import recruiting_test_base.data.datasource.local.SampleLocalSource
import recruiting_test_base.data.datasource.remote.SampleRemoteSource
import recruiting_test_base.data.db.dao.SampleDao

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    fun providesSimpleRemoteSource(service: SampleService): SampleRemoteSource =
        SampleRemoteSource(service)

    @Provides
    fun providesSimpleLocalSource(dao: SampleDao): SampleLocalSource = SampleLocalSource(dao)
}