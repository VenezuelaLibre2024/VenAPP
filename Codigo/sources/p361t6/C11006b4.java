package p361t6;

import android.os.Bundle;
import p082eb.C7155k;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.b4 */
/* loaded from: classes.dex */
public final class C11006b4 extends AbstractC11085p3 {

    /* renamed from: e */
    private static final String f28010e = C11172r0.m34945r0(1);

    /* renamed from: f */
    private static final String f28011f = C11172r0.m34945r0(2);

    /* renamed from: r */
    public static final InterfaceC11076o.a<C11006b4> f28012r = new InterfaceC11076o.a() { // from class: t6.a4
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11006b4 m33721e;
            m33721e = C11006b4.m33721e(bundle);
            return m33721e;
        }
    };

    /* renamed from: c */
    private final boolean f28013c;

    /* renamed from: d */
    private final boolean f28014d;

    public C11006b4() {
        this.f28013c = false;
        this.f28014d = false;
    }

    public C11006b4(boolean z10) {
        this.f28013c = true;
        this.f28014d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C11006b4 m33721e(Bundle bundle) {
        C11137a.m34599a(bundle.getInt(AbstractC11085p3.f28581a, -1) == 3);
        return bundle.getBoolean(f28010e, false) ? new C11006b4(bundle.getBoolean(f28011f, false)) : new C11006b4();
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC11085p3.f28581a, 3);
        bundle.putBoolean(f28010e, this.f28013c);
        bundle.putBoolean(f28011f, this.f28014d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11006b4)) {
            return false;
        }
        C11006b4 c11006b4 = (C11006b4) obj;
        return this.f28014d == c11006b4.f28014d && this.f28013c == c11006b4.f28013c;
    }

    public int hashCode() {
        return C7155k.m21290b(Boolean.valueOf(this.f28013c), Boolean.valueOf(this.f28014d));
    }
}
