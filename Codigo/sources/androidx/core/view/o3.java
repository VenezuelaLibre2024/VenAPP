package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    private final e f3948a;

    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f3949a;

        /* renamed from: b, reason: collision with root package name */
        private final View f3950b;

        a(Window window, View view) {
            this.f3949a = window;
            this.f3950b = view;
        }

        protected void c(int i10) {
            View decorView = this.f3949a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f3949a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f3949a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f3949a.clearFlags(i10);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.o3.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.o3.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final o3 f3951a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f3952b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.collection.h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3953c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f3954d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        d(android.view.Window r2, androidx.core.view.o3 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.q3.a(r2)
                r1.<init>(r0, r3)
                r1.f3954d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.o3.d.<init>(android.view.Window, androidx.core.view.o3):void");
        }

        d(WindowInsetsController windowInsetsController, o3 o3Var) {
            this.f3953c = new androidx.collection.h<>();
            this.f3952b = windowInsetsController;
            this.f3951a = o3Var;
        }

        @Override // androidx.core.view.o3.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f3954d != null) {
                    c(16);
                }
                this.f3952b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3954d != null) {
                    d(16);
                }
                this.f3952b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.o3.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f3954d != null) {
                    c(8192);
                }
                this.f3952b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3954d != null) {
                    d(8192);
                }
                this.f3952b.setSystemBarsAppearance(0, 8);
            }
        }

        protected void c(int i10) {
            View decorView = this.f3954d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f3954d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
            throw null;
        }
    }

    public o3(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3948a = new d(window, this);
        } else {
            this.f3948a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(boolean z10) {
        this.f3948a.a(z10);
    }

    public void b(boolean z10) {
        this.f3948a.b(z10);
    }
}
