package com.google.android.gms.internal.p497authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzv extends AbstractC5105e<C5101a.d.c> {
    private static final C5101a.g<zzw> zza;
    private static final C5101a.a<zzw, C5101a.d.c> zzb;
    private static final C5101a<C5101a.d.c> zzc;

    static {
        C5101a.g<zzw> gVar = new C5101a.g<>();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new C5101a<>("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public zzv(Context context) {
        super(context, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC5188w.m13190a().m13198d(zzac.zzb).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        }).m13199e(1566).m13195a());
    }
}
