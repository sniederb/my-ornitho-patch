package ch.want.myornithopatch.ui.settings

import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(ch.want.myornithopatch.R.xml.preferences, rootKey)
        addDynamicPreferences()
    }

    private fun addDynamicPreferences() {
        val preferenceScreen = this.preferenceScreen
        // create preferences manually
        val preferenceCategory = PreferenceCategory(preferenceScreen.context)
        preferenceCategory.setTitle("yourTitle")
        // do anything you want with the preferencecategory here
        // Important to add any preference category to the preference screen before adding any
        // preferences to the category, or you will get a null pointer
        preferenceScreen.addPreference(preferenceCategory)
        val preference = Preference(preferenceScreen.context)
        preference.setTitle("yourTitle")
        // do anything you want with the preferencey here
        preferenceCategory.addPreference(preference)
    }
}