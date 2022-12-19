package recruiting_test_base.domain.usecase

import recruiting_test_base.data.model.LocalSample
import recruiting_test_base.data.repository.SampleRepository
import javax.inject.Inject

class GetLocalSampleUseCase @Inject constructor(private val repository: SampleRepository) {
    suspend operator fun invoke(
    ): List<LocalSample> {
        return repository.getLocalSample()
    }
}