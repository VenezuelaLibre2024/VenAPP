package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.k1 */
/* loaded from: classes.dex */
public final class C5008k1 {
    @Deprecated
    /* renamed from: a */
    public static Object m12698a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            zzcec.zzh("Unexpected exception.", th2);
            zzbxw.zza(context).zzg(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
