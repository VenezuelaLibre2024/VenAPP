package kotlin.coroutines.jvm.internal;

import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: kotlin.coroutines.jvm.internal.c */
/* loaded from: classes3.dex */
public final class C9297c implements Continuation<Object> {

    /* renamed from: a */
    public static final C9297c f22555a = new C9297c();

    private C9297c() {
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p124gk.Continuation
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
