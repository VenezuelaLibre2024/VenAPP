package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import s9.b;
import s9.c;

/* loaded from: classes2.dex */
public final class zzbo extends e {
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f25415a, cVar == null ? c.f25419b : cVar, e.a.f9309c);
    }

    public zzbo(Context context, c cVar) {
        super(context, b.f25415a, cVar == null ? c.f25419b : cVar, e.a.f9309c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(w.a().b(new r() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        }).e(1520).a());
    }

    public final Task<x9.c> performProxyRequest(final x9.b bVar) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                x9.b bVar2 = bVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), bVar2);
            }
        }).e(1518).a());
    }
}
