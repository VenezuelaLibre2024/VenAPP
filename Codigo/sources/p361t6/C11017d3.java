package p361t6;

import android.os.Bundle;
import p082eb.C7155k;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.d3 */
/* loaded from: classes.dex */
public final class C11017d3 extends AbstractC11085p3 {

    /* renamed from: d */
    private static final String f28211d = C11172r0.m34945r0(1);

    /* renamed from: e */
    public static final InterfaceC11076o.a<C11017d3> f28212e = new InterfaceC11076o.a() { // from class: t6.c3
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11017d3 m33995e;
            m33995e = C11017d3.m33995e(bundle);
            return m33995e;
        }
    };

    /* renamed from: c */
    private final float f28213c;

    public C11017d3() {
        this.f28213c = -1.0f;
    }

    public C11017d3(float f10) {
        C11137a.m34600b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f28213c = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C11017d3 m33995e(Bundle bundle) {
        C11137a.m34599a(bundle.getInt(AbstractC11085p3.f28581a, -1) == 1);
        float f10 = bundle.getFloat(f28211d, -1.0f);
        return f10 == -1.0f ? new C11017d3() : new C11017d3(f10);
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC11085p3.f28581a, 1);
        bundle.putFloat(f28211d, this.f28213c);
        return bundle;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11017d3) && this.f28213c == ((C11017d3) obj).f28213c;
    }

    public int hashCode() {
        return C7155k.m21290b(Float.valueOf(this.f28213c));
    }
}
