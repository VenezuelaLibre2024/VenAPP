package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class FlutterMediationExtras {
    Map<String, Object> extras;

    public abstract Pair<Class<Object>, Bundle> getMediationExtras();

    public void setMediationExtras(Map<String, Object> map) {
        this.extras = map;
    }
}
