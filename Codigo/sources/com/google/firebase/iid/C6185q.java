package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.q */
/* loaded from: classes.dex */
final /* synthetic */ class C6185q implements Continuation {

    /* renamed from: a */
    static final Continuation f13127a = new C6185q();

    private C6185q() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String mo16762a;
        mo16762a = ((InterfaceC6180l) task.getResult()).mo16762a();
        return mo16762a;
    }
}
