package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f11992a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f11992a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(he.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f11992a.trySetResult(dVar.d());
        return true;
    }
}
