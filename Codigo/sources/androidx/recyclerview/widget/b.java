package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0080b f5311a;

    /* renamed from: b, reason: collision with root package name */
    final a f5312b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f5313c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f5314a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f5315b;

        a() {
        }

        private void c() {
            if (this.f5315b == null) {
                this.f5315b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f5314a &= ~(1 << i10);
                return;
            }
            a aVar = this.f5315b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f5315b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f5314a) : Long.bitCount(this.f5314a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f5314a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f5314a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f5314a & (1 << i10)) != 0;
            }
            c();
            return this.f5315b.d(i10 - 64);
        }

        boolean e(int i10) {
            if (i10 >= 64) {
                c();
                return this.f5315b.e(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f5314a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f5314a = j12;
            long j13 = j10 - 1;
            this.f5314a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f5315b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f5315b.e(0);
            }
            return z10;
        }

        void f() {
            this.f5314a = 0L;
            a aVar = this.f5315b;
            if (aVar != null) {
                aVar.f();
            }
        }

        void g(int i10) {
            if (i10 < 64) {
                this.f5314a |= 1 << i10;
            } else {
                c();
                this.f5315b.g(i10 - 64);
            }
        }

        public String toString() {
            if (this.f5315b == null) {
                return Long.toBinaryString(this.f5314a);
            }
            return this.f5315b.toString() + "xx" + Long.toBinaryString(this.f5314a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0080b {
        View a(int i10);

        int b();

        RecyclerView.b0 c(View view);

        void d(int i10);

        void e();

        int f(View view);

        void g(View view);

        void h(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InterfaceC0080b interfaceC0080b) {
        this.f5311a = interfaceC0080b;
    }

    private int e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int b10 = this.f5311a.b();
        int i11 = i10;
        while (i11 < b10) {
            int b11 = i10 - (i11 - this.f5312b.b(i11));
            if (b11 == 0) {
                while (this.f5312b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b11;
        }
        return -1;
    }

    private boolean n(View view) {
        if (!this.f5313c.remove(view)) {
            return false;
        }
        this.f5311a.g(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        int e10 = e(i10);
        this.f5312b.e(e10);
        this.f5311a.d(e10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(int i10) {
        int size = this.f5313c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f5313c.get(i11);
            RecyclerView.b0 c10 = this.f5311a.c(view);
            if (c10.k() == i10 && !c10.r() && !c10.t()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View c(int i10) {
        return this.f5311a.a(e(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f5311a.b() - this.f5313c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i10) {
        return this.f5311a.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f5311a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(View view) {
        int f10 = this.f5311a.f(view);
        if (f10 == -1 || this.f5312b.d(f10)) {
            return -1;
        }
        return f10 - this.f5312b.b(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(View view) {
        return this.f5313c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f5312b.f();
        for (int size = this.f5313c.size() - 1; size >= 0; size--) {
            this.f5311a.g(this.f5313c.get(size));
            this.f5313c.remove(size);
        }
        this.f5311a.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i10) {
        int e10 = e(i10);
        View a10 = this.f5311a.a(e10);
        if (a10 == null) {
            return;
        }
        if (this.f5312b.e(e10)) {
            n(a10);
        }
        this.f5311a.h(e10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(View view) {
        int f10 = this.f5311a.f(view);
        if (f10 == -1) {
            n(view);
            return true;
        }
        if (!this.f5312b.d(f10)) {
            return false;
        }
        this.f5312b.e(f10);
        n(view);
        this.f5311a.h(f10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(View view) {
        int f10 = this.f5311a.f(view);
        if (f10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f5312b.d(f10)) {
            this.f5312b.a(f10);
            n(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f5312b.toString() + ", hidden list:" + this.f5313c.size();
    }
}
