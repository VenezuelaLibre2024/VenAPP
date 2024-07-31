package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class zzfim {
    static Task zza;
    public static q9.b zzb;
    private static final Object zzc = new Object();

    public static Task zza(Context context) {
        Task task;
        zzb(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }

    public static void zzb(Context context, boolean z10) {
        synchronized (zzc) {
            if (zzb == null) {
                zzb = q9.a.a(context);
            }
            Task task = zza;
            if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z10 && zza.isComplete()))) {
                zza = ((q9.b) s.k(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
            }
        }
    }
}
