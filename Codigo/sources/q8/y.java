package q8;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.a;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import t6.o;
import t8.r0;
import v7.d1;

/* loaded from: classes.dex */
public class y implements t6.o {
    public static final y L;

    @Deprecated
    public static final y M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final String f23735a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final String f23736b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final String f23737c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final String f23738d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final String f23739e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final String f23740f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final String f23741g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final String f23742h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final String f23743i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final String f23744j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final String f23745k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f23746l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final String f23747m0;

    /* renamed from: n0, reason: collision with root package name */
    @Deprecated
    public static final o.a<y> f23748n0;
    public final int A;
    public final int B;
    public final com.google.common.collect.w<String> C;
    public final com.google.common.collect.w<String> D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final com.google.common.collect.y<d1, w> J;
    public final com.google.common.collect.a0<Integer> K;

    /* renamed from: a, reason: collision with root package name */
    public final int f23749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23752d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23753e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23754f;

    /* renamed from: r, reason: collision with root package name */
    public final int f23755r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23756s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23757t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23758u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f23759v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.common.collect.w<String> f23760w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23761x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.common.collect.w<String> f23762y;

    /* renamed from: z, reason: collision with root package name */
    public final int f23763z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f23764a;

        /* renamed from: b, reason: collision with root package name */
        private int f23765b;

        /* renamed from: c, reason: collision with root package name */
        private int f23766c;

        /* renamed from: d, reason: collision with root package name */
        private int f23767d;

        /* renamed from: e, reason: collision with root package name */
        private int f23768e;

        /* renamed from: f, reason: collision with root package name */
        private int f23769f;

        /* renamed from: g, reason: collision with root package name */
        private int f23770g;

        /* renamed from: h, reason: collision with root package name */
        private int f23771h;

        /* renamed from: i, reason: collision with root package name */
        private int f23772i;

        /* renamed from: j, reason: collision with root package name */
        private int f23773j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f23774k;

        /* renamed from: l, reason: collision with root package name */
        private com.google.common.collect.w<String> f23775l;

        /* renamed from: m, reason: collision with root package name */
        private int f23776m;

        /* renamed from: n, reason: collision with root package name */
        private com.google.common.collect.w<String> f23777n;

        /* renamed from: o, reason: collision with root package name */
        private int f23778o;

        /* renamed from: p, reason: collision with root package name */
        private int f23779p;

        /* renamed from: q, reason: collision with root package name */
        private int f23780q;

        /* renamed from: r, reason: collision with root package name */
        private com.google.common.collect.w<String> f23781r;

        /* renamed from: s, reason: collision with root package name */
        private com.google.common.collect.w<String> f23782s;

        /* renamed from: t, reason: collision with root package name */
        private int f23783t;

        /* renamed from: u, reason: collision with root package name */
        private int f23784u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f23785v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f23786w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f23787x;

        /* renamed from: y, reason: collision with root package name */
        private HashMap<d1, w> f23788y;

        /* renamed from: z, reason: collision with root package name */
        private HashSet<Integer> f23789z;

