package io.flutter.plugins.googlemobileads;

import android.content.Context;
import x8.k;
import y8.b;

/* loaded from: classes3.dex */
public class BannerAdCreator {
    private final Context context;

    public BannerAdCreator(Context context) {
        this.context = context;
    }

    public b createAdManagerAdView() {
        return new b(this.context);
    }

    public k createAdView() {
        return new k(this.context);
    }
}
