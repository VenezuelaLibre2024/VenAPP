package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.content.Context;
import cb.a;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
class ConsentDebugSettingsWrapper {
    private final Integer debugGeography;
    private final List<String> testIdentifiers;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsentDebugSettingsWrapper(Integer num, List<String> list) {
        this.debugGeography = num;
        this.testIdentifiers = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentDebugSettingsWrapper)) {
            return false;
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
        return Objects.equals(this.debugGeography, consentDebugSettingsWrapper.getDebugGeography()) && Objects.equals(this.testIdentifiers, consentDebugSettingsWrapper.getTestIdentifiers());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cb.a getAsConsentDebugSettings(Context context) {
        a.C0118a c0118a = new a.C0118a(context);
        Integer num = this.debugGeography;
        if (num != null) {
            c0118a.c(num.intValue());
        }
        List<String> list = this.testIdentifiers;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                c0118a.a(it.next());
            }
        }
        return c0118a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getDebugGeography() {
        return this.debugGeography;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> getTestIdentifiers() {
        return this.testIdentifiers;
    }

    public int hashCode() {
        return Objects.hash(this.debugGeography, this.testIdentifiers);
    }
}
