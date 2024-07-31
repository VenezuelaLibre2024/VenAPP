package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import ga.C7533a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzadw implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadw(zzadu zzaduVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C7533a c7533a;
        c7533a = zzadu.zza;
        c7533a.m22871c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
