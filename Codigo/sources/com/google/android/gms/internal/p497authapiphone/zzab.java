package com.google.android.gms.internal.p497authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p417w9.AbstractC12091b;

/* loaded from: classes2.dex */
public final class zzab extends AbstractC12091b {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    @Override // p417w9.AbstractC12091b
    public final Task<Void> startSmsRetriever() {
        return doWrite(AbstractC5188w.m13190a().m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        }).m13198d(zzac.zzc).m13199e(1567).m13195a());
    }

    @Override // p417w9.AbstractC12091b
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(AbstractC5188w.m13190a().m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzabVar, (TaskCompletionSource) obj2));
            }
        }).m13198d(zzac.zzd).m13199e(1568).m13195a());
    }
}
