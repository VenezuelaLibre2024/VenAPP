package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import ga.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzadw implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadw(zzadu zzaduVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = zzadu.zza;
        aVar.c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
