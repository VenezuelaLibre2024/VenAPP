package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p018b0.InterfaceC1602j;
import p112g0.C7438z0;
import p126h0.C7608c;
import p407w.AbstractC12019k;
import p407w.C12041u0;
import p407w.InterfaceC12028o;

/* renamed from: androidx.camera.core.w */
/* loaded from: classes.dex */
public abstract class AbstractC0718w {

    /* renamed from: d */
    private InterfaceC0640k2<?> f3111d;

    /* renamed from: e */
    private InterfaceC0640k2<?> f3112e;

    /* renamed from: f */
    private InterfaceC0640k2<?> f3113f;

    /* renamed from: g */
    private AbstractC0604b2 f3114g;

    /* renamed from: h */
    private InterfaceC0640k2<?> f3115h;

    /* renamed from: i */
    private Rect f3116i;

    /* renamed from: k */
    private InterfaceC0606c0 f3118k;

    /* renamed from: l */
    private AbstractC12019k f3119l;

    /* renamed from: a */
    private final Set<d> f3108a = new HashSet();

    /* renamed from: b */
    private final Object f3109b = new Object();

    /* renamed from: c */
    private c f3110c = c.INACTIVE;

    /* renamed from: j */
    private Matrix f3117j = new Matrix();

    /* renamed from: m */
    private C0701y1 f3120m = C0701y1.m3379a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.w$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3121a;

