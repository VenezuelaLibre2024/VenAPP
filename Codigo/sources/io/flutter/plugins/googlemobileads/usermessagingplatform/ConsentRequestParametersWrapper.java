package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import cb.d;
import java.util.Objects;

/* loaded from: classes3.dex */
class ConsentRequestParametersWrapper {
    private final ConsentDebugSettingsWrapper debugSettings;
    private final Boolean tfuac;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsentRequestParametersWrapper(Boolean bool, ConsentDebugSettingsWrapper consentDebugSettingsWrapper) {
        this.tfuac = bool;
        this.debugSettings = consentDebugSettingsWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentRequestParametersWrapper)) {
            return false;
        }
        ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
        return Objects.equals(this.tfuac, consentRequestParametersWrapper.getTfuac()) && Objects.equals(this.debugSettings, consentRequestParametersWrapper.getDebugSettings());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d getAsConsentRequestParameters(Context context) {
        d.a aVar = new d.a();
        Boolean bool = this.tfuac;
        if (bool != null) {
            aVar.c(bool.booleanValue());
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = this.debugSettings;
        if (consentDebugSettingsWrapper != null) {
            aVar.b(consentDebugSettingsWrapper.getAsConsentDebugSettings(context));
        }
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsentDebugSettingsWrapper getDebugSettings() {
        return this.debugSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean getTfuac() {
        return this.tfuac;
    }

    public int hashCode() {
        return Objects.hash(this.tfuac, this.debugSettings);
    }
}
