package ke.co.academicplanner.data.models

import com.google.firebase.firestore.DocumentId

data class Score(
    @DocumentId var id: String? = null,
    var userId: String? = null,
    var unitCode: String? = null,
    var assignment: Int? = null,
    var cat: Int? = null,
    var exam: Int? = null
)