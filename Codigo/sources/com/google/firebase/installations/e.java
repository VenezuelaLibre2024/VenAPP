package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f11990a;

    /* renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<g> f11991b;

    public e(i iVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f11990a = iVar;
        this.f11991b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f11991b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(he.d dVar) {
        if (!dVar.k() || this.f11990a.f(dVar)) {
            return false;
        }
        this.f11991b.setResult(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
