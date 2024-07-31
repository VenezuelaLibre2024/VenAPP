package f2;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f14891a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0236b f14892b;

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f14893a;

            public a(Throwable th2) {
                this.f14893a = th2;
            }

            public Throwable a() {
                return this.f14893a;
            }

            public String toString() {
                return "FAILURE (" + this.f14893a.getMessage() + ")";
            }
        }

        /* renamed from: f2.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0236b extends b {
            private C0236b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f14891a = new b.c();
        f14892b = new b.C0236b();
    }

    com.google.common.util.concurrent.f<b.c> getResult();
}
