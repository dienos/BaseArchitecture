package recruiting_test_base.data.repository

import recruiting_test_base.data.datasource.local.SampleLocalSource
import recruiting_test_base.data.datasource.remote.SampleRemoteSource
import recruiting_test_base.data.model.LocalSample
import recruiting_test_base.data.model.Sample
import javax.inject.Inject

class SampleRepository @Inject constructor(
    private val localSource: SampleLocalSource,
    private val remoteSource: SampleRemoteSource
) {
    suspend fun getLocalSample(): List<LocalSample> = localSource.getLocalSimple()
    suspend fun getSample(): List<Sample> = remoteSource.getSimple()
}