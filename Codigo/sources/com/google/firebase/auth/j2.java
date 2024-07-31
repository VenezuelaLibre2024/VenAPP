package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j2 implements OnCompleteListener<oc.g1> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p0 f11718a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11719b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f11720c = firebaseAuth;
        this.f11718a = p0Var;
        this.f11719b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<oc.g1> task) {
        String a10;
        String str;
        if (task.isSuccessful()) {
            String c10 = task.getResult().c();
            a10 = task.getResult().a();
            str = c10;
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && oc.d0.f(exception)) {
                FirebaseAuth.j0((zb.m) exception, this.f11718a, this.f11719b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                a10 = null;
            }
        }
        this.f11720c.h0(this.f11718a, str, a10);
    }
}
