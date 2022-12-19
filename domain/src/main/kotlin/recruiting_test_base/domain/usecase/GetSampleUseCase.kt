package recruiting_test_base.domain.usecase

import recruiting_test_base.data.repository.SampleRepository
import recruiting_test_base.domain.model.Sample
import javax.inject.Inject

class GetSampleUseCase @Inject constructor(private val repository: SampleRepository) {
    suspend operator fun invoke(
    ): List<Sample> {
        val result: MutableList<Sample> = mutableListOf()
        val response = repository.getSample()

        response.forEach {
            result.add(Sample(it.name))
        }

        return result
    }
}