        @Deprecated
        public a() {
            this.f23764a = a.e.API_PRIORITY_OTHER;
            this.f23765b = a.e.API_PRIORITY_OTHER;
            this.f23766c = a.e.API_PRIORITY_OTHER;
            this.f23767d = a.e.API_PRIORITY_OTHER;
            this.f23772i = a.e.API_PRIORITY_OTHER;
            this.f23773j = a.e.API_PRIORITY_OTHER;
            this.f23774k = true;
            this.f23775l = com.google.common.collect.w.v();
            this.f23776m = 0;
            this.f23777n = com.google.common.collect.w.v();
            this.f23778o = 0;
            this.f23779p = a.e.API_PRIORITY_OTHER;
            this.f23780q = a.e.API_PRIORITY_OTHER;
            this.f23781r = com.google.common.collect.w.v();
            this.f23782s = com.google.common.collect.w.v();
            this.f23783t = 0;
            this.f23784u = 0;
            this.f23785v = false;
            this.f23786w = false;
            this.f23787x = false;
            this.f23788y = new HashMap<>();
            this.f23789z = new HashSet<>();
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Bundle bundle) {
            String str = y.S;
            y yVar = y.L;
            this.f23764a = bundle.getInt(str, yVar.f23749a);
            this.f23765b = bundle.getInt(y.T, yVar.f23750b);
            this.f23766c = bundle.getInt(y.U, yVar.f23751c);
            this.f23767d = bundle.getInt(y.V, yVar.f23752d);
            this.f23768e = bundle.getInt(y.W, yVar.f23753e);
            this.f23769f = bundle.getInt(y.X, yVar.f23754f);
            this.f23770g = bundle.getInt(y.Y, yVar.f23755r);
            this.f23771h = bundle.getInt(y.Z, yVar.f23756s);
            this.f23772i = bundle.getInt(y.f23735a0, yVar.f23757t);
            this.f23773j = bundle.getInt(y.f23736b0, yVar.f23758u);
            this.f23774k = bundle.getBoolean(y.f23737c0, yVar.f23759v);
            this.f23775l = com.google.common.collect.w.s((String[]) eb.i.a(bundle.getStringArray(y.f23738d0), new String[0]));
            this.f23776m = bundle.getInt(y.f23746l0, yVar.f23761x);
            this.f23777n = C((String[]) eb.i.a(bundle.getStringArray(y.N), new String[0]));
            this.f23778o = bundle.getInt(y.O, yVar.f23763z);
            this.f23779p = bundle.getInt(y.f23739e0, yVar.A);
            this.f23780q = bundle.getInt(y.f23740f0, yVar.B);
            this.f23781r = com.google.common.collect.w.s((String[]) eb.i.a(bundle.getStringArray(y.f23741g0), new String[0]));
            this.f23782s = C((String[]) eb.i.a(bundle.getStringArray(y.P), new String[0]));
            this.f23783t = bundle.getInt(y.Q, yVar.E);
            this.f23784u = bundle.getInt(y.f23747m0, yVar.F);
            this.f23785v = bundle.getBoolean(y.R, yVar.G);
            this.f23786w = bundle.getBoolean(y.f23742h0, yVar.H);
            this.f23787x = bundle.getBoolean(y.f23743i0, yVar.I);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.f23744j0);
            com.google.common.collect.w v10 = parcelableArrayList == null ? com.google.common.collect.w.v() : t8.c.b(w.f23732e, parcelableArrayList);
            this.f23788y = new HashMap<>();
            for (int i10 = 0; i10 < v10.size(); i10++) {
                w wVar = (w) v10.get(i10);
                this.f23788y.put(wVar.f23733a, wVar);
            }
            int[] iArr = (int[]) eb.i.a(bundle.getIntArray(y.f23745k0), new int[0]);
            this.f23789z = new HashSet<>();
            for (int i11 : iArr) {
                this.f23789z.add(Integer.valueOf(i11));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(y yVar) {
            B(yVar);
        }

        private void B(y yVar) {
            this.f23764a = yVar.f23749a;
            this.f23765b = yVar.f23750b;
            this.f23766c = yVar.f23751c;
            this.f23767d = yVar.f23752d;
            this.f23768e = yVar.f23753e;
            this.f23769f = yVar.f23754f;
            this.f23770g = yVar.f23755r;
            this.f23771h = yVar.f23756s;
            this.f23772i = yVar.f23757t;
            this.f23773j = yVar.f23758u;
            this.f23774k = yVar.f23759v;
            this.f23775l = yVar.f23760w;
            this.f23776m = yVar.f23761x;
            this.f23777n = yVar.f23762y;
            this.f23778o = yVar.f23763z;
            this.f23779p = yVar.A;
            this.f23780q = yVar.B;
            this.f23781r = yVar.C;
            this.f23782s = yVar.D;
            this.f23783t = yVar.E;
            this.f23784u = yVar.F;
            this.f23785v = yVar.G;
            this.f23786w = yVar.H;
            this.f23787x = yVar.I;
            this.f23789z = new HashSet<>(yVar.K);
            this.f23788y = new HashMap<>(yVar.J);
        }

        private static com.google.common.collect.w<String> C(String[] strArr) {
            w.a p10 = com.google.common.collect.w.p();
            for (String str : (String[]) t8.a.e(strArr)) {
                p10.a(r0.E0((String) t8.a.e(str)));
            }
            return p10.k();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((r0.f26744a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f23783t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f23782s = com.google.common.collect.w.w(r0.Y(locale));
                }
            }
        }

        public y A() {
            return new y(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a D(y yVar) {
            B(yVar);
            return this;
        }

        public a E(Context context) {
            if (r0.f26744a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f23772i = i10;
            this.f23773j = i11;
            this.f23774k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O = r0.O(context);
            return G(O.x, O.y, z10);
        }
    }

    static {
        y A = new a().A();
        L = A;
        M = A;
        N = r0.r0(1);
        O = r0.r0(2);
        P = r0.r0(3);
        Q = r0.r0(4);
        R = r0.r0(5);
        S = r0.r0(6);
        T = r0.r0(7);
        U = r0.r0(8);
        V = r0.r0(9);
        W = r0.r0(10);
        X = r0.r0(11);
        Y = r0.r0(12);
        Z = r0.r0(13);
        f23735a0 = r0.r0(14);
        f23736b0 = r0.r0(15);
        f23737c0 = r0.r0(16);
        f23738d0 = r0.r0(17);
        f23739e0 = r0.r0(18);
        f23740f0 = r0.r0(19);
        f23741g0 = r0.r0(20);
        f23742h0 = r0.r0(21);
        f23743i0 = r0.r0(22);
        f23744j0 = r0.r0(23);
        f23745k0 = r0.r0(24);
        f23746l0 = r0.r0(25);
        f23747m0 = r0.r0(26);
        f23748n0 = new o.a() { // from class: q8.x
            @Override // t6.o.a
            public final t6.o a(Bundle bundle) {
                return y.B(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y(a aVar) {
        this.f23749a = aVar.f23764a;
        this.f23750b = aVar.f23765b;
        this.f23751c = aVar.f23766c;
        this.f23752d = aVar.f23767d;
        this.f23753e = aVar.f23768e;
        this.f23754f = aVar.f23769f;
        this.f23755r = aVar.f23770g;
        this.f23756s = aVar.f23771h;
        this.f23757t = aVar.f23772i;
        this.f23758u = aVar.f23773j;
        this.f23759v = aVar.f23774k;
        this.f23760w = aVar.f23775l;
        this.f23761x = aVar.f23776m;
        this.f23762y = aVar.f23777n;
        this.f23763z = aVar.f23778o;
        this.A = aVar.f23779p;
        this.B = aVar.f23780q;
        this.C = aVar.f23781r;
        this.D = aVar.f23782s;
        this.E = aVar.f23783t;
        this.F = aVar.f23784u;
        this.G = aVar.f23785v;
        this.H = aVar.f23786w;
        this.I = aVar.f23787x;
        this.J = com.google.common.collect.y.c(aVar.f23788y);
        this.K = com.google.common.collect.a0.r(aVar.f23789z);
    }

    public static y B(Bundle bundle) {
        return new a(bundle).A();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(S, this.f23749a);
        bundle.putInt(T, this.f23750b);
        bundle.putInt(U, this.f23751c);
        bundle.putInt(V, this.f23752d);
        bundle.putInt(W, this.f23753e);
        bundle.putInt(X, this.f23754f);
        bundle.putInt(Y, this.f23755r);
        bundle.putInt(Z, this.f23756s);
        bundle.putInt(f23735a0, this.f23757t);
        bundle.putInt(f23736b0, this.f23758u);
        bundle.putBoolean(f23737c0, this.f23759v);
        bundle.putStringArray(f23738d0, (String[]) this.f23760w.toArray(new String[0]));
        bundle.putInt(f23746l0, this.f23761x);
        bundle.putStringArray(N, (String[]) this.f23762y.toArray(new String[0]));
        bundle.putInt(O, this.f23763z);
        bundle.putInt(f23739e0, this.A);
        bundle.putInt(f23740f0, this.B);
        bundle.putStringArray(f23741g0, (String[]) this.C.toArray(new String[0]));
        bundle.putStringArray(P, (String[]) this.D.toArray(new String[0]));
        bundle.putInt(Q, this.E);
        bundle.putInt(f23747m0, this.F);
        bundle.putBoolean(R, this.G);
        bundle.putBoolean(f23742h0, this.H);
        bundle.putBoolean(f23743i0, this.I);
        bundle.putParcelableArrayList(f23744j0, t8.c.d(this.J.values()));
        bundle.putIntArray(f23745k0, hb.e.l(this.K));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f23749a == yVar.f23749a && this.f23750b == yVar.f23750b && this.f23751c == yVar.f23751c && this.f23752d == yVar.f23752d && this.f23753e == yVar.f23753e && this.f23754f == yVar.f23754f && this.f23755r == yVar.f23755r && this.f23756s == yVar.f23756s && this.f23759v == yVar.f23759v && this.f23757t == yVar.f23757t && this.f23758u == yVar.f23758u && this.f23760w.equals(yVar.f23760w) && this.f23761x == yVar.f23761x && this.f23762y.equals(yVar.f23762y) && this.f23763z == yVar.f23763z && this.A == yVar.A && this.B == yVar.B && this.C.equals(yVar.C) && this.D.equals(yVar.D) && this.E == yVar.E && this.F == yVar.F && this.G == yVar.G && this.H == yVar.H && this.I == yVar.I && this.J.equals(yVar.J) && this.K.equals(yVar.K);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f23749a + 31) * 31) + this.f23750b) * 31) + this.f23751c) * 31) + this.f23752d) * 31) + this.f23753e) * 31) + this.f23754f) * 31) + this.f23755r) * 31) + this.f23756s) * 31) + (this.f23759v ? 1 : 0)) * 31) + this.f23757t) * 31) + this.f23758u) * 31) + this.f23760w.hashCode()) * 31) + this.f23761x) * 31) + this.f23762y.hashCode()) * 31) + this.f23763z) * 31) + this.A) * 31) + this.B) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E) * 31) + this.F) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.J.hashCode()) * 31) + this.K.hashCode();
    }
}
