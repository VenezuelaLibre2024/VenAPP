package io.grpc.internal;

import java.util.Map;
import p082eb.C7159o;
import vi.AbstractC11957y0;
import vi.C11915g1;

/* renamed from: io.grpc.internal.a2 */
/* loaded from: classes3.dex */
public final class C8828a2 extends AbstractC11957y0.h {

    /* renamed from: a */
    private final boolean f20252a;

    /* renamed from: b */
    private final int f20253b;

    /* renamed from: c */
    private final int f20254c;

    /* renamed from: d */
    private final C8861j f20255d;

    public C8828a2(boolean z10, int i10, int i11, C8861j c8861j) {
        this.f20252a = z10;
        this.f20253b = i10;
        this.f20254c = i11;
        this.f20255d = (C8861j) C7159o.m21313p(c8861j, "autoLoadBalancerFactory");
    }

    @Override // vi.AbstractC11957y0.h
    /* renamed from: a */
    public AbstractC11957y0.c mo25273a(Map<String, ?> map) {
        Object m38373c;
        try {
            AbstractC11957y0.c m25619f = this.f20255d.m25619f(map);
            if (m25619f == null) {
                m38373c = null;
            } else {
                if (m25619f.m38374d() != null) {
                    return AbstractC11957y0.c.m38372b(m25619f.m38374d());
                }
                m38373c = m25619f.m38373c();
            }
            return AbstractC11957y0.c.m38371a(C8859i1.m25606b(map, this.f20252a, this.f20253b, this.f20254c, m38373c));
        } catch (RuntimeException e10) {
            return AbstractC11957y0.c.m38372b(C11915g1.f31536h.m38147r("failed to parse service config").m38146q(e10));
        }
    }
}
