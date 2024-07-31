package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzv extends e<a.d.c> {
    private static final a.g<zzw> zza;
    private static final a.AbstractC0146a<zzw, a.d.c> zzb;
    private static final a<a.d.c> zzc;

    static {
        a.g<zzw> gVar = new a.g<>();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a<>("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, a.d.f9307l, e.a.f9309c);
    }

    public zzv(Context context) {
        super(context, zzc, a.d.f9307l, e.a.f9309c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(w.a().d(zzac.zzb).b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        }).e(1566).a());
    }
}
