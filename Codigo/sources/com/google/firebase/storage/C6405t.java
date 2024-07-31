package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6405t implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13977a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f13977a.setException(exc);
    }
}
