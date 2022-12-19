package recruiting_test_base.data.datasource.remote

import recruiting_test_base.data.api.SampleService
import recruiting_test_base.data.model.Sample
import javax.inject.Inject

class SampleRemoteSource @Inject constructor(
    private val sampleService: SampleService
) {
    suspend fun getSimple(): List<Sample> = sampleService.getSample()
}