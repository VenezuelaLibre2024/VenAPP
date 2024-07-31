package p020b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p020b2.AbstractC1632l;

/* renamed from: b2.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC1637n0 extends AbstractC1632l {

    /* renamed from: U */
    private static final String[] f6996U = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: T */
    private int f6997T = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.n0$a */
    /* loaded from: classes.dex */
    public class a extends C1634m {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6998a;

        /* renamed from: b */
        final /* synthetic */ View f6999b;

        /* renamed from: c */
        final /* synthetic */ View f7000c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f6998a = viewGroup;
            this.f6999b = view;
            this.f7000c = view2;
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: a */
        public void mo8988a(AbstractC1632l abstractC1632l) {
            if (this.f6999b.getParent() == null) {
                C1649x.m9104a(this.f6998a).mo9101c(this.f6999b);
            } else {
                AbstractC1637n0.this.cancel();
            }
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: b */
        public void mo8989b(AbstractC1632l abstractC1632l) {
            C1649x.m9104a(this.f6998a).mo9102d(this.f6999b);
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            this.f7000c.setTag(C1626i.f6938a, null);
            C1649x.m9104a(this.f6998a).mo9102d(this.f6999b);
            abstractC1632l.mo9042T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.n0$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC1632l.f {

        /* renamed from: a */
        private final View f7002a;

        /* renamed from: b */
        private final int f7003b;

        /* renamed from: c */
        private final ViewGroup f7004c;

        /* renamed from: d */
        private final boolean f7005d;

        /* renamed from: e */
        private boolean f7006e;

        /* renamed from: f */
        boolean f7007f = false;

        b(View view, int i10, boolean z10) {
            this.f7002a = view;
            this.f7003b = i10;
            this.f7004c = (ViewGroup) view.getParent();
            this.f7005d = z10;
            m9081g(true);
        }

        /* renamed from: f */
        private void m9080f() {
            if (!this.f7007f) {
                C1611a0.m8961h(this.f7002a, this.f7003b);
                ViewGroup viewGroup = this.f7004c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9081g(false);
        }

        /* renamed from: g */
        private void m9081g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f7005d || this.f7006e == z10 || (viewGroup = this.f7004c) == null) {
                return;
            }
            this.f7006e = z10;
            C1649x.m9106c(viewGroup, z10);
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: a */
        public void mo8988a(AbstractC1632l abstractC1632l) {
            m9081g(true);
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: b */
        public void mo8989b(AbstractC1632l abstractC1632l) {
            m9081g(false);
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: c */
        public void mo9005c(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: d */
        public void mo8990d(AbstractC1632l abstractC1632l) {
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            m9080f();
            abstractC1632l.mo9042T(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7007f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m9080f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f7007f) {
                return;
            }
            C1611a0.m8961h(this.f7002a, this.f7003b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f7007f) {
                return;
            }
            C1611a0.m8961h(this.f7002a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.n0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f7008a;

        /* renamed from: b */
        boolean f7009b;

        /* renamed from: c */
        int f7010c;

        /* renamed from: d */
        int f7011d;

        /* renamed from: e */
        ViewGroup f7012e;

        /* renamed from: f */
        ViewGroup f7013f;

        c() {
        }
    }

    /* renamed from: i0 */
    private void m9075i0(C1644s c1644s) {
        c1644s.f7026a.put("android:visibility:visibility", Integer.valueOf(c1644s.f7027b.getVisibility()));
        c1644s.f7026a.put("android:visibility:parent", c1644s.f7027b.getParent());
        int[] iArr = new int[2];
        c1644s.f7027b.getLocationOnScreen(iArr);
        c1644s.f7026a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f7012e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r0.f7010c == 0) goto L40;
     */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p020b2.AbstractC1637n0.c m9076j0(p020b2.C1644s r8, p020b2.C1644s r9) {
        /*
            r7 = this;
            b2.n0$c r0 = new b2.n0$c
            r0.<init>()
            r1 = 0
            r0.f7008a = r1
            r0.f7009b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7026a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7026a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f7010c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7026a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f7012e = r6
            goto L37
        L33:
            r0.f7010c = r4
            r0.f7012e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f7026a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7026a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f7011d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7026a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f7013f = r2
            goto L5e
        L5a:
            r0.f7011d = r4
            r0.f7013f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f7010c
            int r9 = r0.f7011d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f7012e
            android.view.ViewGroup r4 = r0.f7013f
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
            android.view.ViewGroup r8 = r0.f7013f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f7012e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f7011d
            if (r8 != 0) goto L8d
        L88:
            r0.f7009b = r2
        L8a:
            r0.f7008a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f7010c
            if (r8 != 0) goto L96
        L93:
            r0.f7009b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.AbstractC1637n0.m9076j0(b2.s, b2.s):b2.n0$c");
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: G */
    public String[] mo8972G() {
        return f6996U;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: I */
    public boolean mo9038I(C1644s c1644s, C1644s c1644s2) {
        if (c1644s == null && c1644s2 == null) {
            return false;
        }
        if (c1644s != null && c1644s2 != null && c1644s2.f7026a.containsKey("android:visibility:visibility") != c1644s.f7026a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m9076j0 = m9076j0(c1644s, c1644s2);
        if (m9076j0.f7008a) {
            return m9076j0.f7010c == 0 || m9076j0.f7011d == 0;
        }
        return false;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: g */
    public void mo8973g(C1644s c1644s) {
        m9075i0(c1644s);
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: j */
    public void mo8974j(C1644s c1644s) {
        m9075i0(c1644s);
    }

    /* renamed from: k0 */
    public abstract Animator mo8998k0(ViewGroup viewGroup, View view, C1644s c1644s, C1644s c1644s2);

    /* renamed from: l0 */
    public Animator m9077l0(ViewGroup viewGroup, C1644s c1644s, int i10, C1644s c1644s2, int i11) {
        if ((this.f6997T & 1) != 1 || c1644s2 == null) {
            return null;
        }
        if (c1644s == null) {
            View view = (View) c1644s2.f7027b.getParent();
            if (m9076j0(m9066v(view, false), m9037H(view, false)).f7008a) {
                return null;
            }
        }
        return mo8998k0(viewGroup, c1644s2.f7027b, c1644s, c1644s2);
    }

    /* renamed from: m0 */
    public abstract Animator mo8999m0(ViewGroup viewGroup, View view, C1644s c1644s, C1644s c1644s2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.f6954G != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m9078n0(android.view.ViewGroup r18, p020b2.C1644s r19, int r20, p020b2.C1644s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.AbstractC1637n0.m9078n0(android.view.ViewGroup, b2.s, int, b2.s, int):android.animation.Animator");
    }

    /* renamed from: o0 */
    public void m9079o0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f6997T = i10;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: p */
    public Animator mo8975p(ViewGroup viewGroup, C1644s c1644s, C1644s c1644s2) {
        c m9076j0 = m9076j0(c1644s, c1644s2);
        if (!m9076j0.f7008a) {
            return null;
        }
        if (m9076j0.f7012e == null && m9076j0.f7013f == null) {
            return null;
        }
        return m9076j0.f7009b ? m9077l0(viewGroup, c1644s, m9076j0.f7010c, c1644s2, m9076j0.f7011d) : m9078n0(viewGroup, c1644s, m9076j0.f7010c, c1644s2, m9076j0.f7011d);
    }
}
