package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class j extends ConstraintLayout implements q0 {
    public static boolean F0;
    private int A0;
    private boolean B0;
    e C0;
    private boolean D0;
    ArrayList<Integer> E0;
    Interpolator J;
    Interpolator K;
    float L;
    private int M;
    int N;
    private int O;
    private boolean P;
    HashMap<View, g> Q;
    private long R;
    private float S;
    float T;
    float U;
    private long V;
    float W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f2955a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f2956b0;

    /* renamed from: c0, reason: collision with root package name */
    private d f2957c0;

    /* renamed from: d0, reason: collision with root package name */
    int f2958d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f2959e0;

    /* renamed from: f0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f2960f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f2961g0;

    /* renamed from: h0, reason: collision with root package name */
    float f2962h0;

    /* renamed from: i0, reason: collision with root package name */
    float f2963i0;

    /* renamed from: j0, reason: collision with root package name */
    long f2964j0;

    /* renamed from: k0, reason: collision with root package name */
    float f2965k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f2966l0;

    /* renamed from: m0, reason: collision with root package name */
    private ArrayList<h> f2967m0;

    /* renamed from: n0, reason: collision with root package name */
    private ArrayList<h> f2968n0;

    /* renamed from: o0, reason: collision with root package name */
    private ArrayList<h> f2969o0;

    /* renamed from: p0, reason: collision with root package name */
    private CopyOnWriteArrayList<d> f2970p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f2971q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f2972r0;

    /* renamed from: s0, reason: collision with root package name */
    boolean f2973s0;

    /* renamed from: t0, reason: collision with root package name */
    protected boolean f2974t0;

    /* renamed from: u0, reason: collision with root package name */
    float f2975u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f2976v0;

    /* renamed from: w0, reason: collision with root package name */
    private c f2977w0;

    /* renamed from: x0, reason: collision with root package name */
    private Runnable f2978x0;

    /* renamed from: y0, reason: collision with root package name */
    private int[] f2979y0;

    /* renamed from: z0, reason: collision with root package name */
    int f2980z0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f2977w0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2982a;

        static {
            int[] iArr = new int[e.values().length];
            f2982a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2982a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2982a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2982a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        float f2983a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        float f2984b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        int f2985c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f2986d = -1;

        /* renamed from: e, reason: collision with root package name */
        final String f2987e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        final String f2988f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        final String f2989g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        final String f2990h = "motion.EndState";

        c() {
        }

        void a() {
            int i10 = this.f2985c;
            if (i10 != -1 || this.f2986d != -1) {
                if (i10 == -1) {
                    j.this.H(this.f2986d);
                } else {
                    int i11 = this.f2986d;
                    if (i11 == -1) {
                        j.this.E(i10, -1, -1);
                    } else {
                        j.this.F(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f2984b)) {
                if (Float.isNaN(this.f2983a)) {
                    return;
                }
                j.this.setProgress(this.f2983a);
            } else {
                j.this.D(this.f2983a, this.f2984b);
                this.f2983a = Float.NaN;
                this.f2984b = Float.NaN;
                this.f2985c = -1;
                this.f2986d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2983a);
            bundle.putFloat("motion.velocity", this.f2984b);
            bundle.putInt("motion.StartState", this.f2985c);
            bundle.putInt("motion.EndState", this.f2986d);
            return bundle;
        }

        public void c() {
            this.f2986d = j.this.O;
            this.f2985c = j.this.M;
            this.f2984b = j.this.getVelocity();
            this.f2983a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f2986d = i10;
        }

        public void e(float f10) {
            this.f2983a = f10;
        }

        public void f(int i10) {
            this.f2985c = i10;
        }

        public void g(Bundle bundle) {
            this.f2983a = bundle.getFloat("motion.progress");
            this.f2984b = bundle.getFloat("motion.velocity");
            this.f2985c = bundle.getInt("motion.StartState");
            this.f2986d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f2984b = f10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10);

        void c(j jVar, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void C() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.f2957c0 == null && ((copyOnWriteArrayList = this.f2970p0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f2973s0 = false;
        Iterator<Integer> it = this.E0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            d dVar = this.f2957c0;
            if (dVar != null) {
                dVar.b(this, next.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f2970p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, next.intValue());
                }
            }
        }
        this.E0.clear();
    }

    private void z() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f2957c0 == null && ((copyOnWriteArrayList = this.f2970p0) == null || copyOnWriteArrayList.isEmpty())) || this.f2972r0 == this.T) {
            return;
        }
        if (this.f2971q0 != -1) {
            d dVar = this.f2957c0;
            if (dVar != null) {
                dVar.c(this, this.M, this.O);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f2970p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.M, this.O);
                }
            }
            this.f2973s0 = true;
        }
        this.f2971q0 = -1;
        float f10 = this.T;
        this.f2972r0 = f10;
        d dVar2 = this.f2957c0;
        if (dVar2 != null) {
            dVar2.a(this, this.M, this.O, f10);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f2970p0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.M, this.O, this.T);
            }
        }
        this.f2973s0 = true;
    }

    protected void A() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f2957c0 != null || ((copyOnWriteArrayList = this.f2970p0) != null && !copyOnWriteArrayList.isEmpty())) && this.f2971q0 == -1) {
            this.f2971q0 = this.N;
            if (this.E0.isEmpty()) {
                i10 = -1;
            } else {
                ArrayList<Integer> arrayList = this.E0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.N;
            if (i10 != i11 && i11 != -1) {
                this.E0.add(Integer.valueOf(i11));
            }
        }
        C();
        Runnable runnable = this.f2978x0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f2979y0;
        if (iArr == null || this.f2980z0 <= 0) {
            return;
        }
        H(iArr[0]);
        int[] iArr2 = this.f2979y0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f2980z0--;
    }

    void B() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4 > 0.0f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        x(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r3 > 0.5f) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f2977w0
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.j$c r0 = new androidx.constraintlayout.motion.widget.j$c
            r0.<init>()
            r2.f2977w0 = r0
        L11:
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f2977w0
            r0.e(r3)
            androidx.constraintlayout.motion.widget.j$c r3 = r2.f2977w0
            r3.h(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.j$e r0 = androidx.constraintlayout.motion.widget.j.e.MOVING
            r2.setState(r0)
            r2.L = r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L34
            if (r4 <= 0) goto L30
        L2f:
            r0 = r1
        L30:
            r2.x(r0)
            goto L43
        L34:
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L43
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L43
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L30
            goto L2f
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.D(float, float):void");
    }

    public void E(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.N = i10;
        this.M = -1;
        this.O = -1;
        androidx.constraintlayout.widget.d dVar = this.f3017v;
        if (dVar != null) {
            dVar.d(i10, i11, i12);
        }
    }

    public void F(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f2977w0 == null) {
            this.f2977w0 = new c();
        }
        this.f2977w0.f(i10);
        this.f2977w0.d(i11);
    }

    public void G() {
        x(1.0f);
        this.f2978x0 = null;
    }

    public void H(int i10) {
        if (isAttachedToWindow()) {
            I(i10, -1, -1);
            return;
        }
        if (this.f2977w0 == null) {
            this.f2977w0 = new c();
        }
        this.f2977w0.d(i10);
    }

    public void I(int i10, int i11, int i12) {
        J(i10, i11, i12, -1);
    }

    public void J(int i10, int i11, int i12, int i13) {
        int i14 = this.N;
        if (i14 == i10) {
            return;
        }
        if (this.M == i10) {
            x(0.0f);
            if (i13 > 0) {
                this.S = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.O == i10) {
            x(1.0f);
            if (i13 > 0) {
                this.S = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.O = i10;
        if (i14 != -1) {
            F(i14, i10);
            x(1.0f);
            this.U = 0.0f;
            G();
            if (i13 > 0) {
                this.S = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f2959e0 = false;
        this.W = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.V = getNanoTime();
        this.R = getNanoTime();
        this.f2955a0 = false;
        this.J = null;
        if (i13 == -1) {
            throw null;
        }
        this.M = -1;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f2969o0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        y(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.N;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f2960f0 == null) {
            this.f2960f0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f2960f0;
    }

    public int getEndState() {
        return this.O;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.U;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.M;
    }

    public float getTargetPosition() {
        return this.W;
    }

    public Bundle getTransitionState() {
        if (this.f2977w0 == null) {
            this.f2977w0 = new c();
        }
        this.f2977w0.c();
        return this.f2977w0.b();
    }

    public long getTransitionTimeMs() {
        return this.S * 1000.0f;
    }

    public float getVelocity() {
        return this.L;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void m(int i10) {
        this.f3017v = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.A0 = display.getRotation();
        }
        B();
        c cVar = this.f2977w0;
        if (cVar != null) {
            if (this.B0) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f2976v0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f2976v0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // androidx.core.view.p0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // androidx.core.view.p0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f2961g0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f2961g0 = false;
    }

    @Override // androidx.core.view.p0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f2964j0 = getNanoTime();
        this.f2965k0 = 0.0f;
        this.f2962h0 = 0.0f;
        this.f2963i0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // androidx.core.view.p0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // androidx.core.view.p0
    public void onStopNestedScroll(View view, int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f2970p0 == null) {
                this.f2970p0 = new CopyOnWriteArrayList<>();
            }
            this.f2970p0.add(hVar);
            if (hVar.v()) {
                if (this.f2967m0 == null) {
                    this.f2967m0 = new ArrayList<>();
                }
                this.f2967m0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f2968n0 == null) {
                    this.f2968n0 = new ArrayList<>();
                }
                this.f2968n0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f2969o0 == null) {
                    this.f2969o0 = new ArrayList<>();
                }
                this.f2969o0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f2967m0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f2968n0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f2974t0) {
            int i10 = this.N;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f2958d0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.B0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.P = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f2968n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2968n0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f2967m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2967m0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        e eVar;
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f2977w0 == null) {
                this.f2977w0 = new c();
            }
            this.f2977w0.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.U == 1.0f && this.N == this.O) {
                setState(e.MOVING);
            }
            this.N = this.M;
            if (this.U != 0.0f) {
                return;
            }
        } else if (f10 < 1.0f) {
            this.N = -1;
            eVar = e.MOVING;
            setState(eVar);
        } else {
            if (this.U == 0.0f && this.N == this.M) {
                setState(e.MOVING);
            }
            this.N = this.O;
            if (this.U != 1.0f) {
                return;
            }
        }
        eVar = e.FINISHED;
        setState(eVar);
    }

    public void setScene(l lVar) {
        k();
        throw null;
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.N = i10;
            return;
        }
        if (this.f2977w0 == null) {
            this.f2977w0 = new c();
        }
        this.f2977w0.f(i10);
        this.f2977w0.d(i10);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.N == -1) {
            return;
        }
        e eVar3 = this.C0;
        this.C0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            z();
        }
        int i10 = b.f2982a[eVar3.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (eVar == eVar4) {
                z();
            }
            if (eVar != eVar2) {
                return;
            }
        } else if (i10 != 3 || eVar != eVar2) {
            return;
        }
        A();
    }

    public void setTransition(int i10) {
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.f2957c0 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2977w0 == null) {
            this.f2977w0 = new c();
        }
        this.f2977w0.g(bundle);
        if (isAttachedToWindow()) {
            this.f2977w0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.M) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.O) + " (pos:" + this.U + " Dpos/Dt:" + this.L;
    }

    void x(float f10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0211, code lost:
    
        if (r1 != r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0214, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0215, code lost:
    
        r21.N = r2;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0221, code lost:
    
        if (r1 != r2) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void y(boolean r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.y(boolean):void");
    }
}
