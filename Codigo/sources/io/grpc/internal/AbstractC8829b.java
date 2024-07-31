package io.grpc.internal;

import p082eb.C7153i;
import vi.AbstractC11945s0;
import vi.AbstractC11947t0;

/* renamed from: io.grpc.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8829b<T extends AbstractC11947t0<T>> extends AbstractC11947t0<T> {

    /* renamed from: a */
    protected int f20256a = 4194304;

    @Override // vi.AbstractC11947t0
    /* renamed from: a */
    public AbstractC11945s0 mo25274a() {
        return mo25275c().mo25274a();
    }

    /* renamed from: c */
    protected abstract AbstractC11947t0<?> mo25275c();

    public String toString() {
        return C7153i.m21274c(this).m21284d("delegate", mo25275c()).toString();
    }
}
