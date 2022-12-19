package recruiting_test_base.domain.usecase

import recruiting_test_base.data.model.Sample
import recruiting_test_base.data.repository.SampleRepository
import javax.inject.Inject

class GetSampleUseCase @Inject constructor(private val repository: SampleRepository) {
    suspend operator fun invoke(
    ): List<Sample> {
        return repository.getSample()
    }
}