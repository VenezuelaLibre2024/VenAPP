package p094f2;

import com.google.common.util.concurrent.InterfaceFutureC5920f;

/* renamed from: f2.m */
/* loaded from: classes.dex */
public interface InterfaceC7280m {

    /* renamed from: a */
    public static final b.c f16314a;

    /* renamed from: b */
    public static final b.C13206b f16315b;

    /* renamed from: f2.m$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: f2.m$b$a */
        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final Throwable f16316a;

            public a(Throwable th2) {
                this.f16316a = th2;
            }

            /* renamed from: a */
            public Throwable m21786a() {
                return this.f16316a;
            }

            public String toString() {
                return "FAILURE (" + this.f16316a.getMessage() + ")";
            }
        }

        /* renamed from: f2.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13206b extends b {
            private C13206b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: f2.m$b$c */
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
        f16314a = new b.c();
        f16315b = new b.C13206b();
    }

    InterfaceFutureC5920f<b.c> getResult();
}
