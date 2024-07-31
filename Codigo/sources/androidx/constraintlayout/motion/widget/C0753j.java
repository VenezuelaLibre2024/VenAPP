package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0755l;
import androidx.constraintlayout.widget.C0762d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InterfaceC1087q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.constraintlayout.motion.widget.j */
/* loaded from: classes.dex */
public class C0753j extends ConstraintLayout implements InterfaceC1087q0 {

    /* renamed from: F0 */
    public static boolean f3300F0;

    /* renamed from: A0 */
    private int f3301A0;

    /* renamed from: B0 */
    private boolean f3302B0;

    /* renamed from: C0 */
    e f3303C0;

    /* renamed from: D0 */
    private boolean f3304D0;

    /* renamed from: E0 */
    ArrayList<Integer> f3305E0;

    /* renamed from: J */
    Interpolator f3306J;

    /* renamed from: K */
    Interpolator f3307K;

    /* renamed from: L */
    float f3308L;

    /* renamed from: M */
    private int f3309M;

    /* renamed from: N */
    int f3310N;

    /* renamed from: O */
    private int f3311O;

    /* renamed from: P */
    private boolean f3312P;

    /* renamed from: Q */
    HashMap<View, C0750g> f3313Q;

    /* renamed from: R */
    private long f3314R;

    /* renamed from: S */
    private float f3315S;

    /* renamed from: T */
    float f3316T;

    /* renamed from: U */
    float f3317U;

    /* renamed from: V */
    private long f3318V;

    /* renamed from: W */
    float f3319W;

    /* renamed from: a0 */
    private boolean f3320a0;

    /* renamed from: b0 */
    boolean f3321b0;

    /* renamed from: c0 */
    private d f3322c0;

    /* renamed from: d0 */
    int f3323d0;

    /* renamed from: e0 */
    private boolean f3324e0;

    /* renamed from: f0 */
    private C0745b f3325f0;

    /* renamed from: g0 */
    boolean f3326g0;

    /* renamed from: h0 */
    float f3327h0;

    /* renamed from: i0 */
    float f3328i0;

    /* renamed from: j0 */
    long f3329j0;

    /* renamed from: k0 */
    float f3330k0;

    /* renamed from: l0 */
    private boolean f3331l0;

    /* renamed from: m0 */
    private ArrayList<C0751h> f3332m0;

    /* renamed from: n0 */
    private ArrayList<C0751h> f3333n0;

    /* renamed from: o0 */
    private ArrayList<C0751h> f3334o0;

    /* renamed from: p0 */
    private CopyOnWriteArrayList<d> f3335p0;

    /* renamed from: q0 */
    private int f3336q0;

    /* renamed from: r0 */
    private float f3337r0;

    /* renamed from: s0 */
    boolean f3338s0;

    /* renamed from: t0 */
    protected boolean f3339t0;

    /* renamed from: u0 */
    float f3340u0;

    /* renamed from: v0 */
    private boolean f3341v0;

    /* renamed from: w0 */
    private c f3342w0;

    /* renamed from: x0 */
    private Runnable f3343x0;

    /* renamed from: y0 */
    private int[] f3344y0;

    /* renamed from: z0 */
    int f3345z0;

    /* renamed from: androidx.constraintlayout.motion.widget.j$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0753j.this.f3342w0.m3797a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.j$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3347a;

        static {
            int[] iArr = new int[e.values().length];
            f3347a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3347a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3347a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3347a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.j$c */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a */
        float f3348a = Float.NaN;

        /* renamed from: b */
        float f3349b = Float.NaN;

        /* renamed from: c */
        int f3350c = -1;

        /* renamed from: d */
        int f3351d = -1;

        /* renamed from: e */
        final String f3352e = "motion.progress";

        /* renamed from: f */
        final String f3353f = "motion.velocity";

        /* renamed from: g */
        final String f3354g = "motion.StartState";

        /* renamed from: h */
        final String f3355h = "motion.EndState";

        c() {
        }

