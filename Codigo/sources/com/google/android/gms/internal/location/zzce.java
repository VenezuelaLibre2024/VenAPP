package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.p;
import com.google.android.gms.location.q;
import com.google.android.gms.location.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzce extends e implements u {
    public static final /* synthetic */ int zza = 0;

    public zzce(Activity activity) {
        super(activity, (a<a.d.c>) zzbp.zzb, a.d.f9307l, e.a.f9309c);
    }

    public zzce(Context context) {
        super(context, (a<a.d.c>) zzbp.zzb, a.d.f9307l, e.a.f9309c);
    }

    @Override // com.google.android.gms.location.u
    public final Task<q> checkLocationSettings(p pVar) {
        return doRead(w.a().b(new r() { // from class: com.google.android.gms.internal.location.zzcd
            public /* synthetic */ zzcd() {
            }

            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                p pVar2 = p.this;
                zzda zzdaVar = (zzda) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s.b(pVar2 != null, "locationSettingsRequest can't be null");
                ((zzo) zzdaVar.getService()).zzh(pVar2, new zzcq(taskCompletionSource), null);
            }
        }).e(2426).a());
    }
}
