package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C0738h;

/* renamed from: androidx.core.view.o3 */
/* loaded from: classes.dex */
public final class C1080o3 {

    /* renamed from: a */
    private final e f4640a;

    /* renamed from: androidx.core.view.o3$a */
    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a */
        protected final Window f4641a;

        /* renamed from: b */
        private final View f4642b;

        a(Window window, View view) {
            this.f4641a = window;
            this.f4642b = view;
        }

        /* renamed from: c */
        protected void m5103c(int i10) {
            View decorView = this.f4641a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        protected void m5104d(int i10) {
            this.f4641a.addFlags(i10);
        }

        /* renamed from: e */
        protected void m5105e(int i10) {
            View decorView = this.f4641a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* renamed from: f */
        protected void m5106f(int i10) {
            this.f4641a.clearFlags(i10);
        }
    }

    /* renamed from: androidx.core.view.o3$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.C1080o3.e
        /* renamed from: b */
        public void mo5107b(boolean z10) {
            if (!z10) {
                m5105e(8192);
                return;
            }
            m5106f(67108864);
            m5104d(Integer.MIN_VALUE);
            m5103c(8192);
        }
    }

    /* renamed from: androidx.core.view.o3$c */
    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.C1080o3.e
        /* renamed from: a */
        public void mo5108a(boolean z10) {
            if (!z10) {
                m5105e(16);
                return;
            }
            m5106f(134217728);
            m5104d(Integer.MIN_VALUE);
            m5103c(16);
        }
    }

    /* renamed from: androidx.core.view.o3$d */
    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a */
        final C1080o3 f4643a;

        /* renamed from: b */
        final WindowInsetsController f4644b;

        /* renamed from: c */
        private final C0738h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f4645c;

        /* renamed from: d */
        protected Window f4646d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        d(android.view.Window r2, androidx.core.view.C1080o3 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.C1090q3.m5126a(r2)
                r1.<init>(r0, r3)
                r1.f4646d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1080o3.d.<init>(android.view.Window, androidx.core.view.o3):void");
        }

        d(WindowInsetsController windowInsetsController, C1080o3 c1080o3) {
            this.f4645c = new C0738h<>();
            this.f4644b = windowInsetsController;
            this.f4643a = c1080o3;
        }

        @Override // androidx.core.view.C1080o3.e
        /* renamed from: a */
        public void mo5108a(boolean z10) {
            if (z10) {
                if (this.f4646d != null) {
                    m5109c(16);
                }
                this.f4644b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f4646d != null) {
                    m5110d(16);
                }
                this.f4644b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.C1080o3.e
        /* renamed from: b */
        public void mo5107b(boolean z10) {
            if (z10) {
                if (this.f4646d != null) {
                    m5109c(8192);
                }
                this.f4644b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f4646d != null) {
                    m5110d(8192);
                }
                this.f4644b.setSystemBarsAppearance(0, 8);
            }
        }

        /* renamed from: c */
        protected void m5109c(int i10) {
            View decorView = this.f4646d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        protected void m5110d(int i10) {
            View decorView = this.f4646d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: androidx.core.view.o3$e */
    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        /* renamed from: a */
        public void mo5108a(boolean z10) {
        }

        /* renamed from: b */
        public void mo5107b(boolean z10) {
            throw null;
        }
    }

    public C1080o3(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f4640a = new d(window, this);
        } else {
            this.f4640a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    /* renamed from: a */
    public void m5101a(boolean z10) {
        this.f4640a.mo5108a(z10);
    }

    /* renamed from: b */
    public void m5102b(boolean z10) {
        this.f4640a.mo5107b(z10);
    }
}
