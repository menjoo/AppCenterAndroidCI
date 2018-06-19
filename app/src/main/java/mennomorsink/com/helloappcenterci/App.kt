package mennomorsink.com.helloappcenterci

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class App: Application() {

    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
                this,
                BuildConfig.APP_CENTER_ID,
                Analytics::class.java,
                Crashes::class.java)
        AppCenter.setEnabled(!BuildConfig.DEBUG)
    }
}
