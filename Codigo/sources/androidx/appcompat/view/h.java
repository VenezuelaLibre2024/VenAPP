package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.n2;
import androidx.core.view.o2;
import androidx.core.view.p2;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f998c;

    /* renamed from: d, reason: collision with root package name */
    o2 f999d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1000e;

    /* renamed from: b, reason: collision with root package name */
    private long f997b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final p2 f1001f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<n2> f996a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends p2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1002a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f1003b = 0;

        a() {
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            int i10 = this.f1003b + 1;
            this.f1003b = i10;
            if (i10 == h.this.f996a.size()) {
                o2 o2Var = h.this.f999d;
                if (o2Var != null) {
                    o2Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.p2, androidx.core.view.o2
        public void c(View view) {
            if (this.f1002a) {
                return;
            }
            this.f1002a = true;
            o2 o2Var = h.this.f999d;
            if (o2Var != null) {
                o2Var.c(null);
            }
        }

        void d() {
            this.f1003b = 0;
            this.f1002a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f1000e) {
            Iterator<n2> it = this.f996a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f1000e = false;
        }
    }

    void b() {
        this.f1000e = false;
    }

    public h c(n2 n2Var) {
        if (!this.f1000e) {
            this.f996a.add(n2Var);
        }
        return this;
    }

    public h d(n2 n2Var, n2 n2Var2) {
        this.f996a.add(n2Var);
        n2Var2.j(n2Var.d());
        this.f996a.add(n2Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f1000e) {
            this.f997b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1000e) {
            this.f998c = interpolator;
        }
        return this;
    }

    public h g(o2 o2Var) {
        if (!this.f1000e) {
            this.f999d = o2Var;
        }
        return this;
    }

    public void h() {
        if (this.f1000e) {
            return;
        }
        Iterator<n2> it = this.f996a.iterator();
        while (it.hasNext()) {
            n2 next = it.next();
            long j10 = this.f997b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f998c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f999d != null) {
                next.h(this.f1001f);
            }
            next.l();
        }
        this.f1000e = true;
    }
}
