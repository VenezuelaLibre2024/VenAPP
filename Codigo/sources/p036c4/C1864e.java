package p036c4;

import java.util.concurrent.Executor;

/* renamed from: c4.e */
/* loaded from: classes.dex */
public final class C1864e {

    /* renamed from: a */
    private static final Executor f7789a = new a();

    /* renamed from: b */
    private static final Executor f7790b = new b();

    /* renamed from: c4.e$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1871l.m9972u(runnable);
        }
    }

    /* renamed from: c4.e$b */
    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m9930a() {
        return f7790b;
    }

    /* renamed from: b */
    public static Executor m9931b() {
        return f7789a;
    }
}
