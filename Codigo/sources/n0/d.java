package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k0.i;
import o0.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b */
    private int f21585b;

    /* renamed from: c */
    private boolean f21586c;

    /* renamed from: d */
    public final e f21587d;

    /* renamed from: e */
    public final b f21588e;

    /* renamed from: f */
    public d f21589f;

    /* renamed from: i */
    k0.i f21592i;

    /* renamed from: a */
    private HashSet<d> f21584a = null;

    /* renamed from: g */
    public int f21590g = 0;

    /* renamed from: h */
    int f21591h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21593a;

        static {
            int[] iArr = new int[b.values().length];
            f21593a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21593a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21593a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21593a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21593a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21593a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21593a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21593a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21593a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

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

    public d(e eVar, b bVar) {
        this.f21587d = eVar;
        this.f21588e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z10 && !o(dVar)) {
            return false;
        }
        this.f21589f = dVar;
        if (dVar.f21584a == null) {
            dVar.f21584a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f21589f.f21584a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f21590g = i10;
        this.f21591h = i11;
        return true;
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f21584a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                o0.i.a(it.next().f21587d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f21584a;
    }

    public int d() {
        if (this.f21586c) {
            return this.f21585b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f21587d.T() == 8) {
            return 0;
        }
        return (this.f21591h == Integer.MIN_VALUE || (dVar = this.f21589f) == null || dVar.f21587d.T() != 8) ? this.f21590g : this.f21591h;
    }

    public final d f() {
        switch (a.f21593a[this.f21588e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f21587d.Q;
            case 3:
                return this.f21587d.O;
            case 4:
                return this.f21587d.R;
            case 5:
                return this.f21587d.P;
            default:
                throw new AssertionError(this.f21588e.name());
        }
    }

    public e g() {
        return this.f21587d;
    }

    public k0.i h() {
        return this.f21592i;
    }

    public d i() {
        return this.f21589f;
    }

    public b j() {
        return this.f21588e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f21584a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f21584a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f21586c;
    }

    public boolean n() {
        return this.f21589f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f21588e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f21593a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = j10 == b.LEFT || j10 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z10 || j10 == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = j10 == b.TOP || j10 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z11 || j10 == b.CENTER_Y;
                }
                return z11;
            case 6:
                return (j10 == b.LEFT || j10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f21588e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f21589f;
        if (dVar != null && (hashSet = dVar.f21584a) != null) {
            hashSet.remove(this);
            if (this.f21589f.f21584a.size() == 0) {
                this.f21589f.f21584a = null;
            }
        }
        this.f21584a = null;
        this.f21589f = null;
        this.f21590g = 0;
        this.f21591h = Integer.MIN_VALUE;
        this.f21586c = false;
        this.f21585b = 0;
    }

    public void q() {
        this.f21586c = false;
        this.f21585b = 0;
    }

    public void r(k0.c cVar) {
        k0.i iVar = this.f21592i;
        if (iVar == null) {
            this.f21592i = new k0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.m();
        }
    }

    public void s(int i10) {
        this.f21585b = i10;
        this.f21586c = true;
    }

    public String toString() {
        return this.f21587d.r() + ":" + this.f21588e.toString();
    }
}
