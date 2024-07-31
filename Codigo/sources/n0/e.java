package n0;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n0.d;
import o0.n;
import o0.p;

/* loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f21595a0;

    /* renamed from: b0, reason: collision with root package name */
    int f21597b0;

    /* renamed from: c, reason: collision with root package name */
    public o0.c f21598c;

    /* renamed from: c0, reason: collision with root package name */
    int f21599c0;

    /* renamed from: d, reason: collision with root package name */
    public o0.c f21600d;

    /* renamed from: d0, reason: collision with root package name */
    public float f21601d0;

    /* renamed from: e0, reason: collision with root package name */
    protected int f21603e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f21605f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f21607g0;

    /* renamed from: h0, reason: collision with root package name */
    int f21609h0;

    /* renamed from: i0, reason: collision with root package name */
    int f21611i0;

    /* renamed from: j0, reason: collision with root package name */
    protected int f21613j0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f21615k0;

    /* renamed from: l0, reason: collision with root package name */
    int f21617l0;

    /* renamed from: m0, reason: collision with root package name */
    protected int f21619m0;

    /* renamed from: n0, reason: collision with root package name */
    protected int f21621n0;

    /* renamed from: o, reason: collision with root package name */
    public String f21622o;

    /* renamed from: o0, reason: collision with root package name */
    float f21623o0;

    /* renamed from: p0, reason: collision with root package name */
    float f21625p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f21627q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f21629r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f21631s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f21633t0;

    /* renamed from: u0, reason: collision with root package name */
    private String f21635u0;

    /* renamed from: v0, reason: collision with root package name */
    private String f21637v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f21639w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f21641x0;

    /* renamed from: y0, reason: collision with root package name */
    boolean f21643y0;

    /* renamed from: z0, reason: collision with root package name */
    int f21645z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21594a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f21596b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public o0.l f21602e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f21604f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f21606g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f21608h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21610i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21612j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21614k = true;

    /* renamed from: l, reason: collision with root package name */
    private int f21616l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f21618m = -1;

    /* renamed from: n, reason: collision with root package name */
    public m0.a f21620n = new m0.a(this);

    /* renamed from: p, reason: collision with root package name */
    private boolean f21624p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21626q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21628r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21630s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f21632t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f21634u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f21636v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f21638w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f21640x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f21642y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f21644z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21646a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21647b;

        static {
            int[] iArr = new int[b.values().length];
            f21647b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21647b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21647b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21647b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f21646a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21646a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21646a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21646a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21646a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21646a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21646a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21646a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21646a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f21595a0 = null;
        this.f21597b0 = 0;
        this.f21599c0 = 0;
        this.f21601d0 = 0.0f;
        this.f21603e0 = -1;
        this.f21605f0 = 0;
        this.f21607g0 = 0;
        this.f21609h0 = 0;
        this.f21611i0 = 0;
        this.f21613j0 = 0;
        this.f21615k0 = 0;
        this.f21617l0 = 0;
        float f10 = K0;
        this.f21623o0 = f10;
        this.f21625p0 = f10;
        this.f21629r0 = 0;
        this.f21631s0 = 0;
        this.f21633t0 = false;
        this.f21635u0 = null;
        this.f21637v0 = null;
        this.f21643y0 = false;
        this.f21645z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, a.e.API_PRIORITY_OTHER);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f21589f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f21589f);
        sb2.append("'");
        if (dVar.f21591h != Integer.MIN_VALUE || dVar.f21590g != 0) {
            sb2.append(",");
            sb2.append(dVar.f21590g);
            if (dVar.f21591h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f21591h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f21589f;
        return (dVar4 == null || dVar4.f21589f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f21589f) == null || dVar2.f21589f != dVar) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0488, code lost:
    
        if ((r4 instanceof n0.a) != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(k0.d r38, boolean r39, boolean r40, boolean r41, boolean r42, k0.i r43, k0.i r44, n0.e.b r45, boolean r46, n0.d r47, n0.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.e.i(k0.d, boolean, boolean, boolean, boolean, k0.i, k0.i, n0.e$b, boolean, n0.d, n0.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void w0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int A() {
        return this.M;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void A0(String str) {
        float f10;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f21601d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i11 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f10 = Float.parseFloat(substring2);
            }
            f10 = i10;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f10 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f10 = i10;
        }
        i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f21601d0 = f10;
            this.f21603e0 = i11;
        }
    }

    public int B() {
        return this.N;
    }

    public void B0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f21617l0;
            int i12 = this.f21599c0 + i11;
            this.f21607g0 = i11;
            this.P.s(i11);
            this.R.s(i12);
            this.S.s(i10);
            this.f21626q = true;
        }
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i10, int i11) {
        if (this.f21624p) {
            return;
        }
        this.O.s(i10);
        this.Q.s(i11);
        this.f21605f0 = i10;
        this.f21597b0 = i11 - i10;
        this.f21624p = true;
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i10) {
        this.O.s(i10);
        this.f21605f0 = i10;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i10) {
        this.P.s(i10);
        this.f21607g0 = i10;
    }

    public int F() {
        return this.f21621n0;
    }

    public void F0(int i10, int i11) {
        if (this.f21626q) {
            return;
        }
        this.P.s(i10);
        this.R.s(i11);
        this.f21607g0 = i10;
        this.f21599c0 = i11 - i10;
        if (this.J) {
            this.S.s(i10 + this.f21617l0);
        }
        this.f21626q = true;
    }

    public int G() {
        return this.f21619m0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f21605f0 = i10;
        this.f21607g0 = i11;
        if (this.f21631s0 == 8) {
            this.f21597b0 = 0;
            this.f21599c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f21597b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f21599c0)) {
            i17 = i14;
        }
        this.f21597b0 = i16;
        this.f21599c0 = i17;
        int i18 = this.f21621n0;
        if (i17 < i18) {
            this.f21599c0 = i18;
        }
        int i19 = this.f21619m0;
        if (i16 < i19) {
            this.f21597b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f21597b0 = Math.min(this.f21597b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f21599c0 = Math.min(this.f21599c0, i21);
        }
        int i22 = this.f21597b0;
        if (i16 != i22) {
            this.f21616l = i22;
        }
        int i23 = this.f21599c0;
        if (i17 != i23) {
            this.f21618m = i23;
        }
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f21589f) != null && dVar2.f21589f == dVar) {
                return dVar2.f21587d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f21589f;
        if (dVar4 == null || dVar4.f21589f != dVar3) {
            return null;
        }
        return dVar4.f21587d;
    }

    public void H0(boolean z10) {
        this.J = z10;
    }

    public e I() {
        return this.f21595a0;
    }

    public void I0(int i10) {
        this.f21599c0 = i10;
        int i11 = this.f21621n0;
        if (i10 < i11) {
            this.f21599c0 = i11;
        }
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.P).f21589f) != null && dVar2.f21589f == dVar) {
                return dVar2.f21587d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f21589f;
        if (dVar4 == null || dVar4.f21589f != dVar3) {
            return null;
        }
        return dVar4.f21587d;
    }

    public void J0(float f10) {
        this.f21623o0 = f10;
    }

    public int K() {
        return V() + this.f21597b0;
    }

    public void K0(int i10) {
        this.f21645z0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f21602e;
        }
        if (i10 == 1) {
            return this.f21604f;
        }
        return null;
    }

    public void L0(int i10, int i11) {
        this.f21605f0 = i10;
        int i12 = i11 - i10;
        this.f21597b0 = i12;
        int i13 = this.f21619m0;
        if (i12 < i13) {
            this.f21597b0 = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f21622o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f21597b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f21599c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f21605f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f21607g0);
        sb2.append("\n");
        O(sb2, "left", this.O);
        O(sb2, "top", this.P);
        O(sb2, "right", this.Q);
        O(sb2, "bottom", this.R);
        O(sb2, "baseline", this.S);
        O(sb2, "centerX", this.T);
        O(sb2, "centerY", this.U);
        N(sb2, "    width", this.f21597b0, this.f21619m0, this.H[0], this.f21616l, this.f21644z, this.f21638w, this.B, this.D0[0]);
        N(sb2, "    height", this.f21599c0, this.f21621n0, this.H[1], this.f21618m, this.C, this.f21640x, this.E, this.D0[1]);
        w0(sb2, "    dimensionRatio", this.f21601d0, this.f21603e0);
        u0(sb2, "    horizontalBias", this.f21623o0, K0);
        u0(sb2, "    verticalBias", this.f21625p0, K0);
        v0(sb2, "    horizontalChainStyle", this.f21645z0, 0);
        v0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f10) {
        this.f21638w = i10;
        this.f21644z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f21638w = 2;
    }

    public void O0(float f10) {
        this.D0[0] = f10;
    }

    public float P() {
        return this.f21625p0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z10) {
        this.K = z10;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(boolean z10) {
        this.L = z10;
    }

    public int S() {
        int i10 = this.O != null ? 0 + this.P.f21590g : 0;
        return this.Q != null ? i10 + this.R.f21590g : i10;
    }

    public void S0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        V0(false);
    }

    public int T() {
        return this.f21631s0;
    }

    public void T0(int i10) {
        this.H[1] = i10;
    }

    public int U() {
        if (this.f21631s0 == 8) {
            return 0;
        }
        return this.f21597b0;
    }

    public void U0(int i10) {
        this.H[0] = i10;
    }

    public int V() {
        e eVar = this.f21595a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f21605f0 : ((f) eVar).S0 + this.f21605f0;
    }

    public void V0(boolean z10) {
        this.f21610i = z10;
    }

    public int W() {
        e eVar = this.f21595a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f21607g0 : ((f) eVar).T0 + this.f21607g0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f21621n0 = i10;
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f21619m0 = i10;
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.O.f21589f != null ? 1 : 0) + (this.Q.f21589f != null ? 1 : 0) < 2;
        }
        return ((this.P.f21589f != null ? 1 : 0) + (this.R.f21589f != null ? 1 : 0)) + (this.S.f21589f != null ? 1 : 0) < 2;
    }

    public void Y0(int i10, int i11) {
        this.f21605f0 = i10;
        this.f21607g0 = i11;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.X.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.f21595a0 = eVar;
    }

    public boolean a0() {
        return (this.f21616l == -1 && this.f21618m == -1) ? false : true;
    }

    public void a1(float f10) {
        this.f21625p0 = f10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f21589f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.Q.f21589f) != null && dVar2.m() && (this.Q.f21589f.d() - this.Q.e()) - (this.O.f21589f.d() + this.O.e()) >= i11;
        }
        d dVar4 = this.P.f21589f;
        return dVar4 != null && dVar4.m() && (dVar = this.R.f21589f) != null && dVar.m() && (this.R.f21589f.d() - this.R.e()) - (this.P.f21589f.d() + this.P.e()) >= i11;
        return false;
    }

    public void b1(int i10) {
        this.A0 = i10;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(int i10, int i11) {
        this.f21607g0 = i10;
        int i12 = i11 - i10;
        this.f21599c0 = i12;
        int i13 = this.f21621n0;
        if (i12 < i13) {
            this.f21599c0 = i13;
        }
    }

    public void d1(b bVar) {
        this.Z[1] = bVar;
    }

    public void e(f fVar, k0.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.P1(64));
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.O.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f21587d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.Q.c();
            if (c11 != null) {
                Iterator<d> it2 = c11.iterator();
                while (it2.hasNext()) {
                    it2.next().f21587d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> c12 = this.P.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f21587d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.R.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f21587d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.S.c();
        if (c14 != null) {
            Iterator<d> it5 = c14.iterator();
            while (it5.hasNext()) {
                it5.next().f21587d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f21628r;
    }

    public void e1(int i10, int i11, int i12, float f10) {
        this.f21640x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f21640x = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i10) {
        return this.Y[i10];
    }

    public void f1(float f10) {
        this.D0[1] = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(k0.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.e.g(k0.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f21589f;
        if (dVar2 != null && dVar2.f21589f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f21589f;
        return dVar4 != null && dVar4.f21589f == dVar3;
    }

    public void g1(int i10) {
        this.f21631s0 = i10;
    }

    public boolean h() {
        return this.f21631s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i10) {
        this.f21597b0 = i10;
        int i11 = this.f21619m0;
        if (i10 < i11) {
            this.f21597b0 = i11;
        }
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f21589f;
        if (dVar2 != null && dVar2.f21589f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f21589f;
        return dVar4 != null && dVar4.f21589f == dVar3;
    }

    public void i1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f21636v = i10;
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.I = f10;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i10) {
        this.f21605f0 = i10;
    }

    public void k(k0.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f21617l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f21610i && this.f21631s0 != 8;
    }

    public void k1(int i10) {
        this.f21607g0 = i10;
    }

    public void l() {
        if (this.f21602e == null) {
            this.f21602e = new o0.l(this);
        }
        if (this.f21604f == null) {
            this.f21604f = new n(this);
        }
    }

    public boolean l0() {
        return this.f21624p || (this.O.m() && this.Q.m());
    }

    public void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f21603e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f21644z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f21646a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f21626q || (this.P.m() && this.R.m());
    }

    public void m1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f21602e.k();
        boolean k11 = z11 & this.f21604f.k();
        o0.l lVar = this.f21602e;
        int i12 = lVar.f22133h.f22088g;
        n nVar = this.f21604f;
        int i13 = nVar.f22133h.f22088g;
        int i14 = lVar.f22134i.f22088g;
        int i15 = nVar.f22134i.f22088g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f21605f0 = i12;
        }
        if (k11) {
            this.f21607g0 = i13;
        }
        if (this.f21631s0 == 8) {
            this.f21597b0 = 0;
            this.f21599c0 = 0;
            return;
        }
        if (k10) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f21597b0)) {
                i17 = i11;
            }
            this.f21597b0 = i17;
            int i19 = this.f21619m0;
            if (i17 < i19) {
                this.f21597b0 = i19;
            }
        }
        if (k11) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f21599c0)) {
                i18 = i10;
            }
            this.f21599c0 = i18;
            int i20 = this.f21621n0;
            if (i18 < i20) {
                this.f21599c0 = i20;
            }
        }
    }

    public int n() {
        return this.f21617l0;
    }

    public boolean n0() {
        return this.f21630s;
    }

    public void n1(k0.d dVar, boolean z10) {
        n nVar;
        o0.l lVar;
        int x10 = dVar.x(this.O);
        int x11 = dVar.x(this.P);
        int x12 = dVar.x(this.Q);
        int x13 = dVar.x(this.R);
        if (z10 && (lVar = this.f21602e) != null) {
            o0.f fVar = lVar.f22133h;
            if (fVar.f22091j) {
                o0.f fVar2 = lVar.f22134i;
                if (fVar2.f22091j) {
                    x10 = fVar.f22088g;
                    x12 = fVar2.f22088g;
                }
            }
        }
        if (z10 && (nVar = this.f21604f) != null) {
            o0.f fVar3 = nVar.f22133h;
            if (fVar3.f22091j) {
                o0.f fVar4 = nVar.f22134i;
                if (fVar4.f22091j) {
                    x11 = fVar3.f22088g;
                    x13 = fVar4.f22088g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x10 = 0;
            x13 = 0;
            x11 = 0;
            x12 = 0;
        }
        G0(x10, x11, x12, x13);
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f21623o0;
        }
        if (i10 == 1) {
            return this.f21625p0;
        }
        return -1.0f;
    }

    public void o0() {
        this.f21628r = true;
    }

    public int p() {
        return W() + this.f21599c0;
    }

    public void p0() {
        this.f21630s = true;
    }

    public Object q() {
        return this.f21627q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f21635u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f21595a0 = null;
        this.I = 0.0f;
        this.f21597b0 = 0;
        this.f21599c0 = 0;
        this.f21601d0 = 0.0f;
        this.f21603e0 = -1;
        this.f21605f0 = 0;
        this.f21607g0 = 0;
        this.f21613j0 = 0;
        this.f21615k0 = 0;
        this.f21617l0 = 0;
        this.f21619m0 = 0;
        this.f21621n0 = 0;
        float f10 = K0;
        this.f21623o0 = f10;
        this.f21625p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f21627q0 = null;
        this.f21629r0 = 0;
        this.f21631s0 = 0;
        this.f21637v0 = null;
        this.f21639w0 = false;
        this.f21641x0 = false;
        this.f21645z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f21632t = -1;
        this.f21634u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f21638w = 0;
        this.f21640x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = a.e.API_PRIORITY_OTHER;
        this.D = a.e.API_PRIORITY_OTHER;
        this.f21644z = 0;
        this.C = 0;
        this.f21608h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f21643y0 = false;
        boolean[] zArr = this.f21606g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f21610i = true;
        int[] iArr2 = this.f21642y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f21616l = -1;
        this.f21618m = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.f21624p = false;
        this.f21626q = false;
        this.f21628r = false;
        this.f21630s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).q();
        }
    }

    public float t() {
        return this.f21601d0;
    }

    public void t0(k0.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f21637v0 != null) {
            str = "type: " + this.f21637v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f21635u0 != null) {
            str2 = "id: " + this.f21635u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f21605f0);
        sb2.append(", ");
        sb2.append(this.f21607g0);
        sb2.append(") - (");
        sb2.append(this.f21597b0);
        sb2.append(" x ");
        sb2.append(this.f21599c0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f21603e0;
    }

    public int v() {
        if (this.f21631s0 == 8) {
            return 0;
        }
        return this.f21599c0;
    }

    public float w() {
        return this.f21623o0;
    }

    public int x() {
        return this.f21645z0;
    }

    public void x0(int i10) {
        this.f21617l0 = i10;
        this.J = i10 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f21627q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i10 = dVar != null ? 0 + dVar.f21590g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f21590g : i10;
    }

    public void z0(String str) {
        this.f21635u0 = str;
    }
}
