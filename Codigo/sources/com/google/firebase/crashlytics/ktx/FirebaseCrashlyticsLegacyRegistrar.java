package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dk.q;
import java.util.List;
import pc.c;
import ye.h;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCrashlyticsLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> e10;
        e10 = q.e(h.b("fire-cls-ktx", "18.6.0"));
        return e10;
    }
}
