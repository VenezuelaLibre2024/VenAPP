package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f3118f = {0, 4, 8};

    /* renamed from: g, reason: collision with root package name */
    private static SparseIntArray f3119g = new SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f3120h = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f3121a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f3122b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.b> f3123c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f3124d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<Integer, a> f3125e = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f3126a;

        /* renamed from: b, reason: collision with root package name */
        String f3127b;

        /* renamed from: c, reason: collision with root package name */
        public final d f3128c = new d();

        /* renamed from: d, reason: collision with root package name */
        public final c f3129d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f3130e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final C0035e f3131f = new C0035e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.b> f3132g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        C0034a f3133h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0034a {

            /* renamed from: a, reason: collision with root package name */
            int[] f3134a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f3135b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f3136c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f3137d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f3138e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f3139f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f3140g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f3141h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f3142i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f3143j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f3144k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f3145l = 0;

            C0034a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f3139f;
                int[] iArr = this.f3137d;
                if (i11 >= iArr.length) {
                    this.f3137d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3138e;
                    this.f3138e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3137d;
                int i12 = this.f3139f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f3138e;
                this.f3139f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f3136c;
                int[] iArr = this.f3134a;
                if (i12 >= iArr.length) {
                    this.f3134a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3135b;
                    this.f3135b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3134a;
                int i13 = this.f3136c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f3135b;
                this.f3136c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f3142i;
                int[] iArr = this.f3140g;
                if (i11 >= iArr.length) {
                    this.f3140g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3141h;
                    this.f3141h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3140g;
                int i12 = this.f3142i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f3141h;
                this.f3142i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f3145l;
                int[] iArr = this.f3143j;
                if (i11 >= iArr.length) {
                    this.f3143j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3144k;
                    this.f3144k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3143j;
                int i12 = this.f3145l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f3144k;
                this.f3145l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f3126a = i10;
            b bVar2 = this.f3130e;
            bVar2.f3165j = bVar.f3031e;
            bVar2.f3167k = bVar.f3033f;
            bVar2.f3169l = bVar.f3035g;
            bVar2.f3171m = bVar.f3037h;
            bVar2.f3173n = bVar.f3039i;
            bVar2.f3175o = bVar.f3041j;
            bVar2.f3177p = bVar.f3043k;
            bVar2.f3179q = bVar.f3045l;
            bVar2.f3181r = bVar.f3047m;
            bVar2.f3182s = bVar.f3049n;
            bVar2.f3183t = bVar.f3051o;
            bVar2.f3184u = bVar.f3059s;
            bVar2.f3185v = bVar.f3061t;
            bVar2.f3186w = bVar.f3063u;
            bVar2.f3187x = bVar.f3065v;
            bVar2.f3188y = bVar.G;
            bVar2.f3189z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f3053p;
            bVar2.C = bVar.f3055q;
            bVar2.D = bVar.f3057r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f3161h = bVar.f3027c;
            bVar2.f3157f = bVar.f3023a;
            bVar2.f3159g = bVar.f3025b;
            bVar2.f3153d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f3155e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f3174n0 = bVar.f3024a0;
            bVar2.f3176o0 = bVar.f3026b0;
            bVar2.Z = bVar.P;
            bVar2.f3148a0 = bVar.Q;
            bVar2.f3150b0 = bVar.T;
            bVar2.f3152c0 = bVar.U;
            bVar2.f3154d0 = bVar.R;
            bVar2.f3156e0 = bVar.S;
            bVar2.f3158f0 = bVar.V;
            bVar2.f3160g0 = bVar.W;
            bVar2.f3172m0 = bVar.f3028c0;
            bVar2.P = bVar.f3069x;
            bVar2.R = bVar.f3071z;
            bVar2.O = bVar.f3067w;
            bVar2.Q = bVar.f3070y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f3180q0 = bVar.f3030d0;
            bVar2.L = bVar.getMarginEnd();
            this.f3130e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, f.a aVar) {
            f(i10, aVar);
            this.f3128c.f3208d = aVar.f3226x0;
            C0035e c0035e = this.f3131f;
            c0035e.f3212b = aVar.A0;
            c0035e.f3213c = aVar.B0;
            c0035e.f3214d = aVar.C0;
            c0035e.f3215e = aVar.D0;
            c0035e.f3216f = aVar.E0;
            c0035e.f3217g = aVar.F0;
            c0035e.f3218h = aVar.G0;
            c0035e.f3220j = aVar.H0;
            c0035e.f3221k = aVar.I0;
            c0035e.f3222l = aVar.J0;
            c0035e.f3224n = aVar.f3228z0;
            c0035e.f3223m = aVar.f3227y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.c cVar, int i10, f.a aVar) {
            g(i10, aVar);
            if (cVar instanceof androidx.constraintlayout.widget.a) {
                b bVar = this.f3130e;
                bVar.f3166j0 = 1;
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) cVar;
                bVar.f3162h0 = aVar2.getType();
                this.f3130e.f3168k0 = aVar2.getReferencedIds();
                this.f3130e.f3164i0 = aVar2.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f3130e;
            bVar.f3031e = bVar2.f3165j;
            bVar.f3033f = bVar2.f3167k;
            bVar.f3035g = bVar2.f3169l;
            bVar.f3037h = bVar2.f3171m;
            bVar.f3039i = bVar2.f3173n;
            bVar.f3041j = bVar2.f3175o;
            bVar.f3043k = bVar2.f3177p;
            bVar.f3045l = bVar2.f3179q;
            bVar.f3047m = bVar2.f3181r;
            bVar.f3049n = bVar2.f3182s;
            bVar.f3051o = bVar2.f3183t;
            bVar.f3059s = bVar2.f3184u;
            bVar.f3061t = bVar2.f3185v;
            bVar.f3063u = bVar2.f3186w;
            bVar.f3065v = bVar2.f3187x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f3069x = bVar2.P;
            bVar.f3071z = bVar2.R;
            bVar.G = bVar2.f3188y;
            bVar.H = bVar2.f3189z;
            bVar.f3053p = bVar2.B;
            bVar.f3055q = bVar2.C;
            bVar.f3057r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f3024a0 = bVar2.f3174n0;
            bVar.f3026b0 = bVar2.f3176o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f3148a0;
            bVar.T = bVar2.f3150b0;
            bVar.U = bVar2.f3152c0;
            bVar.R = bVar2.f3154d0;
            bVar.S = bVar2.f3156e0;
            bVar.V = bVar2.f3158f0;
            bVar.W = bVar2.f3160g0;
            bVar.Z = bVar2.G;
            bVar.f3027c = bVar2.f3161h;
            bVar.f3023a = bVar2.f3157f;
            bVar.f3025b = bVar2.f3159g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f3153d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f3155e;
            String str = bVar2.f3172m0;
            if (str != null) {
                bVar.f3028c0 = str;
            }
            bVar.f3030d0 = bVar2.f3180q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f3130e.L);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f3130e.a(this.f3130e);
            aVar.f3129d.a(this.f3129d);
            aVar.f3128c.a(this.f3128c);
            aVar.f3131f.a(this.f3131f);
            aVar.f3126a = this.f3126a;
            aVar.f3133h = this.f3133h;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f3146r0;

        /* renamed from: d, reason: collision with root package name */
        public int f3153d;

        /* renamed from: e, reason: collision with root package name */
        public int f3155e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f3168k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f3170l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f3172m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3147a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3149b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3151c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f3157f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f3159g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f3161h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3163i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f3165j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f3167k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f3169l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f3171m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f3173n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f3175o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f3177p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f3179q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f3181r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f3182s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f3183t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f3184u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f3185v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f3186w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f3187x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f3188y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f3189z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f3148a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f3150b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f3152c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f3154d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f3156e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f3158f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f3160g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f3162h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f3164i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f3166j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f3174n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f3176o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f3178p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f3180q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3146r0 = sparseIntArray;
            sparseIntArray.append(k.K5, 24);
            f3146r0.append(k.L5, 25);
            f3146r0.append(k.N5, 28);
            f3146r0.append(k.O5, 29);
            f3146r0.append(k.T5, 35);
            f3146r0.append(k.S5, 34);
            f3146r0.append(k.f3419u5, 4);
            f3146r0.append(k.f3410t5, 3);
            f3146r0.append(k.f3392r5, 1);
            f3146r0.append(k.Z5, 6);
            f3146r0.append(k.f3240a6, 7);
            f3146r0.append(k.B5, 17);
            f3146r0.append(k.C5, 18);
            f3146r0.append(k.D5, 19);
            f3146r0.append(k.f3356n5, 90);
            f3146r0.append(k.Z4, 26);
            f3146r0.append(k.P5, 31);
            f3146r0.append(k.Q5, 32);
            f3146r0.append(k.A5, 10);
            f3146r0.append(k.f3464z5, 9);
            f3146r0.append(k.f3267d6, 13);
            f3146r0.append(k.f3294g6, 16);
            f3146r0.append(k.f3276e6, 14);
            f3146r0.append(k.f3249b6, 11);
            f3146r0.append(k.f3285f6, 15);
            f3146r0.append(k.f3258c6, 12);
            f3146r0.append(k.W5, 38);
            f3146r0.append(k.I5, 37);
            f3146r0.append(k.H5, 39);
            f3146r0.append(k.V5, 40);
            f3146r0.append(k.G5, 20);
            f3146r0.append(k.U5, 36);
            f3146r0.append(k.f3455y5, 5);
            f3146r0.append(k.J5, 91);
            f3146r0.append(k.R5, 91);
            f3146r0.append(k.M5, 91);
            f3146r0.append(k.f3401s5, 91);
            f3146r0.append(k.f3383q5, 91);
            f3146r0.append(k.f3257c5, 23);
            f3146r0.append(k.f3275e5, 27);
            f3146r0.append(k.f3293g5, 30);
            f3146r0.append(k.f3302h5, 8);
            f3146r0.append(k.f3266d5, 33);
            f3146r0.append(k.f3284f5, 2);
            f3146r0.append(k.f3239a5, 22);
            f3146r0.append(k.f3248b5, 21);
            f3146r0.append(k.X5, 41);
            f3146r0.append(k.E5, 42);
            f3146r0.append(k.f3374p5, 41);
            f3146r0.append(k.f3365o5, 42);
            f3146r0.append(k.f3303h6, 76);
            f3146r0.append(k.f3428v5, 61);
            f3146r0.append(k.f3446x5, 62);
            f3146r0.append(k.f3437w5, 63);
            f3146r0.append(k.Y5, 69);
            f3146r0.append(k.F5, 70);
            f3146r0.append(k.f3338l5, 71);
            f3146r0.append(k.f3320j5, 72);
            f3146r0.append(k.f3329k5, 73);
            f3146r0.append(k.f3347m5, 74);
            f3146r0.append(k.f3311i5, 75);
        }

        public void a(b bVar) {
            this.f3147a = bVar.f3147a;
            this.f3153d = bVar.f3153d;
            this.f3149b = bVar.f3149b;
            this.f3155e = bVar.f3155e;
            this.f3157f = bVar.f3157f;
            this.f3159g = bVar.f3159g;
            this.f3161h = bVar.f3161h;
            this.f3163i = bVar.f3163i;
            this.f3165j = bVar.f3165j;
            this.f3167k = bVar.f3167k;
            this.f3169l = bVar.f3169l;
            this.f3171m = bVar.f3171m;
            this.f3173n = bVar.f3173n;
            this.f3175o = bVar.f3175o;
            this.f3177p = bVar.f3177p;
            this.f3179q = bVar.f3179q;
            this.f3181r = bVar.f3181r;
            this.f3182s = bVar.f3182s;
            this.f3183t = bVar.f3183t;
            this.f3184u = bVar.f3184u;
            this.f3185v = bVar.f3185v;
            this.f3186w = bVar.f3186w;
            this.f3187x = bVar.f3187x;
            this.f3188y = bVar.f3188y;
            this.f3189z = bVar.f3189z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f3148a0 = bVar.f3148a0;
            this.f3150b0 = bVar.f3150b0;
            this.f3152c0 = bVar.f3152c0;
            this.f3154d0 = bVar.f3154d0;
            this.f3156e0 = bVar.f3156e0;
            this.f3158f0 = bVar.f3158f0;
            this.f3160g0 = bVar.f3160g0;
            this.f3162h0 = bVar.f3162h0;
            this.f3164i0 = bVar.f3164i0;
            this.f3166j0 = bVar.f3166j0;
            this.f3172m0 = bVar.f3172m0;
            int[] iArr = bVar.f3168k0;
            if (iArr == null || bVar.f3170l0 != null) {
                this.f3168k0 = null;
            } else {
                this.f3168k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f3170l0 = bVar.f3170l0;
            this.f3174n0 = bVar.f3174n0;
            this.f3176o0 = bVar.f3176o0;
            this.f3178p0 = bVar.f3178p0;
            this.f3180q0 = bVar.f3180q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Y4);
            this.f3149b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f3146r0.get(index);
                switch (i11) {
                    case 1:
                        this.f3181r = e.l(obtainStyledAttributes, index, this.f3181r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f3179q = e.l(obtainStyledAttributes, index, this.f3179q);
                        break;
                    case 4:
                        this.f3177p = e.l(obtainStyledAttributes, index, this.f3177p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f3187x = e.l(obtainStyledAttributes, index, this.f3187x);
                        break;
                    case 10:
                        this.f3186w = e.l(obtainStyledAttributes, index, this.f3186w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f3157f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3157f);
                        break;
                    case 18:
                        this.f3159g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3159g);
                        break;
                    case 19:
                        this.f3161h = obtainStyledAttributes.getFloat(index, this.f3161h);
                        break;
                    case 20:
                        this.f3188y = obtainStyledAttributes.getFloat(index, this.f3188y);
                        break;
                    case 21:
                        this.f3155e = obtainStyledAttributes.getLayoutDimension(index, this.f3155e);
                        break;
                    case 22:
                        this.f3153d = obtainStyledAttributes.getLayoutDimension(index, this.f3153d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f3165j = e.l(obtainStyledAttributes, index, this.f3165j);
                        break;
                    case 25:
                        this.f3167k = e.l(obtainStyledAttributes, index, this.f3167k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f3169l = e.l(obtainStyledAttributes, index, this.f3169l);
                        break;
                    case 29:
                        this.f3171m = e.l(obtainStyledAttributes, index, this.f3171m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f3184u = e.l(obtainStyledAttributes, index, this.f3184u);
                        break;
                    case 32:
                        this.f3185v = e.l(obtainStyledAttributes, index, this.f3185v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f3175o = e.l(obtainStyledAttributes, index, this.f3175o);
                        break;
                    case 35:
                        this.f3173n = e.l(obtainStyledAttributes, index, this.f3173n);
                        break;
                    case 36:
                        this.f3189z = obtainStyledAttributes.getFloat(index, this.f3189z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = e.l(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f3158f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f3160g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f3162h0 = obtainStyledAttributes.getInt(index, this.f3162h0);
                                        continue;
                                    case 73:
                                        this.f3164i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3164i0);
                                        continue;
                                    case 74:
                                        this.f3170l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f3178p0 = obtainStyledAttributes.getBoolean(index, this.f3178p0);
                                        continue;
                                    case 76:
                                        this.f3180q0 = obtainStyledAttributes.getInt(index, this.f3180q0);
                                        continue;
                                    case 77:
                                        this.f3182s = e.l(obtainStyledAttributes, index, this.f3182s);
                                        continue;
                                    case 78:
                                        this.f3183t = e.l(obtainStyledAttributes, index, this.f3183t);
                                        continue;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.f3148a0 = obtainStyledAttributes.getInt(index, this.f3148a0);
                                        continue;
                                    case 83:
                                        this.f3152c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3152c0);
                                        continue;
                                    case 84:
                                        this.f3150b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3150b0);
                                        continue;
                                    case 85:
                                        this.f3156e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3156e0);
                                        continue;
                                    case 86:
                                        this.f3154d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3154d0);
                                        continue;
                                    case 87:
                                        this.f3174n0 = obtainStyledAttributes.getBoolean(index, this.f3174n0);
                                        continue;
                                    case 88:
                                        this.f3176o0 = obtainStyledAttributes.getBoolean(index, this.f3176o0);
                                        continue;
                                    case 89:
                                        this.f3172m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f3163i = obtainStyledAttributes.getBoolean(index, this.f3163i);
                                        continue;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb2.append(str);
                                sb2.append(Integer.toHexString(index));
                                sb2.append("   ");
                                sb2.append(f3146r0.get(index));
                                Log.w("ConstraintSet", sb2.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f3190o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3191a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3192b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f3193c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f3194d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f3195e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f3196f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f3197g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f3198h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f3199i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f3200j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f3201k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f3202l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f3203m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f3204n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3190o = sparseIntArray;
            sparseIntArray.append(k.f3411t6, 1);
            f3190o.append(k.f3429v6, 2);
            f3190o.append(k.f3465z6, 3);
            f3190o.append(k.f3402s6, 4);
            f3190o.append(k.f3393r6, 5);
            f3190o.append(k.f3384q6, 6);
            f3190o.append(k.f3420u6, 7);
            f3190o.append(k.f3456y6, 8);
            f3190o.append(k.f3447x6, 9);
            f3190o.append(k.f3438w6, 10);
        }

        public void a(c cVar) {
            this.f3191a = cVar.f3191a;
            this.f3192b = cVar.f3192b;
            this.f3194d = cVar.f3194d;
            this.f3195e = cVar.f3195e;
            this.f3196f = cVar.f3196f;
            this.f3199i = cVar.f3199i;
            this.f3197g = cVar.f3197g;
            this.f3198h = cVar.f3198h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f3375p6);
            this.f3191a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3190o.get(index)) {
                    case 1:
                        this.f3199i = obtainStyledAttributes.getFloat(index, this.f3199i);
                        break;
                    case 2:
                        this.f3195e = obtainStyledAttributes.getInt(index, this.f3195e);
                        break;
                    case 3:
                        this.f3194d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : l0.b.f20777c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f3196f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3192b = e.l(obtainStyledAttributes, index, this.f3192b);
                        break;
                    case 6:
                        this.f3193c = obtainStyledAttributes.getInteger(index, this.f3193c);
                        break;
                    case 7:
                        this.f3197g = obtainStyledAttributes.getFloat(index, this.f3197g);
                        break;
                    case 8:
                        this.f3201k = obtainStyledAttributes.getInteger(index, this.f3201k);
                        break;
                    case 9:
                        this.f3200j = obtainStyledAttributes.getFloat(index, this.f3200j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3204n = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.f3203m = -2;
                            break;
                        } else if (i11 != 3) {
                            this.f3203m = obtainStyledAttributes.getInteger(index, this.f3204n);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3202l = string;
                            if (string.indexOf("/") <= 0) {
                                this.f3203m = -1;
                                break;
                            } else {
                                this.f3204n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3203m = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3205a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3206b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f3207c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f3208d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3209e = Float.NaN;

        public void a(d dVar) {
            this.f3205a = dVar.f3205a;
            this.f3206b = dVar.f3206b;
            this.f3208d = dVar.f3208d;
            this.f3209e = dVar.f3209e;
            this.f3207c = dVar.f3207c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.M6);
            this.f3205a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.O6) {
                    this.f3208d = obtainStyledAttributes.getFloat(index, this.f3208d);
                } else if (index == k.N6) {
                    this.f3206b = obtainStyledAttributes.getInt(index, this.f3206b);
                    this.f3206b = e.f3118f[this.f3206b];
                } else if (index == k.Q6) {
                    this.f3207c = obtainStyledAttributes.getInt(index, this.f3207c);
                } else if (index == k.P6) {
                    this.f3209e = obtainStyledAttributes.getFloat(index, this.f3209e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f3210o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3211a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f3212b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f3213c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f3214d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3215e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f3216f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f3217g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f3218h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f3219i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f3220j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f3221k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f3222l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f3223m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f3224n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3210o = sparseIntArray;
            sparseIntArray.append(k.f3340l7, 1);
            f3210o.append(k.f3349m7, 2);
            f3210o.append(k.f3358n7, 3);
            f3210o.append(k.f3322j7, 4);
            f3210o.append(k.f3331k7, 5);
            f3210o.append(k.f3286f7, 6);
            f3210o.append(k.f3295g7, 7);
            f3210o.append(k.f3304h7, 8);
            f3210o.append(k.f3313i7, 9);
            f3210o.append(k.f3367o7, 10);
            f3210o.append(k.f3376p7, 11);
            f3210o.append(k.f3385q7, 12);
        }

        public void a(C0035e c0035e) {
            this.f3211a = c0035e.f3211a;
            this.f3212b = c0035e.f3212b;
            this.f3213c = c0035e.f3213c;
            this.f3214d = c0035e.f3214d;
            this.f3215e = c0035e.f3215e;
            this.f3216f = c0035e.f3216f;
            this.f3217g = c0035e.f3217g;
            this.f3218h = c0035e.f3218h;
            this.f3219i = c0035e.f3219i;
            this.f3220j = c0035e.f3220j;
            this.f3221k = c0035e.f3221k;
            this.f3222l = c0035e.f3222l;
            this.f3223m = c0035e.f3223m;
            this.f3224n = c0035e.f3224n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f3277e7);
            this.f3211a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3210o.get(index)) {
                    case 1:
                        this.f3212b = obtainStyledAttributes.getFloat(index, this.f3212b);
                        break;
                    case 2:
                        this.f3213c = obtainStyledAttributes.getFloat(index, this.f3213c);
                        break;
                    case 3:
                        this.f3214d = obtainStyledAttributes.getFloat(index, this.f3214d);
                        break;
                    case 4:
                        this.f3215e = obtainStyledAttributes.getFloat(index, this.f3215e);
                        break;
                    case 5:
                        this.f3216f = obtainStyledAttributes.getFloat(index, this.f3216f);
                        break;
                    case 6:
                        this.f3217g = obtainStyledAttributes.getDimension(index, this.f3217g);
                        break;
                    case 7:
                        this.f3218h = obtainStyledAttributes.getDimension(index, this.f3218h);
                        break;
                    case 8:
                        this.f3220j = obtainStyledAttributes.getDimension(index, this.f3220j);
                        break;
                    case 9:
                        this.f3221k = obtainStyledAttributes.getDimension(index, this.f3221k);
                        break;
                    case 10:
                        this.f3222l = obtainStyledAttributes.getDimension(index, this.f3222l);
                        break;
                    case 11:
                        this.f3223m = true;
                        this.f3224n = obtainStyledAttributes.getDimension(index, this.f3224n);
                        break;
                    case 12:
                        this.f3219i = e.l(obtainStyledAttributes, index, this.f3219i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f3119g.append(k.A0, 25);
        f3119g.append(k.B0, 26);
        f3119g.append(k.D0, 29);
        f3119g.append(k.E0, 30);
        f3119g.append(k.K0, 36);
        f3119g.append(k.J0, 35);
        f3119g.append(k.f3297h0, 4);
        f3119g.append(k.f3288g0, 3);
        f3119g.append(k.f3252c0, 1);
        f3119g.append(k.f3270e0, 91);
        f3119g.append(k.f3261d0, 92);
        f3119g.append(k.T0, 6);
        f3119g.append(k.U0, 7);
        f3119g.append(k.f3360o0, 17);
        f3119g.append(k.f3369p0, 18);
        f3119g.append(k.f3378q0, 19);
        f3119g.append(k.Y, 99);
        f3119g.append(k.f3413u, 27);
        f3119g.append(k.F0, 32);
        f3119g.append(k.G0, 33);
        f3119g.append(k.f3351n0, 10);
        f3119g.append(k.f3342m0, 9);
        f3119g.append(k.X0, 13);
        f3119g.append(k.f3235a1, 16);
        f3119g.append(k.Y0, 14);
        f3119g.append(k.V0, 11);
        f3119g.append(k.Z0, 15);
        f3119g.append(k.W0, 12);
        f3119g.append(k.N0, 40);
        f3119g.append(k.f3450y0, 39);
        f3119g.append(k.f3441x0, 41);
        f3119g.append(k.M0, 42);
        f3119g.append(k.f3432w0, 20);
        f3119g.append(k.L0, 37);
        f3119g.append(k.f3333l0, 5);
        f3119g.append(k.f3459z0, 87);
        f3119g.append(k.I0, 87);
        f3119g.append(k.C0, 87);
        f3119g.append(k.f3279f0, 87);
        f3119g.append(k.f3243b0, 87);
        f3119g.append(k.f3458z, 24);
        f3119g.append(k.B, 28);
        f3119g.append(k.N, 31);
        f3119g.append(k.O, 8);
        f3119g.append(k.A, 34);
        f3119g.append(k.C, 2);
        f3119g.append(k.f3440x, 23);
        f3119g.append(k.f3449y, 21);
        f3119g.append(k.O0, 95);
        f3119g.append(k.f3387r0, 96);
        f3119g.append(k.f3431w, 22);
        f3119g.append(k.D, 43);
        f3119g.append(k.Q, 44);
        f3119g.append(k.L, 45);
        f3119g.append(k.M, 46);
        f3119g.append(k.K, 60);
        f3119g.append(k.I, 47);
        f3119g.append(k.J, 48);
        f3119g.append(k.E, 49);
        f3119g.append(k.F, 50);
        f3119g.append(k.G, 51);
        f3119g.append(k.H, 52);
        f3119g.append(k.P, 53);
        f3119g.append(k.P0, 54);
        f3119g.append(k.f3396s0, 55);
        f3119g.append(k.Q0, 56);
        f3119g.append(k.f3405t0, 57);
        f3119g.append(k.R0, 58);
        f3119g.append(k.f3414u0, 59);
        f3119g.append(k.f3306i0, 61);
        f3119g.append(k.f3324k0, 62);
        f3119g.append(k.f3315j0, 63);
        f3119g.append(k.R, 64);
        f3119g.append(k.f3325k1, 65);
        f3119g.append(k.X, 66);
        f3119g.append(k.f3334l1, 67);
        f3119g.append(k.f3262d1, 79);
        f3119g.append(k.f3422v, 38);
        f3119g.append(k.f3253c1, 68);
        f3119g.append(k.S0, 69);
        f3119g.append(k.f3423v0, 70);
        f3119g.append(k.f3244b1, 97);
        f3119g.append(k.V, 71);
        f3119g.append(k.T, 72);
        f3119g.append(k.U, 73);
        f3119g.append(k.W, 74);
        f3119g.append(k.S, 75);
        f3119g.append(k.f3271e1, 76);
        f3119g.append(k.H0, 77);
        f3119g.append(k.f3343m1, 78);
        f3119g.append(k.f3234a0, 80);
        f3119g.append(k.Z, 81);
        f3119g.append(k.f3280f1, 82);
        f3119g.append(k.f3316j1, 83);
        f3119g.append(k.f3307i1, 84);
        f3119g.append(k.f3298h1, 85);
        f3119g.append(k.f3289g1, 86);
        SparseIntArray sparseIntArray = f3120h;
        int i10 = k.R3;
        sparseIntArray.append(i10, 6);
        f3120h.append(i10, 7);
        f3120h.append(k.M2, 27);
        f3120h.append(k.U3, 13);
        f3120h.append(k.X3, 16);
        f3120h.append(k.V3, 14);
        f3120h.append(k.S3, 11);
        f3120h.append(k.W3, 15);
        f3120h.append(k.T3, 12);
        f3120h.append(k.L3, 40);
        f3120h.append(k.E3, 39);
        f3120h.append(k.D3, 41);
        f3120h.append(k.K3, 42);
        f3120h.append(k.C3, 20);
        f3120h.append(k.J3, 37);
        f3120h.append(k.f3435w3, 5);
        f3120h.append(k.F3, 87);
        f3120h.append(k.I3, 87);
        f3120h.append(k.G3, 87);
        f3120h.append(k.f3408t3, 87);
        f3120h.append(k.f3399s3, 87);
        f3120h.append(k.R2, 24);
        f3120h.append(k.T2, 28);
        f3120h.append(k.f3282f3, 31);
        f3120h.append(k.f3291g3, 8);
        f3120h.append(k.S2, 34);
        f3120h.append(k.U2, 2);
        f3120h.append(k.P2, 23);
        f3120h.append(k.Q2, 21);
        f3120h.append(k.M3, 95);
        f3120h.append(k.f3444x3, 96);
        f3120h.append(k.O2, 22);
        f3120h.append(k.V2, 43);
        f3120h.append(k.f3309i3, 44);
        f3120h.append(k.f3264d3, 45);
        f3120h.append(k.f3273e3, 46);
        f3120h.append(k.f3255c3, 60);
        f3120h.append(k.f3237a3, 47);
        f3120h.append(k.f3246b3, 48);
        f3120h.append(k.W2, 49);
        f3120h.append(k.X2, 50);
        f3120h.append(k.Y2, 51);
        f3120h.append(k.Z2, 52);
        f3120h.append(k.f3300h3, 53);
        f3120h.append(k.N3, 54);
        f3120h.append(k.f3453y3, 55);
        f3120h.append(k.O3, 56);
        f3120h.append(k.f3462z3, 57);
        f3120h.append(k.P3, 58);
        f3120h.append(k.A3, 59);
        f3120h.append(k.f3426v3, 62);
        f3120h.append(k.f3417u3, 63);
        f3120h.append(k.f3318j3, 64);
        f3120h.append(k.f3310i4, 65);
        f3120h.append(k.f3372p3, 66);
        f3120h.append(k.f3319j4, 67);
        f3120h.append(k.f3238a4, 79);
        f3120h.append(k.N2, 38);
        f3120h.append(k.f3247b4, 98);
        f3120h.append(k.Z3, 68);
        f3120h.append(k.Q3, 69);
        f3120h.append(k.B3, 70);
        f3120h.append(k.f3354n3, 71);
        f3120h.append(k.f3336l3, 72);
        f3120h.append(k.f3345m3, 73);
        f3120h.append(k.f3363o3, 74);
        f3120h.append(k.f3327k3, 75);
        f3120h.append(k.f3256c4, 76);
        f3120h.append(k.H3, 77);
        f3120h.append(k.f3328k4, 78);
        f3120h.append(k.f3390r3, 80);
        f3120h.append(k.f3381q3, 81);
        f3120h.append(k.f3265d4, 82);
        f3120h.append(k.f3301h4, 83);
        f3120h.append(k.f3292g4, 84);
        f3120h.append(k.f3283f4, 85);
        f3120h.append(k.f3274e4, 86);
        f3120h.append(k.Y3, 97);
    }

    private int[] h(View view, String str) {
        int i10;
        Object f10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f10 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f10 instanceof Integer)) {
                i10 = ((Integer) f10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? k.L2 : k.f3404t);
        p(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6c
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L26
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L22
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L2a
            r6 = -1
            if (r5 == r6) goto L2a
        L20:
            r5 = r2
            goto L2d
        L22:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2d
        L26:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L2a:
            r3 = r2
            r2 = r5
            r5 = r3
        L2d:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L3f
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3a
            r4.width = r2
            r4.f3024a0 = r5
            goto L6b
        L3a:
            r4.height = r2
            r4.f3026b0 = r5
            goto L6b
        L3f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L51
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L4c
            r4.f3153d = r2
            r4.f3174n0 = r5
            goto L6b
        L4c:
            r4.f3155e = r2
            r4.f3176o0 = r5
            goto L6b
        L51:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0034a
            if (r6 == 0) goto L6b
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0034a) r4
            if (r7 != 0) goto L61
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            goto L68
        L61:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
        L68:
            r4.d(r6, r5)
        L6b:
            return
        L6c:
            java.lang.String r5 = r5.getString(r6)
            n(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void n(Object obj, String str, int i10) {
        int i11;
        int i12;
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    o(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0034a) {
                        ((a.C0034a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f3153d = 0;
                            bVar3.W = parseFloat;
                            return;
                        } else {
                            bVar3.f3155e = 0;
                            bVar3.V = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof a.C0034a) {
                        a.C0034a c0034a = (a.C0034a) obj;
                        if (i10 == 0) {
                            c0034a.b(23, 0);
                            i12 = 39;
                        } else {
                            c0034a.b(21, 0);
                            i12 = 40;
                        }
                        c0034a.a(i12, parseFloat);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f3153d = 0;
                            bVar5.f3158f0 = max;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f3155e = 0;
                            bVar5.f3160g0 = max;
                            bVar5.f3148a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0034a) {
                        a.C0034a c0034a2 = (a.C0034a) obj;
                        if (i10 == 0) {
                            c0034a2.b(23, 0);
                            i11 = 54;
                        } else {
                            c0034a2.b(21, 0);
                            i11 = 55;
                        }
                        c0034a2.b(i11, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i11);
                    if (substring2.length() > 0) {
                        f10 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i11, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f10;
        bVar.K = i10;
    }

    private void p(Context context, a aVar, TypedArray typedArray, boolean z10) {
        c cVar;
        String str;
        c cVar2;
        StringBuilder sb2;
        String str2;
        if (z10) {
            q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != k.f3422v && k.N != index && k.O != index) {
                aVar.f3129d.f3191a = true;
                aVar.f3130e.f3149b = true;
                aVar.f3128c.f3205a = true;
                aVar.f3131f.f3211a = true;
            }
            switch (f3119g.get(index)) {
                case 1:
                    b bVar = aVar.f3130e;
                    bVar.f3181r = l(typedArray, index, bVar.f3181r);
                    continue;
                case 2:
                    b bVar2 = aVar.f3130e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    continue;
                case 3:
                    b bVar3 = aVar.f3130e;
                    bVar3.f3179q = l(typedArray, index, bVar3.f3179q);
                    continue;
                case 4:
                    b bVar4 = aVar.f3130e;
                    bVar4.f3177p = l(typedArray, index, bVar4.f3177p);
                    continue;
                case 5:
                    aVar.f3130e.A = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f3130e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    continue;
                case 7:
                    b bVar6 = aVar.f3130e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    continue;
                case 8:
                    b bVar7 = aVar.f3130e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    continue;
                case 9:
                    b bVar8 = aVar.f3130e;
                    bVar8.f3187x = l(typedArray, index, bVar8.f3187x);
                    continue;
                case 10:
                    b bVar9 = aVar.f3130e;
                    bVar9.f3186w = l(typedArray, index, bVar9.f3186w);
                    continue;
                case 11:
                    b bVar10 = aVar.f3130e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    continue;
                case 12:
                    b bVar11 = aVar.f3130e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    continue;
                case 13:
                    b bVar12 = aVar.f3130e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    continue;
                case 14:
                    b bVar13 = aVar.f3130e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    continue;
                case 15:
                    b bVar14 = aVar.f3130e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    continue;
                case 16:
                    b bVar15 = aVar.f3130e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    continue;
                case 17:
                    b bVar16 = aVar.f3130e;
                    bVar16.f3157f = typedArray.getDimensionPixelOffset(index, bVar16.f3157f);
                    continue;
                case 18:
                    b bVar17 = aVar.f3130e;
                    bVar17.f3159g = typedArray.getDimensionPixelOffset(index, bVar17.f3159g);
                    continue;
                case 19:
                    b bVar18 = aVar.f3130e;
                    bVar18.f3161h = typedArray.getFloat(index, bVar18.f3161h);
                    continue;
                case 20:
                    b bVar19 = aVar.f3130e;
                    bVar19.f3188y = typedArray.getFloat(index, bVar19.f3188y);
                    continue;
                case 21:
                    b bVar20 = aVar.f3130e;
                    bVar20.f3155e = typedArray.getLayoutDimension(index, bVar20.f3155e);
                    continue;
                case 22:
                    d dVar = aVar.f3128c;
                    dVar.f3206b = typedArray.getInt(index, dVar.f3206b);
                    d dVar2 = aVar.f3128c;
                    dVar2.f3206b = f3118f[dVar2.f3206b];
                    continue;
                case 23:
                    b bVar21 = aVar.f3130e;
                    bVar21.f3153d = typedArray.getLayoutDimension(index, bVar21.f3153d);
                    continue;
                case 24:
                    b bVar22 = aVar.f3130e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    continue;
                case 25:
                    b bVar23 = aVar.f3130e;
                    bVar23.f3165j = l(typedArray, index, bVar23.f3165j);
                    continue;
                case 26:
                    b bVar24 = aVar.f3130e;
                    bVar24.f3167k = l(typedArray, index, bVar24.f3167k);
                    continue;
                case 27:
                    b bVar25 = aVar.f3130e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    continue;
                case 28:
                    b bVar26 = aVar.f3130e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    continue;
                case 29:
                    b bVar27 = aVar.f3130e;
                    bVar27.f3169l = l(typedArray, index, bVar27.f3169l);
                    continue;
                case 30:
                    b bVar28 = aVar.f3130e;
                    bVar28.f3171m = l(typedArray, index, bVar28.f3171m);
                    continue;
                case 31:
                    b bVar29 = aVar.f3130e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    continue;
                case 32:
                    b bVar30 = aVar.f3130e;
                    bVar30.f3184u = l(typedArray, index, bVar30.f3184u);
                    continue;
                case 33:
                    b bVar31 = aVar.f3130e;
                    bVar31.f3185v = l(typedArray, index, bVar31.f3185v);
                    continue;
                case 34:
                    b bVar32 = aVar.f3130e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    continue;
                case 35:
                    b bVar33 = aVar.f3130e;
                    bVar33.f3175o = l(typedArray, index, bVar33.f3175o);
                    continue;
                case 36:
                    b bVar34 = aVar.f3130e;
                    bVar34.f3173n = l(typedArray, index, bVar34.f3173n);
                    continue;
                case 37:
                    b bVar35 = aVar.f3130e;
                    bVar35.f3189z = typedArray.getFloat(index, bVar35.f3189z);
                    continue;
                case 38:
                    aVar.f3126a = typedArray.getResourceId(index, aVar.f3126a);
                    continue;
                case 39:
                    b bVar36 = aVar.f3130e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    continue;
                case 40:
                    b bVar37 = aVar.f3130e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    continue;
                case 41:
                    b bVar38 = aVar.f3130e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    continue;
                case 42:
                    b bVar39 = aVar.f3130e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    continue;
                case 43:
                    d dVar3 = aVar.f3128c;
                    dVar3.f3208d = typedArray.getFloat(index, dVar3.f3208d);
                    continue;
                case 44:
                    C0035e c0035e = aVar.f3131f;
                    c0035e.f3223m = true;
                    c0035e.f3224n = typedArray.getDimension(index, c0035e.f3224n);
                    continue;
                case 45:
                    C0035e c0035e2 = aVar.f3131f;
                    c0035e2.f3213c = typedArray.getFloat(index, c0035e2.f3213c);
                    continue;
                case 46:
                    C0035e c0035e3 = aVar.f3131f;
                    c0035e3.f3214d = typedArray.getFloat(index, c0035e3.f3214d);
                    continue;
                case 47:
                    C0035e c0035e4 = aVar.f3131f;
                    c0035e4.f3215e = typedArray.getFloat(index, c0035e4.f3215e);
                    continue;
                case 48:
                    C0035e c0035e5 = aVar.f3131f;
                    c0035e5.f3216f = typedArray.getFloat(index, c0035e5.f3216f);
                    continue;
                case 49:
                    C0035e c0035e6 = aVar.f3131f;
                    c0035e6.f3217g = typedArray.getDimension(index, c0035e6.f3217g);
                    continue;
                case 50:
                    C0035e c0035e7 = aVar.f3131f;
                    c0035e7.f3218h = typedArray.getDimension(index, c0035e7.f3218h);
                    continue;
                case 51:
                    C0035e c0035e8 = aVar.f3131f;
                    c0035e8.f3220j = typedArray.getDimension(index, c0035e8.f3220j);
                    continue;
                case 52:
                    C0035e c0035e9 = aVar.f3131f;
                    c0035e9.f3221k = typedArray.getDimension(index, c0035e9.f3221k);
                    continue;
                case 53:
                    C0035e c0035e10 = aVar.f3131f;
                    c0035e10.f3222l = typedArray.getDimension(index, c0035e10.f3222l);
                    continue;
                case 54:
                    b bVar40 = aVar.f3130e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    continue;
                case 55:
                    b bVar41 = aVar.f3130e;
                    bVar41.f3148a0 = typedArray.getInt(index, bVar41.f3148a0);
                    continue;
                case 56:
                    b bVar42 = aVar.f3130e;
                    bVar42.f3150b0 = typedArray.getDimensionPixelSize(index, bVar42.f3150b0);
                    continue;
                case 57:
                    b bVar43 = aVar.f3130e;
                    bVar43.f3152c0 = typedArray.getDimensionPixelSize(index, bVar43.f3152c0);
                    continue;
                case 58:
                    b bVar44 = aVar.f3130e;
                    bVar44.f3154d0 = typedArray.getDimensionPixelSize(index, bVar44.f3154d0);
                    continue;
                case 59:
                    b bVar45 = aVar.f3130e;
                    bVar45.f3156e0 = typedArray.getDimensionPixelSize(index, bVar45.f3156e0);
                    continue;
                case 60:
                    C0035e c0035e11 = aVar.f3131f;
                    c0035e11.f3212b = typedArray.getFloat(index, c0035e11.f3212b);
                    continue;
                case 61:
                    b bVar46 = aVar.f3130e;
                    bVar46.B = l(typedArray, index, bVar46.B);
                    continue;
                case 62:
                    b bVar47 = aVar.f3130e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    continue;
                case 63:
                    b bVar48 = aVar.f3130e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    continue;
                case 64:
                    c cVar3 = aVar.f3129d;
                    cVar3.f3192b = l(typedArray, index, cVar3.f3192b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f3129d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f3129d;
                        str = l0.b.f20777c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f3194d = str;
                    continue;
                case 66:
                    aVar.f3129d.f3196f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f3129d;
                    cVar4.f3199i = typedArray.getFloat(index, cVar4.f3199i);
                    continue;
                case 68:
                    d dVar4 = aVar.f3128c;
                    dVar4.f3209e = typedArray.getFloat(index, dVar4.f3209e);
                    continue;
                case 69:
                    aVar.f3130e.f3158f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f3130e.f3160g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f3130e;
                    bVar49.f3162h0 = typedArray.getInt(index, bVar49.f3162h0);
                    continue;
                case 73:
                    b bVar50 = aVar.f3130e;
                    bVar50.f3164i0 = typedArray.getDimensionPixelSize(index, bVar50.f3164i0);
                    continue;
                case 74:
                    aVar.f3130e.f3170l0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f3130e;
                    bVar51.f3178p0 = typedArray.getBoolean(index, bVar51.f3178p0);
                    continue;
                case 76:
                    c cVar5 = aVar.f3129d;
                    cVar5.f3195e = typedArray.getInt(index, cVar5.f3195e);
                    continue;
                case 77:
                    aVar.f3130e.f3172m0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f3128c;
                    dVar5.f3207c = typedArray.getInt(index, dVar5.f3207c);
                    continue;
                case 79:
                    c cVar6 = aVar.f3129d;
                    cVar6.f3197g = typedArray.getFloat(index, cVar6.f3197g);
                    continue;
                case 80:
                    b bVar52 = aVar.f3130e;
                    bVar52.f3174n0 = typedArray.getBoolean(index, bVar52.f3174n0);
                    continue;
                case 81:
                    b bVar53 = aVar.f3130e;
                    bVar53.f3176o0 = typedArray.getBoolean(index, bVar53.f3176o0);
                    continue;
                case 82:
                    c cVar7 = aVar.f3129d;
                    cVar7.f3193c = typedArray.getInteger(index, cVar7.f3193c);
                    continue;
                case 83:
                    C0035e c0035e12 = aVar.f3131f;
                    c0035e12.f3219i = l(typedArray, index, c0035e12.f3219i);
                    continue;
                case 84:
                    c cVar8 = aVar.f3129d;
                    cVar8.f3201k = typedArray.getInteger(index, cVar8.f3201k);
                    continue;
                case 85:
                    c cVar9 = aVar.f3129d;
                    cVar9.f3200j = typedArray.getFloat(index, cVar9.f3200j);
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f3129d.f3204n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f3129d;
                        if (cVar2.f3204n == -1) {
                            continue;
                        }
                        cVar2.f3203m = -2;
                        break;
                    } else if (i11 != 3) {
                        c cVar10 = aVar.f3129d;
                        cVar10.f3203m = typedArray.getInteger(index, cVar10.f3204n);
                        break;
                    } else {
                        aVar.f3129d.f3202l = typedArray.getString(index);
                        if (aVar.f3129d.f3202l.indexOf("/") <= 0) {
                            aVar.f3129d.f3203m = -1;
                            break;
                        } else {
                            aVar.f3129d.f3204n = typedArray.getResourceId(index, -1);
                            cVar2 = aVar.f3129d;
                            cVar2.f3203m = -2;
                        }
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb2 = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f3130e;
                    bVar54.f3182s = l(typedArray, index, bVar54.f3182s);
                    continue;
                case 92:
                    b bVar55 = aVar.f3130e;
                    bVar55.f3183t = l(typedArray, index, bVar55.f3183t);
                    continue;
                case 93:
                    b bVar56 = aVar.f3130e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    continue;
                case 94:
                    b bVar57 = aVar.f3130e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    continue;
                case 95:
                    m(aVar.f3130e, typedArray, index, 0);
                    continue;
                case 96:
                    m(aVar.f3130e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f3130e;
                    bVar58.f3180q0 = typedArray.getInt(index, bVar58.f3180q0);
                    continue;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f3119g.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
        b bVar59 = aVar.f3130e;
        if (bVar59.f3170l0 != null) {
            bVar59.f3168k0 = null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0032. Please report as an issue. */
    private static void q(Context context, a aVar, TypedArray typedArray) {
        int dimensionPixelSize;
        int i10;
        int i11;
        float f10;
        int i12;
        boolean z10;
        int i13;
        c cVar;
        StringBuilder sb2;
        String str;
        int indexCount = typedArray.getIndexCount();
        a.C0034a c0034a = new a.C0034a();
        aVar.f3133h = c0034a;
        aVar.f3129d.f3191a = false;
        aVar.f3130e.f3149b = false;
        aVar.f3128c.f3205a = false;
        aVar.f3131f.f3211a = false;
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArray.getIndex(i14);
            switch (f3120h.get(index)) {
                case 2:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.K);
                    i10 = 2;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb2 = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f3119g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 5:
                    i11 = 5;
                    c0034a.c(i11, typedArray.getString(index));
                    break;
                case 6:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3130e.E);
                    i10 = 6;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 7:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3130e.F);
                    i10 = 7;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 8:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.L);
                    i10 = 8;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 11:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.R);
                    i10 = 11;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 12:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.S);
                    i10 = 12;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 13:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.O);
                    i10 = 13;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 14:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.Q);
                    i10 = 14;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 15:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.T);
                    i10 = 15;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 16:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.P);
                    i10 = 16;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 17:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3130e.f3157f);
                    i10 = 17;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 18:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3130e.f3159g);
                    i10 = 18;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 19:
                    f10 = typedArray.getFloat(index, aVar.f3130e.f3161h);
                    i12 = 19;
                    c0034a.a(i12, f10);
                    break;
                case 20:
                    f10 = typedArray.getFloat(index, aVar.f3130e.f3188y);
                    i12 = 20;
                    c0034a.a(i12, f10);
                    break;
                case 21:
                    dimensionPixelSize = typedArray.getLayoutDimension(index, aVar.f3130e.f3155e);
                    i10 = 21;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 22:
                    dimensionPixelSize = f3118f[typedArray.getInt(index, aVar.f3128c.f3206b)];
                    i10 = 22;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 23:
                    dimensionPixelSize = typedArray.getLayoutDimension(index, aVar.f3130e.f3153d);
                    i10 = 23;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 24:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.H);
                    i10 = 24;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 27:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.G);
                    i10 = 27;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 28:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.I);
                    i10 = 28;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 31:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.M);
                    i10 = 31;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 34:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.J);
                    i10 = 34;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 37:
                    f10 = typedArray.getFloat(index, aVar.f3130e.f3189z);
                    i12 = 37;
                    c0034a.a(i12, f10);
                    break;
                case 38:
                    dimensionPixelSize = typedArray.getResourceId(index, aVar.f3126a);
                    aVar.f3126a = dimensionPixelSize;
                    i10 = 38;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 39:
                    f10 = typedArray.getFloat(index, aVar.f3130e.W);
                    i12 = 39;
                    c0034a.a(i12, f10);
                    break;
                case 40:
                    f10 = typedArray.getFloat(index, aVar.f3130e.V);
                    i12 = 40;
                    c0034a.a(i12, f10);
                    break;
                case 41:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.X);
                    i10 = 41;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 42:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.Y);
                    i10 = 42;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 43:
                    f10 = typedArray.getFloat(index, aVar.f3128c.f3208d);
                    i12 = 43;
                    c0034a.a(i12, f10);
                    break;
                case 44:
                    i12 = 44;
                    c0034a.d(44, true);
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3224n);
                    c0034a.a(i12, f10);
                    break;
                case 45:
                    f10 = typedArray.getFloat(index, aVar.f3131f.f3213c);
                    i12 = 45;
                    c0034a.a(i12, f10);
                    break;
                case 46:
                    f10 = typedArray.getFloat(index, aVar.f3131f.f3214d);
                    i12 = 46;
                    c0034a.a(i12, f10);
                    break;
                case 47:
                    f10 = typedArray.getFloat(index, aVar.f3131f.f3215e);
                    i12 = 47;
                    c0034a.a(i12, f10);
                    break;
                case 48:
                    f10 = typedArray.getFloat(index, aVar.f3131f.f3216f);
                    i12 = 48;
                    c0034a.a(i12, f10);
                    break;
                case 49:
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3217g);
                    i12 = 49;
                    c0034a.a(i12, f10);
                    break;
                case 50:
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3218h);
                    i12 = 50;
                    c0034a.a(i12, f10);
                    break;
                case 51:
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3220j);
                    i12 = 51;
                    c0034a.a(i12, f10);
                    break;
                case 52:
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3221k);
                    i12 = 52;
                    c0034a.a(i12, f10);
                    break;
                case 53:
                    f10 = typedArray.getDimension(index, aVar.f3131f.f3222l);
                    i12 = 53;
                    c0034a.a(i12, f10);
                    break;
                case 54:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.Z);
                    i10 = 54;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 55:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.f3148a0);
                    i10 = 55;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 56:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.f3150b0);
                    i10 = 56;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 57:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.f3152c0);
                    i10 = 57;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 58:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.f3154d0);
                    i10 = 58;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 59:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.f3156e0);
                    i10 = 59;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 60:
                    f10 = typedArray.getFloat(index, aVar.f3131f.f3212b);
                    i12 = 60;
                    c0034a.a(i12, f10);
                    break;
                case 62:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.C);
                    i10 = 62;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 63:
                    f10 = typedArray.getFloat(index, aVar.f3130e.D);
                    i12 = 63;
                    c0034a.a(i12, f10);
                    break;
                case 64:
                    dimensionPixelSize = l(typedArray, index, aVar.f3129d.f3192b);
                    i10 = 64;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 65:
                    c0034a.c(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : l0.b.f20777c[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i10 = 66;
                    dimensionPixelSize = typedArray.getInt(index, 0);
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 67:
                    f10 = typedArray.getFloat(index, aVar.f3129d.f3199i);
                    i12 = 67;
                    c0034a.a(i12, f10);
                    break;
                case 68:
                    f10 = typedArray.getFloat(index, aVar.f3128c.f3209e);
                    i12 = 68;
                    c0034a.a(i12, f10);
                    break;
                case 69:
                    i12 = 69;
                    f10 = typedArray.getFloat(index, 1.0f);
                    c0034a.a(i12, f10);
                    break;
                case 70:
                    i12 = 70;
                    f10 = typedArray.getFloat(index, 1.0f);
                    c0034a.a(i12, f10);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.f3162h0);
                    i10 = 72;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 73:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.f3164i0);
                    i10 = 73;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 74:
                    i11 = 74;
                    c0034a.c(i11, typedArray.getString(index));
                    break;
                case 75:
                    z10 = typedArray.getBoolean(index, aVar.f3130e.f3178p0);
                    i13 = 75;
                    c0034a.d(i13, z10);
                    break;
                case 76:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3129d.f3195e);
                    i10 = 76;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 77:
                    i11 = 77;
                    c0034a.c(i11, typedArray.getString(index));
                    break;
                case 78:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3128c.f3207c);
                    i10 = 78;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 79:
                    f10 = typedArray.getFloat(index, aVar.f3129d.f3197g);
                    i12 = 79;
                    c0034a.a(i12, f10);
                    break;
                case 80:
                    z10 = typedArray.getBoolean(index, aVar.f3130e.f3174n0);
                    i13 = 80;
                    c0034a.d(i13, z10);
                    break;
                case 81:
                    z10 = typedArray.getBoolean(index, aVar.f3130e.f3176o0);
                    i13 = 81;
                    c0034a.d(i13, z10);
                    break;
                case 82:
                    dimensionPixelSize = typedArray.getInteger(index, aVar.f3129d.f3193c);
                    i10 = 82;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 83:
                    dimensionPixelSize = l(typedArray, index, aVar.f3131f.f3219i);
                    i10 = 83;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 84:
                    dimensionPixelSize = typedArray.getInteger(index, aVar.f3129d.f3201k);
                    i10 = 84;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 85:
                    f10 = typedArray.getFloat(index, aVar.f3129d.f3200j);
                    i12 = 85;
                    c0034a.a(i12, f10);
                    break;
                case 86:
                    int i15 = typedArray.peekValue(index).type;
                    if (i15 == 1) {
                        aVar.f3129d.f3204n = typedArray.getResourceId(index, -1);
                        c0034a.b(89, aVar.f3129d.f3204n);
                        cVar = aVar.f3129d;
                        if (cVar.f3204n == -1) {
                            break;
                        }
                        cVar.f3203m = -2;
                        c0034a.b(88, -2);
                        break;
                    } else if (i15 != 3) {
                        c cVar2 = aVar.f3129d;
                        cVar2.f3203m = typedArray.getInteger(index, cVar2.f3204n);
                        c0034a.b(88, aVar.f3129d.f3203m);
                        break;
                    } else {
                        aVar.f3129d.f3202l = typedArray.getString(index);
                        c0034a.c(90, aVar.f3129d.f3202l);
                        if (aVar.f3129d.f3202l.indexOf("/") <= 0) {
                            aVar.f3129d.f3203m = -1;
                            c0034a.b(88, -1);
                            break;
                        } else {
                            aVar.f3129d.f3204n = typedArray.getResourceId(index, -1);
                            c0034a.b(89, aVar.f3129d.f3204n);
                            cVar = aVar.f3129d;
                            cVar.f3203m = -2;
                            c0034a.b(88, -2);
                        }
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str = "unused attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f3119g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.N);
                    i10 = 93;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 94:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3130e.U);
                    i10 = 94;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 95:
                    m(c0034a, typedArray, index, 0);
                    break;
                case 96:
                    m(c0034a, typedArray, index, 1);
                    break;
                case 97:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3130e.f3180q0);
                    i10 = 97;
                    c0034a.b(i10, dimensionPixelSize);
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.F0) {
                        int resourceId = typedArray.getResourceId(index, aVar.f3126a);
                        aVar.f3126a = resourceId;
                        if (resourceId != -1) {
                            break;
                        }
                        aVar.f3127b = typedArray.getString(index);
                        break;
                    } else {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f3126a = typedArray.getResourceId(index, aVar.f3126a);
                            break;
                        }
                        aVar.f3127b = typedArray.getString(index);
                    }
                case 99:
                    z10 = typedArray.getBoolean(index, aVar.f3130e.f3163i);
                    i13 = 99;
                    c0034a.d(i13, z10);
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3125e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f3125e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.b(childAt));
            } else {
                if (this.f3124d && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f3125e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f3125e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f3130e.f3166j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id2);
                                aVar2.setType(aVar.f3130e.f3162h0);
                                aVar2.setMargin(aVar.f3130e.f3164i0);
                                aVar2.setAllowsGoneWidget(aVar.f3130e.f3178p0);
                                b bVar = aVar.f3130e;
                                int[] iArr = bVar.f3168k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f3170l0;
                                    if (str != null) {
                                        bVar.f3168k0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f3130e.f3168k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.b.e(childAt, aVar.f3132g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f3128c;
                            if (dVar.f3207c == 0) {
                                childAt.setVisibility(dVar.f3206b);
                            }
                            childAt.setAlpha(aVar.f3128c.f3208d);
                            childAt.setRotation(aVar.f3131f.f3212b);
                            childAt.setRotationX(aVar.f3131f.f3213c);
                            childAt.setRotationY(aVar.f3131f.f3214d);
                            childAt.setScaleX(aVar.f3131f.f3215e);
                            childAt.setScaleY(aVar.f3131f.f3216f);
                            C0035e c0035e = aVar.f3131f;
                            if (c0035e.f3219i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f3131f.f3219i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0035e.f3217g)) {
                                    childAt.setPivotX(aVar.f3131f.f3217g);
                                }
                                if (!Float.isNaN(aVar.f3131f.f3218h)) {
                                    childAt.setPivotY(aVar.f3131f.f3218h);
                                }
                            }
                            childAt.setTranslationX(aVar.f3131f.f3220j);
                            childAt.setTranslationY(aVar.f3131f.f3221k);
                            childAt.setTranslationZ(aVar.f3131f.f3222l);
                            C0035e c0035e2 = aVar.f3131f;
                            if (c0035e2.f3223m) {
                                childAt.setElevation(c0035e2.f3224n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f3125e.get(num);
            if (aVar3 != null) {
                if (aVar3.f3130e.f3166j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f3130e;
                    int[] iArr2 = bVar3.f3168k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f3170l0;
                        if (str2 != null) {
                            bVar3.f3168k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f3130e.f3168k0);
                        }
                    }
                    aVar4.setType(aVar3.f3130e.f3162h0);
                    aVar4.setMargin(aVar3.f3130e.f3164i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.s();
                    aVar3.d(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.f3130e.f3147a) {
                    View hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(hVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3125e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3124d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3125e.containsKey(Integer.valueOf(id2))) {
                this.f3125e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f3125e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f3132g = androidx.constraintlayout.widget.b.a(this.f3123c, childAt);
                aVar.f(id2, bVar);
                aVar.f3128c.f3206b = childAt.getVisibility();
                aVar.f3128c.f3208d = childAt.getAlpha();
                aVar.f3131f.f3212b = childAt.getRotation();
                aVar.f3131f.f3213c = childAt.getRotationX();
                aVar.f3131f.f3214d = childAt.getRotationY();
                aVar.f3131f.f3215e = childAt.getScaleX();
                aVar.f3131f.f3216f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0035e c0035e = aVar.f3131f;
                    c0035e.f3217g = pivotX;
                    c0035e.f3218h = pivotY;
                }
                aVar.f3131f.f3220j = childAt.getTranslationX();
                aVar.f3131f.f3221k = childAt.getTranslationY();
                aVar.f3131f.f3222l = childAt.getTranslationZ();
                C0035e c0035e2 = aVar.f3131f;
                if (c0035e2.f3223m) {
                    c0035e2.f3224n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f3130e.f3178p0 = aVar2.getAllowsGoneWidget();
                    aVar.f3130e.f3168k0 = aVar2.getReferencedIds();
                    aVar.f3130e.f3162h0 = aVar2.getType();
                    aVar.f3130e.f3164i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(f fVar) {
        int childCount = fVar.getChildCount();
        this.f3125e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fVar.getChildAt(i10);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3124d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3125e.containsKey(Integer.valueOf(id2))) {
                this.f3125e.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f3125e.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.c) {
                    aVar2.h((androidx.constraintlayout.widget.c) childAt, id2, aVar);
                }
                aVar2.g(id2, aVar);
            }
        }
    }

    public void j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i11 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i11.f3130e.f3147a = true;
                    }
                    this.f3125e.put(Integer.valueOf(i11.f3126a), i11);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00db. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
