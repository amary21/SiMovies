package com.amary.core.data.source.remote.response

import com.amary.core.constant.EmptyValue
import com.amary.core.domain.model.ResultData
import com.google.gson.annotations.SerializedName

data class ResultsResponse(
	@SerializedName("overview") val overview: String? = EmptyValue.STRING,
	@SerializedName("original_language") val originalLanguage: String? = EmptyValue.STRING,
	@SerializedName("original_title", alternate = ["original_name"]) val originalTitle: String? = EmptyValue.STRING,
	@SerializedName("video") val video: Boolean? = EmptyValue.BOOLEAN,
	@SerializedName("title", alternate = ["name"]) val title: String? = EmptyValue.STRING,
	@SerializedName("poster_path") val posterPath: String? = EmptyValue.STRING,
	@SerializedName("backdrop_path") val backdropPath: String? = EmptyValue.STRING,
	@SerializedName("release_date", alternate = ["first_air_date"]) val releaseDate: String? = EmptyValue.STRING,
	@SerializedName("popularity") val popularity: Double? = EmptyValue.DOUBLE,
	@SerializedName("vote_average") val voteAverage: Double? = EmptyValue.DOUBLE,
	@SerializedName("id") val id: Int? = EmptyValue.INT,
	@SerializedName("adult") val adult: Boolean? = EmptyValue.BOOLEAN,
	@SerializedName("vote_count") val voteCount: Int? = EmptyValue.INT
) {
	fun mapToModel() = ResultData(
		overview ?: EmptyValue.STRING,
		originalLanguage ?: EmptyValue.STRING,
		originalTitle ?: EmptyValue.STRING,
		video ?: EmptyValue.BOOLEAN,
		title ?: EmptyValue.STRING,
		posterPath ?: EmptyValue.STRING,
		backdropPath ?: EmptyValue.STRING,
		releaseDate ?: EmptyValue.STRING,
		popularity ?: EmptyValue.DOUBLE,
		voteAverage ?: EmptyValue.DOUBLE,
		id ?: EmptyValue.INT,
		adult ?: EmptyValue.BOOLEAN,
		voteCount ?: EmptyValue.INT
	)
}