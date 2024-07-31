package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final /* synthetic */ class q implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    static final Continuation f11912a = new q();

    private q() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String a10;
        a10 = ((l) task.getResult()).a();
        return a10;
    }
}
