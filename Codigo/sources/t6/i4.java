package t6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t6.i4;
import t6.o;

/* loaded from: classes.dex */
public final class i4 implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final i4 f26207b = new i4(com.google.common.collect.w.v());

    /* renamed from: c, reason: collision with root package name */
    private static final String f26208c = t8.r0.r0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final o.a<i4> f26209d = new o.a() { // from class: t6.g4
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            i4 e10;
            e10 = i4.e(bundle);
            return e10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.w<a> f26210a;

    /* loaded from: classes.dex */
    public static final class a implements o {

        /* renamed from: f, reason: collision with root package name */
        private static final String f26211f = t8.r0.r0(0);

        /* renamed from: r, reason: collision with root package name */
        private static final String f26212r = t8.r0.r0(1);

        /* renamed from: s, reason: collision with root package name */
        private static final String f26213s = t8.r0.r0(3);

        /* renamed from: t, reason: collision with root package name */
        private static final String f26214t = t8.r0.r0(4);

        /* renamed from: u, reason: collision with root package name */
        public static final o.a<a> f26215u = new o.a() { // from class: t6.h4
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                i4.a g10;
                g10 = i4.a.g(bundle);
                return g10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f26216a;

        /* renamed from: b, reason: collision with root package name */
        private final v7.d1 f26217b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26218c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f26219d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f26220e;

        public a(v7.d1 d1Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = d1Var.f28288a;
            this.f26216a = i10;
            boolean z11 = false;
            t8.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f26217b = d1Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f26218c = z11;
            this.f26219d = (int[]) iArr.clone();
            this.f26220e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a g(Bundle bundle) {
            v7.d1 a10 = v7.d1.f28287s.a((Bundle) t8.a.e(bundle.getBundle(f26211f)));
            return new a(a10, bundle.getBoolean(f26214t, false), (int[]) eb.i.a(bundle.getIntArray(f26212r), new int[a10.f28288a]), (boolean[]) eb.i.a(bundle.getBooleanArray(f26213s), new boolean[a10.f28288a]));
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f26211f, this.f26217b.a());
            bundle.putIntArray(f26212r, this.f26219d);
            bundle.putBooleanArray(f26213s, this.f26220e);
            bundle.putBoolean(f26214t, this.f26218c);
            return bundle;
        }

        public u1 c(int i10) {
            return this.f26217b.d(i10);
        }

        public int d() {
            return this.f26217b.f28290c;
        }

        public boolean e() {
            return hb.a.b(this.f26220e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26218c == aVar.f26218c && this.f26217b.equals(aVar.f26217b) && Arrays.equals(this.f26219d, aVar.f26219d) && Arrays.equals(this.f26220e, aVar.f26220e);
        }

        public boolean f(int i10) {
            return this.f26220e[i10];
        }

        public int hashCode() {
            return (((((this.f26217b.hashCode() * 31) + (this.f26218c ? 1 : 0)) * 31) + Arrays.hashCode(this.f26219d)) * 31) + Arrays.hashCode(this.f26220e);
        }
    }

    public i4(List<a> list) {
        this.f26210a = com.google.common.collect.w.r(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i4 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f26208c);
        return new i4(parcelableArrayList == null ? com.google.common.collect.w.v() : t8.c.b(a.f26215u, parcelableArrayList));
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f26208c, t8.c.d(this.f26210a));
        return bundle;
    }

    public com.google.common.collect.w<a> c() {
        return this.f26210a;
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f26210a.size(); i11++) {
            a aVar = this.f26210a.get(i11);
            if (aVar.e() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4.class != obj.getClass()) {
            return false;
        }
        return this.f26210a.equals(((i4) obj).f26210a);
    }

    public int hashCode() {
        return this.f26210a.hashCode();
    }
}
