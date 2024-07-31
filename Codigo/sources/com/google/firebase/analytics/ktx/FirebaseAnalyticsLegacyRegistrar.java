package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import dk.q;
import java.util.List;
import pc.c;
import ye.h;

/* loaded from: classes.dex */
public final class FirebaseAnalyticsLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<c<?>> getComponents() {
        List<c<?>> e10;
        e10 = q.e(h.b("fire-analytics-ktx", "21.5.0"));
        return e10;
    }
}