        /* renamed from: a */
        void m3797a() {
            int i10 = this.f3350c;
            if (i10 != -1 || this.f3351d != -1) {
                if (i10 == -1) {
                    C0753j.this.m3791H(this.f3351d);
                } else {
                    int i11 = this.f3351d;
                    if (i11 == -1) {
                        C0753j.this.m3788E(i10, -1, -1);
                    } else {
                        C0753j.this.m3789F(i10, i11);
                    }
                }
                C0753j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f3349b)) {
                if (Float.isNaN(this.f3348a)) {
                    return;
                }
                C0753j.this.setProgress(this.f3348a);
            } else {
                C0753j.this.m3787D(this.f3348a, this.f3349b);
                this.f3348a = Float.NaN;
                this.f3349b = Float.NaN;
                this.f3350c = -1;
                this.f3351d = -1;
            }
        }

        /* renamed from: b */
        public Bundle m3798b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f3348a);
            bundle.putFloat("motion.velocity", this.f3349b);
            bundle.putInt("motion.StartState", this.f3350c);
            bundle.putInt("motion.EndState", this.f3351d);
            return bundle;
        }

        /* renamed from: c */
        public void m3799c() {
            this.f3351d = C0753j.this.f3311O;
            this.f3350c = C0753j.this.f3309M;
            this.f3349b = C0753j.this.getVelocity();
            this.f3348a = C0753j.this.getProgress();
        }

        /* renamed from: d */
        public void m3800d(int i10) {
            this.f3351d = i10;
        }

        /* renamed from: e */
        public void m3801e(float f10) {
            this.f3348a = f10;
        }

        /* renamed from: f */
        public void m3802f(int i10) {
            this.f3350c = i10;
        }

        /* renamed from: g */
        public void m3803g(Bundle bundle) {
            this.f3348a = bundle.getFloat("motion.progress");
            this.f3349b = bundle.getFloat("motion.velocity");
            this.f3350c = bundle.getInt("motion.StartState");
            this.f3351d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void m3804h(float f10) {
            this.f3349b = f10;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.j$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo3770a(C0753j c0753j, int i10, int i11, float f10);

        /* renamed from: b */
        void mo3771b(C0753j c0753j, int i10);

        /* renamed from: c */
        void mo3772c(C0753j c0753j, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.j$e */
    /* loaded from: classes.dex */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: C */
    private void m3780C() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.f3322c0 == null && ((copyOnWriteArrayList = this.f3335p0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f3338s0 = false;
        Iterator<Integer> it = this.f3305E0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            d dVar = this.f3322c0;
            if (dVar != null) {
                dVar.mo3771b(this, next.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f3335p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo3771b(this, next.intValue());
                }
            }
        }
        this.f3305E0.clear();
    }

    /* renamed from: z */
    private void m3784z() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f3322c0 == null && ((copyOnWriteArrayList = this.f3335p0) == null || copyOnWriteArrayList.isEmpty())) || this.f3337r0 == this.f3316T) {
            return;
        }
        if (this.f3336q0 != -1) {
            d dVar = this.f3322c0;
            if (dVar != null) {
                dVar.mo3772c(this, this.f3309M, this.f3311O);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f3335p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo3772c(this, this.f3309M, this.f3311O);
                }
            }
            this.f3338s0 = true;
        }
        this.f3336q0 = -1;
        float f10 = this.f3316T;
        this.f3337r0 = f10;
        d dVar2 = this.f3322c0;
        if (dVar2 != null) {
            dVar2.mo3770a(this, this.f3309M, this.f3311O, f10);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f3335p0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo3770a(this, this.f3309M, this.f3311O, this.f3316T);
            }
        }
        this.f3338s0 = true;
    }

    /* renamed from: A */
    protected void m3785A() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f3322c0 != null || ((copyOnWriteArrayList = this.f3335p0) != null && !copyOnWriteArrayList.isEmpty())) && this.f3336q0 == -1) {
            this.f3336q0 = this.f3310N;
            if (this.f3305E0.isEmpty()) {
                i10 = -1;
            } else {
                ArrayList<Integer> arrayList = this.f3305E0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.f3310N;
            if (i10 != i11 && i11 != -1) {
                this.f3305E0.add(Integer.valueOf(i11));
            }
        }
        m3780C();
        Runnable runnable = this.f3343x0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f3344y0;
        if (iArr == null || this.f3345z0 <= 0) {
            return;
        }
        m3791H(iArr[0]);
        int[] iArr2 = this.f3344y0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f3345z0--;
    }

    /* renamed from: B */
    void m3786B() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4 > 0.0f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        m3795x(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r3 > 0.5f) goto L12;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3787D(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f3342w0
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.j$c r0 = new androidx.constraintlayout.motion.widget.j$c
            r0.<init>()
            r2.f3342w0 = r0
        L11:
            androidx.constraintlayout.motion.widget.j$c r0 = r2.f3342w0
            r0.m3801e(r3)
            androidx.constraintlayout.motion.widget.j$c r3 = r2.f3342w0
            r3.m3804h(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.j$e r0 = androidx.constraintlayout.motion.widget.C0753j.e.MOVING
            r2.setState(r0)
            r2.f3308L = r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L34
            if (r4 <= 0) goto L30
        L2f:
            r0 = r1
        L30:
            r2.m3795x(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0753j.m3787D(float, float):void");
    }

    /* renamed from: E */
    public void m3788E(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.f3310N = i10;
        this.f3309M = -1;
        this.f3311O = -1;
        C0762d c0762d = this.f3395v;
        if (c0762d != null) {
            c0762d.m3859d(i10, i11, i12);
        }
    }

    /* renamed from: F */
    public void m3789F(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f3342w0 == null) {
            this.f3342w0 = new c();
        }
        this.f3342w0.m3802f(i10);
        this.f3342w0.m3800d(i11);
    }

    /* renamed from: G */
    public void m3790G() {
        m3795x(1.0f);
        this.f3343x0 = null;
    }

    /* renamed from: H */
    public void m3791H(int i10) {
        if (isAttachedToWindow()) {
            m3792I(i10, -1, -1);
            return;
        }
        if (this.f3342w0 == null) {
            this.f3342w0 = new c();
        }
        this.f3342w0.m3800d(i10);
    }

    /* renamed from: I */
    public void m3792I(int i10, int i11, int i12) {
        m3793J(i10, i11, i12, -1);
    }

    /* renamed from: J */
    public void m3793J(int i10, int i11, int i12, int i13) {
        int i14 = this.f3310N;
        if (i14 == i10) {
            return;
        }
        if (this.f3309M == i10) {
            m3795x(0.0f);
            if (i13 > 0) {
                this.f3315S = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f3311O == i10) {
            m3795x(1.0f);
            if (i13 > 0) {
                this.f3315S = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f3311O = i10;
        if (i14 != -1) {
            m3789F(i14, i10);
            m3795x(1.0f);
            this.f3317U = 0.0f;
            m3790G();
            if (i13 > 0) {
                this.f3315S = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f3324e0 = false;
        this.f3319W = 1.0f;
        this.f3316T = 0.0f;
        this.f3317U = 0.0f;
        this.f3318V = getNanoTime();
        this.f3314R = getNanoTime();
        this.f3320a0 = false;
        this.f3306J = null;
        if (i13 == -1) {
            throw null;
        }
        this.f3309M = -1;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<C0751h> arrayList = this.f3334o0;
        if (arrayList != null) {
            Iterator<C0751h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m3777w(canvas);
            }
        }
        m3796y(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f3310N;
    }

    public ArrayList<C0755l.a> getDefinedTransitions() {
        return null;
    }

    public C0745b getDesignTool() {
        if (this.f3325f0 == null) {
            this.f3325f0 = new C0745b(this);
        }
        return this.f3325f0;
    }

    public int getEndState() {
        return this.f3311O;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f3317U;
    }

    public C0755l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f3309M;
    }

    public float getTargetPosition() {
        return this.f3319W;
    }

    public Bundle getTransitionState() {
        if (this.f3342w0 == null) {
            this.f3342w0 = new c();
        }
        this.f3342w0.m3799c();
        return this.f3342w0.m3798b();
    }

    public long getTransitionTimeMs() {
        return this.f3315S * 1000.0f;
    }

    public float getVelocity() {
        return this.f3308L;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: m */
    protected void mo3794m(int i10) {
        this.f3395v = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f3301A0 = display.getRotation();
        }
        m3786B();
        c cVar = this.f3342w0;
        if (cVar != null) {
            if (this.f3302B0) {
                post(new a());
            } else {
                cVar.m3797a();
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
        this.f3341v0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f3341v0 = false;
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

    @Override // androidx.core.view.InterfaceC1082p0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // androidx.core.view.InterfaceC1082p0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.InterfaceC1087q0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f3326g0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f3326g0 = false;
    }

    @Override // androidx.core.view.InterfaceC1082p0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f3329j0 = getNanoTime();
        this.f3330k0 = 0.0f;
        this.f3327h0 = 0.0f;
        this.f3328i0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // androidx.core.view.InterfaceC1082p0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // androidx.core.view.InterfaceC1082p0
    public void onStopNestedScroll(View view, int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0751h) {
            C0751h c0751h = (C0751h) view;
            if (this.f3335p0 == null) {
                this.f3335p0 = new CopyOnWriteArrayList<>();
            }
            this.f3335p0.add(c0751h);
            if (c0751h.m3776v()) {
                if (this.f3332m0 == null) {
                    this.f3332m0 = new ArrayList<>();
                }
                this.f3332m0.add(c0751h);
            }
            if (c0751h.m3775u()) {
                if (this.f3333n0 == null) {
                    this.f3333n0 = new ArrayList<>();
                }
                this.f3333n0.add(c0751h);
            }
            if (c0751h.m3774t()) {
                if (this.f3334o0 == null) {
                    this.f3334o0 = new ArrayList<>();
                }
                this.f3334o0.add(c0751h);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C0751h> arrayList = this.f3332m0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C0751h> arrayList2 = this.f3333n0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f3339t0) {
            int i10 = this.f3310N;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f3323d0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f3302B0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f3312P = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<C0751h> arrayList = this.f3333n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3333n0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<C0751h> arrayList = this.f3332m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3332m0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        e eVar;
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f3342w0 == null) {
                this.f3342w0 = new c();
            }
            this.f3342w0.m3801e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f3317U == 1.0f && this.f3310N == this.f3311O) {
                setState(e.MOVING);
            }
            this.f3310N = this.f3309M;
            if (this.f3317U != 0.0f) {
                return;
            }
        } else if (f10 < 1.0f) {
            this.f3310N = -1;
            eVar = e.MOVING;
            setState(eVar);
        } else {
            if (this.f3317U == 0.0f && this.f3310N == this.f3309M) {
                setState(e.MOVING);
            }
            this.f3310N = this.f3311O;
            if (this.f3317U != 1.0f) {
                return;
            }
        }
        eVar = e.FINISHED;
        setState(eVar);
    }

    public void setScene(C0755l c0755l) {
        m3823k();
        throw null;
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f3310N = i10;
            return;
        }
        if (this.f3342w0 == null) {
            this.f3342w0 = new c();
        }
        this.f3342w0.m3802f(i10);
        this.f3342w0.m3800d(i10);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f3310N == -1) {
            return;
        }
        e eVar3 = this.f3303C0;
        this.f3303C0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            m3784z();
        }
        int i10 = b.f3347a[eVar3.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (eVar == eVar4) {
                m3784z();
            }
            if (eVar != eVar2) {
                return;
            }
        } else if (i10 != 3 || eVar != eVar2) {
            return;
        }
        m3785A();
    }

    public void setTransition(int i10) {
    }

    protected void setTransition(C0755l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.f3322c0 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f3342w0 == null) {
            this.f3342w0 = new c();
        }
        this.f3342w0.m3803g(bundle);
        if (isAttachedToWindow()) {
            this.f3342w0.m3797a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C0744a.m3763a(context, this.f3309M) + "->" + C0744a.m3763a(context, this.f3311O) + " (pos:" + this.f3317U + " Dpos/Dt:" + this.f3308L;
    }

    /* renamed from: x */
    void m3795x(float f10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0211, code lost:
    
        if (r1 != r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0214, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0215, code lost:
    
        r21.f3310N = r2;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0221, code lost:
    
        if (r1 != r2) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m3796y(boolean r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0753j.m3796y(boolean):void");
    }
}
