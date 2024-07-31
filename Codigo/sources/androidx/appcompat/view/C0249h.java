package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1074n2;
import androidx.core.view.C1084p2;
import androidx.core.view.InterfaceC1079o2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
/* loaded from: classes.dex */
public class C0249h {

    /* renamed from: c */
    private Interpolator f1135c;

    /* renamed from: d */
    InterfaceC1079o2 f1136d;

    /* renamed from: e */
    private boolean f1137e;

    /* renamed from: b */
    private long f1134b = -1;

    /* renamed from: f */
    private final C1084p2 f1138f = new a();

    /* renamed from: a */
    final ArrayList<C1074n2> f1133a = new ArrayList<>();

    /* renamed from: androidx.appcompat.view.h$a */
    /* loaded from: classes.dex */
    class a extends C1084p2 {

        /* renamed from: a */
        private boolean f1139a = false;

        /* renamed from: b */
        private int f1140b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            int i10 = this.f1140b + 1;
            this.f1140b = i10;
            if (i10 == C0249h.this.f1133a.size()) {
                InterfaceC1079o2 interfaceC1079o2 = C0249h.this.f1136d;
                if (interfaceC1079o2 != null) {
                    interfaceC1079o2.mo1032b(null);
                }
                m1210d();
            }
        }

        @Override // androidx.core.view.C1084p2, androidx.core.view.InterfaceC1079o2
        /* renamed from: c */
        public void mo1033c(View view) {
            if (this.f1139a) {
                return;
            }
            this.f1139a = true;
            InterfaceC1079o2 interfaceC1079o2 = C0249h.this.f1136d;
            if (interfaceC1079o2 != null) {
                interfaceC1079o2.mo1033c(null);
            }
        }

        /* renamed from: d */
        void m1210d() {
            this.f1140b = 0;
            this.f1139a = false;
            C0249h.this.m1203b();
        }
    }

    /* renamed from: a */
    public void m1202a() {
        if (this.f1137e) {
            Iterator<C1074n2> it = this.f1133a.iterator();
            while (it.hasNext()) {
                it.next().m5069c();
            }
            this.f1137e = false;
        }
    }

    /* renamed from: b */
    void m1203b() {
        this.f1137e = false;
    }

    /* renamed from: c */
    public C0249h m1204c(C1074n2 c1074n2) {
        if (!this.f1137e) {
            this.f1133a.add(c1074n2);
        }
        return this;
    }

    /* renamed from: d */
    public C0249h m1205d(C1074n2 c1074n2, C1074n2 c1074n22) {
        this.f1133a.add(c1074n2);
        c1074n22.m5074j(c1074n2.m5070d());
        this.f1133a.add(c1074n22);
        return this;
    }

    /* renamed from: e */
    public C0249h m1206e(long j10) {
        if (!this.f1137e) {
            this.f1134b = j10;
        }
        return this;
    }

    /* renamed from: f */
    public C0249h m1207f(Interpolator interpolator) {
        if (!this.f1137e) {
            this.f1135c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0249h m1208g(InterfaceC1079o2 interfaceC1079o2) {
        if (!this.f1137e) {
            this.f1136d = interfaceC1079o2;
        }
        return this;
    }

    /* renamed from: h */
    public void m1209h() {
        if (this.f1137e) {
            return;
        }
        Iterator<C1074n2> it = this.f1133a.iterator();
        while (it.hasNext()) {
            C1074n2 next = it.next();
            long j10 = this.f1134b;
            if (j10 >= 0) {
                next.m5071f(j10);
            }
            Interpolator interpolator = this.f1135c;
            if (interpolator != null) {
                next.m5072g(interpolator);
            }
            if (this.f1136d != null) {
                next.m5073h(this.f1138f);
            }
            next.m5076l();
        }
        this.f1137e = true;
    }
}
