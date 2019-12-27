package ch.want.myornithopatch.ui.settings

import android.os.Bundle
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import ch.want.myornithopatch.R


class SettingsFragment : PreferenceFragmentCompat() {


    private lateinit var settingsViewModel: SettingsViewModel
    private var mListPreference: ListPreference? = null

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//        mListPreference = preferenceManager.findPreference("preference_key")
//        mListPreference?.setOnPreferenceChangeListener { preference, any ->
//            true
//        }
//        return inflater.inflate(R.layout.fragment_settings, container, false)
//
////        settingsViewModel = ViewModelProviders.of(this).get(SettingsViewModel::class.java)
////        val root = inflater.inflate(R.layout.fragment_settings, container, false)
////        val textView: TextView = root.findViewById(R.id.text_share)
////        settingsViewModel.text.observe(this, Observer {
////            textView.text = it
////        })
////        return root
//    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}