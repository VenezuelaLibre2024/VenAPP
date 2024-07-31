package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import w9.b;

/* loaded from: classes2.dex */
public final class zzab extends b {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    @Override // w9.b
    public final Task<Void> startSmsRetriever() {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        }).d(zzac.zzc).e(1567).a());
    }

    @Override // w9.b
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(w.a().b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzabVar, (TaskCompletionSource) obj2));
            }
        }).d(zzac.zzd).e(1568).a());
    }
}
