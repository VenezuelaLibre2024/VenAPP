package kotlin.coroutines.jvm.internal;

import gk.Continuation;

/* loaded from: classes3.dex */
public final class c implements Continuation<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20733a = new c();

    private c() {
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // gk.Continuation
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
