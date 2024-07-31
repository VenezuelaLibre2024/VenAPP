package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.p;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean G;
    int H;
    final SparseIntArray I;
    final SparseIntArray J;
    c K;
    final Rect L;
    private boolean M;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.o {

        /* renamed from: e, reason: collision with root package name */
        int f5091e;

        /* renamed from: f, reason: collision with root package name */
        int f5092f;

        public b(int i10, int i11) {
            super(i10, i11);
            this.f5091e = -1;
            this.f5092f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5091e = -1;
            this.f5092f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5091e = -1;
            this.f5092f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5091e = -1;
            this.f5092f = 0;
        }

        public int b() {
            return this.f5091e;
        }

        public int c() {
            return this.f5092f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f5093a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f5094b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f5095c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5096d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f5096d) {
                return d(i10, i11);
            }
            int i12 = this.f5094b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f5094b.put(i10, d10);
            return d10;
        }

        int c(int i10, int i11) {
            if (!this.f5095c) {
                return e(i10, i11);
            }
            int i12 = this.f5093a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f5093a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f5096d || (a10 = a(this.f5094b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.f5094b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f5094b.clear();
        }

        public void h() {
            this.f5093a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.G = false;
        this.H = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        a1(RecyclerView.n.J(context, attributeSet, i10, i11).f5222b);
    }

    private int X0(RecyclerView.y yVar) {
        if (t() != 0 && yVar.a() != 0) {
            L0();
            boolean T0 = T0();
            View N0 = N0(!T0, true);
            View M0 = M0(!T0, true);
            if (N0 != null && M0 != null) {
                int b10 = this.K.b(I(N0), this.H);
                int b11 = this.K.b(I(M0), this.H);
                int max = this.f5102v ? Math.max(0, ((this.K.b(yVar.a() - 1, this.H) + 1) - Math.max(b10, b11)) - 1) : Math.max(0, Math.min(b10, b11));
                if (T0) {
                    return Math.round((max * (Math.abs(this.f5099s.d(M0) - this.f5099s.e(N0)) / ((this.K.b(I(M0), this.H) - this.K.b(I(N0), this.H)) + 1))) + (this.f5099s.g() - this.f5099s.e(N0)));
                }
                return max;
            }
        }
        return 0;
    }

    private int Y0(RecyclerView.y yVar) {
        if (t() != 0 && yVar.a() != 0) {
            L0();
            View N0 = N0(!T0(), true);
            View M0 = M0(!T0(), true);
            if (N0 != null && M0 != null) {
                if (!T0()) {
                    return this.K.b(yVar.a() - 1, this.H) + 1;
                }
                int d10 = this.f5099s.d(M0) - this.f5099s.e(N0);
                int b10 = this.K.b(I(N0), this.H);
                return (int) ((d10 / ((this.K.b(I(M0), this.H) - b10) + 1)) * (this.K.b(yVar.a() - 1, this.H) + 1));
            }
        }
        return 0;
    }

    private int Z0(RecyclerView.u uVar, RecyclerView.y yVar, int i10) {
        if (!yVar.b()) {
            return this.K.b(i10, this.H);
        }
        int d10 = uVar.d(i10);
        if (d10 != -1) {
            return this.K.b(d10, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public boolean G0() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int L(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f5097q == 0) {
            return this.H;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return Z0(uVar, yVar, yVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void W0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.W0(false);
    }

    public void a1(int i10) {
        if (i10 == this.H) {
            return;
        }
        this.G = true;
        if (i10 >= 1) {
            this.H = i10;
            this.K.h();
            C0();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e0(RecyclerView.u uVar, RecyclerView.y yVar, View view, p pVar) {
        int i10;
        int b10;
        int c10;
        boolean z10;
        boolean z11;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.d0(view, pVar);
            return;
        }
        b bVar = (b) layoutParams;
        int Z0 = Z0(uVar, yVar, bVar.a());
        if (this.f5097q == 0) {
            i11 = bVar.b();
            i10 = bVar.c();
            c10 = 1;
            z10 = false;
            z11 = false;
            b10 = Z0;
        } else {
            i10 = 1;
            b10 = bVar.b();
            c10 = bVar.c();
            z10 = false;
            z11 = false;
            i11 = Z0;
        }
        pVar.L(p.d.a(i11, i10, b10, c10, z10, z11));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.y yVar) {
        return this.M ? X0(yVar) : super.g(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g0(RecyclerView recyclerView, int i10, int i11) {
        this.K.h();
        this.K.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.y yVar) {
        return this.M ? Y0(yVar) : super.h(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void h0(RecyclerView recyclerView) {
        this.K.h();
        this.K.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.K.h();
        this.K.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.y yVar) {
        return this.M ? X0(yVar) : super.j(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j0(RecyclerView recyclerView, int i10, int i11) {
        this.K.h();
        this.K.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.y yVar) {
        return this.M ? Y0(yVar) : super.k(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.K.h();
        this.K.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return this.f5097q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int v(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f5097q == 1) {
            return this.H;
        }
        if (yVar.a() < 1) {
            return 0;
        }
        return Z0(uVar, yVar, yVar.a() - 1) + 1;
    }
}
