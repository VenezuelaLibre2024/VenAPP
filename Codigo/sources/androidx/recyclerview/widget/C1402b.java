package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C1402b {

    /* renamed from: a */
    final b f6131a;

    /* renamed from: b */
    final a f6132b = new a();

    /* renamed from: c */
    final List<View> f6133c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f6134a = 0;

        /* renamed from: b */
        a f6135b;

        a() {
        }

        /* renamed from: c */
        private void m8004c() {
            if (this.f6135b == null) {
                this.f6135b = new a();
            }
        }

        /* renamed from: a */
        void m8005a(int i10) {
            if (i10 < 64) {
                this.f6134a &= ~(1 << i10);
                return;
            }
            a aVar = this.f6135b;
            if (aVar != null) {
                aVar.m8005a(i10 - 64);
            }
        }

        /* renamed from: b */
        int m8006b(int i10) {
            a aVar = this.f6135b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f6134a) : Long.bitCount(this.f6134a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f6134a & ((1 << i10) - 1)) : aVar.m8006b(i10 - 64) + Long.bitCount(this.f6134a);
        }

        /* renamed from: d */
        boolean m8007d(int i10) {
            if (i10 < 64) {
                return (this.f6134a & (1 << i10)) != 0;
            }
            m8004c();
            return this.f6135b.m8007d(i10 - 64);
        }

        /* renamed from: e */
        boolean m8008e(int i10) {
            if (i10 >= 64) {
                m8004c();
                return this.f6135b.m8008e(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f6134a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f6134a = j12;
            long j13 = j10 - 1;
            this.f6134a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f6135b;
            if (aVar != null) {
                if (aVar.m8007d(0)) {
                    m8010g(63);
                }
                this.f6135b.m8008e(0);
            }
            return z10;
        }

        /* renamed from: f */
        void m8009f() {
            this.f6134a = 0L;
            a aVar = this.f6135b;
            if (aVar != null) {
                aVar.m8009f();
            }
        }

        /* renamed from: g */
        void m8010g(int i10) {
            if (i10 < 64) {
                this.f6134a |= 1 << i10;
            } else {
                m8004c();
                this.f6135b.m8010g(i10 - 64);
            }
        }

        public String toString() {
            if (this.f6135b == null) {
                return Long.toBinaryString(this.f6134a);
            }
            return this.f6135b.toString() + "xx" + Long.toBinaryString(this.f6134a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        View mo7765a(int i10);

        /* renamed from: b */
        int mo7766b();

        /* renamed from: c */
        RecyclerView.AbstractC1370b0 mo7767c(View view);

        /* renamed from: d */
        void mo7768d(int i10);

        /* renamed from: e */
        void mo7769e();

        /* renamed from: f */
        int mo7770f(View view);

        /* renamed from: g */
        void mo7771g(View view);

        /* renamed from: h */
        void mo7772h(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1402b(b bVar) {
        this.f6131a = bVar;
    }

    /* renamed from: e */
    private int m7990e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int mo7766b = this.f6131a.mo7766b();
        int i11 = i10;
        while (i11 < mo7766b) {
            int m8006b = i10 - (i11 - this.f6132b.m8006b(i11));
            if (m8006b == 0) {
                while (this.f6132b.m8007d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += m8006b;
        }
        return -1;
    }

    /* renamed from: n */
    private boolean m7991n(View view) {
        if (!this.f6133c.remove(view)) {
            return false;
        }
        this.f6131a.mo7771g(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7992a(int i10) {
        int m7990e = m7990e(i10);
        this.f6132b.m8008e(m7990e);
        this.f6131a.mo7768d(m7990e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m7993b(int i10) {
        int size = this.f6133c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f6133c.get(i11);
            RecyclerView.AbstractC1370b0 mo7767c = this.f6131a.mo7767c(view);
            if (mo7767c.m7749k() == i10 && !mo7767c.m7756r() && !mo7767c.m7758t()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public View m7994c(int i10) {
        return this.f6131a.mo7765a(m7990e(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m7995d() {
        return this.f6131a.mo7766b() - this.f6133c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m7996f(int i10) {
        return this.f6131a.mo7765a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m7997g() {
        return this.f6131a.mo7766b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m7998h(View view) {
        int mo7770f = this.f6131a.mo7770f(view);
        if (mo7770f == -1 || this.f6132b.m8007d(mo7770f)) {
            return -1;
        }
        return mo7770f - this.f6132b.m8006b(mo7770f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m7999i(View view) {
        return this.f6133c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m8000j() {
        this.f6132b.m8009f();
        for (int size = this.f6133c.size() - 1; size >= 0; size--) {
            this.f6131a.mo7771g(this.f6133c.get(size));
            this.f6133c.remove(size);
        }
        this.f6131a.mo7769e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m8001k(int i10) {
        int m7990e = m7990e(i10);
        View mo7765a = this.f6131a.mo7765a(m7990e);
        if (mo7765a == null) {
            return;
        }
        if (this.f6132b.m8008e(m7990e)) {
            m7991n(mo7765a);
        }
        this.f6131a.mo7772h(m7990e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m8002l(View view) {
        int mo7770f = this.f6131a.mo7770f(view);
        if (mo7770f == -1) {
            m7991n(view);
            return true;
        }
        if (!this.f6132b.m8007d(mo7770f)) {
            return false;
        }
        this.f6132b.m8008e(mo7770f);
        m7991n(view);
        this.f6131a.mo7772h(mo7770f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m8003m(View view) {
        int mo7770f = this.f6131a.mo7770f(view);
        if (mo7770f < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f6132b.m8007d(mo7770f)) {
            this.f6132b.m8005a(mo7770f);
            m7991n(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f6132b.toString() + ", hidden list:" + this.f6133c.size();
    }
}
