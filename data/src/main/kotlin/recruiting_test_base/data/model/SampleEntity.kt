package recruiting_test_base.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sample")
data class SampleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String
)