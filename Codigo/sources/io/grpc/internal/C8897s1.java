package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11939p0;
import vi.C11901c;
import vi.C11953w0;
import vi.C11955x0;

/* renamed from: io.grpc.internal.s1 */
/* loaded from: classes3.dex */
public final class C8897s1 extends AbstractC11939p0.f {

    /* renamed from: a */
    private final C11901c f20884a;

    /* renamed from: b */
    private final C11953w0 f20885b;

    /* renamed from: c */
    private final C11955x0<?, ?> f20886c;

    public C8897s1(C11955x0<?, ?> c11955x0, C11953w0 c11953w0, C11901c c11901c) {
        this.f20886c = (C11955x0) C7159o.m21313p(c11955x0, Constants.METHOD);
        this.f20885b = (C11953w0) C7159o.m21313p(c11953w0, "headers");
        this.f20884a = (C11901c) C7159o.m21313p(c11901c, "callOptions");
    }

    @Override // vi.AbstractC11939p0.f
    /* renamed from: a */
    public C11901c mo25817a() {
        return this.f20884a;
    }

    @Override // vi.AbstractC11939p0.f
    /* renamed from: b */
    public C11953w0 mo25818b() {
        return this.f20885b;
    }

    @Override // vi.AbstractC11939p0.f
    /* renamed from: c */
    public C11955x0<?, ?> mo25819c() {
        return this.f20886c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8897s1.class != obj.getClass()) {
            return false;
        }
        C8897s1 c8897s1 = (C8897s1) obj;
        return C7155k.m21289a(this.f20884a, c8897s1.f20884a) && C7155k.m21289a(this.f20885b, c8897s1.f20885b) && C7155k.m21289a(this.f20886c, c8897s1.f20886c);
    }

    public int hashCode() {
        return C7155k.m21290b(this.f20884a, this.f20885b, this.f20886c);
    }

    public final String toString() {
        return "[method=" + this.f20886c + " headers=" + this.f20885b + " callOptions=" + this.f20884a + "]";
    }
}
