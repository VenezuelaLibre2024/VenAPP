package p302q3;

import p129h3.C7623g;

/* renamed from: q3.k */
/* loaded from: classes.dex */
public abstract class AbstractC10245k {

    /* renamed from: a */
    public static final AbstractC10245k f25414a = new a();

    /* renamed from: b */
    public static final AbstractC10245k f25415b = new b();

    /* renamed from: c */
    public static final AbstractC10245k f25416c = new e();

    /* renamed from: d */
    public static final AbstractC10245k f25417d = new c();

    /* renamed from: e */
    public static final AbstractC10245k f25418e;

    /* renamed from: f */
    public static final AbstractC10245k f25419f;

    /* renamed from: g */
    public static final AbstractC10245k f25420g;

    /* renamed from: h */
    public static final C7623g<AbstractC10245k> f25421h;

    /* renamed from: i */
    static final boolean f25422i;

    /* renamed from: q3.k$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC10245k {
        a() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: q3.k$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC10245k {
        b() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* renamed from: q3.k$c */
    /* loaded from: classes.dex */
    private static class c extends AbstractC10245k {
        c() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return mo30658b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : AbstractC10245k.f25416c.mo30657a(i10, i11, i12, i13);
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, AbstractC10245k.f25416c.mo30658b(i10, i11, i12, i13));
        }
    }

    /* renamed from: q3.k$d */
    /* loaded from: classes.dex */
    private static class d extends AbstractC10245k {
        d() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* renamed from: q3.k$e */
    /* loaded from: classes.dex */
    private static class e extends AbstractC10245k {
        e() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return AbstractC10245k.f25422i ? g.QUALITY : g.MEMORY;
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            if (AbstractC10245k.f25422i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: q3.k$f */
    /* loaded from: classes.dex */
    private static class f extends AbstractC10245k {
        f() {
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: a */
        public g mo30657a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p302q3.AbstractC10245k
        /* renamed from: b */
        public float mo30658b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* renamed from: q3.k$g */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f25418e = dVar;
        f25419f = new f();
        f25420g = dVar;
        f25421h = C7623g.m23142f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f25422i = true;
    }

    /* renamed from: a */
    public abstract g mo30657a(int i10, int i11, int i12, int i13);

    /* renamed from: b */
    public abstract float mo30658b(int i10, int i11, int i12, int i13);
}
