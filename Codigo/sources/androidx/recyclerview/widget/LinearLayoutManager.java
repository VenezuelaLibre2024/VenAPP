package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.n {
    private boolean A;

    /* renamed from: r, reason: collision with root package name */
    private c f5098r;

    /* renamed from: s, reason: collision with root package name */
    h f5099s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5100t;

    /* renamed from: q, reason: collision with root package name */
    int f5097q = 1;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5101u = false;

    /* renamed from: v, reason: collision with root package name */
    boolean f5102v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5103w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5104x = true;

    /* renamed from: y, reason: collision with root package name */
    int f5105y = -1;

    /* renamed from: z, reason: collision with root package name */
    int f5106z = Integer.MIN_VALUE;
    d B = null;
    final a C = new a();
    private final b D = new b();
    private int E = 2;
    private int[] F = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        h f5107a;

        /* renamed from: b, reason: collision with root package name */
        int f5108b;

        /* renamed from: c, reason: collision with root package name */
        int f5109c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5110d;

        /* renamed from: e, reason: collision with root package name */
        boolean f5111e;

        a() {
            a();
        }

        void a() {
            this.f5108b = -1;
            this.f5109c = Integer.MIN_VALUE;
            this.f5110d = false;
            this.f5111e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5108b + ", mCoordinate=" + this.f5109c + ", mLayoutFromEnd=" + this.f5110d + ", mValid=" + this.f5111e + '}';
        }
    }

    /* loaded from: classes.dex */
    protected static class b {
        protected b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f5112a = true;

        /* renamed from: b, reason: collision with root package name */
        int f5113b = 0;

        /* renamed from: c, reason: collision with root package name */
        int f5114c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f5115d = false;

        /* renamed from: e, reason: collision with root package name */
        List<RecyclerView.b0> f5116e = null;

        c() {
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f5117a;

        /* renamed from: b, reason: collision with root package name */
        int f5118b;

        /* renamed from: c, reason: collision with root package name */
        boolean f5119c;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f5117a = parcel.readInt();
            this.f5118b = parcel.readInt();
            this.f5119c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f5117a = dVar.f5117a;
            this.f5118b = dVar.f5118b;
            this.f5119c = dVar.f5119c;
        }

        void a() {
            this.f5117a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f5117a);
            parcel.writeInt(this.f5118b);
            parcel.writeInt(this.f5119c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.c J = RecyclerView.n.J(context, attributeSet, i10, i11);
        U0(J.f5221a);
        V0(J.f5223c);
        W0(J.f5224d);
    }

    private int H0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        L0();
        return j.a(yVar, this.f5099s, N0(!this.f5104x, true), M0(!this.f5104x, true), this, this.f5104x);
    }

    private int I0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        L0();
        return j.b(yVar, this.f5099s, N0(!this.f5104x, true), M0(!this.f5104x, true), this, this.f5104x, this.f5102v);
    }

    private int J0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        L0();
        return j.c(yVar, this.f5099s, N0(!this.f5104x, true), M0(!this.f5104x, true), this, this.f5104x);
    }

    private View R0() {
        return s(this.f5102v ? 0 : t() - 1);
    }

    private View S0() {
        return s(this.f5102v ? t() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean G0() {
        return this.B == null && this.f5100t == this.f5103w;
    }

    c K0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0() {
        if (this.f5098r == null) {
            this.f5098r = K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View M0(boolean z10, boolean z11) {
        int t10;
        int i10;
        if (this.f5102v) {
            t10 = 0;
            i10 = t();
        } else {
            t10 = t() - 1;
            i10 = -1;
        }
        return Q0(t10, i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View N0(boolean z10, boolean z11) {
        int i10;
        int t10;
        if (this.f5102v) {
            i10 = t() - 1;
            t10 = -1;
        } else {
            i10 = 0;
            t10 = t();
        }
        return Q0(i10, t10, z10, z11);
    }

    public int O0() {
        View Q0 = Q0(0, t(), false, true);
        if (Q0 == null) {
            return -1;
        }
        return I(Q0);
    }

    public int P0() {
        View Q0 = Q0(t() - 1, -1, false, true);
        if (Q0 == null) {
            return -1;
        }
        return I(Q0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean Q() {
        return true;
    }

    View Q0(int i10, int i11, boolean z10, boolean z11) {
        L0();
        return (this.f5097q == 0 ? this.f5207e : this.f5208f).a(i10, i11, z10 ? 24579 : 320, z11 ? 320 : 0);
    }

    public boolean T0() {
        return this.f5104x;
    }

    public void U0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        a(null);
        if (i10 != this.f5097q || this.f5099s == null) {
            h b10 = h.b(this, i10);
            this.f5099s = b10;
            this.C.f5107a = b10;
            this.f5097q = i10;
            C0();
        }
    }

    public void V0(boolean z10) {
        a(null);
        if (z10 == this.f5101u) {
            return;
        }
        this.f5101u = z10;
        C0();
    }

    public void W0(boolean z10) {
        a(null);
        if (this.f5103w == z10) {
            return;
        }
        this.f5103w = z10;
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Y(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.Y(recyclerView, uVar);
        if (this.A) {
            v0(uVar);
            uVar.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            accessibilityEvent.setFromIndex(O0());
            accessibilityEvent.setToIndex(P0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(String str) {
        if (this.B == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b() {
        return this.f5097q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c() {
        return this.f5097q == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int f(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.y yVar) {
        return J0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int i(RecyclerView.y yVar) {
        return H0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.y yVar) {
        return I0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.y yVar) {
        return J0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return new RecyclerView.o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable p0() {
        if (this.B != null) {
            return new d(this.B);
        }
        d dVar = new d();
        if (t() > 0) {
            L0();
            boolean z10 = this.f5100t ^ this.f5102v;
            dVar.f5119c = z10;
            if (z10) {
                View R0 = R0();
                dVar.f5118b = this.f5099s.f() - this.f5099s.d(R0);
                dVar.f5117a = I(R0);
            } else {
                View S0 = S0();
                dVar.f5117a = I(S0);
                dVar.f5118b = this.f5099s.e(S0) - this.f5099s.g();
            }
        } else {
            dVar.a();
        }
        return dVar;
    }
}
