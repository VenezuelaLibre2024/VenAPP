package p378u8;

import android.os.Bundle;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: u8.a0 */
/* loaded from: classes.dex */
public final class C11448a0 implements InterfaceC11076o {

    /* renamed from: e */
    public static final C11448a0 f29643e = new C11448a0(0, 0);

    /* renamed from: f */
    private static final String f29644f = C11172r0.m34945r0(0);

    /* renamed from: r */
    private static final String f29645r = C11172r0.m34945r0(1);

    /* renamed from: s */
    private static final String f29646s = C11172r0.m34945r0(2);

    /* renamed from: t */
    private static final String f29647t = C11172r0.m34945r0(3);

    /* renamed from: u */
    public static final InterfaceC11076o.a<C11448a0> f29648u = new InterfaceC11076o.a() { // from class: u8.z
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11448a0 m35771c;
            m35771c = C11448a0.m35771c(bundle);
            return m35771c;
        }
    };

    /* renamed from: a */
    public final int f29649a;

    /* renamed from: b */
    public final int f29650b;

    /* renamed from: c */
    public final int f29651c;

    /* renamed from: d */
    public final float f29652d;

    public C11448a0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public C11448a0(int i10, int i11, int i12, float f10) {
        this.f29649a = i10;
        this.f29650b = i11;
        this.f29651c = i12;
        this.f29652d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ C11448a0 m35771c(Bundle bundle) {
        return new C11448a0(bundle.getInt(f29644f, 0), bundle.getInt(f29645r, 0), bundle.getInt(f29646s, 0), bundle.getFloat(f29647t, 1.0f));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f29644f, this.f29649a);
        bundle.putInt(f29645r, this.f29650b);
        bundle.putInt(f29646s, this.f29651c);
        bundle.putFloat(f29647t, this.f29652d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11448a0)) {
            return false;
        }
        C11448a0 c11448a0 = (C11448a0) obj;
        return this.f29649a == c11448a0.f29649a && this.f29650b == c11448a0.f29650b && this.f29651c == c11448a0.f29651c && this.f29652d == c11448a0.f29652d;
    }

    public int hashCode() {
        return ((((((217 + this.f29649a) * 31) + this.f29650b) * 31) + this.f29651c) * 31) + Float.floatToRawIntBits(this.f29652d);
    }
}
