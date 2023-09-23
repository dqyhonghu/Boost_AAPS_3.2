package info.nightscout.interfaces.stats

import info.nightscout.interfaces.profile.Profile
import org.json.JSONObject

interface IsfCalculator {
    fun calculateAndSetToProfile(profile : Profile, insulinDivisor: Int, glucose: Double, isTempTarget: Boolean, profileJson : JSONObject? = null) : IsfCalculation
}