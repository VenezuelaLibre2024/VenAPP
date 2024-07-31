package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.r2 */
/* loaded from: classes.dex */
public final class C6118r2 implements Continuation<Void, Task<Void>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6118r2(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<Void> task) {
        return (!task.isSuccessful() && (task.getException() instanceof C6111q) && ((C6111q) task.getException()).m16603a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
