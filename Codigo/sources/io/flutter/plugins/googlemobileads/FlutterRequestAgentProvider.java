package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes3.dex */
class FlutterRequestAgentProvider {
    static final String GAME_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION";
    static final String NEWS_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION";
    private String gameTemplateVersion;
    private String newsTemplateVersion;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterRequestAgentProvider(Context context) {
        processGameAndNewsTemplateVersions(context);
    }

    private void processGameAndNewsTemplateVersions(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.gameTemplateVersion = bundle.getString(GAME_VERSION_KEY);
                this.newsTemplateVersion = applicationInfo.metaData.getString(NEWS_VERSION_KEY);
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getRequestAgent() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        if (this.newsTemplateVersion != null) {
            sb2.append("_");
            sb2.append(Constants.REQUEST_AGENT_NEWS_TEMPLATE_PREFIX);
            sb2.append("-");
            sb2.append(this.newsTemplateVersion);
        }
        if (this.gameTemplateVersion != null) {
            sb2.append("_");
            sb2.append(Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX);
            sb2.append("-");
            sb2.append(this.gameTemplateVersion);
        }
        return sb2.toString();
    }
}
