package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import androidx.annotation.Keep;
import c9.a;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z10) {
        this.mId = str;
        this.mLimitAdTracking = z10;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            a.C0117a a10 = a.a(context);
            if (a10 != null) {
                return new AdvertisingId(a10.a(), a10.b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
