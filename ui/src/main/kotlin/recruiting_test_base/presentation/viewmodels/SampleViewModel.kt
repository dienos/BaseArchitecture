package recruiting_test_base.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import recruiting_test_base.domain.model.LocalSample
import recruiting_test_base.domain.model.Sample
import recruiting_test_base.domain.usecase.GetLocalSampleUseCase
import recruiting_test_base.domain.usecase.GetSampleUseCase
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val getSampleUseCase: GetSampleUseCase,
    private val getLocalSampleUseCase: GetLocalSampleUseCase,
) : BaseViewModel() {

    private var _sampleData = MutableLiveData<List<Sample>>()
    val sampleRepository : LiveData<List<Sample>> = _sampleData

    private var _sampleLocalData = MutableLiveData<List<LocalSample>>()
    val sampleLocalRepository : LiveData<List<LocalSample>> = _sampleLocalData

    fun getSimpleData() {
        viewModelScope.launch {
            _sampleData.value = getSampleUseCase.invoke()
        }
    }

    fun getLocalSimpleData() {
        viewModelScope.launch {
            _sampleLocalData.value = getLocalSampleUseCase.invoke()
        }
    }
}