        static {
            int[] iArr = new int[c.values().length];
            f3121a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3121a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.camera.core.w$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m3570a();

        /* renamed from: b */
        void m3571b(InterfaceC12028o interfaceC12028o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.w$c */
    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.w$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: c */
        void mo2488c(AbstractC0718w abstractC0718w);

        /* renamed from: k */
        void mo2497k(AbstractC0718w abstractC0718w);

        /* renamed from: n */
        void mo2501n(AbstractC0718w abstractC0718w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0718w(InterfaceC0640k2<?> interfaceC0640k2) {
        this.f3112e = interfaceC0640k2;
        this.f3113f = interfaceC0640k2;
    }

    /* renamed from: N */
    private void m3536N(d dVar) {
        this.f3108a.remove(dVar);
    }

    /* renamed from: a */
    private void m3537a(d dVar) {
        this.f3108a.add(dVar);
    }

    /* renamed from: A */
    public InterfaceC0640k2<?> m3538A(InterfaceC0602b0 interfaceC0602b0, InterfaceC0640k2<?> interfaceC0640k2, InterfaceC0640k2<?> interfaceC0640k22) {
        C0647m1 m3184a0;
        if (interfaceC0640k22 != null) {
            m3184a0 = C0647m1.m3185b0(interfaceC0640k22);
            m3184a0.m3186c0(InterfaceC1602j.f6863C);
        } else {
            m3184a0 = C0647m1.m3184a0();
        }
        if (this.f3112e.mo3192b(InterfaceC0619f1.f2800h) || this.f3112e.mo3192b(InterfaceC0619f1.f2804l)) {
            InterfaceC0649n0.a<C7608c> aVar = InterfaceC0619f1.f2808p;
            if (m3184a0.mo3192b(aVar)) {
                m3184a0.m3186c0(aVar);
            }
        }
        InterfaceC0640k2<?> interfaceC0640k23 = this.f3112e;
        InterfaceC0649n0.a<C7608c> aVar2 = InterfaceC0619f1.f2808p;
        if (interfaceC0640k23.mo3192b(aVar2)) {
            InterfaceC0649n0.a<Size> aVar3 = InterfaceC0619f1.f2806n;
            if (m3184a0.mo3192b(aVar3) && ((C7608c) this.f3112e.mo3191a(aVar2)).m23119d() != null) {
                m3184a0.m3186c0(aVar3);
            }
        }
        Iterator<InterfaceC0649n0.a<?>> it = this.f3112e.mo3195e().iterator();
        while (it.hasNext()) {
            InterfaceC0649n0.m3188D(m3184a0, m3184a0, this.f3112e, it.next());
        }
        if (interfaceC0640k2 != null) {
            for (InterfaceC0649n0.a<?> aVar4 : interfaceC0640k2.mo3195e()) {
                if (!aVar4.mo3015c().equals(InterfaceC1602j.f6863C.mo3015c())) {
                    InterfaceC0649n0.m3188D(m3184a0, m3184a0, interfaceC0640k2, aVar4);
                }
            }
        }
        if (m3184a0.mo3192b(InterfaceC0619f1.f2804l)) {
            InterfaceC0649n0.a<Integer> aVar5 = InterfaceC0619f1.f2800h;
            if (m3184a0.mo3192b(aVar5)) {
                m3184a0.m3186c0(aVar5);
            }
        }
        InterfaceC0649n0.a<C7608c> aVar6 = InterfaceC0619f1.f2808p;
        if (m3184a0.mo3192b(aVar6) && ((C7608c) m3184a0.mo3191a(aVar6)).m23116a() != 0) {
            m3184a0.mo3178r(InterfaceC0640k2.f2872y, Boolean.TRUE);
        }
        return mo2912H(interfaceC0602b0, mo2928v(m3184a0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m3539B() {
        this.f3110c = c.ACTIVE;
        m3542E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final void m3540C() {
        this.f3110c = c.INACTIVE;
        m3542E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final void m3541D() {
        Iterator<d> it = this.f3108a.iterator();
        while (it.hasNext()) {
            it.next().mo2497k(this);
        }
    }

    /* renamed from: E */
    public final void m3542E() {
        int i10 = a.f3121a[this.f3110c.ordinal()];
        if (i10 == 1) {
            Iterator<d> it = this.f3108a.iterator();
            while (it.hasNext()) {
                it.next().mo2501n(this);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            Iterator<d> it2 = this.f3108a.iterator();
            while (it2.hasNext()) {
                it2.next().mo2488c(this);
            }
        }
    }

    /* renamed from: F */
    public void mo2911F() {
    }

    /* renamed from: G */
    public void mo3451G() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    /* renamed from: H */
    protected InterfaceC0640k2<?> mo2912H(InterfaceC0602b0 interfaceC0602b0, InterfaceC0640k2.a<?, ?, ?> aVar) {
        return aVar.mo2933b();
    }

    /* renamed from: I */
    public void mo3543I() {
    }

    /* renamed from: J */
    public void mo3452J() {
    }

    /* renamed from: K */
    protected AbstractC0604b2 mo2913K(InterfaceC0649n0 interfaceC0649n0) {
        AbstractC0604b2 abstractC0604b2 = this.f3114g;
        if (abstractC0604b2 != null) {
            return abstractC0604b2.mo2990f().mo2994d(interfaceC0649n0).mo2991a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    /* renamed from: L */
    protected AbstractC0604b2 mo2914L(AbstractC0604b2 abstractC0604b2) {
        return abstractC0604b2;
    }

    /* renamed from: M */
    public void mo2915M() {
    }

    /* renamed from: O */
    public void m3544O(AbstractC12019k abstractC12019k) {
        C0984h.m4823a(abstractC12019k == null || m3568y(abstractC12019k.m38628f()));
        this.f3119l = abstractC12019k;
    }

    /* renamed from: P */
    public void mo2916P(Matrix matrix) {
        this.f3117j = new Matrix(matrix);
    }

    /* renamed from: Q */
    public void mo2917Q(Rect rect) {
        this.f3116i = rect;
    }

    /* renamed from: R */
    public final void m3545R(InterfaceC0606c0 interfaceC0606c0) {
        mo2915M();
        b m8928S = this.f3113f.m8928S(null);
        if (m8928S != null) {
            m8928S.m3570a();
        }
        synchronized (this.f3109b) {
            C0984h.m4823a(interfaceC0606c0 == this.f3118k);
            m3536N(this.f3118k);
            this.f3118k = null;
        }
        this.f3114g = null;
        this.f3116i = null;
        this.f3113f = this.f3112e;
        this.f3111d = null;
        this.f3115h = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public void m3546S(C0701y1 c0701y1) {
        this.f3120m = c0701y1;
        for (AbstractC0661r0 abstractC0661r0 : c0701y1.m3389k()) {
            if (abstractC0661r0.m3226g() == null) {
                abstractC0661r0.m3233s(getClass());
            }
        }
    }

    /* renamed from: T */
    public void m3547T(AbstractC0604b2 abstractC0604b2) {
        this.f3114g = mo2914L(abstractC0604b2);
    }

    /* renamed from: U */
    public void m3548U(InterfaceC0649n0 interfaceC0649n0) {
        this.f3114g = mo2913K(interfaceC0649n0);
    }

    /* renamed from: b */
    public final void m3549b(InterfaceC0606c0 interfaceC0606c0, InterfaceC0640k2<?> interfaceC0640k2, InterfaceC0640k2<?> interfaceC0640k22) {
        synchronized (this.f3109b) {
            this.f3118k = interfaceC0606c0;
            m3537a(interfaceC0606c0);
        }
        this.f3111d = interfaceC0640k2;
        this.f3115h = interfaceC0640k22;
        InterfaceC0640k2<?> m3538A = m3538A(interfaceC0606c0.mo2495i(), this.f3111d, this.f3115h);
        this.f3113f = m3538A;
        b m8928S = m3538A.m8928S(null);
        if (m8928S != null) {
            m8928S.m3571b(interfaceC0606c0.mo2495i());
        }
        mo2911F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m3550c() {
        return ((InterfaceC0619f1) this.f3113f).m3066t(-1);
    }

    /* renamed from: d */
    public AbstractC0604b2 m3551d() {
        return this.f3114g;
    }

    /* renamed from: e */
    public Size m3552e() {
        AbstractC0604b2 abstractC0604b2 = this.f3114g;
        if (abstractC0604b2 != null) {
            return abstractC0604b2.mo2989e();
        }
        return null;
    }

    /* renamed from: f */
    public InterfaceC0606c0 m3553f() {
        InterfaceC0606c0 interfaceC0606c0;
        synchronized (this.f3109b) {
            interfaceC0606c0 = this.f3118k;
        }
        return interfaceC0606c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public InterfaceC0699y m3554g() {
        synchronized (this.f3109b) {
            InterfaceC0606c0 interfaceC0606c0 = this.f3118k;
            if (interfaceC0606c0 == null) {
                return InterfaceC0699y.f3016a;
            }
            return interfaceC0606c0.mo2489d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public String m3555h() {
        return ((InterfaceC0606c0) C0984h.m4834l(m3553f(), "No camera attached to use case: " + this)).mo2495i().mo2559b();
    }

    /* renamed from: i */
    public InterfaceC0640k2<?> m3556i() {
        return this.f3113f;
    }

    /* renamed from: j */
    public abstract InterfaceC0640k2<?> mo2926j(boolean z10, InterfaceC0644l2 interfaceC0644l2);

    /* renamed from: k */
    public AbstractC12019k m3557k() {
        return this.f3119l;
    }

    /* renamed from: l */
    public int m3558l() {
        return this.f3113f.mo3010n();
    }

    /* renamed from: m */
    protected int m3559m() {
        return ((InterfaceC0619f1) this.f3113f).m3062U(0);
    }

    /* renamed from: n */
    public String m3560n() {
        String m8926u = this.f3113f.m8926u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(m8926u);
        return m8926u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public int m3561o(InterfaceC0606c0 interfaceC0606c0) {
        return mo3516p(interfaceC0606c0, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public int mo3516p(InterfaceC0606c0 interfaceC0606c0, boolean z10) {
        int mo2565i = interfaceC0606c0.mo2495i().mo2565i(m3565u());
        return !interfaceC0606c0.mo3001m() && z10 ? C0689r.m3359q(-mo2565i) : mo2565i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public C12041u0 m3562q() {
        InterfaceC0606c0 m3553f = m3553f();
        Size m3552e = m3552e();
        if (m3553f == null || m3552e == null) {
            return null;
        }
        Rect m3566w = m3566w();
        if (m3566w == null) {
            m3566w = new Rect(0, 0, m3552e.getWidth(), m3552e.getHeight());
        }
        return new C12041u0(m3552e, m3566w, m3561o(m3553f));
    }

    /* renamed from: r */
    public Matrix m3563r() {
        return this.f3117j;
    }

    /* renamed from: s */
    public C0701y1 m3564s() {
        return this.f3120m;
    }

    /* renamed from: t */
    protected Set<Integer> mo3460t() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public int m3565u() {
        return ((InterfaceC0619f1) this.f3113f).m3057C(0);
    }

    /* renamed from: v */
    public abstract InterfaceC0640k2.a<?, ?, ?> mo2928v(InterfaceC0649n0 interfaceC0649n0);

    /* renamed from: w */
    public Rect m3566w() {
        return this.f3116i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public boolean m3567x(String str) {
        if (m3553f() == null) {
            return false;
        }
        return Objects.equals(str, m3555h());
    }

    /* renamed from: y */
    public boolean m3568y(int i10) {
        Iterator<Integer> it = mo3460t().iterator();
        while (it.hasNext()) {
            if (C7438z0.m22438b(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public boolean m3569z(InterfaceC0606c0 interfaceC0606c0) {
        int m3559m = m3559m();
        if (m3559m == 0) {
            return false;
        }
        if (m3559m == 1) {
            return true;
        }
        if (m3559m == 2) {
            return interfaceC0606c0.m3000j();
        }
        throw new AssertionError("Unknown mirrorMode: " + m3559m);
    }
}
