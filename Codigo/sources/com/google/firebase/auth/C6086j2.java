package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p272oc.AbstractC9853g1;
import p272oc.C9843d0;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.j2 */
/* loaded from: classes.dex */
public final class C6086j2 implements OnCompleteListener<AbstractC9853g1> {

    /* renamed from: a */
    private final /* synthetic */ C6108p0 f12933a;

    /* renamed from: b */
    private final /* synthetic */ String f12934b;

    /* renamed from: c */
    private final /* synthetic */ FirebaseAuth f12935c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6086j2(FirebaseAuth firebaseAuth, C6108p0 c6108p0, String str) {
        this.f12935c = firebaseAuth;
        this.f12933a = c6108p0;
        this.f12934b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<AbstractC9853g1> task) {
        String mo29536a;
        String str;
        if (task.isSuccessful()) {
            String mo29538c = task.getResult().mo29538c();
            mo29536a = task.getResult().mo29536a();
            str = mo29538c;
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null && C9843d0.m29519f(exception)) {
                FirebaseAuth.m16352j0((C12873m) exception, this.f12933a, this.f12934b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                mo29536a = null;
            }
        }
        this.f12935c.m16395h0(this.f12933a, str, mo29536a);
    }
}
