package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.storage.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6404s implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13976a;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f13976a.setResult(obj);
    }
}
