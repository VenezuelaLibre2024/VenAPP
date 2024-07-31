package p361t6;

import android.os.Bundle;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p082eb.C7153i;
import p137hb.C7686a;
import p361t6.C11048i4;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11141c;
import p363t8.C11172r0;
import p397v7.C11694d1;

/* renamed from: t6.i4 */
/* loaded from: classes.dex */
public final class C11048i4 implements InterfaceC11076o {

    /* renamed from: b */
    public static final C11048i4 f28431b = new C11048i4(AbstractC5907w.m15081v());

    /* renamed from: c */
    private static final String f28432c = C11172r0.m34945r0(0);

    /* renamed from: d */
    public static final InterfaceC11076o.a<C11048i4> f28433d = new InterfaceC11076o.a() { // from class: t6.g4
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11048i4 m34164e;
            m34164e = C11048i4.m34164e(bundle);
            return m34164e;
        }
    };

    /* renamed from: a */
    private final AbstractC5907w<a> f28434a;

    /* renamed from: t6.i4$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC11076o {

        /* renamed from: f */
        private static final String f28435f = C11172r0.m34945r0(0);

        /* renamed from: r */
        private static final String f28436r = C11172r0.m34945r0(1);

        /* renamed from: s */
        private static final String f28437s = C11172r0.m34945r0(3);

        /* renamed from: t */
        private static final String f28438t = C11172r0.m34945r0(4);

        /* renamed from: u */
        public static final InterfaceC11076o.a<a> f28439u = new InterfaceC11076o.a() { // from class: t6.h4
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C11048i4.a m34168g;
                m34168g = C11048i4.a.m34168g(bundle);
                return m34168g;
            }
        };

        /* renamed from: a */
        public final int f28440a;

        /* renamed from: b */
        private final C11694d1 f28441b;

        /* renamed from: c */
        private final boolean f28442c;

        /* renamed from: d */
        private final int[] f28443d;

        /* renamed from: e */
        private final boolean[] f28444e;

        public a(C11694d1 c11694d1, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = c11694d1.f30658a;
            this.f28440a = i10;
            boolean z11 = false;
            C11137a.m34599a(i10 == iArr.length && i10 == zArr.length);
            this.f28441b = c11694d1;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f28442c = z11;
            this.f28443d = (int[]) iArr.clone();
            this.f28444e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ a m34168g(Bundle bundle) {
            C11694d1 mo22759a = C11694d1.f30657s.mo22759a((Bundle) C11137a.m34603e(bundle.getBundle(f28435f)));
            return new a(mo22759a, bundle.getBoolean(f28438t, false), (int[]) C7153i.m21272a(bundle.getIntArray(f28436r), new int[mo22759a.f30658a]), (boolean[]) C7153i.m21272a(bundle.getBooleanArray(f28437s), new boolean[mo22759a.f30658a]));
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f28435f, this.f28441b.mo22762a());
            bundle.putIntArray(f28436r, this.f28443d);
            bundle.putBooleanArray(f28437s, this.f28444e);
            bundle.putBoolean(f28438t, this.f28442c);
            return bundle;
        }

        /* renamed from: c */
        public C11108u1 m34169c(int i10) {
            return this.f28441b.m36849d(i10);
        }

        /* renamed from: d */
        public int m34170d() {
            return this.f28441b.f30660c;
        }

        /* renamed from: e */
        public boolean m34171e() {
            return C7686a.m23405b(this.f28444e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28442c == aVar.f28442c && this.f28441b.equals(aVar.f28441b) && Arrays.equals(this.f28443d, aVar.f28443d) && Arrays.equals(this.f28444e, aVar.f28444e);
        }

        /* renamed from: f */
        public boolean m34172f(int i10) {
            return this.f28444e[i10];
        }

        public int hashCode() {
            return (((((this.f28441b.hashCode() * 31) + (this.f28442c ? 1 : 0)) * 31) + Arrays.hashCode(this.f28443d)) * 31) + Arrays.hashCode(this.f28444e);
        }
    }

    public C11048i4(List<a> list) {
        this.f28434a = AbstractC5907w.m15079r(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C11048i4 m34164e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f28432c);
        return new C11048i4(parcelableArrayList == null ? AbstractC5907w.m15081v() : C11141c.m34616b(a.f28439u, parcelableArrayList));
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f28432c, C11141c.m34618d(this.f28434a));
        return bundle;
    }

    /* renamed from: c */
    public AbstractC5907w<a> m34165c() {
        return this.f28434a;
    }

    /* renamed from: d */
    public boolean m34166d(int i10) {
        for (int i11 = 0; i11 < this.f28434a.size(); i11++) {
            a aVar = this.f28434a.get(i11);
            if (aVar.m34171e() && aVar.m34170d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11048i4.class != obj.getClass()) {
            return false;
        }
        return this.f28434a.equals(((C11048i4) obj).f28434a);
    }

    public int hashCode() {
        return this.f28434a.hashCode();
    }
}
