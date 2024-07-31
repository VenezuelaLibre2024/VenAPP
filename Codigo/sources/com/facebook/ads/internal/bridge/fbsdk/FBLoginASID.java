package com.facebook.ads.internal.bridge.fbsdk;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import i4.a;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class FBLoginASID {
    public static String getFBLoginASID() {
        try {
            a.c cVar = a.f16899w;
            Object invoke = a.class.getDeclaredMethod("getCurrentAccessToken", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                return (String) a.class.getDeclaredMethod("getUserId", new Class[0]).invoke(invoke, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
