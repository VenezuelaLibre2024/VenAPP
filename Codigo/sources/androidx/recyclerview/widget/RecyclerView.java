package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.p;
import androidx.core.view.h2;
import androidx.core.view.n0;
import androidx.core.view.o0;
import androidx.core.view.x0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    private static final int[] K0 = {R.attr.nestedScrollingEnabled};
    static final boolean L0 = false;
    static final boolean M0 = true;
    static final boolean N0 = true;
    static final boolean O0 = true;
    private static final boolean P0 = false;
    private static final boolean Q0 = false;
    private static final Class<?>[] R0;
    static final Interpolator S0;
    private final ArrayList<r> A;
    private o0 A0;
    private r B;
    private final int[] B0;
    boolean C;
    private final int[] C0;
    boolean D;
    final int[] D0;
    boolean E;
    final List<b0> E0;
    boolean F;
    private Runnable F0;
    private int G;
    private boolean G0;
    boolean H;
    private int H0;
    boolean I;
    private int I0;
    private boolean J;
    private final m.b J0;
    private int K;
    boolean L;
    private final AccessibilityManager M;
    private List<p> N;
    boolean O;
    boolean P;
    private int Q;
    private int R;
    private j S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    private EdgeEffect W;

    /* renamed from: a */
    private final w f5120a;

    /* renamed from: a0 */
    k f5121a0;

    /* renamed from: b */
    final u f5122b;

    /* renamed from: b0 */
    private int f5123b0;

    /* renamed from: c */
    x f5124c;

    /* renamed from: c0 */
    private int f5125c0;

    /* renamed from: d */
    androidx.recyclerview.widget.a f5126d;

    /* renamed from: d0 */
    private VelocityTracker f5127d0;

    /* renamed from: e */
    androidx.recyclerview.widget.b f5128e;

    /* renamed from: e0 */
    private int f5129e0;

    /* renamed from: f */
    final androidx.recyclerview.widget.m f5130f;

    /* renamed from: f0 */
    private int f5131f0;

    /* renamed from: g0 */
    private int f5132g0;

    /* renamed from: h0 */
    private int f5133h0;

    /* renamed from: i0 */
    private int f5134i0;

    /* renamed from: j0 */
    private final int f5135j0;

    /* renamed from: k0 */
    private final int f5136k0;

    /* renamed from: l0 */
    private float f5137l0;

    /* renamed from: m0 */
    private float f5138m0;

    /* renamed from: n0 */
    private boolean f5139n0;

    /* renamed from: o0 */
    final a0 f5140o0;

    /* renamed from: p0 */
    androidx.recyclerview.widget.e f5141p0;

    /* renamed from: q0 */
    e.b f5142q0;

    /* renamed from: r */
    boolean f5143r;

    /* renamed from: r0 */
    final y f5144r0;

    /* renamed from: s */
    final Runnable f5145s;

    /* renamed from: s0 */
    private s f5146s0;

    /* renamed from: t */
    final Rect f5147t;

    /* renamed from: t0 */
    private List<s> f5148t0;

    /* renamed from: u */
    private final Rect f5149u;

    /* renamed from: u0 */
    boolean f5150u0;

    /* renamed from: v */
    final RectF f5151v;

    /* renamed from: v0 */
    boolean f5152v0;

    /* renamed from: w */
    n f5153w;

    /* renamed from: w0 */
    private k.b f5154w0;

    /* renamed from: x */
    v f5155x;

    /* renamed from: x0 */
    boolean f5156x0;

    /* renamed from: y */
    final List<v> f5157y;

    /* renamed from: y0 */
    androidx.recyclerview.widget.i f5158y0;

    /* renamed from: z */
    final ArrayList<m> f5159z;

    /* renamed from: z0 */
    private final int[] f5160z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.F || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.C) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.I) {
                recyclerView2.H = true;
            } else {
                recyclerView2.m();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements Runnable {

        /* renamed from: a */
        private int f5162a;

        /* renamed from: b */
        private int f5163b;

        /* renamed from: c */
        OverScroller f5164c;

        /* renamed from: d */
        Interpolator f5165d;

        /* renamed from: e */
        private boolean f5166e;

        /* renamed from: f */
        private boolean f5167f;

        a0() {
            Interpolator interpolator = RecyclerView.S0;
            this.f5165d = interpolator;
            this.f5166e = false;
            this.f5167f = false;
            this.f5164c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), AdError.SERVER_ERROR_CODE);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            x0.R(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f5163b = 0;
            this.f5162a = 0;
            Interpolator interpolator = this.f5165d;
            Interpolator interpolator2 = RecyclerView.S0;
            if (interpolator != interpolator2) {
                this.f5165d = interpolator2;
                this.f5164c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5164c.fling(0, 0, i10, i11, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
            d();
        }

        void d() {
            if (this.f5166e) {
                this.f5167f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.S0;
            }
            if (this.f5165d != interpolator) {
                this.f5165d = interpolator;
                this.f5164c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5163b = 0;
            this.f5162a = 0;
            RecyclerView.this.setScrollState(2);
            this.f5164c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f5164c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5153w == null) {
                f();
                return;
            }
            this.f5167f = false;
            this.f5166e = true;
            recyclerView.m();
            OverScroller overScroller = this.f5164c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f5162a;
                int i11 = currY - this.f5163b;
                this.f5162a = currX;
                this.f5163b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.D0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.s(i10, i11, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.D0;
                    i10 -= iArr2[0];
                    i11 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.l(i10, i11);
                }
                RecyclerView.this.getClass();
                if (!RecyclerView.this.f5159z.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                int[] iArr3 = recyclerView3.D0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView3.t(0, 0, i10, i11, null, 1, iArr3);
                RecyclerView recyclerView4 = RecyclerView.this;
                int[] iArr4 = recyclerView4.D0;
                int i12 = i10 - iArr4[0];
                int i13 = i11 - iArr4[1];
                if (!recyclerView4.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                RecyclerView.this.f5153w.getClass();
                if (z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i14, currVelocity);
                    }
                    if (RecyclerView.O0) {
                        RecyclerView.this.f5142q0.a();
                    }
                } else {
                    d();
                    RecyclerView recyclerView5 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView5.f5141p0;
                    if (eVar != null) {
                        eVar.f(recyclerView5, 0, 0);
                    }
                }
            }
            RecyclerView.this.f5153w.getClass();
            this.f5166e = false;
            if (this.f5167f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.F0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = RecyclerView.this.f5121a0;
            if (kVar != null) {
                kVar.p();
            }
            RecyclerView.this.f5156x0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {

        /* renamed from: s */
        private static final List<Object> f5170s = Collections.emptyList();

        /* renamed from: a */
        public final View f5171a;

        /* renamed from: b */
        WeakReference<RecyclerView> f5172b;

        /* renamed from: c */
        int f5173c;

        /* renamed from: d */
        int f5174d;

        /* renamed from: e */
        long f5175e;

        /* renamed from: f */
        int f5176f;

        /* renamed from: g */
        int f5177g;

        /* renamed from: h */
        b0 f5178h;

        /* renamed from: i */
        b0 f5179i;

        /* renamed from: j */
        int f5180j;

        /* renamed from: k */
        List<Object> f5181k;

        /* renamed from: l */
        List<Object> f5182l;

        /* renamed from: m */
        private int f5183m;

        /* renamed from: n */
        u f5184n;

        /* renamed from: o */
        boolean f5185o;

        /* renamed from: p */
        private int f5186p;

        /* renamed from: q */
        int f5187q;

        /* renamed from: r */
        RecyclerView f5188r;

        private void f() {
            if (this.f5181k == null) {
                ArrayList arrayList = new ArrayList();
                this.f5181k = arrayList;
                this.f5182l = Collections.unmodifiableList(arrayList);
            }
        }

        void A() {
            this.f5180j = 0;
            this.f5173c = -1;
            this.f5174d = -1;
            this.f5175e = -1L;
            this.f5177g = -1;
            this.f5183m = 0;
            this.f5178h = null;
            this.f5179i = null;
            c();
            this.f5186p = 0;
            this.f5187q = -1;
            RecyclerView.k(this);
        }

        void B(int i10, int i11) {
            this.f5180j = (i10 & i11) | (this.f5180j & (~i11));
        }

        public final void C(boolean z10) {
            int i10;
            int i11 = this.f5183m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f5183m = i12;
            if (i12 < 0) {
                this.f5183m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f5180j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f5180j & (-17);
            }
            this.f5180j = i10;
        }

        void D(u uVar, boolean z10) {
            this.f5184n = uVar;
            this.f5185o = z10;
        }

        boolean E() {
            return (this.f5180j & 16) != 0;
        }

        boolean F() {
            return (this.f5180j & RecognitionOptions.ITF) != 0;
        }

        void G() {
            this.f5184n.B(this);
        }

        boolean H() {
            return (this.f5180j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(RecognitionOptions.UPC_E);
            } else if ((1024 & this.f5180j) == 0) {
                f();
                this.f5181k.add(obj);
            }
        }

        void b(int i10) {
            this.f5180j = i10 | this.f5180j;
        }

        void c() {
            List<Object> list = this.f5181k;
            if (list != null) {
                list.clear();
            }
            this.f5180j &= -1025;
        }

        void d() {
            this.f5180j &= -33;
        }

        void e() {
            this.f5180j &= -257;
        }

        boolean g() {
            return (this.f5180j & 16) == 0 && x0.E(this.f5171a);
        }

        void h(int i10, int i11, boolean z10) {
            b(8);
            y(i11, z10);
            this.f5173c = i10;
        }

        public final int i() {
            RecyclerView recyclerView = this.f5188r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.G(this);
        }

        public final int j() {
            return this.f5176f;
        }

        public final int k() {
            int i10 = this.f5177g;
            return i10 == -1 ? this.f5173c : i10;
        }

        public final int l() {
            return this.f5174d;
        }

        List<Object> m() {
            if ((this.f5180j & RecognitionOptions.UPC_E) != 0) {
                return f5170s;
            }
            List<Object> list = this.f5181k;
            return (list == null || list.size() == 0) ? f5170s : this.f5182l;
        }

        boolean n(int i10) {
            return (i10 & this.f5180j) != 0;
        }

        boolean o() {
            return (this.f5180j & RecognitionOptions.UPC_A) != 0 || r();
        }

        boolean p() {
            return (this.f5171a.getParent() == null || this.f5171a.getParent() == this.f5188r) ? false : true;
        }

        public boolean q() {
            return (this.f5180j & 1) != 0;
        }

        public boolean r() {
            return (this.f5180j & 4) != 0;
        }

        public final boolean s() {
            return (this.f5180j & 16) == 0 && !x0.E(this.f5171a);
        }

        public boolean t() {
            return (this.f5180j & 8) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f5173c + " id=" + this.f5175e + ", oldPos=" + this.f5174d + ", pLpos:" + this.f5177g);
            if (u()) {
                sb2.append(" scrap ");
                sb2.append(this.f5185o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (r()) {
                sb2.append(" invalid");
            }
            if (!q()) {
                sb2.append(" unbound");
            }
            if (x()) {
                sb2.append(" update");
            }
            if (t()) {
                sb2.append(" removed");
            }
            if (F()) {
                sb2.append(" ignored");
            }
            if (v()) {
                sb2.append(" tmpDetached");
            }
            if (!s()) {
                sb2.append(" not recyclable(" + this.f5183m + ")");
            }
            if (o()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f5171a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        boolean u() {
            return this.f5184n != null;
        }

        boolean v() {
            return (this.f5180j & RecognitionOptions.QR_CODE) != 0;
        }

        boolean w() {
            return (this.f5180j & 2) != 0;
        }

        boolean x() {
            return (this.f5180j & 2) != 0;
        }

        void y(int i10, boolean z10) {
            if (this.f5174d == -1) {
                this.f5174d = this.f5173c;
            }
            if (this.f5177g == -1) {
                this.f5177g = this.f5173c;
            }
            if (z10) {
                this.f5177g += i10;
            }
            this.f5173c += i10;
            if (this.f5171a.getLayoutParams() != null) {
                ((o) this.f5171a.getLayoutParams()).f5227c = true;
            }
        }

        void z(RecyclerView recyclerView) {
            recyclerView.w0(this, this.f5186p);
            this.f5186p = 0;
        }
    }

    /* loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements m.b {
        d() {
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0080b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public b0 c(View view) {
            return RecyclerView.I(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public void d(int i10) {
            b0 I;
            View a10 = a(i10);
            if (a10 != null && (I = RecyclerView.I(a10)) != null) {
                if (I.v() && !I.F()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + I + RecyclerView.this.B());
                }
                I.b(RecognitionOptions.QR_CODE);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public void e() {
            int b10 = b();
            for (int i10 = 0; i10 < b10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.p(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public void g(View view) {
            b0 I = RecyclerView.I(view);
            if (I != null) {
                I.z(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0080b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.p(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0079a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void a(int i10, int i11) {
            RecyclerView.this.Z(i10, i11);
            RecyclerView.this.f5150u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void d(int i10, int i11) {
            RecyclerView.this.a0(i10, i11, false);
            RecyclerView.this.f5150u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.I0(i10, i11, obj);
            RecyclerView.this.f5152v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public b0 f(int i10) {
            b0 E = RecyclerView.this.E(i10, true);
            if (E == null || RecyclerView.this.f5128e.i(E.f5171a)) {
                return null;
            }
            return E;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void g(int i10, int i11) {
            RecyclerView.this.Y(i10, i11);
            RecyclerView.this.f5150u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0079a
        public void h(int i10, int i11) {
            RecyclerView.this.a0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5150u0 = true;
            recyclerView.f5144r0.f5248d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f5307a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5153w.g0(recyclerView, bVar.f5308b, bVar.f5310d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5153w.j0(recyclerView2, bVar.f5308b, bVar.f5310d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5153w.l0(recyclerView3, bVar.f5308b, bVar.f5310d, bVar.f5309c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5153w.i0(recyclerView4, bVar.f5308b, bVar.f5310d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends b0> {
    }

    /* loaded from: classes.dex */
    public static abstract class h {
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public static class j {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {

        /* renamed from: a */
        private b f5192a = null;

        /* renamed from: b */
        private ArrayList<a> f5193b = new ArrayList<>();

        /* renamed from: c */
        private long f5194c = 120;

        /* renamed from: d */
        private long f5195d = 120;

        /* renamed from: e */
        private long f5196e = 250;

        /* renamed from: f */
        private long f5197f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
            void a(b0 b0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f5198a;

            /* renamed from: b */
            public int f5199b;

            /* renamed from: c */
            public int f5200c;

            /* renamed from: d */
            public int f5201d;

            public c a(b0 b0Var) {
                return b(b0Var, 0);
            }

            public c b(b0 b0Var, int i10) {
                View view = b0Var.f5171a;
                this.f5198a = view.getLeft();
                this.f5199b = view.getTop();
                this.f5200c = view.getRight();
                this.f5201d = view.getBottom();
                return this;
            }
        }

        static int a(b0 b0Var) {
            int i10 = b0Var.f5180j & 14;
            if (b0Var.r()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int l10 = b0Var.l();
            int i11 = b0Var.i();
            return (l10 == -1 || i11 == -1 || l10 == i11) ? i10 : i10 | RecognitionOptions.PDF417;
        }

        public abstract boolean b(b0 b0Var);

        public boolean c(b0 b0Var, List<Object> list) {
            return b(b0Var);
        }

        public final void d(b0 b0Var) {
            n(b0Var);
            b bVar = this.f5192a;
            if (bVar != null) {
                bVar.a(b0Var);
            }
        }

        public final void e() {
            int size = this.f5193b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5193b.get(i10).a();
            }
            this.f5193b.clear();
        }

        public abstract void f(b0 b0Var);

        public abstract void g();

        public long h() {
            return this.f5194c;
        }

        public long i() {
            return this.f5197f;
        }

        public long j() {
            return this.f5196e;
        }

        public long k() {
            return this.f5195d;
        }

        public abstract boolean l();

        public c m() {
            return new c();
        }

        public void n(b0 b0Var) {
        }

        public c o(y yVar, b0 b0Var, int i10, List<Object> list) {
            return m().a(b0Var);
        }

        public abstract void p();

        void q(b bVar) {
            this.f5192a = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l implements k.b {
        l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k.b
        public void a(b0 b0Var) {
            b0Var.C(true);
            if (b0Var.f5178h != null && b0Var.f5179i == null) {
                b0Var.f5178h = null;
            }
            b0Var.f5179i = null;
            if (b0Var.E() || RecyclerView.this.o0(b0Var.f5171a) || !b0Var.v()) {
                return;
            }
            RecyclerView.this.removeDetachedView(b0Var.f5171a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, y yVar) {
            d(canvas, recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, y yVar) {
            f(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {

        /* renamed from: a */
        androidx.recyclerview.widget.b f5203a;

        /* renamed from: b */
        RecyclerView f5204b;

        /* renamed from: c */
        private final l.b f5205c;

        /* renamed from: d */
        private final l.b f5206d;

        /* renamed from: e */
        androidx.recyclerview.widget.l f5207e;

        /* renamed from: f */
        androidx.recyclerview.widget.l f5208f;

        /* renamed from: g */
        boolean f5209g;

        /* renamed from: h */
        boolean f5210h;

        /* renamed from: i */
        boolean f5211i;

        /* renamed from: j */
        private boolean f5212j;

        /* renamed from: k */
        private boolean f5213k;

        /* renamed from: l */
        int f5214l;

        /* renamed from: m */
        private int f5215m;

        /* renamed from: n */
        private int f5216n;

        /* renamed from: o */
        private int f5217o;

        /* renamed from: p */
        private int f5218p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements l.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i10) {
                return n.this.s(i10);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b(View view) {
                return n.this.y(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return n.this.F();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.O() - n.this.G();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.z(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements l.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i10) {
                return n.this.s(i10);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b(View view) {
                return n.this.A(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return n.this.H();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.B() - n.this.E();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.w(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f5221a;

            /* renamed from: b */
            public int f5222b;

            /* renamed from: c */
            public boolean f5223c;

            /* renamed from: d */
            public boolean f5224d;
        }

        public n() {
            a aVar = new a();
            this.f5205c = aVar;
            b bVar = new b();
            this.f5206d = bVar;
            this.f5207e = new androidx.recyclerview.widget.l(aVar);
            this.f5208f = new androidx.recyclerview.widget.l(bVar);
            this.f5209g = false;
            this.f5210h = false;
            this.f5211i = false;
            this.f5212j = true;
            this.f5213k = true;
        }

        public static c J(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.c.f23386f, i10, i11);
            cVar.f5221a = obtainStyledAttributes.getInt(q1.c.f23387g, 1);
            cVar.f5222b = obtainStyledAttributes.getInt(q1.c.f23397q, 1);
            cVar.f5223c = obtainStyledAttributes.getBoolean(q1.c.f23396p, false);
            cVar.f5224d = obtainStyledAttributes.getBoolean(q1.c.f23398r, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        private boolean R(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            Rect rect = this.f5204b.f5147t;
            x(focusedChild, rect);
            return rect.left - i10 < O && rect.right - i10 > F && rect.top - i11 < B && rect.bottom - i11 > H;
        }

        public static int e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private int[] u(View view, Rect rect) {
            int[] iArr = new int[2];
            int F = F();
            int H = H();
            int O = O() - G();
            int B = B() - E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - F;
            int min = Math.min(0, i10);
            int i11 = top - H;
            int min2 = Math.min(0, i11);
            int i12 = width - O;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - B);
            if (C() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public int A(View view) {
            return view.getTop() - N(view);
        }

        public boolean A0(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return B0(recyclerView, view, rect, z10, false);
        }

        public int B() {
            return this.f5218p;
        }

        public boolean B0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] u10 = u(view, rect);
            int i10 = u10[0];
            int i11 = u10[1];
            if ((z11 && !R(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.y0(i10, i11);
            }
            return true;
        }

        public int C() {
            return x0.u(this.f5204b);
        }

        public void C0() {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int D(View view) {
            return ((o) view.getLayoutParams()).f5226b.left;
        }

        public void D0() {
            this.f5209g = true;
        }

        public int E() {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        void E0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f5204b = null;
                this.f5203a = null;
                height = 0;
                this.f5217o = 0;
            } else {
                this.f5204b = recyclerView;
                this.f5203a = recyclerView.f5128e;
                this.f5217o = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f5218p = height;
            this.f5215m = 1073741824;
            this.f5216n = 1073741824;
        }

        public int F() {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        void F0() {
        }

        public int G() {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean G0() {
            return false;
        }

        public int H() {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int I(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int K(View view) {
            return ((o) view.getLayoutParams()).f5226b.right;
        }

        public int L(u uVar, y yVar) {
            return -1;
        }

        public int M(u uVar, y yVar) {
            return 0;
        }

        public int N(View view) {
            return ((o) view.getLayoutParams()).f5226b.top;
        }

        public int O() {
            return this.f5217o;
        }

        public boolean P() {
            return this.f5210h;
        }

        public boolean Q() {
            return this.f5211i;
        }

        public boolean S(u uVar, y yVar) {
            return false;
        }

        public boolean T() {
            return false;
        }

        public void U(g gVar, g gVar2) {
        }

        public boolean V(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W(RecyclerView recyclerView) {
        }

        @Deprecated
        public void X(RecyclerView recyclerView) {
        }

        public void Y(RecyclerView recyclerView, u uVar) {
            X(recyclerView);
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5204b;
            a0(recyclerView.f5122b, recyclerView.f5144r0, accessibilityEvent);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                recyclerView.h(str);
            }
        }

        public void a0(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5204b.canScrollVertically(-1) && !this.f5204b.canScrollHorizontally(-1) && !this.f5204b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            this.f5204b.getClass();
        }

        public boolean b() {
            return false;
        }

        public void b0(androidx.core.view.accessibility.p pVar) {
            RecyclerView recyclerView = this.f5204b;
            c0(recyclerView.f5122b, recyclerView.f5144r0, pVar);
        }

        public boolean c() {
            return false;
        }

        public void c0(u uVar, y yVar, androidx.core.view.accessibility.p pVar) {
            if (this.f5204b.canScrollVertically(-1) || this.f5204b.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.P(true);
            }
            if (this.f5204b.canScrollVertically(1) || this.f5204b.canScrollHorizontally(1)) {
                pVar.a(RecognitionOptions.AZTEC);
                pVar.P(true);
            }
            pVar.K(p.c.a(L(uVar, yVar), v(uVar, yVar), S(uVar, yVar), M(uVar, yVar)));
        }

        public boolean d(o oVar) {
            return oVar != null;
        }

        public void d0(View view, androidx.core.view.accessibility.p pVar) {
            b0 I = RecyclerView.I(view);
            if (I == null || I.t() || this.f5203a.i(I.f5171a)) {
                return;
            }
            RecyclerView recyclerView = this.f5204b;
            e0(recyclerView.f5122b, recyclerView.f5144r0, view, pVar);
        }

        public void e0(u uVar, y yVar, View view, androidx.core.view.accessibility.p pVar) {
        }

        public int f(y yVar) {
            return 0;
        }

        public View f0(View view, int i10) {
            return null;
        }

        public int g(y yVar) {
            return 0;
        }

        public void g0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int h(y yVar) {
            return 0;
        }

        public void h0(RecyclerView recyclerView) {
        }

        public int i(y yVar) {
            return 0;
        }

        public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int j(y yVar) {
            return 0;
        }

        public void j0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int k(y yVar) {
            return 0;
        }

        public void k0(RecyclerView recyclerView, int i10, int i11) {
        }

        void l(RecyclerView recyclerView) {
            this.f5210h = true;
            W(recyclerView);
        }

        public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            k0(recyclerView, i10, i11);
        }

        void m(RecyclerView recyclerView, u uVar) {
            this.f5210h = false;
            Y(recyclerView, uVar);
        }

        public void m0(u uVar, y yVar, int i10, int i11) {
            this.f5204b.o(i10, i11);
        }

        public abstract o n();

        @Deprecated
        public boolean n0(RecyclerView recyclerView, View view, View view2) {
            return T() || recyclerView.T();
        }

        public o o(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public boolean o0(RecyclerView recyclerView, y yVar, View view, View view2) {
            return n0(recyclerView, view, view2);
        }

        public o p(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public Parcelable p0() {
            return null;
        }

        public int q() {
            return -1;
        }

        public void q0(int i10) {
        }

        public int r(View view) {
            return ((o) view.getLayoutParams()).f5226b.bottom;
        }

        public boolean r0(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f5204b;
            return s0(recyclerView.f5122b, recyclerView.f5144r0, i10, bundle);
        }

        public View s(int i10) {
            androidx.recyclerview.widget.b bVar = this.f5203a;
            if (bVar != null) {
                return bVar.c(i10);
            }
            return null;
        }

        public boolean s0(u uVar, y yVar, int i10, Bundle bundle) {
            int B;
            int O;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                B = recyclerView.canScrollVertically(1) ? (B() - H()) - E() : 0;
                if (this.f5204b.canScrollHorizontally(1)) {
                    O = (O() - F()) - G();
                    i11 = B;
                    i12 = O;
                }
                i11 = B;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                B = recyclerView.canScrollVertically(-1) ? -((B() - H()) - E()) : 0;
                if (this.f5204b.canScrollHorizontally(-1)) {
                    O = -((O() - F()) - G());
                    i11 = B;
                    i12 = O;
                }
                i11 = B;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f5204b.B0(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public int t() {
            androidx.recyclerview.widget.b bVar = this.f5203a;
            if (bVar != null) {
                return bVar.d();
            }
            return 0;
        }

        public boolean t0(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f5204b;
            return u0(recyclerView.f5122b, recyclerView.f5144r0, view, i10, bundle);
        }

        public boolean u0(u uVar, y yVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public int v(u uVar, y yVar) {
            return -1;
        }

        public void v0(u uVar) {
            for (int t10 = t() - 1; t10 >= 0; t10--) {
                if (!RecyclerView.I(s(t10)).F()) {
                    x0(t10, uVar);
                }
            }
        }

        public int w(View view) {
            return view.getBottom() + r(view);
        }

        void w0(u uVar) {
            int h10 = uVar.h();
            for (int i10 = h10 - 1; i10 >= 0; i10--) {
                View j10 = uVar.j(i10);
                b0 I = RecyclerView.I(j10);
                if (!I.F()) {
                    I.C(false);
                    if (I.v()) {
                        this.f5204b.removeDetachedView(j10, false);
                    }
                    k kVar = this.f5204b.f5121a0;
                    if (kVar != null) {
                        kVar.f(I);
                    }
                    I.C(true);
                    uVar.q(j10);
                }
            }
            uVar.c();
            if (h10 > 0) {
                this.f5204b.invalidate();
            }
        }

        public void x(View view, Rect rect) {
            RecyclerView.J(view, rect);
        }

        public void x0(int i10, u uVar) {
            View s10 = s(i10);
            z0(i10);
            uVar.t(s10);
        }

        public int y(View view) {
            return view.getLeft() - D(view);
        }

        public boolean y0(Runnable runnable) {
            RecyclerView recyclerView = this.f5204b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int z(View view) {
            return view.getRight() + K(view);
        }

        public void z0(int i10) {
            if (s(i10) != null) {
                this.f5203a.k(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        b0 f5225a;

        /* renamed from: b */
        final Rect f5226b;

        /* renamed from: c */
        boolean f5227c;

        /* renamed from: d */
        boolean f5228d;

        public o(int i10, int i11) {
            super(i10, i11);
            this.f5226b = new Rect();
            this.f5227c = true;
            this.f5228d = false;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5226b = new Rect();
            this.f5227c = true;
            this.f5228d = false;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5226b = new Rect();
            this.f5227c = true;
            this.f5228d = false;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5226b = new Rect();
            this.f5227c = true;
            this.f5228d = false;
        }

        public o(o oVar) {
            super((ViewGroup.LayoutParams) oVar);
            this.f5226b = new Rect();
            this.f5227c = true;
            this.f5228d = false;
        }

        public int a() {
            return this.f5225a.k();
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class q {
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public void a(RecyclerView recyclerView, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static class t {

        /* renamed from: a */
        SparseArray<a> f5229a = new SparseArray<>();

        /* renamed from: b */
        private int f5230b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<b0> f5231a = new ArrayList<>();

            /* renamed from: b */
            int f5232b = 5;

            /* renamed from: c */
            long f5233c = 0;

            /* renamed from: d */
            long f5234d = 0;

            a() {
            }
        }

        private a c(int i10) {
            a aVar = this.f5229a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f5229a.put(i10, aVar2);
            return aVar2;
        }

        public void a() {
            for (int i10 = 0; i10 < this.f5229a.size(); i10++) {
                this.f5229a.valueAt(i10).f5231a.clear();
            }
        }

        void b() {
            this.f5230b--;
        }

        void d(g gVar, g gVar2, boolean z10) {
            if (z10 || this.f5230b != 0) {
                return;
            }
            a();
        }

        public void e(b0 b0Var) {
            int j10 = b0Var.j();
            ArrayList<b0> arrayList = c(j10).f5231a;
            if (this.f5229a.get(j10).f5232b <= arrayList.size()) {
                return;
            }
            b0Var.A();
            arrayList.add(b0Var);
        }

        boolean f(int i10, long j10, long j11) {
            long j12 = c(i10).f5234d;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* loaded from: classes.dex */
    public final class u {

        /* renamed from: a */
        final ArrayList<b0> f5235a;

        /* renamed from: b */
        ArrayList<b0> f5236b;

        /* renamed from: c */
        final ArrayList<b0> f5237c;

        /* renamed from: d */
        private final List<b0> f5238d;

        /* renamed from: e */
        private int f5239e;

        /* renamed from: f */
        int f5240f;

        /* renamed from: g */
        t f5241g;

        public u() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f5235a = arrayList;
            this.f5236b = null;
            this.f5237c = new ArrayList<>();
            this.f5238d = Collections.unmodifiableList(arrayList);
            this.f5239e = 2;
            this.f5240f = 2;
        }

        private boolean z(b0 b0Var, int i10, int i11, long j10) {
            b0Var.getClass();
            b0Var.f5188r = RecyclerView.this;
            int j11 = b0Var.j();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f5241g.f(j11, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.getClass();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.b0 A(int r12, boolean r13, long r14) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.A(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        void B(b0 b0Var) {
            (b0Var.f5185o ? this.f5236b : this.f5235a).remove(b0Var);
            b0Var.f5184n = null;
            b0Var.f5185o = false;
            b0Var.d();
        }

        void C() {
            n nVar = RecyclerView.this.f5153w;
            this.f5240f = this.f5239e + (nVar != null ? nVar.f5214l : 0);
            for (int size = this.f5237c.size() - 1; size >= 0 && this.f5237c.size() > this.f5240f; size--) {
                s(size);
            }
        }

        boolean D(b0 b0Var) {
            if (b0Var.t()) {
                return RecyclerView.this.f5144r0.b();
            }
            if (b0Var.f5173c >= 0) {
                RecyclerView.this.getClass();
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b0Var + RecyclerView.this.B());
        }

        void E(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f5237c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f5237c.get(size);
                if (b0Var != null && (i12 = b0Var.f5173c) >= i10 && i12 < i13) {
                    b0Var.b(2);
                    s(size);
                }
            }
        }

        public void a(b0 b0Var, boolean z10) {
            RecyclerView.k(b0Var);
            View view = b0Var.f5171a;
            androidx.recyclerview.widget.i iVar = RecyclerView.this.f5158y0;
            if (iVar != null) {
                androidx.core.view.a n10 = iVar.n();
                x0.W(view, n10 instanceof i.a ? ((i.a) n10).n(view) : null);
            }
            if (z10) {
                e(b0Var);
            }
            b0Var.f5188r = null;
            g().e(b0Var);
        }

        public void b() {
            this.f5235a.clear();
            r();
        }

        void c() {
            this.f5235a.clear();
            ArrayList<b0> arrayList = this.f5236b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int d(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f5144r0.a()) {
                return !RecyclerView.this.f5144r0.b() ? i10 : RecyclerView.this.f5126d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f5144r0.a() + RecyclerView.this.B());
        }

        void e(b0 b0Var) {
            v vVar = RecyclerView.this.f5155x;
            if (vVar != null) {
                vVar.a(b0Var);
            }
            int size = RecyclerView.this.f5157y.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f5157y.get(i10).a(b0Var);
            }
            RecyclerView.this.getClass();
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5144r0 != null) {
                recyclerView.f5130f.d(b0Var);
            }
        }

        b0 f(int i10) {
            int size;
            ArrayList<b0> arrayList = this.f5236b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            for (int i11 = 0; i11 < size; i11++) {
                b0 b0Var = this.f5236b.get(i11);
                if (!b0Var.H() && b0Var.k() == i10) {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            RecyclerView.this.getClass();
            throw null;
        }

        t g() {
            if (this.f5241g == null) {
                this.f5241g = new t();
            }
            return this.f5241g;
        }

        int h() {
            return this.f5235a.size();
        }

        b0 i(int i10, boolean z10) {
            View b10;
            int size = this.f5235a.size();
            for (int i11 = 0; i11 < size; i11++) {
                b0 b0Var = this.f5235a.get(i11);
                if (!b0Var.H() && b0Var.k() == i10 && !b0Var.r() && (RecyclerView.this.f5144r0.f5252h || !b0Var.t())) {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            if (z10 || (b10 = RecyclerView.this.f5128e.b(i10)) == null) {
                int size2 = this.f5237c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    b0 b0Var2 = this.f5237c.get(i12);
                    if (!b0Var2.r() && b0Var2.k() == i10 && !b0Var2.p()) {
                        if (!z10) {
                            this.f5237c.remove(i12);
                        }
                        return b0Var2;
                    }
                }
                return null;
            }
            b0 I = RecyclerView.I(b10);
            RecyclerView.this.f5128e.m(b10);
            int h10 = RecyclerView.this.f5128e.h(b10);
            if (h10 != -1) {
                RecyclerView.this.f5128e.a(h10);
                v(b10);
                I.b(8224);
                return I;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I + RecyclerView.this.B());
        }

        View j(int i10) {
            return this.f5235a.get(i10).f5171a;
        }

        void k() {
            int size = this.f5237c.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f5237c.get(i10).f5171a.getLayoutParams();
                if (oVar != null) {
                    oVar.f5227c = true;
                }
            }
        }

        void l() {
            int size = this.f5237c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var = this.f5237c.get(i10);
                if (b0Var != null) {
                    b0Var.b(6);
                    b0Var.a(null);
                }
            }
            RecyclerView.this.getClass();
            r();
        }

        void m(int i10, int i11) {
            int size = this.f5237c.size();
            for (int i12 = 0; i12 < size; i12++) {
                b0 b0Var = this.f5237c.get(i12);
                if (b0Var != null && b0Var.f5173c >= i10) {
                    b0Var.y(i11, false);
                }
            }
        }

        void n(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f5237c.size();
            for (int i16 = 0; i16 < size; i16++) {
                b0 b0Var = this.f5237c.get(i16);
                if (b0Var != null && (i15 = b0Var.f5173c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        b0Var.y(i11 - i10, false);
                    } else {
                        b0Var.y(i12, false);
                    }
                }
            }
        }

        void o(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f5237c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f5237c.get(size);
                if (b0Var != null) {
                    int i13 = b0Var.f5173c;
                    if (i13 >= i12) {
                        b0Var.y(-i11, z10);
                    } else if (i13 >= i10) {
                        b0Var.b(8);
                        s(size);
                    }
                }
            }
        }

        void p(g gVar, g gVar2, boolean z10) {
            b();
            g().d(gVar, gVar2, z10);
        }

        void q(View view) {
            b0 I = RecyclerView.I(view);
            I.f5184n = null;
            I.f5185o = false;
            I.d();
            u(I);
        }

        void r() {
            for (int size = this.f5237c.size() - 1; size >= 0; size--) {
                s(size);
            }
            this.f5237c.clear();
            if (RecyclerView.O0) {
                RecyclerView.this.f5142q0.a();
            }
        }

        void s(int i10) {
            a(this.f5237c.get(i10), true);
            this.f5237c.remove(i10);
        }

        public void t(View view) {
            b0 I = RecyclerView.I(view);
            if (I.v()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (I.u()) {
                I.G();
            } else if (I.H()) {
                I.d();
            }
            u(I);
            if (RecyclerView.this.f5121a0 == null || I.s()) {
                return;
            }
            RecyclerView.this.f5121a0.f(I);
        }

        void u(b0 b0Var) {
            boolean z10;
            boolean z11 = true;
            if (b0Var.u() || b0Var.f5171a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(b0Var.u());
                sb2.append(" isAttached:");
                sb2.append(b0Var.f5171a.getParent() != null);
                sb2.append(RecyclerView.this.B());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (b0Var.v()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + RecyclerView.this.B());
            }
            if (b0Var.F()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.B());
            }
            boolean g10 = b0Var.g();
            RecyclerView.this.getClass();
            if (b0Var.s()) {
                if (this.f5240f <= 0 || b0Var.n(526)) {
                    z10 = false;
                } else {
                    int size = this.f5237c.size();
                    if (size >= this.f5240f && size > 0) {
                        s(0);
                        size--;
                    }
                    if (RecyclerView.O0 && size > 0 && !RecyclerView.this.f5142q0.c(b0Var.f5173c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f5142q0.c(this.f5237c.get(i10).f5173c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f5237c.add(size, b0Var);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(b0Var, true);
                }
                r1 = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f5130f.d(b0Var);
            if (r1 || z11 || !g10) {
                return;
            }
            b0Var.f5188r = null;
        }

        void v(View view) {
            ArrayList<b0> arrayList;
            b0 I = RecyclerView.I(view);
            if (!I.n(12) && I.w() && !RecyclerView.this.i(I)) {
                if (this.f5236b == null) {
                    this.f5236b = new ArrayList<>();
                }
                I.D(this, true);
                arrayList = this.f5236b;
            } else {
                if (I.r() && !I.t()) {
                    RecyclerView.this.getClass();
                    throw null;
                }
                I.D(this, false);
                arrayList = this.f5235a;
            }
            arrayList.add(I);
        }

        void w(t tVar) {
            t tVar2 = this.f5241g;
            if (tVar2 != null) {
                tVar2.b();
            }
            this.f5241g = tVar;
            if (tVar != null) {
                RecyclerView.this.getAdapter();
            }
        }

        void x(z zVar) {
        }

        public void y(int i10) {
            this.f5239e = i10;
            C();
        }
    }

    /* loaded from: classes.dex */
    public interface v {
        void a(b0 b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class w extends h {
        w() {
        }
    }

    /* loaded from: classes.dex */
    public static class x extends v0.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: c */
        Parcelable f5244c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<x> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5244c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }

        void b(x xVar) {
            this.f5244c = xVar.f5244c;
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f5244c, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class y {

        /* renamed from: b */
        private SparseArray<Object> f5246b;

        /* renamed from: a */
        int f5245a = -1;

        /* renamed from: c */
        int f5247c = 0;

        /* renamed from: d */
        int f5248d = 0;

        /* renamed from: e */
        int f5249e = 1;

        /* renamed from: f */
        int f5250f = 0;

        /* renamed from: g */
        boolean f5251g = false;

        /* renamed from: h */
        boolean f5252h = false;

        /* renamed from: i */
        boolean f5253i = false;

        /* renamed from: j */
        boolean f5254j = false;

        /* renamed from: k */
        boolean f5255k = false;

        /* renamed from: l */
        boolean f5256l = false;

        public int a() {
            return this.f5252h ? this.f5247c - this.f5248d : this.f5250f;
        }

        public boolean b() {
            return this.f5252h;
        }

        public void c(g gVar) {
            this.f5249e = 1;
            throw null;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5245a + ", mData=" + this.f5246b + ", mItemCount=" + this.f5250f + ", mIsMeasuring=" + this.f5254j + ", mPreviousLayoutItemCount=" + this.f5247c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5248d + ", mStructureChanged=" + this.f5251g + ", mInPreLayout=" + this.f5252h + ", mRunSimpleAnimations=" + this.f5255k + ", mRunPredictiveAnimations=" + this.f5256l + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {
    }

    static {
        Class<?> cls = Integer.TYPE;
        R0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        S0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q1.a.f23377a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5120a = new w();
        this.f5122b = new u();
        this.f5130f = new androidx.recyclerview.widget.m();
        this.f5145s = new a();
        this.f5147t = new Rect();
        this.f5149u = new Rect();
        this.f5151v = new RectF();
        this.f5157y = new ArrayList();
        this.f5159z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.G = 0;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = new j();
        this.f5121a0 = new androidx.recyclerview.widget.c();
        this.f5123b0 = 0;
        this.f5125c0 = -1;
        this.f5137l0 = Float.MIN_VALUE;
        this.f5138m0 = Float.MIN_VALUE;
        this.f5139n0 = true;
        this.f5140o0 = new a0();
        this.f5142q0 = O0 ? new e.b() : null;
        this.f5144r0 = new y();
        this.f5150u0 = false;
        this.f5152v0 = false;
        this.f5154w0 = new l();
        this.f5156x0 = false;
        this.f5160z0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new ArrayList();
        this.F0 = new b();
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5134i0 = viewConfiguration.getScaledTouchSlop();
        this.f5137l0 = h2.b(viewConfiguration, context);
        this.f5138m0 = h2.d(viewConfiguration, context);
        this.f5135j0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5136k0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5121a0.q(this.f5154w0);
        N();
        P();
        O();
        if (x0.s(this) == 0) {
            x0.f0(this, 1);
        }
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.i(this));
        int[] iArr = q1.c.f23386f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        x0.U(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(q1.c.f23395o);
        if (obtainStyledAttributes.getInt(q1.c.f23389i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5143r = obtainStyledAttributes.getBoolean(q1.c.f23388h, true);
        boolean z10 = obtainStyledAttributes.getBoolean(q1.c.f23390j, false);
        this.E = z10;
        if (z10) {
            Q((StateListDrawable) obtainStyledAttributes.getDrawable(q1.c.f23393m), obtainStyledAttributes.getDrawable(q1.c.f23394n), (StateListDrawable) obtainStyledAttributes.getDrawable(q1.c.f23391k), obtainStyledAttributes.getDrawable(q1.c.f23392l));
        }
        obtainStyledAttributes.recycle();
        n(context, string, attributeSet, i10, 0);
        int[] iArr2 = K0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        x0.U(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    private boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = this.A.get(i10);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.B = rVar;
                return true;
            }
        }
        return false;
    }

    private void H0() {
        this.f5140o0.f();
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.F0();
        }
    }

    public static b0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f5225a;
    }

    static void J(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f5226b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
    }

    private String K(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private boolean M() {
        int d10 = this.f5128e.d();
        for (int i10 = 0; i10 < d10; i10++) {
            b0 I = I(this.f5128e.c(i10));
            if (I != null && !I.F() && I.w()) {
                return true;
            }
        }
        return false;
    }

    private void O() {
        if (x0.t(this) == 0) {
            x0.g0(this, 8);
        }
    }

    private void P() {
        this.f5128e = new androidx.recyclerview.widget.b(new e());
    }

    private boolean U(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || C(view2) == null) {
            return false;
        }
        if (view == null || C(view) == null) {
            return true;
        }
        this.f5147t.set(0, 0, view.getWidth(), view.getHeight());
        this.f5149u.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5147t);
        offsetDescendantRectToMyCoords(view2, this.f5149u);
        char c10 = 65535;
        int i12 = this.f5153w.C() == 1 ? -1 : 1;
        Rect rect = this.f5147t;
        int i13 = rect.left;
        Rect rect2 = this.f5149u;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + B());
    }

    private void X(int i10, int i11, MotionEvent motionEvent, int i12) {
        n nVar = this.f5153w;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        int[] iArr = this.D0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean b10 = nVar.b();
        boolean c10 = this.f5153w.c();
        D0(c10 ? (b10 ? 1 : 0) | 2 : b10 ? 1 : 0, i12);
        if (s(b10 ? i10 : 0, c10 ? i11 : 0, this.D0, this.B0, i12)) {
            int[] iArr2 = this.D0;
            i10 -= iArr2[0];
            i11 -= iArr2[1];
        }
        u0(b10 ? i10 : 0, c10 ? i11 : 0, motionEvent, i12);
        androidx.recyclerview.widget.e eVar = this.f5141p0;
        if (eVar != null && (i10 != 0 || i11 != 0)) {
            eVar.f(this, i10, i11);
        }
        F0(i12);
    }

    private void f0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5125c0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5125c0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f5132g0 = x10;
            this.f5129e0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f5133h0 = y10;
            this.f5131f0 = y10;
        }
    }

    private o0 getScrollingChildHelper() {
        if (this.A0 == null) {
            this.A0 = new o0(this);
        }
        return this.A0;
    }

    private boolean h0() {
        return this.f5121a0 != null && this.f5153w.G0();
    }

    private void i0() {
        boolean z10;
        boolean z11;
        if (this.O) {
            this.f5126d.t();
            if (this.P) {
                this.f5153w.h0(this);
            }
        }
        if (h0()) {
            this.f5126d.r();
        } else {
            this.f5126d.j();
        }
        boolean z12 = false;
        boolean z13 = this.f5150u0 || this.f5152v0;
        y yVar = this.f5144r0;
        if (!this.F || this.f5121a0 == null || (!(z11 = this.O) && !z13 && !this.f5153w.f5209g)) {
            z10 = false;
        } else {
            if (z11) {
                throw null;
            }
            z10 = true;
        }
        yVar.f5255k = z10;
        if (z10 && z13 && !this.O && h0()) {
            z12 = true;
        }
        yVar.f5256l = z12;
    }

    private void j() {
        t0();
        setScrollState(0);
    }

    static void k(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f5172b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == b0Var.f5171a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                b0Var.f5172b = null;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.y()
            android.widget.EdgeEffect r1 = r6.T
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            androidx.core.widget.d.c(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.z()
            android.widget.EdgeEffect r1 = r6.V
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.A()
            android.widget.EdgeEffect r9 = r6.U
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.c(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.x()
            android.widget.EdgeEffect r9 = r6.W
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.c(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            androidx.core.view.x0.Q(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.k0(float, float, float, float):void");
    }

    private void m0() {
        boolean z10;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.T.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.W.isFinished();
        }
        if (z10) {
            x0.Q(this);
        }
    }

    private void n(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String K = K(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(K, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(n.class);
                try {
                    constructor = asSubclass.getConstructor(R0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + K, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + K, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + K, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + K, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + K, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + K, e16);
            }
        }
    }

    private void q() {
        int i10 = this.K;
        this.K = 0;
        if (i10 == 0 || !S()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(RecognitionOptions.PDF417);
        androidx.core.view.accessibility.b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void s0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5147t.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f5227c) {
                Rect rect = oVar.f5226b;
                Rect rect2 = this.f5147t;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5147t);
            offsetRectIntoDescendantCoords(view, this.f5147t);
        }
        this.f5153w.B0(this, view, this.f5147t, !this.F, view2 == null);
    }

    private void t0() {
        VelocityTracker velocityTracker = this.f5127d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        F0(0);
        m0();
    }

    private void v0(g gVar, boolean z10, boolean z11) {
        if (!z10 || z11) {
            n0();
        }
        this.f5126d.t();
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.U(null, null);
        }
        this.f5122b.p(null, null, z10);
        this.f5144r0.f5251g = true;
    }

    private boolean w(MotionEvent motionEvent) {
        r rVar = this.B;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return D(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.B = null;
        }
        return true;
    }

    void A() {
        int measuredWidth;
        int measuredHeight;
        if (this.U != null) {
            return;
        }
        EdgeEffect a10 = this.S.a(this, 1);
        this.U = a10;
        if (this.f5143r) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a10.setSize(measuredWidth, measuredHeight);
    }

    public void A0(int i10, int i11, Interpolator interpolator, int i12) {
        B0(i10, i11, interpolator, i12, false);
    }

    String B() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f5153w + ", context:" + getContext();
    }

    void B0(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        n nVar = this.f5153w;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!nVar.b()) {
            i10 = 0;
        }
        if (!this.f5153w.c()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (!(i12 == Integer.MIN_VALUE || i12 > 0)) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            D0(i13, 1);
        }
        this.f5140o0.e(i10, i11, i12, interpolator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    void C0() {
        int i10 = this.G + 1;
        this.G = i10;
        if (i10 != 1 || this.I) {
            return;
        }
        this.H = false;
    }

    public boolean D0(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.b0 E(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f5128e
            int r0 = r0.g()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f5128e
            android.view.View r3 = r3.f(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r3 = I(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.t()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f5173c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.k()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f5128e
            android.view.View r4 = r3.f5171a
            boolean r1 = r1.i(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(int, boolean):androidx.recyclerview.widget.RecyclerView$b0");
    }

    void E0(boolean z10) {
        if (this.G < 1) {
            this.G = 1;
        }
        if (!z10 && !this.I) {
            this.H = false;
        }
        int i10 = this.G;
        if (i10 == 1) {
            if (z10 && this.H && !this.I) {
                n nVar = this.f5153w;
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G = i10 - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean F(int i10, int i11) {
        n nVar = this.f5153w;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.I) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f5153w.c();
        if (b10 == 0 || Math.abs(i10) < this.f5135j0) {
            i10 = 0;
        }
        if (!c10 || Math.abs(i11) < this.f5135j0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = b10 != 0 || c10;
            dispatchNestedFling(f10, f11, z10);
            int i12 = b10;
            if (z10) {
                if (c10) {
                    i12 = (b10 ? 1 : 0) | 2;
                }
                D0(i12, 1);
                int i13 = this.f5136k0;
                int max = Math.max(-i13, Math.min(i10, i13));
                int i14 = this.f5136k0;
                this.f5140o0.b(max, Math.max(-i14, Math.min(i11, i14)));
                return true;
            }
        }
        return false;
    }

    public void F0(int i10) {
        getScrollingChildHelper().s(i10);
    }

    int G(b0 b0Var) {
        if (b0Var.n(524) || !b0Var.q()) {
            return -1;
        }
        return this.f5126d.e(b0Var.f5173c);
    }

    public void G0() {
        setScrollState(0);
        H0();
    }

    long H(b0 b0Var) {
        throw null;
    }

    void I0(int i10, int i11, Object obj) {
        int i12;
        int g10 = this.f5128e.g();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < g10; i14++) {
            View f10 = this.f5128e.f(i14);
            b0 I = I(f10);
            if (I != null && !I.F() && (i12 = I.f5173c) >= i10 && i12 < i13) {
                I.b(2);
                I.a(obj);
                ((o) f10.getLayoutParams()).f5227c = true;
            }
        }
        this.f5122b.E(i10, i11);
    }

    public boolean L() {
        return !this.F || this.O || this.f5126d.p();
    }

    void N() {
        this.f5126d = new androidx.recyclerview.widget.a(new f());
    }

    void Q(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(q1.b.f23378a), resources.getDimensionPixelSize(q1.b.f23380c), resources.getDimensionPixelOffset(q1.b.f23379b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + B());
        }
    }

    void R() {
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    boolean S() {
        AccessibilityManager accessibilityManager = this.M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean T() {
        return this.Q > 0;
    }

    void V() {
        int g10 = this.f5128e.g();
        for (int i10 = 0; i10 < g10; i10++) {
            ((o) this.f5128e.f(i10).getLayoutParams()).f5227c = true;
        }
        this.f5122b.k();
    }

    void W() {
        int g10 = this.f5128e.g();
        for (int i10 = 0; i10 < g10; i10++) {
            b0 I = I(this.f5128e.f(i10));
            if (I != null && !I.F()) {
                I.b(6);
            }
        }
        V();
        this.f5122b.l();
    }

    void Y(int i10, int i11) {
        int g10 = this.f5128e.g();
        for (int i12 = 0; i12 < g10; i12++) {
            b0 I = I(this.f5128e.f(i12));
            if (I != null && !I.F() && I.f5173c >= i10) {
                I.y(i11, false);
                this.f5144r0.f5251g = true;
            }
        }
        this.f5122b.m(i10, i11);
        requestLayout();
    }

    void Z(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int g10 = this.f5128e.g();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < g10; i16++) {
            b0 I = I(this.f5128e.f(i16));
            if (I != null && (i15 = I.f5173c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    I.y(i11 - i10, false);
                } else {
                    I.y(i14, false);
                }
                this.f5144r0.f5251g = true;
            }
        }
        this.f5122b.n(i10, i11);
        requestLayout();
    }

    void a(int i10, int i11) {
        if (i10 < 0) {
            y();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            z();
            if (this.V.isFinished()) {
                this.V.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            A();
            if (this.U.isFinished()) {
                this.U.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            x();
            if (this.W.isFinished()) {
                this.W.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        x0.Q(this);
    }

    void a0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int g10 = this.f5128e.g();
        for (int i13 = 0; i13 < g10; i13++) {
            b0 I = I(this.f5128e.f(i13));
            if (I != null && !I.F()) {
                int i14 = I.f5173c;
                if (i14 >= i12) {
                    I.y(-i11, z10);
                } else if (i14 >= i10) {
                    I.h(i10 - 1, -i11, z10);
                }
                this.f5144r0.f5251g = true;
            }
        }
        this.f5122b.o(i10, i11, z10);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.f5153w;
        if (nVar == null || !nVar.V(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b0(View view) {
    }

    public void c0() {
        this.Q++;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f5153w.d((o) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.b()) {
            return this.f5153w.f(this.f5144r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.b()) {
            return this.f5153w.g(this.f5144r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.b()) {
            return this.f5153w.h(this.f5144r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.c()) {
            return this.f5153w.i(this.f5144r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.c()) {
            return this.f5153w.j(this.f5144r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        n nVar = this.f5153w;
        if (nVar != null && nVar.c()) {
            return this.f5153w.k(this.f5144r0);
        }
        return 0;
    }

    public void d(m mVar) {
        e(mVar, -1);
    }

    void d0() {
        e0(true);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        float f10;
        int i10;
        super.draw(canvas);
        int size = this.f5159z.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f5159z.get(i11).g(canvas, this, this.f5144r0);
        }
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5143r ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.T;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5143r) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.U;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5143r ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.V;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5143r) {
                f10 = (-getWidth()) + getPaddingRight();
                i10 = (-getHeight()) + getPaddingBottom();
            } else {
                f10 = -getWidth();
                i10 = -getHeight();
            }
            canvas.translate(f10, i10);
            EdgeEffect edgeEffect8 = this.W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.f5121a0 == null || this.f5159z.size() <= 0 || !this.f5121a0.l()) ? z10 : true) {
            x0.Q(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void e(m mVar, int i10) {
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5159z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f5159z.add(mVar);
        } else {
            this.f5159z.add(i10, mVar);
        }
        V();
        requestLayout();
    }

    public void e0(boolean z10) {
        int i10 = this.Q - 1;
        this.Q = i10;
        if (i10 < 1) {
            this.Q = 0;
            if (z10) {
                q();
                v();
            }
        }
    }

    public void f(r rVar) {
        this.A.add(rVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View f02 = this.f5153w.f0(view, i10);
        if (f02 != null) {
            return f02;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            return U(view, findNextFocus, i10) ? findNextFocus : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        s0(findNextFocus, null);
        return view;
    }

    public void g(s sVar) {
        if (this.f5148t0 == null) {
            this.f5148t0 = new ArrayList();
        }
        this.f5148t0.add(sVar);
    }

    public void g0(int i10) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f5153w;
        if (nVar != null) {
            return nVar.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f5153w;
        if (nVar != null) {
            return nVar.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f5153w;
        if (nVar != null) {
            return nVar.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.f5153w;
        return nVar != null ? nVar.q() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5143r;
    }

    public androidx.recyclerview.widget.i getCompatAccessibilityDelegate() {
        return this.f5158y0;
    }

    public j getEdgeEffectFactory() {
        return this.S;
    }

    public k getItemAnimator() {
        return this.f5121a0;
    }

    public int getItemDecorationCount() {
        return this.f5159z.size();
    }

    public n getLayoutManager() {
        return this.f5153w;
    }

    public int getMaxFlingVelocity() {
        return this.f5136k0;
    }

    public int getMinFlingVelocity() {
        return this.f5135j0;
    }

    public long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5139n0;
    }

    public t getRecycledViewPool() {
        return this.f5122b.g();
    }

    public int getScrollState() {
        return this.f5123b0;
    }

    void h(String str) {
        if (T()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + B());
        }
        if (this.R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + B()));
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    boolean i(b0 b0Var) {
        k kVar = this.f5121a0;
        return kVar == null || kVar.c(b0Var, b0Var.m());
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.I;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void j0(boolean z10) {
        this.P = z10 | this.P;
        this.O = true;
        W();
    }

    void l(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.T.onRelease();
            z10 = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.V.onRelease();
            z10 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.U.onRelease();
            z10 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.W.onRelease();
            z10 |= this.W.isFinished();
        }
        if (z10) {
            x0.Q(this);
        }
    }

    void l0(b0 b0Var, k.c cVar) {
        b0Var.B(0, 8192);
        if (this.f5144r0.f5253i && b0Var.w() && !b0Var.t() && !b0Var.F()) {
            this.f5130f.a(H(b0Var), b0Var);
        }
        this.f5130f.b(b0Var, cVar);
    }

    void m() {
        if (!this.F || this.O) {
            androidx.core.os.l.a("RV FullInvalidate");
            r();
            androidx.core.os.l.b();
            return;
        }
        if (this.f5126d.p()) {
            if (this.f5126d.o(4) && !this.f5126d.o(11)) {
                androidx.core.os.l.a("RV PartialInvalidate");
                C0();
                c0();
                this.f5126d.r();
                if (!this.H) {
                    if (M()) {
                        r();
                    } else {
                        this.f5126d.i();
                    }
                }
                E0(true);
                d0();
            } else {
                if (!this.f5126d.p()) {
                    return;
                }
                androidx.core.os.l.a("RV FullInvalidate");
                r();
            }
            androidx.core.os.l.b();
        }
    }

    public void n0() {
        k kVar = this.f5121a0;
        if (kVar != null) {
            kVar.g();
        }
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.v0(this.f5122b);
            this.f5153w.w0(this.f5122b);
        }
        this.f5122b.b();
    }

    void o(int i10, int i11) {
        setMeasuredDimension(n.e(i10, getPaddingLeft() + getPaddingRight(), x0.w(this)), n.e(i11, getPaddingTop() + getPaddingBottom(), x0.v(this)));
    }

    boolean o0(View view) {
        C0();
        boolean l10 = this.f5128e.l(view);
        if (l10) {
            b0 I = I(view);
            this.f5122b.B(I);
            this.f5122b.u(I);
        }
        E0(!l10);
        return l10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L48;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.Q = r0
            r1 = 1
            r5.C = r1
            boolean r2 = r5.F
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.F = r1
            androidx.recyclerview.widget.RecyclerView$n r1 = r5.f5153w
            if (r1 == 0) goto L1e
            r1.l(r5)
        L1e:
            r5.f5156x0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.O0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.e.f5397e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f5141p0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f5141p0 = r1
            android.view.Display r1 = androidx.core.view.x0.q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f5141p0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5401c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f5141p0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        k kVar = this.f5121a0;
        if (kVar != null) {
            kVar.g();
        }
        G0();
        this.C = false;
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.m(this, this.f5122b);
        }
        this.E0.clear();
        removeCallbacks(this.F0);
        this.f5130f.c();
        if (!O0 || (eVar = this.f5141p0) == null) {
            return;
        }
        eVar.j(this);
        this.f5141p0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5159z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5159z.get(i10).e(canvas, this, this.f5144r0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f5153w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.I
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f5153w
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5153w
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5153w
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5153w
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f5137l0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f5138m0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.X(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.I) {
            return false;
        }
        this.B = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        n nVar = this.f5153w;
        if (nVar == null) {
            return false;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f5153w.c();
        if (this.f5127d0 == null) {
            this.f5127d0 = VelocityTracker.obtain();
        }
        this.f5127d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.J) {
                this.J = false;
            }
            this.f5125c0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f5132g0 = x10;
            this.f5129e0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f5133h0 = y10;
            this.f5131f0 = y10;
            if (this.f5123b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                F0(1);
            }
            int[] iArr = this.C0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = b10;
            if (c10) {
                i10 = (b10 ? 1 : 0) | 2;
            }
            D0(i10, 0);
        } else if (actionMasked == 1) {
            this.f5127d0.clear();
            F0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5125c0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5125c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5123b0 != 1) {
                int i11 = x11 - this.f5129e0;
                int i12 = y11 - this.f5131f0;
                if (b10 == 0 || Math.abs(i11) <= this.f5134i0) {
                    z10 = false;
                } else {
                    this.f5132g0 = x11;
                    z10 = true;
                }
                if (c10 && Math.abs(i12) > this.f5134i0) {
                    this.f5133h0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.f5125c0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5132g0 = x12;
            this.f5129e0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5133h0 = y12;
            this.f5131f0 = y12;
        } else if (actionMasked == 6) {
            f0(motionEvent);
        }
        return this.f5123b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.l.a("RV OnLayout");
        r();
        androidx.core.os.l.b();
        this.F = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        n nVar = this.f5153w;
        if (nVar == null) {
            o(i10, i11);
            return;
        }
        if (nVar.Q()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f5153w.m0(this.f5122b, this.f5144r0, i10, i11);
            this.G0 = mode == 1073741824 && mode2 == 1073741824;
            return;
        }
        if (this.D) {
            this.f5153w.m0(this.f5122b, this.f5144r0, i10, i11);
            return;
        }
        if (this.L) {
            C0();
            c0();
            i0();
            d0();
            y yVar = this.f5144r0;
            if (yVar.f5256l) {
                yVar.f5252h = true;
            } else {
                this.f5126d.j();
                this.f5144r0.f5252h = false;
            }
            this.L = false;
            E0(false);
        } else if (this.f5144r0.f5256l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        this.f5144r0.f5250f = 0;
        C0();
        this.f5153w.m0(this.f5122b, this.f5144r0, i10, i11);
        E0(false);
        this.f5144r0.f5252h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f5124c = xVar;
        super.onRestoreInstanceState(xVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f5124c;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            n nVar = this.f5153w;
            xVar.f5244c = nVar != null ? nVar.p0() : null;
        }
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p(View view) {
        I(view);
        b0(view);
        List<p> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).a(view);
            }
        }
    }

    public void p0(m mVar) {
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5159z.remove(mVar);
        if (this.f5159z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        V();
        requestLayout();
    }

    public void q0(r rVar) {
        this.A.remove(rVar);
        if (this.B == rVar) {
            this.B = null;
        }
    }

    void r() {
        Log.w("RecyclerView", "No adapter attached; skipping layout");
    }

    public void r0(s sVar) {
        List<s> list = this.f5148t0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        b0 I = I(view);
        if (I != null) {
            if (I.v()) {
                I.e();
            } else if (!I.F()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I + B());
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f5153w.o0(this, this.f5144r0, view, view2) && view2 != null) {
            s0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f5153w.A0(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        n nVar = this.f5153w;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        boolean b10 = nVar.b();
        boolean c10 = this.f5153w.c();
        if (b10 || c10) {
            if (!b10) {
                i10 = 0;
            }
            if (!c10) {
                i11 = 0;
            }
            u0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (x0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.i iVar) {
        this.f5158y0 = iVar;
        x0.W(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        v0(gVar, false, true);
        j0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f5143r) {
            R();
        }
        this.f5143r = z10;
        super.setClipToPadding(z10);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        androidx.core.util.h.k(jVar);
        this.S = jVar;
        R();
    }

    public void setHasFixedSize(boolean z10) {
        this.D = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f5121a0;
        if (kVar2 != null) {
            kVar2.g();
            this.f5121a0.q(null);
        }
        this.f5121a0 = kVar;
        if (kVar != null) {
            kVar.q(this.f5154w0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f5122b.y(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(n nVar) {
        if (nVar == this.f5153w) {
            return;
        }
        G0();
        if (this.f5153w != null) {
            k kVar = this.f5121a0;
            if (kVar != null) {
                kVar.g();
            }
            this.f5153w.v0(this.f5122b);
            this.f5153w.w0(this.f5122b);
            this.f5122b.b();
            if (this.C) {
                this.f5153w.m(this, this.f5122b);
            }
            this.f5153w.E0(null);
            this.f5153w = null;
        } else {
            this.f5122b.b();
        }
        this.f5128e.j();
        this.f5153w = nVar;
        if (nVar != null) {
            if (nVar.f5204b != null) {
                throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f5204b.B());
            }
            nVar.E0(this);
            if (this.C) {
                this.f5153w.l(this);
            }
        }
        this.f5122b.C();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(q qVar) {
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f5146s0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f5139n0 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        this.f5122b.w(tVar);
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
        this.f5155x = vVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f5123b0) {
            return;
        }
        this.f5123b0 = i10;
        if (i10 != 2) {
            H0();
        }
        u(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f5134i0 = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f5134i0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(z zVar) {
        this.f5122b.x(zVar);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.I) {
            h("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.I = false;
                if (this.H) {
                    n nVar = this.f5153w;
                }
                this.H = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.I = true;
            this.J = true;
            G0();
        }
    }

    public final void t(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void u(int i10) {
        n nVar = this.f5153w;
        if (nVar != null) {
            nVar.q0(i10);
        }
        g0(i10);
        s sVar = this.f5146s0;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List<s> list = this.f5148t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5148t0.get(size).a(this, i10);
            }
        }
    }

    boolean u0(int i10, int i11, MotionEvent motionEvent, int i12) {
        m();
        if (!this.f5159z.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.D0;
        iArr[0] = 0;
        iArr[1] = 0;
        t(0, 0, 0, 0, this.B0, i12, iArr);
        int[] iArr2 = this.D0;
        int i13 = iArr2[0];
        int i14 = 0 - i13;
        int i15 = iArr2[1];
        int i16 = 0 - i15;
        boolean z10 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.f5132g0;
        int[] iArr3 = this.B0;
        int i18 = iArr3[0];
        this.f5132g0 = i17 - i18;
        int i19 = this.f5133h0;
        int i20 = iArr3[1];
        this.f5133h0 = i19 - i20;
        int[] iArr4 = this.C0;
        iArr4[0] = iArr4[0] + i18;
        iArr4[1] = iArr4[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !n0.a(motionEvent, 8194)) {
                k0(motionEvent.getX(), i14, motionEvent.getY(), i16);
            }
            l(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return z10;
    }

    void v() {
        int i10;
        for (int size = this.E0.size() - 1; size >= 0; size--) {
            b0 b0Var = this.E0.get(size);
            if (b0Var.f5171a.getParent() == this && !b0Var.F() && (i10 = b0Var.f5187q) != -1) {
                x0.f0(b0Var.f5171a, i10);
                b0Var.f5187q = -1;
            }
        }
        this.E0.clear();
    }

    boolean w0(b0 b0Var, int i10) {
        if (!T()) {
            x0.f0(b0Var.f5171a, i10);
            return true;
        }
        b0Var.f5187q = i10;
        this.E0.add(b0Var);
        return false;
    }

    void x() {
        int measuredWidth;
        int measuredHeight;
        if (this.W != null) {
            return;
        }
        EdgeEffect a10 = this.S.a(this, 3);
        this.W = a10;
        if (this.f5143r) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a10.setSize(measuredWidth, measuredHeight);
    }

    boolean x0(AccessibilityEvent accessibilityEvent) {
        if (!T()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        this.K |= a10 != 0 ? a10 : 0;
        return true;
    }

    void y() {
        int measuredHeight;
        int measuredWidth;
        if (this.T != null) {
            return;
        }
        EdgeEffect a10 = this.S.a(this, 0);
        this.T = a10;
        if (this.f5143r) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a10.setSize(measuredHeight, measuredWidth);
    }

    public void y0(int i10, int i11) {
        z0(i10, i11, null);
    }

    void z() {
        int measuredHeight;
        int measuredWidth;
        if (this.V != null) {
            return;
        }
        EdgeEffect a10 = this.S.a(this, 2);
        this.V = a10;
        if (this.f5143r) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a10.setSize(measuredHeight, measuredWidth);
    }

    public void z0(int i10, int i11, Interpolator interpolator) {
        A0(i10, i11, interpolator, Integer.MIN_VALUE);
    }
}
