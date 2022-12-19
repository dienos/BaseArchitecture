package recruiting_test_base.data.datasource.local

import recruiting_test_base.data.db.dao.SampleDao
import recruiting_test_base.data.model.SampleEntity
import javax.inject.Inject

class SampleLocalSource @Inject constructor(
    private val dao: SampleDao
) {
    suspend fun getLocalSimple(): List<SampleEntity> = dao.getSamples()
}