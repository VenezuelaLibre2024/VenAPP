package p361t6;

import android.os.Bundle;
import p082eb.C7155k;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.x1 */
/* loaded from: classes.dex */
public final class C11123x1 extends AbstractC11085p3 {

    /* renamed from: e */
    private static final String f28879e = C11172r0.m34945r0(1);

    /* renamed from: f */
    private static final String f28880f = C11172r0.m34945r0(2);

    /* renamed from: r */
    public static final InterfaceC11076o.a<C11123x1> f28881r = new InterfaceC11076o.a() { // from class: t6.w1
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11123x1 m34574e;
            m34574e = C11123x1.m34574e(bundle);
            return m34574e;
        }
    };

    /* renamed from: c */
    private final boolean f28882c;

    /* renamed from: d */
    private final boolean f28883d;

    public C11123x1() {
        this.f28882c = false;
        this.f28883d = false;
    }

    public C11123x1(boolean z10) {
        this.f28882c = true;
        this.f28883d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C11123x1 m34574e(Bundle bundle) {
        C11137a.m34599a(bundle.getInt(AbstractC11085p3.f28581a, -1) == 0);
        return bundle.getBoolean(f28879e, false) ? new C11123x1(bundle.getBoolean(f28880f, false)) : new C11123x1();
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC11085p3.f28581a, 0);
        bundle.putBoolean(f28879e, this.f28882c);
        bundle.putBoolean(f28880f, this.f28883d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11123x1)) {
            return false;
        }
        C11123x1 c11123x1 = (C11123x1) obj;
        return this.f28883d == c11123x1.f28883d && this.f28882c == c11123x1.f28882c;
    }

    public int hashCode() {
        return C7155k.m21290b(Boolean.valueOf(this.f28882c), Boolean.valueOf(this.f28883d));
    }
}
