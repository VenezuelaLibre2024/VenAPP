package p361t6;

import android.os.Bundle;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.i3 */
/* loaded from: classes.dex */
public final class C11047i3 implements InterfaceC11076o {

    /* renamed from: d */
    public static final C11047i3 f28424d = new C11047i3(1.0f);

    /* renamed from: e */
    private static final String f28425e = C11172r0.m34945r0(0);

    /* renamed from: f */
    private static final String f28426f = C11172r0.m34945r0(1);

    /* renamed from: r */
    public static final InterfaceC11076o.a<C11047i3> f28427r = new InterfaceC11076o.a() { // from class: t6.h3
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11047i3 m34160d;
            m34160d = C11047i3.m34160d(bundle);
            return m34160d;
        }
    };

    /* renamed from: a */
    public final float f28428a;

    /* renamed from: b */
    public final float f28429b;

    /* renamed from: c */
    private final int f28430c;

    public C11047i3(float f10) {
        this(f10, 1.0f);
    }

    public C11047i3(float f10, float f11) {
        C11137a.m34599a(f10 > 0.0f);
        C11137a.m34599a(f11 > 0.0f);
        this.f28428a = f10;
        this.f28429b = f11;
        this.f28430c = Math.round(f10 * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C11047i3 m34160d(Bundle bundle) {
        return new C11047i3(bundle.getFloat(f28425e, 1.0f), bundle.getFloat(f28426f, 1.0f));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f28425e, this.f28428a);
        bundle.putFloat(f28426f, this.f28429b);
        return bundle;
    }

    /* renamed from: c */
    public long m34161c(long j10) {
        return j10 * this.f28430c;
    }

    /* renamed from: e */
    public C11047i3 m34162e(float f10) {
        return new C11047i3(f10, this.f28429b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11047i3.class != obj.getClass()) {
            return false;
        }
        C11047i3 c11047i3 = (C11047i3) obj;
        return this.f28428a == c11047i3.f28428a && this.f28429b == c11047i3.f28429b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f28428a)) * 31) + Float.floatToRawIntBits(this.f28429b);
    }

    public String toString() {
        return C11172r0.m34860C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f28428a), Float.valueOf(this.f28429b));
    }
}
