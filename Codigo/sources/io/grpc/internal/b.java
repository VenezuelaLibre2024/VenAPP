package io.grpc.internal;

import vi.t0;

/* loaded from: classes3.dex */
public abstract class b<T extends vi.t0<T>> extends vi.t0<T> {

    /* renamed from: a, reason: collision with root package name */
    protected int f18562a = 4194304;

    @Override // vi.t0
    public vi.s0 a() {
        return c().a();
    }

    protected abstract vi.t0<?> c();

    public String toString() {
        return eb.i.c(this).d("delegate", c()).toString();
    }
}
