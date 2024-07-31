package v6;

import android.media.AudioAttributes;
import android.os.Bundle;
import t6.o;

/* loaded from: classes.dex */
public final class e implements t6.o {

    /* renamed from: r, reason: collision with root package name */
    public static final e f27964r = new C0459e().a();

    /* renamed from: s, reason: collision with root package name */
    private static final String f27965s = t8.r0.r0(0);

    /* renamed from: t, reason: collision with root package name */
    private static final String f27966t = t8.r0.r0(1);

    /* renamed from: u, reason: collision with root package name */
    private static final String f27967u = t8.r0.r0(2);

    /* renamed from: v, reason: collision with root package name */
    private static final String f27968v = t8.r0.r0(3);

    /* renamed from: w, reason: collision with root package name */
    private static final String f27969w = t8.r0.r0(4);

    /* renamed from: x, reason: collision with root package name */
    public static final o.a<e> f27970x = new o.a() { // from class: v6.d
        @Override // t6.o.a
        public final t6.o a(Bundle bundle) {
            e d10;
            d10 = e.d(bundle);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f27971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27974d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27975e;

    /* renamed from: f, reason: collision with root package name */
    private d f27976f;

    /* loaded from: classes.dex */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f27977a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f27971a).setFlags(eVar.f27972b).setUsage(eVar.f27973c);
            int i10 = t8.r0.f26744a;
            if (i10 >= 29) {
                b.a(usage, eVar.f27974d);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f27975e);
            }
            this.f27977a = usage.build();
        }
    }

    /* renamed from: v6.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0459e {

        /* renamed from: a, reason: collision with root package name */
        private int f27978a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f27979b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f27980c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f27981d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f27982e = 0;

        public e a() {
            return new e(this.f27978a, this.f27979b, this.f27980c, this.f27981d, this.f27982e);
        }

        public C0459e b(int i10) {
            this.f27981d = i10;
            return this;
        }

        public C0459e c(int i10) {
            this.f27978a = i10;
            return this;
        }

        public C0459e d(int i10) {
            this.f27979b = i10;
            return this;
        }

        public C0459e e(int i10) {
            this.f27982e = i10;
            return this;
        }

        public C0459e f(int i10) {
            this.f27980c = i10;
            return this;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14) {
        this.f27971a = i10;
        this.f27972b = i11;
        this.f27973c = i12;
        this.f27974d = i13;
        this.f27975e = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e d(Bundle bundle) {
        C0459e c0459e = new C0459e();
        String str = f27965s;
        if (bundle.containsKey(str)) {
            c0459e.c(bundle.getInt(str));
        }
        String str2 = f27966t;
        if (bundle.containsKey(str2)) {
            c0459e.d(bundle.getInt(str2));
        }
        String str3 = f27967u;
        if (bundle.containsKey(str3)) {
            c0459e.f(bundle.getInt(str3));
        }
        String str4 = f27968v;
        if (bundle.containsKey(str4)) {
            c0459e.b(bundle.getInt(str4));
        }
        String str5 = f27969w;
        if (bundle.containsKey(str5)) {
            c0459e.e(bundle.getInt(str5));
        }
        return c0459e.a();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27965s, this.f27971a);
        bundle.putInt(f27966t, this.f27972b);
        bundle.putInt(f27967u, this.f27973c);
        bundle.putInt(f27968v, this.f27974d);
        bundle.putInt(f27969w, this.f27975e);
        return bundle;
    }

    public d c() {
        if (this.f27976f == null) {
            this.f27976f = new d();
        }
        return this.f27976f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f27971a == eVar.f27971a && this.f27972b == eVar.f27972b && this.f27973c == eVar.f27973c && this.f27974d == eVar.f27974d && this.f27975e == eVar.f27975e;
    }

    public int hashCode() {
        return ((((((((527 + this.f27971a) * 31) + this.f27972b) * 31) + this.f27973c) * 31) + this.f27974d) * 31) + this.f27975e;
    }
}
