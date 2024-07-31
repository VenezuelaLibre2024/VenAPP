package p396v6;

import android.media.AudioAttributes;
import android.os.Bundle;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: v6.e */
/* loaded from: classes.dex */
public final class C11639e implements InterfaceC11076o {

    /* renamed from: r */
    public static final C11639e f30288r = new e().m36493a();

    /* renamed from: s */
    private static final String f30289s = C11172r0.m34945r0(0);

    /* renamed from: t */
    private static final String f30290t = C11172r0.m34945r0(1);

    /* renamed from: u */
    private static final String f30291u = C11172r0.m34945r0(2);

    /* renamed from: v */
    private static final String f30292v = C11172r0.m34945r0(3);

    /* renamed from: w */
    private static final String f30293w = C11172r0.m34945r0(4);

    /* renamed from: x */
    public static final InterfaceC11076o.a<C11639e> f30294x = new InterfaceC11076o.a() { // from class: v6.d
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11639e m36489d;
            m36489d = C11639e.m36489d(bundle);
            return m36489d;
        }
    };

    /* renamed from: a */
    public final int f30295a;

    /* renamed from: b */
    public final int f30296b;

    /* renamed from: c */
    public final int f30297c;

    /* renamed from: d */
    public final int f30298d;

    /* renamed from: e */
    public final int f30299e;

    /* renamed from: f */
    private d f30300f;

    /* renamed from: v6.e$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        public static void m36491a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: v6.e$c */
    /* loaded from: classes.dex */
    private static final class c {
        /* renamed from: a */
        public static void m36492a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: v6.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final AudioAttributes f30301a;

        private d(C11639e c11639e) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c11639e.f30295a).setFlags(c11639e.f30296b).setUsage(c11639e.f30297c);
            int i10 = C11172r0.f29040a;
            if (i10 >= 29) {
                b.m36491a(usage, c11639e.f30298d);
            }
            if (i10 >= 32) {
                c.m36492a(usage, c11639e.f30299e);
            }
            this.f30301a = usage.build();
        }
    }

    /* renamed from: v6.e$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        private int f30302a = 0;

        /* renamed from: b */
        private int f30303b = 0;

        /* renamed from: c */
        private int f30304c = 1;

        /* renamed from: d */
        private int f30305d = 1;

        /* renamed from: e */
        private int f30306e = 0;

        /* renamed from: a */
        public C11639e m36493a() {
            return new C11639e(this.f30302a, this.f30303b, this.f30304c, this.f30305d, this.f30306e);
        }

        /* renamed from: b */
        public e m36494b(int i10) {
            this.f30305d = i10;
            return this;
        }

        /* renamed from: c */
        public e m36495c(int i10) {
            this.f30302a = i10;
            return this;
        }

        /* renamed from: d */
        public e m36496d(int i10) {
            this.f30303b = i10;
            return this;
        }

        /* renamed from: e */
        public e m36497e(int i10) {
            this.f30306e = i10;
            return this;
        }

        /* renamed from: f */
        public e m36498f(int i10) {
            this.f30304c = i10;
            return this;
        }
    }

    private C11639e(int i10, int i11, int i12, int i13, int i14) {
        this.f30295a = i10;
        this.f30296b = i11;
        this.f30297c = i12;
        this.f30298d = i13;
        this.f30299e = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C11639e m36489d(Bundle bundle) {
        e eVar = new e();
        String str = f30289s;
        if (bundle.containsKey(str)) {
            eVar.m36495c(bundle.getInt(str));
        }
        String str2 = f30290t;
        if (bundle.containsKey(str2)) {
            eVar.m36496d(bundle.getInt(str2));
        }
        String str3 = f30291u;
        if (bundle.containsKey(str3)) {
            eVar.m36498f(bundle.getInt(str3));
        }
        String str4 = f30292v;
        if (bundle.containsKey(str4)) {
            eVar.m36494b(bundle.getInt(str4));
        }
        String str5 = f30293w;
        if (bundle.containsKey(str5)) {
            eVar.m36497e(bundle.getInt(str5));
        }
        return eVar.m36493a();
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f30289s, this.f30295a);
        bundle.putInt(f30290t, this.f30296b);
        bundle.putInt(f30291u, this.f30297c);
        bundle.putInt(f30292v, this.f30298d);
        bundle.putInt(f30293w, this.f30299e);
        return bundle;
    }

    /* renamed from: c */
    public d m36490c() {
        if (this.f30300f == null) {
            this.f30300f = new d();
        }
        return this.f30300f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11639e.class != obj.getClass()) {
            return false;
        }
        C11639e c11639e = (C11639e) obj;
        return this.f30295a == c11639e.f30295a && this.f30296b == c11639e.f30296b && this.f30297c == c11639e.f30297c && this.f30298d == c11639e.f30298d && this.f30299e == c11639e.f30299e;
    }

    public int hashCode() {
        return ((((((((527 + this.f30295a) * 31) + this.f30296b) * 31) + this.f30297c) * 31) + this.f30298d) * 31) + this.f30299e;
    }
}
