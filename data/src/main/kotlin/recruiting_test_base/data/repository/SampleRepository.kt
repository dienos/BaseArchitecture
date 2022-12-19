package recruiting_test_base.data.repository

import recruiting_test_base.data.datasource.local.SampleLocalSource
import recruiting_test_base.data.datasource.remote.SampleRemoteSource
import recruiting_test_base.data.model.SampleEntity
import recruiting_test_base.data.model.SampleDTO
import javax.inject.Inject

class SampleRepository @Inject constructor(
    private val localSource: SampleLocalSource,
    private val remoteSource: SampleRemoteSource
) {
    suspend fun getLocalSample(): List<SampleEntity> = localSource.getLocalSimple()
    suspend fun getSample(): List<SampleDTO> = remoteSource.getSimple()
}