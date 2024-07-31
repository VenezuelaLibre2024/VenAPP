package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.location.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbz extends e {
    public static final /* synthetic */ int zza = 0;

    public zzbz(Activity activity) {
        super(activity, (a<a.d.c>) zzbp.zzb, a.d.f9307l, e.a.f9309c);
    }

    public zzbz(Context context) {
        super(context, (a<a.d.c>) zzbp.zzb, a.d.f9307l, e.a.f9309c);
    }

    public final Task<Void> addGeofences(k kVar, final PendingIntent pendingIntent) {
        final k v12 = kVar.v1(getContextAttributionTag());
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbw
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzq(k.this, pendingIntent, (TaskCompletionSource) obj2);
            }
        }).e(2424).a());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzby
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzx(pendingIntent, (TaskCompletionSource) obj2);
            }
        }).e(2425).a());
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzy(list, (TaskCompletionSource) obj2);
            }
        }).e(2425).a());
    }
}
