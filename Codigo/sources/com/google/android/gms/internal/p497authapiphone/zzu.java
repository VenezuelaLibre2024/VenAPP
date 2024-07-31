package com.google.android.gms.internal.p497authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.common.api.internal.InterfaceC5139h;
import com.google.android.gms.common.internal.C5224b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzu extends InterfaceC5139h.a {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5139h
    public final void onResult(Status status) {
        if (status.m12969v1() == 6) {
            this.zza.trySetException(C5224b.m13226a(status));
        } else {
            C5191x.m13202a(status, this.zza);
        }
    }
}
