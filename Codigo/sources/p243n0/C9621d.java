package p243n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p190k0.C9101c;
import p190k0.C9107i;
import p260o0.C9761i;
import p260o0.C9767o;

/* renamed from: n0.d */
/* loaded from: classes.dex */
public class C9621d {

    /* renamed from: b */
    private int f23443b;

    /* renamed from: c */
    private boolean f23444c;

    /* renamed from: d */
    public final C9622e f23445d;

    /* renamed from: e */
    public final b f23446e;

    /* renamed from: f */
    public C9621d f23447f;

    /* renamed from: i */
    C9107i f23450i;

    /* renamed from: a */
    private HashSet<C9621d> f23442a = null;

    /* renamed from: g */
    public int f23448g = 0;

    /* renamed from: h */
    int f23449h = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23451a;

        static {
            int[] iArr = new int[b.values().length];
            f23451a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23451a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23451a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23451a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23451a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23451a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23451a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23451a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23451a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: n0.d$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C9621d(C9622e c9622e, b bVar) {
        this.f23445d = c9622e;
        this.f23446e = bVar;
    }

    /* renamed from: a */
    public boolean m28643a(C9621d c9621d, int i10, int i11, boolean z10) {
        if (c9621d == null) {
            m28658p();
            return true;
        }
        if (!z10 && !m28657o(c9621d)) {
            return false;
        }
        this.f23447f = c9621d;
        if (c9621d.f23442a == null) {
            c9621d.f23442a = new HashSet<>();
        }
        HashSet<C9621d> hashSet = this.f23447f.f23442a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f23448g = i10;
        this.f23449h = i11;
        return true;
    }

    /* renamed from: b */
    public void m28644b(int i10, ArrayList<C9767o> arrayList, C9767o c9767o) {
        HashSet<C9621d> hashSet = this.f23442a;
        if (hashSet != null) {
            Iterator<C9621d> it = hashSet.iterator();
            while (it.hasNext()) {
                C9761i.m29273a(it.next().f23445d, i10, arrayList, c9767o);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C9621d> m28645c() {
        return this.f23442a;
    }

    /* renamed from: d */
    public int m28646d() {
        if (this.f23444c) {
            return this.f23443b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m28647e() {
        C9621d c9621d;
        if (this.f23445d.m28706T() == 8) {
            return 0;
        }
        return (this.f23449h == Integer.MIN_VALUE || (c9621d = this.f23447f) == null || c9621d.f23445d.m28706T() != 8) ? this.f23448g : this.f23449h;
    }

    /* renamed from: f */
    public final C9621d m28648f() {
        switch (a.f23451a[this.f23446e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f23445d.f23479Q;
            case 3:
                return this.f23445d.f23477O;
            case 4:
                return this.f23445d.f23480R;
            case 5:
                return this.f23445d.f23478P;
            default:
                throw new AssertionError(this.f23446e.name());
        }
    }

    /* renamed from: g */
    public C9622e m28649g() {
        return this.f23445d;
    }

    /* renamed from: h */
    public C9107i m28650h() {
        return this.f23450i;
    }

    /* renamed from: i */
    public C9621d m28651i() {
        return this.f23447f;
    }

    /* renamed from: j */
    public b m28652j() {
        return this.f23446e;
    }

    /* renamed from: k */
    public boolean m28653k() {
        HashSet<C9621d> hashSet = this.f23442a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C9621d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m28648f().m28656n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean m28654l() {
        HashSet<C9621d> hashSet = this.f23442a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean m28655m() {
        return this.f23444c;
    }

    /* renamed from: n */
    public boolean m28656n() {
        return this.f23447f != null;
    }

    /* renamed from: o */
    public boolean m28657o(C9621d c9621d) {
        if (c9621d == null) {
            return false;
        }
        b m28652j = c9621d.m28652j();
        b bVar = this.f23446e;
        if (m28652j == bVar) {
            return bVar != b.BASELINE || (c9621d.m28649g().m28714X() && m28649g().m28714X());
        }
        switch (a.f23451a[bVar.ordinal()]) {
            case 1:
                return (m28652j == b.BASELINE || m28652j == b.CENTER_X || m28652j == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = m28652j == b.LEFT || m28652j == b.RIGHT;
                if (c9621d.m28649g() instanceof C9624g) {
                    return z10 || m28652j == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = m28652j == b.TOP || m28652j == b.BOTTOM;
                if (c9621d.m28649g() instanceof C9624g) {
                    return z11 || m28652j == b.CENTER_Y;
                }
                return z11;
            case 6:
                return (m28652j == b.LEFT || m28652j == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f23446e.name());
        }
    }

    /* renamed from: p */
    public void m28658p() {
        HashSet<C9621d> hashSet;
        C9621d c9621d = this.f23447f;
        if (c9621d != null && (hashSet = c9621d.f23442a) != null) {
            hashSet.remove(this);
            if (this.f23447f.f23442a.size() == 0) {
                this.f23447f.f23442a = null;
            }
        }
        this.f23442a = null;
        this.f23447f = null;
        this.f23448g = 0;
        this.f23449h = Integer.MIN_VALUE;
        this.f23444c = false;
        this.f23443b = 0;
    }

    /* renamed from: q */
    public void m28659q() {
        this.f23444c = false;
        this.f23443b = 0;
    }

    /* renamed from: r */
    public void m28660r(C9101c c9101c) {
        C9107i c9107i = this.f23450i;
        if (c9107i == null) {
            this.f23450i = new C9107i(C9107i.a.UNRESTRICTED, null);
        } else {
            c9107i.m26814m();
        }
    }

    /* renamed from: s */
    public void m28661s(int i10) {
        this.f23443b = i10;
        this.f23444c = true;
    }

    public String toString() {
        return this.f23445d.m28758r() + ":" + this.f23446e.toString();
    }
}
