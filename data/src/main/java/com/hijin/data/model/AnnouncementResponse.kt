package com.hijin.data.model

data class AnnouncementResponse(
    @SerializedName("announcementList") var announcementList: ArrayList<AnnouncementList> = arrayListOf(),
)

data class AnnouncementList(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,

    )

fun AnnouncementResponse.getFirstAnnouncementTitle(): String {
    return this.announcementList.firstOrNull()?.title ?: ""
}
