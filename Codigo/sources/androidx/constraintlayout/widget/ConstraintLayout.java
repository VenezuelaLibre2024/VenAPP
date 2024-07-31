package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n0.d;
import n0.e;
import o0.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static l I;
    int A;
    int B;
    int C;
    int D;
    private SparseArray<n0.e> E;
    c F;
    private int G;
    private int H;

    /* renamed from: a */
    SparseArray<View> f3007a;

    /* renamed from: b */
    private ArrayList<androidx.constraintlayout.widget.c> f3008b;

    /* renamed from: c */
    protected n0.f f3009c;

    /* renamed from: d */
    private int f3010d;

    /* renamed from: e */
    private int f3011e;

    /* renamed from: f */
    private int f3012f;

    /* renamed from: r */
    private int f3013r;

    /* renamed from: s */
    protected boolean f3014s;

    /* renamed from: t */
    private int f3015t;

    /* renamed from: u */
    private e f3016u;

    /* renamed from: v */
    protected d f3017v;

    /* renamed from: w */
    private int f3018w;

    /* renamed from: x */
    private HashMap<String, Integer> f3019x;

    /* renamed from: y */
    private int f3020y;

    /* renamed from: z */
    private int f3021z;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3022a;

        static {
            int[] iArr = new int[e.b.values().length];
            f3022a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3022a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3022a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3022a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a */
        public int f3023a;

        /* renamed from: a0 */
        public boolean f3024a0;

        /* renamed from: b */
        public int f3025b;

        /* renamed from: b0 */
        public boolean f3026b0;

        /* renamed from: c */
        public float f3027c;

        /* renamed from: c0 */
        public String f3028c0;

        /* renamed from: d */
        public boolean f3029d;

        /* renamed from: d0 */
        public int f3030d0;

        /* renamed from: e */
        public int f3031e;

        /* renamed from: e0 */
        boolean f3032e0;

        /* renamed from: f */
        public int f3033f;

        /* renamed from: f0 */
        boolean f3034f0;

        /* renamed from: g */
        public int f3035g;

        /* renamed from: g0 */
        boolean f3036g0;

        /* renamed from: h */
        public int f3037h;

        /* renamed from: h0 */
        boolean f3038h0;

        /* renamed from: i */
        public int f3039i;

        /* renamed from: i0 */
        boolean f3040i0;

        /* renamed from: j */
        public int f3041j;

        /* renamed from: j0 */
        boolean f3042j0;

        /* renamed from: k */
        public int f3043k;

        /* renamed from: k0 */
        boolean f3044k0;

        /* renamed from: l */
        public int f3045l;

        /* renamed from: l0 */
        int f3046l0;

        /* renamed from: m */
        public int f3047m;

        /* renamed from: m0 */
        int f3048m0;

        /* renamed from: n */
        public int f3049n;

        /* renamed from: n0 */
        int f3050n0;

        /* renamed from: o */
        public int f3051o;

        /* renamed from: o0 */
        int f3052o0;

        /* renamed from: p */
        public int f3053p;

        /* renamed from: p0 */
        int f3054p0;

        /* renamed from: q */
        public int f3055q;

        /* renamed from: q0 */
        int f3056q0;

        /* renamed from: r */
        public float f3057r;

        /* renamed from: r0 */
        float f3058r0;

        /* renamed from: s */
        public int f3059s;

        /* renamed from: s0 */
        int f3060s0;

        /* renamed from: t */
        public int f3061t;

        /* renamed from: t0 */
        int f3062t0;

        /* renamed from: u */
        public int f3063u;

        /* renamed from: u0 */
        float f3064u0;

        /* renamed from: v */
        public int f3065v;

        /* renamed from: v0 */
        n0.e f3066v0;

        /* renamed from: w */
        public int f3067w;

        /* renamed from: w0 */
        public boolean f3068w0;

        /* renamed from: x */
        public int f3069x;

        /* renamed from: y */
        public int f3070y;

        /* renamed from: z */
        public int f3071z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f3072a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3072a = sparseIntArray;
                sparseIntArray.append(k.f3398s2, 64);
                sparseIntArray.append(k.V1, 65);
                sparseIntArray.append(k.f3272e2, 8);
                sparseIntArray.append(k.f3281f2, 9);
                sparseIntArray.append(k.f3299h2, 10);
                sparseIntArray.append(k.f3308i2, 11);
                sparseIntArray.append(k.f3362o2, 12);
                sparseIntArray.append(k.f3353n2, 13);
                sparseIntArray.append(k.L1, 14);
                sparseIntArray.append(k.K1, 15);
                sparseIntArray.append(k.G1, 16);
                sparseIntArray.append(k.I1, 52);
                sparseIntArray.append(k.H1, 53);
                sparseIntArray.append(k.M1, 2);
                sparseIntArray.append(k.O1, 3);
                sparseIntArray.append(k.N1, 4);
                sparseIntArray.append(k.f3443x2, 49);
                sparseIntArray.append(k.f3452y2, 50);
                sparseIntArray.append(k.S1, 5);
                sparseIntArray.append(k.T1, 6);
                sparseIntArray.append(k.U1, 7);
                sparseIntArray.append(k.B1, 67);
                sparseIntArray.append(k.f3361o1, 1);
                sparseIntArray.append(k.f3317j2, 17);
                sparseIntArray.append(k.f3326k2, 18);
                sparseIntArray.append(k.R1, 19);
                sparseIntArray.append(k.Q1, 20);
                sparseIntArray.append(k.C2, 21);
                sparseIntArray.append(k.F2, 22);
                sparseIntArray.append(k.D2, 23);
                sparseIntArray.append(k.A2, 24);
                sparseIntArray.append(k.E2, 25);
                sparseIntArray.append(k.B2, 26);
                sparseIntArray.append(k.f3461z2, 55);
                sparseIntArray.append(k.G2, 54);
                sparseIntArray.append(k.f3236a2, 29);
                sparseIntArray.append(k.f3371p2, 30);
                sparseIntArray.append(k.P1, 44);
                sparseIntArray.append(k.f3254c2, 45);
                sparseIntArray.append(k.f3389r2, 46);
                sparseIntArray.append(k.f3245b2, 47);
                sparseIntArray.append(k.f3380q2, 48);
                sparseIntArray.append(k.E1, 27);
                sparseIntArray.append(k.D1, 28);
                sparseIntArray.append(k.f3407t2, 31);
                sparseIntArray.append(k.W1, 32);
                sparseIntArray.append(k.f3425v2, 33);
                sparseIntArray.append(k.f3416u2, 34);
                sparseIntArray.append(k.f3434w2, 35);
                sparseIntArray.append(k.Y1, 36);
                sparseIntArray.append(k.X1, 37);
                sparseIntArray.append(k.Z1, 38);
                sparseIntArray.append(k.f3263d2, 39);
                sparseIntArray.append(k.f3344m2, 40);
                sparseIntArray.append(k.f3290g2, 41);
                sparseIntArray.append(k.J1, 42);
                sparseIntArray.append(k.F1, 43);
                sparseIntArray.append(k.f3335l2, 51);
                sparseIntArray.append(k.I2, 66);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3023a = -1;
            this.f3025b = -1;
            this.f3027c = -1.0f;
            this.f3029d = true;
            this.f3031e = -1;
            this.f3033f = -1;
            this.f3035g = -1;
            this.f3037h = -1;
            this.f3039i = -1;
            this.f3041j = -1;
            this.f3043k = -1;
            this.f3045l = -1;
            this.f3047m = -1;
            this.f3049n = -1;
            this.f3051o = -1;
            this.f3053p = -1;
            this.f3055q = 0;
            this.f3057r = 0.0f;
            this.f3059s = -1;
            this.f3061t = -1;
            this.f3063u = -1;
            this.f3065v = -1;
            this.f3067w = Integer.MIN_VALUE;
            this.f3069x = Integer.MIN_VALUE;
            this.f3070y = Integer.MIN_VALUE;
            this.f3071z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f3024a0 = false;
            this.f3026b0 = false;
            this.f3028c0 = null;
            this.f3030d0 = 0;
            this.f3032e0 = true;
            this.f3034f0 = true;
            this.f3036g0 = false;
            this.f3038h0 = false;
            this.f3040i0 = false;
            this.f3042j0 = false;
            this.f3044k0 = false;
            this.f3046l0 = -1;
            this.f3048m0 = -1;
            this.f3050n0 = -1;
            this.f3052o0 = -1;
            this.f3054p0 = Integer.MIN_VALUE;
            this.f3056q0 = Integer.MIN_VALUE;
            this.f3058r0 = 0.5f;
            this.f3066v0 = new n0.e();
            this.f3068w0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f3023a = -1;
            this.f3025b = -1;
            this.f3027c = -1.0f;
            this.f3029d = true;
            this.f3031e = -1;
            this.f3033f = -1;
            this.f3035g = -1;
            this.f3037h = -1;
            this.f3039i = -1;
            this.f3041j = -1;
            this.f3043k = -1;
            this.f3045l = -1;
            this.f3047m = -1;
            this.f3049n = -1;
            this.f3051o = -1;
            this.f3053p = -1;
            this.f3055q = 0;
            this.f3057r = 0.0f;
            this.f3059s = -1;
            this.f3061t = -1;
            this.f3063u = -1;
            this.f3065v = -1;
            this.f3067w = Integer.MIN_VALUE;
            this.f3069x = Integer.MIN_VALUE;
            this.f3070y = Integer.MIN_VALUE;
            this.f3071z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f3024a0 = false;
            this.f3026b0 = false;
            this.f3028c0 = null;
            this.f3030d0 = 0;
            this.f3032e0 = true;
            this.f3034f0 = true;
            this.f3036g0 = false;
            this.f3038h0 = false;
            this.f3040i0 = false;
            this.f3042j0 = false;
            this.f3044k0 = false;
            this.f3046l0 = -1;
            this.f3048m0 = -1;
            this.f3050n0 = -1;
            this.f3052o0 = -1;
            this.f3054p0 = Integer.MIN_VALUE;
            this.f3056q0 = Integer.MIN_VALUE;
            this.f3058r0 = 0.5f;
            this.f3066v0 = new n0.e();
            this.f3068w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f3352n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f3072a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3053p);
                        this.f3053p = resourceId;
                        if (resourceId == -1) {
                            this.f3053p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.f3055q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3055q);
                        continue;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f3057r) % 360.0f;
                        this.f3057r = f10;
                        if (f10 < 0.0f) {
                            this.f3057r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f3023a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3023a);
                        continue;
                    case 6:
                        this.f3025b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3025b);
                        continue;
                    case 7:
                        this.f3027c = obtainStyledAttributes.getFloat(index, this.f3027c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3031e);
                        this.f3031e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3031e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3033f);
                        this.f3033f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3033f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3035g);
                        this.f3035g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3035g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3037h);
                        this.f3037h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3037h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3039i);
                        this.f3039i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3039i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3041j);
                        this.f3041j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3041j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3043k);
                        this.f3043k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3043k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3045l);
                        this.f3045l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3045l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3047m);
                        this.f3047m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3047m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3059s);
                        this.f3059s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3059s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3061t);
                        this.f3061t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3061t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3063u);
                        this.f3063u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3063u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3065v);
                        this.f3065v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3065v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.f3067w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3067w);
                        continue;
                    case 22:
                        this.f3069x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3069x);
                        continue;
                    case 23:
                        this.f3070y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3070y);
                        continue;
                    case 24:
                        this.f3071z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3071z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.f3024a0 = obtainStyledAttributes.getBoolean(index, this.f3024a0);
                        continue;
                    case 28:
                        this.f3026b0 = obtainStyledAttributes.getBoolean(index, this.f3026b0);
                        continue;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        continue;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        continue;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                e.o(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f3028c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f3049n);
                                this.f3049n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f3049n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f3051o);
                                this.f3051o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f3051o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        e.m(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.m(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f3030d0 = obtainStyledAttributes.getInt(index, this.f3030d0);
                                        break;
                                    case 67:
                                        this.f3029d = obtainStyledAttributes.getBoolean(index, this.f3029d);
                                        continue;
                                }
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3023a = -1;
            this.f3025b = -1;
            this.f3027c = -1.0f;
            this.f3029d = true;
            this.f3031e = -1;
            this.f3033f = -1;
            this.f3035g = -1;
            this.f3037h = -1;
            this.f3039i = -1;
            this.f3041j = -1;
            this.f3043k = -1;
            this.f3045l = -1;
            this.f3047m = -1;
            this.f3049n = -1;
            this.f3051o = -1;
            this.f3053p = -1;
            this.f3055q = 0;
            this.f3057r = 0.0f;
            this.f3059s = -1;
            this.f3061t = -1;
            this.f3063u = -1;
            this.f3065v = -1;
            this.f3067w = Integer.MIN_VALUE;
            this.f3069x = Integer.MIN_VALUE;
            this.f3070y = Integer.MIN_VALUE;
            this.f3071z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f3024a0 = false;
            this.f3026b0 = false;
            this.f3028c0 = null;
            this.f3030d0 = 0;
            this.f3032e0 = true;
            this.f3034f0 = true;
            this.f3036g0 = false;
            this.f3038h0 = false;
            this.f3040i0 = false;
            this.f3042j0 = false;
            this.f3044k0 = false;
            this.f3046l0 = -1;
            this.f3048m0 = -1;
            this.f3050n0 = -1;
            this.f3052o0 = -1;
            this.f3054p0 = Integer.MIN_VALUE;
            this.f3056q0 = Integer.MIN_VALUE;
            this.f3058r0 = 0.5f;
            this.f3066v0 = new n0.e();
            this.f3068w0 = false;
        }

        public void a() {
            this.f3038h0 = false;
            this.f3032e0 = true;
            this.f3034f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f3024a0) {
                this.f3032e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f3026b0) {
                this.f3034f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f3032e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f3024a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f3034f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f3026b0 = true;
                }
            }
            if (this.f3027c == -1.0f && this.f3023a == -1 && this.f3025b == -1) {
                return;
            }
            this.f3038h0 = true;
            this.f3032e0 = true;
            this.f3034f0 = true;
            if (!(this.f3066v0 instanceof n0.g)) {
                this.f3066v0 = new n0.g();
            }
            ((n0.g) this.f3066v0).x1(this.Z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        
            if (r1 > 0) goto L179;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
        
            if (r1 > 0) goto L179;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0362b {

        /* renamed from: a */
        ConstraintLayout f3073a;

        /* renamed from: b */
        int f3074b;

        /* renamed from: c */
        int f3075c;

        /* renamed from: d */
        int f3076d;

        /* renamed from: e */
        int f3077e;

        /* renamed from: f */
        int f3078f;

        /* renamed from: g */
        int f3079g;

        public c(ConstraintLayout constraintLayout) {
            this.f3073a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // o0.b.InterfaceC0362b
        public final void a() {
            int childCount = this.f3073a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f3073a.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f3073a);
                }
            }
            int size = this.f3073a.f3008b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f3073a.f3008b.get(i11)).p(this.f3073a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:152:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
        @Override // o0.b.InterfaceC0362b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(n0.e r18, o0.b.a r19) {
            /*
                Method dump skipped, instructions count: 712
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(n0.e, o0.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f3074b = i12;
            this.f3075c = i13;
            this.f3076d = i14;
            this.f3077e = i15;
            this.f3078f = i10;
            this.f3079g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3007a = new SparseArray<>();
        this.f3008b = new ArrayList<>(4);
        this.f3009c = new n0.f();
        this.f3010d = 0;
        this.f3011e = 0;
        this.f3012f = a.e.API_PRIORITY_OTHER;
        this.f3013r = a.e.API_PRIORITY_OTHER;
        this.f3014s = true;
        this.f3015t = 257;
        this.f3016u = null;
        this.f3017v = null;
        this.f3018w = -1;
        this.f3019x = new HashMap<>();
        this.f3020y = -1;
        this.f3021z = -1;
        this.A = -1;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = new SparseArray<>();
        this.F = new c(this);
        this.G = 0;
        this.H = 0;
        j(attributeSet, 0, 0);
    }

    private final n0.e g(int i10) {
        if (i10 == 0) {
            return this.f3009c;
        }
        View view = this.f3007a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f3009c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3066v0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static l getSharedValues() {
        if (I == null) {
            I = new l();
        }
        return I;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) {
        this.f3009c.y0(this);
        this.f3009c.R1(this.F);
        this.f3007a.put(getId(), this);
        this.f3016u = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f3352n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == k.f3397s1) {
                    this.f3010d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3010d);
                } else if (index == k.f3406t1) {
                    this.f3011e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3011e);
                } else if (index == k.f3379q1) {
                    this.f3012f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3012f);
                } else if (index == k.f3388r1) {
                    this.f3013r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3013r);
                } else if (index == k.H2) {
                    this.f3015t = obtainStyledAttributes.getInt(index, this.f3015t);
                } else if (index == k.C1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3017v = null;
                        }
                    }
                } else if (index == k.f3451y1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f3016u = eVar;
                        eVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3016u = null;
                    }
                    this.f3018w = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3009c.S1(this.f3015t);
    }

    private void l() {
        this.f3014s = true;
        this.f3020y = -1;
        this.f3021z = -1;
        this.A = -1;
        this.B = -1;
        this.C = 0;
        this.D = 0;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n0.e i11 = i(getChildAt(i10));
            if (i11 != null) {
                i11.r0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f3018w != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f3018w && (childAt2 instanceof f)) {
                    this.f3016u = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f3016u;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f3009c.r1();
        int size = this.f3008b.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f3008b.get(i14).r(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.E.clear();
        this.E.put(0, this.f3009c);
        this.E.put(getId(), this.f3009c);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.E.put(childAt4.getId(), i(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            n0.e i18 = i(childAt5);
            if (i18 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f3009c.b(i18);
                c(isInEditMode, childAt5, i18, bVar, this.E);
            }
        }
    }

    private void s(n0.e eVar, b bVar, SparseArray<n0.e> sparseArray, int i10, d.b bVar2) {
        View view = this.f3007a.get(i10);
        n0.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f3036g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f3036g0 = true;
            bVar4.f3066v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private boolean t() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            p();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void c(boolean r17, android.view.View r18, n0.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray<n0.e> r21) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, n0.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.f3008b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f3008b.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f3019x;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f3019x.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f3013r;
    }

    public int getMaxWidth() {
        return this.f3012f;
    }

    public int getMinHeight() {
        return this.f3011e;
    }

    public int getMinWidth() {
        return this.f3010d;
    }

    public int getOptimizationLevel() {
        return this.f3009c.G1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f3009c.f21622o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f3009c.f21622o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f3009c.f21622o = "parent";
            }
        }
        if (this.f3009c.r() == null) {
            n0.f fVar = this.f3009c;
            fVar.z0(fVar.f21622o);
            Log.v("ConstraintLayout", " setDebugName " + this.f3009c.r());
        }
        Iterator<n0.e> it = this.f3009c.o1().iterator();
        while (it.hasNext()) {
            n0.e next = it.next();
            View view = (View) next.q();
            if (view != null) {
                if (next.f21622o == null && (id2 = view.getId()) != -1) {
                    next.f21622o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.r() == null) {
                    next.z0(next.f21622o);
                    Log.v("ConstraintLayout", " setDebugName " + next.r());
                }
            }
        }
        this.f3009c.M(sb2);
        return sb2.toString();
    }

    public View h(int i10) {
        return this.f3007a.get(i10);
    }

    public final n0.e i(View view) {
        if (view == this) {
            return this.f3009c;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f3066v0;
    }

    public boolean k() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    protected void m(int i10) {
        this.f3017v = new d(getContext(), this, i10);
    }

    protected void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.F;
        int i14 = cVar.f3077e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f3076d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int min = Math.min(this.f3012f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f3013r, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f3020y = min;
        this.f3021z = min2;
    }

    protected void o(n0.f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.F.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        r(fVar, mode, i14, mode2, i15);
        fVar.N1(i10, mode, i14, mode2, i15, this.f3020y, this.f3021z, max5, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            n0.e eVar = bVar.f3066v0;
            if ((childAt.getVisibility() != 8 || bVar.f3038h0 || bVar.f3040i0 || bVar.f3044k0 || isInEditMode) && !bVar.f3042j0) {
                int V = eVar.V();
                int W = eVar.W();
                int U = eVar.U() + V;
                int v10 = eVar.v() + W;
                childAt.layout(V, W, U, v10);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v10);
                }
            }
        }
        int size = this.f3008b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f3008b.get(i15).o(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.G == i10) {
            int i12 = this.H;
        }
        if (!this.f3014s) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f3014s = true;
                    break;
                }
                i13++;
            }
        }
        boolean z10 = this.f3014s;
        this.G = i10;
        this.H = i11;
        this.f3009c.U1(k());
        if (this.f3014s) {
            this.f3014s = false;
            if (t()) {
                this.f3009c.W1();
            }
        }
        o(this.f3009c, this.f3015t, i10, i11);
        n(i10, i11, this.f3009c.U(), this.f3009c.v(), this.f3009c.M1(), this.f3009c.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        n0.e i10 = i(view);
        if ((view instanceof h) && !(i10 instanceof n0.g)) {
            b bVar = (b) view.getLayoutParams();
            n0.g gVar = new n0.g();
            bVar.f3066v0 = gVar;
            bVar.f3038h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.s();
            ((b) view.getLayoutParams()).f3040i0 = true;
            if (!this.f3008b.contains(cVar)) {
                this.f3008b.add(cVar);
            }
        }
        this.f3007a.put(view.getId(), view);
        this.f3014s = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3007a.remove(view.getId());
        this.f3009c.q1(i(view));
        this.f3008b.remove(view);
        this.f3014s = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3019x == null) {
                this.f3019x = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f3019x.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r3 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r12 = java.lang.Math.max(0, r7.f3011e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r3 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0025, code lost:
    
        if (r3 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r10 = java.lang.Math.max(0, r7.f3010d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        if (r3 == 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void r(n0.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.F
            int r1 = r0.f3077e
            int r0 = r0.f3076d
            n0.e$b r2 = n0.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.f3012f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            n0.e$b r9 = n0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            n0.e$b r9 = n0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f3010d
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.f3013r
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            n0.e$b r2 = n0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            n0.e$b r2 = n0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f3011e
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.U()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.J1()
        L60:
            r8.j1(r6)
            r8.k1(r6)
            int r11 = r7.f3012f
            int r11 = r11 - r0
            r8.U0(r11)
            int r11 = r7.f3013r
            int r11 = r11 - r1
            r8.T0(r11)
            r8.X0(r6)
            r8.W0(r6)
            r8.M0(r9)
            r8.h1(r10)
            r8.d1(r2)
            r8.I0(r12)
            int r9 = r7.f3010d
            int r9 = r9 - r0
            r8.X0(r9)
            int r9 = r7.f3011e
            int r9 = r9 - r1
            r8.W0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(n0.f, int, int, int, int):void");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f3016u = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f3007a.remove(getId());
        super.setId(i10);
        this.f3007a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f3013r) {
            return;
        }
        this.f3013r = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f3012f) {
            return;
        }
        this.f3012f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f3011e) {
            return;
        }
        this.f3011e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f3010d) {
            return;
        }
        this.f3010d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f3017v;
        if (dVar != null) {
            dVar.c(gVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f3015t = i10;
        this.f3009c.S1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
