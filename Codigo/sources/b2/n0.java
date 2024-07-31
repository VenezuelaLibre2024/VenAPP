package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b2.l;

/* loaded from: classes.dex */
public abstract class n0 extends l {
    private static final String[] U = {"android:visibility:visibility", "android:visibility:parent"};
    private int T = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6108a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6109b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6110c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f6108a = viewGroup;
            this.f6109b = view;
            this.f6110c = view2;
        }

        @Override // b2.m, b2.l.f
        public void a(l lVar) {
            if (this.f6109b.getParent() == null) {
                x.a(this.f6108a).c(this.f6109b);
            } else {
                n0.this.cancel();
            }
        }

        @Override // b2.m, b2.l.f
        public void b(l lVar) {
            x.a(this.f6108a).d(this.f6109b);
        }

        @Override // b2.l.f
        public void e(l lVar) {
            this.f6110c.setTag(i.f6069a, null);
            x.a(this.f6108a).d(this.f6109b);
            lVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f6112a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6113b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f6114c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6115d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6116e;

        /* renamed from: f, reason: collision with root package name */
        boolean f6117f = false;

        b(View view, int i10, boolean z10) {
            this.f6112a = view;
            this.f6113b = i10;
            this.f6114c = (ViewGroup) view.getParent();
            this.f6115d = z10;
            g(true);
        }

        private void f() {
            if (!this.f6117f) {
                a0.h(this.f6112a, this.f6113b);
                ViewGroup viewGroup = this.f6114c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f6115d || this.f6116e == z10 || (viewGroup = this.f6114c) == null) {
                return;
            }
            this.f6116e = z10;
            x.c(viewGroup, z10);
        }

        @Override // b2.l.f
        public void a(l lVar) {
            g(true);
        }

        @Override // b2.l.f
        public void b(l lVar) {
            g(false);
        }

        @Override // b2.l.f
        public void c(l lVar) {
        }

        @Override // b2.l.f
        public void d(l lVar) {
        }

        @Override // b2.l.f
        public void e(l lVar) {
            f();
            lVar.T(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6117f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f6117f) {
                return;
            }
            a0.h(this.f6112a, this.f6113b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f6117f) {
                return;
            }
            a0.h(this.f6112a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f6118a;

        /* renamed from: b, reason: collision with root package name */
        boolean f6119b;

        /* renamed from: c, reason: collision with root package name */
        int f6120c;

        /* renamed from: d, reason: collision with root package name */
        int f6121d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f6122e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f6123f;

        c() {
        }
    }

    private void i0(s sVar) {
        sVar.f6131a.put("android:visibility:visibility", Integer.valueOf(sVar.f6132b.getVisibility()));
        sVar.f6131a.put("android:visibility:parent", sVar.f6132b.getParent());
        int[] iArr = new int[2];
        sVar.f6132b.getLocationOnScreen(iArr);
        sVar.f6131a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f6122e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r0.f6120c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private b2.n0.c j0(b2.s r8, b2.s r9) {
        /*
            r7 = this;
            b2.n0$c r0 = new b2.n0$c
            r0.<init>()
            r1 = 0
            r0.f6118a = r1
            r0.f6119b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6131a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6131a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f6120c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6131a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f6122e = r6
            goto L37
        L33:
            r0.f6120c = r4
            r0.f6122e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f6131a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6131a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f6121d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6131a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f6123f = r2
            goto L5e
        L5a:
            r0.f6121d = r4
            r0.f6123f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f6120c
            int r9 = r0.f6121d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f6122e
            android.view.ViewGroup r4 = r0.f6123f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f6123f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f6122e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f6121d
            if (r8 != 0) goto L8d
        L88:
            r0.f6119b = r2
        L8a:
            r0.f6118a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f6120c
            if (r8 != 0) goto L96
        L93:
            r0.f6119b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.n0.j0(b2.s, b2.s):b2.n0$c");
    }

    @Override // b2.l
    public String[] G() {
        return U;
    }

    @Override // b2.l
    public boolean I(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f6131a.containsKey("android:visibility:visibility") != sVar.f6131a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c j02 = j0(sVar, sVar2);
        if (j02.f6118a) {
            return j02.f6120c == 0 || j02.f6121d == 0;
        }
        return false;
    }

    @Override // b2.l
    public void g(s sVar) {
        i0(sVar);
    }

    @Override // b2.l
    public void j(s sVar) {
        i0(sVar);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator l0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.T & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f6132b.getParent();
            if (j0(v(view, false), H(view, false)).f6118a) {
                return null;
            }
        }
        return k0(viewGroup, sVar2.f6132b, sVar, sVar2);
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.G != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator n0(android.view.ViewGroup r18, b2.s r19, int r20, b2.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.n0.n0(android.view.ViewGroup, b2.s, int, b2.s, int):android.animation.Animator");
    }

    public void o0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.T = i10;
    }

    @Override // b2.l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c j02 = j0(sVar, sVar2);
        if (!j02.f6118a) {
            return null;
        }
        if (j02.f6122e == null && j02.f6123f == null) {
            return null;
        }
        return j02.f6119b ? l0(viewGroup, sVar, j02.f6120c, sVar2, j02.f6121d) : n0(viewGroup, sVar, j02.f6120c, sVar2, j02.f6121d);
    }
}
