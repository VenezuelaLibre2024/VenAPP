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
import androidx.constraintlayout.motion.widget.C0744a;
import androidx.constraintlayout.motion.widget.C0753j;
import androidx.constraintlayout.widget.C0764f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p209l0.C9338b;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0763e {

    /* renamed from: f */
    private static final int[] f3522f = {0, 4, 8};

    /* renamed from: g */
    private static SparseIntArray f3523g = new SparseIntArray();

    /* renamed from: h */
    private static SparseIntArray f3524h = new SparseIntArray();

    /* renamed from: a */
    public String f3525a = "";

    /* renamed from: b */
    public int f3526b = 0;

    /* renamed from: c */
    private HashMap<String, C0760b> f3527c = new HashMap<>();

    /* renamed from: d */
    private boolean f3528d = true;

    /* renamed from: e */
    private HashMap<Integer, a> f3529e = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f3530a;

        /* renamed from: b */
        String f3531b;

        /* renamed from: c */
        public final d f3532c = new d();

        /* renamed from: d */
        public final c f3533d = new c();

        /* renamed from: e */
        public final b f3534e = new b();

        /* renamed from: f */
        public final e f3535f = new e();

        /* renamed from: g */
        public HashMap<String, C0760b> f3536g = new HashMap<>();

        /* renamed from: h */
        C13155a f3537h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13155a {

            /* renamed from: a */
            int[] f3538a = new int[10];

            /* renamed from: b */
            int[] f3539b = new int[10];

            /* renamed from: c */
            int f3540c = 0;

            /* renamed from: d */
            int[] f3541d = new int[10];

            /* renamed from: e */
            float[] f3542e = new float[10];

            /* renamed from: f */
            int f3543f = 0;

            /* renamed from: g */
            int[] f3544g = new int[5];

            /* renamed from: h */
            String[] f3545h = new String[5];

            /* renamed from: i */
            int f3546i = 0;

            /* renamed from: j */
            int[] f3547j = new int[4];

            /* renamed from: k */
            boolean[] f3548k = new boolean[4];

            /* renamed from: l */
            int f3549l = 0;

            C13155a() {
            }

            /* renamed from: a */
            void m3888a(int i10, float f10) {
                int i11 = this.f3543f;
                int[] iArr = this.f3541d;
                if (i11 >= iArr.length) {
                    this.f3541d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3542e;
                    this.f3542e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3541d;
                int i12 = this.f3543f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f3542e;
                this.f3543f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* renamed from: b */
            void m3889b(int i10, int i11) {
                int i12 = this.f3540c;
                int[] iArr = this.f3538a;
                if (i12 >= iArr.length) {
                    this.f3538a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3539b;
                    this.f3539b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3538a;
                int i13 = this.f3540c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f3539b;
                this.f3540c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* renamed from: c */
            void m3890c(int i10, String str) {
                int i11 = this.f3546i;
                int[] iArr = this.f3544g;
                if (i11 >= iArr.length) {
                    this.f3544g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3545h;
                    this.f3545h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3544g;
                int i12 = this.f3546i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f3545h;
                this.f3546i = i12 + 1;
                strArr2[i12] = str;
            }

            /* renamed from: d */
            void m3891d(int i10, boolean z10) {
                int i11 = this.f3549l;
                int[] iArr = this.f3547j;
                if (i11 >= iArr.length) {
                    this.f3547j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3548k;
                    this.f3548k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3547j;
                int i12 = this.f3549l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f3548k;
                this.f3549l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m3883f(int i10, ConstraintLayout.C0757b c0757b) {
            this.f3530a = i10;
            b bVar = this.f3534e;
            bVar.f3595j = c0757b.f3435e;
            bVar.f3597k = c0757b.f3437f;
            bVar.f3599l = c0757b.f3439g;
            bVar.f3601m = c0757b.f3441h;
            bVar.f3603n = c0757b.f3443i;
            bVar.f3605o = c0757b.f3445j;
            bVar.f3607p = c0757b.f3447k;
            bVar.f3609q = c0757b.f3449l;
            bVar.f3611r = c0757b.f3451m;
            bVar.f3612s = c0757b.f3453n;
            bVar.f3613t = c0757b.f3455o;
            bVar.f3614u = c0757b.f3463s;
            bVar.f3615v = c0757b.f3465t;
            bVar.f3616w = c0757b.f3467u;
            bVar.f3617x = c0757b.f3469v;
            bVar.f3618y = c0757b.f3407G;
            bVar.f3619z = c0757b.f3408H;
            bVar.f3551A = c0757b.f3409I;
            bVar.f3552B = c0757b.f3457p;
            bVar.f3553C = c0757b.f3459q;
            bVar.f3554D = c0757b.f3461r;
            bVar.f3555E = c0757b.f3424X;
            bVar.f3556F = c0757b.f3425Y;
            bVar.f3557G = c0757b.f3426Z;
            bVar.f3591h = c0757b.f3431c;
            bVar.f3587f = c0757b.f3427a;
            bVar.f3589g = c0757b.f3429b;
            bVar.f3583d = ((ViewGroup.MarginLayoutParams) c0757b).width;
            bVar.f3585e = ((ViewGroup.MarginLayoutParams) c0757b).height;
            bVar.f3558H = ((ViewGroup.MarginLayoutParams) c0757b).leftMargin;
            bVar.f3559I = ((ViewGroup.MarginLayoutParams) c0757b).rightMargin;
            bVar.f3560J = ((ViewGroup.MarginLayoutParams) c0757b).topMargin;
            bVar.f3561K = ((ViewGroup.MarginLayoutParams) c0757b).bottomMargin;
            bVar.f3564N = c0757b.f3404D;
            bVar.f3572V = c0757b.f3413M;
            bVar.f3573W = c0757b.f3412L;
            bVar.f3575Y = c0757b.f3415O;
            bVar.f3574X = c0757b.f3414N;
            bVar.f3604n0 = c0757b.f3428a0;
            bVar.f3606o0 = c0757b.f3430b0;
            bVar.f3576Z = c0757b.f3416P;
            bVar.f3578a0 = c0757b.f3417Q;
            bVar.f3580b0 = c0757b.f3420T;
            bVar.f3582c0 = c0757b.f3421U;
            bVar.f3584d0 = c0757b.f3418R;
            bVar.f3586e0 = c0757b.f3419S;
            bVar.f3588f0 = c0757b.f3422V;
            bVar.f3590g0 = c0757b.f3423W;
            bVar.f3602m0 = c0757b.f3432c0;
            bVar.f3566P = c0757b.f3473x;
            bVar.f3568R = c0757b.f3475z;
            bVar.f3565O = c0757b.f3471w;
            bVar.f3567Q = c0757b.f3474y;
            bVar.f3570T = c0757b.f3401A;
            bVar.f3569S = c0757b.f3402B;
            bVar.f3571U = c0757b.f3403C;
            bVar.f3610q0 = c0757b.f3434d0;
            bVar.f3562L = c0757b.getMarginEnd();
            this.f3534e.f3563M = c0757b.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m3884g(int i10, C0764f.a aVar) {
            m3883f(i10, aVar);
            this.f3532c.f3638d = aVar.f3666x0;
            e eVar = this.f3535f;
            eVar.f3642b = aVar.f3656A0;
            eVar.f3643c = aVar.f3657B0;
            eVar.f3644d = aVar.f3658C0;
            eVar.f3645e = aVar.f3659D0;
            eVar.f3646f = aVar.f3660E0;
            eVar.f3647g = aVar.f3661F0;
            eVar.f3648h = aVar.f3662G0;
            eVar.f3650j = aVar.f3663H0;
            eVar.f3651k = aVar.f3664I0;
            eVar.f3652l = aVar.f3665J0;
            eVar.f3654n = aVar.f3668z0;
            eVar.f3653m = aVar.f3667y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m3885h(AbstractC0761c abstractC0761c, int i10, C0764f.a aVar) {
            m3884g(i10, aVar);
            if (abstractC0761c instanceof C0759a) {
                b bVar = this.f3534e;
                bVar.f3596j0 = 1;
                C0759a c0759a = (C0759a) abstractC0761c;
                bVar.f3592h0 = c0759a.getType();
                this.f3534e.f3598k0 = c0759a.getReferencedIds();
                this.f3534e.f3594i0 = c0759a.getMargin();
            }
        }

        /* renamed from: d */
        public void m3886d(ConstraintLayout.C0757b c0757b) {
            b bVar = this.f3534e;
            c0757b.f3435e = bVar.f3595j;
            c0757b.f3437f = bVar.f3597k;
            c0757b.f3439g = bVar.f3599l;
            c0757b.f3441h = bVar.f3601m;
            c0757b.f3443i = bVar.f3603n;
            c0757b.f3445j = bVar.f3605o;
            c0757b.f3447k = bVar.f3607p;
            c0757b.f3449l = bVar.f3609q;
            c0757b.f3451m = bVar.f3611r;
            c0757b.f3453n = bVar.f3612s;
            c0757b.f3455o = bVar.f3613t;
            c0757b.f3463s = bVar.f3614u;
            c0757b.f3465t = bVar.f3615v;
            c0757b.f3467u = bVar.f3616w;
            c0757b.f3469v = bVar.f3617x;
            ((ViewGroup.MarginLayoutParams) c0757b).leftMargin = bVar.f3558H;
            ((ViewGroup.MarginLayoutParams) c0757b).rightMargin = bVar.f3559I;
            ((ViewGroup.MarginLayoutParams) c0757b).topMargin = bVar.f3560J;
            ((ViewGroup.MarginLayoutParams) c0757b).bottomMargin = bVar.f3561K;
            c0757b.f3401A = bVar.f3570T;
            c0757b.f3402B = bVar.f3569S;
            c0757b.f3473x = bVar.f3566P;
            c0757b.f3475z = bVar.f3568R;
            c0757b.f3407G = bVar.f3618y;
            c0757b.f3408H = bVar.f3619z;
            c0757b.f3457p = bVar.f3552B;
            c0757b.f3459q = bVar.f3553C;
            c0757b.f3461r = bVar.f3554D;
            c0757b.f3409I = bVar.f3551A;
            c0757b.f3424X = bVar.f3555E;
            c0757b.f3425Y = bVar.f3556F;
            c0757b.f3413M = bVar.f3572V;
            c0757b.f3412L = bVar.f3573W;
            c0757b.f3415O = bVar.f3575Y;
            c0757b.f3414N = bVar.f3574X;
            c0757b.f3428a0 = bVar.f3604n0;
            c0757b.f3430b0 = bVar.f3606o0;
            c0757b.f3416P = bVar.f3576Z;
            c0757b.f3417Q = bVar.f3578a0;
            c0757b.f3420T = bVar.f3580b0;
            c0757b.f3421U = bVar.f3582c0;
            c0757b.f3418R = bVar.f3584d0;
            c0757b.f3419S = bVar.f3586e0;
            c0757b.f3422V = bVar.f3588f0;
            c0757b.f3423W = bVar.f3590g0;
            c0757b.f3426Z = bVar.f3557G;
            c0757b.f3431c = bVar.f3591h;
            c0757b.f3427a = bVar.f3587f;
            c0757b.f3429b = bVar.f3589g;
            ((ViewGroup.MarginLayoutParams) c0757b).width = bVar.f3583d;
            ((ViewGroup.MarginLayoutParams) c0757b).height = bVar.f3585e;
            String str = bVar.f3602m0;
            if (str != null) {
                c0757b.f3432c0 = str;
            }
            c0757b.f3434d0 = bVar.f3610q0;
            c0757b.setMarginStart(bVar.f3563M);
            c0757b.setMarginEnd(this.f3534e.f3562L);
            c0757b.m3828a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f3534e.m3892a(this.f3534e);
            aVar.f3533d.m3894a(this.f3533d);
            aVar.f3532c.m3896a(this.f3532c);
            aVar.f3535f.m3898a(this.f3535f);
            aVar.f3530a = this.f3530a;
            aVar.f3537h = this.f3537h;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: r0 */
        private static SparseIntArray f3550r0;

        /* renamed from: d */
        public int f3583d;

        /* renamed from: e */
        public int f3585e;

        /* renamed from: k0 */
        public int[] f3598k0;

        /* renamed from: l0 */
        public String f3600l0;

        /* renamed from: m0 */
        public String f3602m0;

        /* renamed from: a */
        public boolean f3577a = false;

        /* renamed from: b */
        public boolean f3579b = false;

        /* renamed from: c */
        public boolean f3581c = false;

        /* renamed from: f */
        public int f3587f = -1;

        /* renamed from: g */
        public int f3589g = -1;

        /* renamed from: h */
        public float f3591h = -1.0f;

        /* renamed from: i */
        public boolean f3593i = true;

        /* renamed from: j */
        public int f3595j = -1;

        /* renamed from: k */
        public int f3597k = -1;

        /* renamed from: l */
        public int f3599l = -1;

        /* renamed from: m */
        public int f3601m = -1;

        /* renamed from: n */
        public int f3603n = -1;

        /* renamed from: o */
        public int f3605o = -1;

        /* renamed from: p */
        public int f3607p = -1;

        /* renamed from: q */
        public int f3609q = -1;

        /* renamed from: r */
        public int f3611r = -1;

        /* renamed from: s */
        public int f3612s = -1;

        /* renamed from: t */
        public int f3613t = -1;

        /* renamed from: u */
        public int f3614u = -1;

        /* renamed from: v */
        public int f3615v = -1;

        /* renamed from: w */
        public int f3616w = -1;

        /* renamed from: x */
        public int f3617x = -1;

        /* renamed from: y */
        public float f3618y = 0.5f;

        /* renamed from: z */
        public float f3619z = 0.5f;

        /* renamed from: A */
        public String f3551A = null;

        /* renamed from: B */
        public int f3552B = -1;

        /* renamed from: C */
        public int f3553C = 0;

        /* renamed from: D */
        public float f3554D = 0.0f;

        /* renamed from: E */
        public int f3555E = -1;

        /* renamed from: F */
        public int f3556F = -1;

        /* renamed from: G */
        public int f3557G = -1;

        /* renamed from: H */
        public int f3558H = 0;

        /* renamed from: I */
        public int f3559I = 0;

        /* renamed from: J */
        public int f3560J = 0;

        /* renamed from: K */
        public int f3561K = 0;

        /* renamed from: L */
        public int f3562L = 0;

        /* renamed from: M */
        public int f3563M = 0;

        /* renamed from: N */
        public int f3564N = 0;

        /* renamed from: O */
        public int f3565O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f3566P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f3567Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f3568R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f3569S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f3570T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f3571U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f3572V = -1.0f;

        /* renamed from: W */
        public float f3573W = -1.0f;

        /* renamed from: X */
        public int f3574X = 0;

        /* renamed from: Y */
        public int f3575Y = 0;

        /* renamed from: Z */
        public int f3576Z = 0;

        /* renamed from: a0 */
        public int f3578a0 = 0;

        /* renamed from: b0 */
        public int f3580b0 = 0;

        /* renamed from: c0 */
        public int f3582c0 = 0;

        /* renamed from: d0 */
        public int f3584d0 = 0;

        /* renamed from: e0 */
        public int f3586e0 = 0;

        /* renamed from: f0 */
        public float f3588f0 = 1.0f;

        /* renamed from: g0 */
        public float f3590g0 = 1.0f;

        /* renamed from: h0 */
        public int f3592h0 = -1;

        /* renamed from: i0 */
        public int f3594i0 = 0;

        /* renamed from: j0 */
        public int f3596j0 = -1;

        /* renamed from: n0 */
        public boolean f3604n0 = false;

        /* renamed from: o0 */
        public boolean f3606o0 = false;

        /* renamed from: p0 */
        public boolean f3608p0 = true;

        /* renamed from: q0 */
        public int f3610q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3550r0 = sparseIntArray;
            sparseIntArray.append(C0769k.f3762K5, 24);
            f3550r0.append(C0769k.f3770L5, 25);
            f3550r0.append(C0769k.f3786N5, 28);
            f3550r0.append(C0769k.f3794O5, 29);
            f3550r0.append(C0769k.f3834T5, 35);
            f3550r0.append(C0769k.f3826S5, 34);
            f3550r0.append(C0769k.f4070u5, 4);
            f3550r0.append(C0769k.f4061t5, 3);
            f3550r0.append(C0769k.f4043r5, 1);
            f3550r0.append(C0769k.f3882Z5, 6);
            f3550r0.append(C0769k.f3891a6, 7);
            f3550r0.append(C0769k.f3688B5, 17);
            f3550r0.append(C0769k.f3697C5, 18);
            f3550r0.append(C0769k.f3706D5, 19);
            f3550r0.append(C0769k.f4007n5, 90);
            f3550r0.append(C0769k.f3881Z4, 26);
            f3550r0.append(C0769k.f3802P5, 31);
            f3550r0.append(C0769k.f3810Q5, 32);
            f3550r0.append(C0769k.f3679A5, 10);
            f3550r0.append(C0769k.f4115z5, 9);
            f3550r0.append(C0769k.f3918d6, 13);
            f3550r0.append(C0769k.f3945g6, 16);
            f3550r0.append(C0769k.f3927e6, 14);
            f3550r0.append(C0769k.f3900b6, 11);
            f3550r0.append(C0769k.f3936f6, 15);
            f3550r0.append(C0769k.f3909c6, 12);
            f3550r0.append(C0769k.f3858W5, 38);
            f3550r0.append(C0769k.f3746I5, 37);
            f3550r0.append(C0769k.f3738H5, 39);
            f3550r0.append(C0769k.f3850V5, 40);
            f3550r0.append(C0769k.f3730G5, 20);
            f3550r0.append(C0769k.f3842U5, 36);
            f3550r0.append(C0769k.f4106y5, 5);
            f3550r0.append(C0769k.f3754J5, 91);
            f3550r0.append(C0769k.f3818R5, 91);
            f3550r0.append(C0769k.f3778M5, 91);
            f3550r0.append(C0769k.f4052s5, 91);
            f3550r0.append(C0769k.f4034q5, 91);
            f3550r0.append(C0769k.f3908c5, 23);
            f3550r0.append(C0769k.f3926e5, 27);
            f3550r0.append(C0769k.f3944g5, 30);
            f3550r0.append(C0769k.f3953h5, 8);
            f3550r0.append(C0769k.f3917d5, 33);
            f3550r0.append(C0769k.f3935f5, 2);
            f3550r0.append(C0769k.f3890a5, 22);
            f3550r0.append(C0769k.f3899b5, 21);
            f3550r0.append(C0769k.f3866X5, 41);
            f3550r0.append(C0769k.f3714E5, 42);
            f3550r0.append(C0769k.f4025p5, 41);
            f3550r0.append(C0769k.f4016o5, 42);
            f3550r0.append(C0769k.f3954h6, 76);
            f3550r0.append(C0769k.f4079v5, 61);
            f3550r0.append(C0769k.f4097x5, 62);
            f3550r0.append(C0769k.f4088w5, 63);
            f3550r0.append(C0769k.f3874Y5, 69);
            f3550r0.append(C0769k.f3722F5, 70);
            f3550r0.append(C0769k.f3989l5, 71);
            f3550r0.append(C0769k.f3971j5, 72);
            f3550r0.append(C0769k.f3980k5, 73);
            f3550r0.append(C0769k.f3998m5, 74);
            f3550r0.append(C0769k.f3962i5, 75);
        }

        /* renamed from: a */
        public void m3892a(b bVar) {
            this.f3577a = bVar.f3577a;
            this.f3583d = bVar.f3583d;
            this.f3579b = bVar.f3579b;
            this.f3585e = bVar.f3585e;
            this.f3587f = bVar.f3587f;
            this.f3589g = bVar.f3589g;
            this.f3591h = bVar.f3591h;
            this.f3593i = bVar.f3593i;
            this.f3595j = bVar.f3595j;
            this.f3597k = bVar.f3597k;
            this.f3599l = bVar.f3599l;
            this.f3601m = bVar.f3601m;
            this.f3603n = bVar.f3603n;
            this.f3605o = bVar.f3605o;
            this.f3607p = bVar.f3607p;
            this.f3609q = bVar.f3609q;
            this.f3611r = bVar.f3611r;
            this.f3612s = bVar.f3612s;
            this.f3613t = bVar.f3613t;
            this.f3614u = bVar.f3614u;
            this.f3615v = bVar.f3615v;
            this.f3616w = bVar.f3616w;
            this.f3617x = bVar.f3617x;
            this.f3618y = bVar.f3618y;
            this.f3619z = bVar.f3619z;
            this.f3551A = bVar.f3551A;
            this.f3552B = bVar.f3552B;
            this.f3553C = bVar.f3553C;
            this.f3554D = bVar.f3554D;
            this.f3555E = bVar.f3555E;
            this.f3556F = bVar.f3556F;
            this.f3557G = bVar.f3557G;
            this.f3558H = bVar.f3558H;
            this.f3559I = bVar.f3559I;
            this.f3560J = bVar.f3560J;
            this.f3561K = bVar.f3561K;
            this.f3562L = bVar.f3562L;
            this.f3563M = bVar.f3563M;
            this.f3564N = bVar.f3564N;
            this.f3565O = bVar.f3565O;
            this.f3566P = bVar.f3566P;
            this.f3567Q = bVar.f3567Q;
            this.f3568R = bVar.f3568R;
            this.f3569S = bVar.f3569S;
            this.f3570T = bVar.f3570T;
            this.f3571U = bVar.f3571U;
            this.f3572V = bVar.f3572V;
            this.f3573W = bVar.f3573W;
            this.f3574X = bVar.f3574X;
            this.f3575Y = bVar.f3575Y;
            this.f3576Z = bVar.f3576Z;
            this.f3578a0 = bVar.f3578a0;
            this.f3580b0 = bVar.f3580b0;
            this.f3582c0 = bVar.f3582c0;
            this.f3584d0 = bVar.f3584d0;
            this.f3586e0 = bVar.f3586e0;
            this.f3588f0 = bVar.f3588f0;
            this.f3590g0 = bVar.f3590g0;
            this.f3592h0 = bVar.f3592h0;
            this.f3594i0 = bVar.f3594i0;
            this.f3596j0 = bVar.f3596j0;
            this.f3602m0 = bVar.f3602m0;
            int[] iArr = bVar.f3598k0;
            if (iArr == null || bVar.f3600l0 != null) {
                this.f3598k0 = null;
            } else {
                this.f3598k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f3600l0 = bVar.f3600l0;
            this.f3604n0 = bVar.f3604n0;
            this.f3606o0 = bVar.f3606o0;
            this.f3608p0 = bVar.f3608p0;
            this.f3610q0 = bVar.f3610q0;
        }

        /* renamed from: b */
        void m3893b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0769k.f3873Y4);
            this.f3579b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f3550r0.get(index);
                switch (i11) {
                    case 1:
                        this.f3611r = C0763e.m3867l(obtainStyledAttributes, index, this.f3611r);
                        break;
                    case 2:
                        this.f3561K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3561K);
                        break;
                    case 3:
                        this.f3609q = C0763e.m3867l(obtainStyledAttributes, index, this.f3609q);
                        break;
                    case 4:
                        this.f3607p = C0763e.m3867l(obtainStyledAttributes, index, this.f3607p);
                        break;
                    case 5:
                        this.f3551A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f3555E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3555E);
                        break;
                    case 7:
                        this.f3556F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3556F);
                        break;
                    case 8:
                        this.f3562L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3562L);
                        break;
                    case 9:
                        this.f3617x = C0763e.m3867l(obtainStyledAttributes, index, this.f3617x);
                        break;
                    case 10:
                        this.f3616w = C0763e.m3867l(obtainStyledAttributes, index, this.f3616w);
                        break;
                    case 11:
                        this.f3568R = obtainStyledAttributes.getDimensionPixelSize(index, this.f3568R);
                        break;
                    case 12:
                        this.f3569S = obtainStyledAttributes.getDimensionPixelSize(index, this.f3569S);
                        break;
                    case 13:
                        this.f3565O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3565O);
                        break;
                    case 14:
                        this.f3567Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3567Q);
                        break;
                    case 15:
                        this.f3570T = obtainStyledAttributes.getDimensionPixelSize(index, this.f3570T);
                        break;
                    case 16:
                        this.f3566P = obtainStyledAttributes.getDimensionPixelSize(index, this.f3566P);
                        break;
                    case 17:
                        this.f3587f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3587f);
                        break;
                    case 18:
                        this.f3589g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3589g);
                        break;
                    case 19:
                        this.f3591h = obtainStyledAttributes.getFloat(index, this.f3591h);
                        break;
                    case 20:
                        this.f3618y = obtainStyledAttributes.getFloat(index, this.f3618y);
                        break;
                    case 21:
                        this.f3585e = obtainStyledAttributes.getLayoutDimension(index, this.f3585e);
                        break;
                    case 22:
                        this.f3583d = obtainStyledAttributes.getLayoutDimension(index, this.f3583d);
                        break;
                    case 23:
                        this.f3558H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3558H);
                        break;
                    case 24:
                        this.f3595j = C0763e.m3867l(obtainStyledAttributes, index, this.f3595j);
                        break;
                    case 25:
                        this.f3597k = C0763e.m3867l(obtainStyledAttributes, index, this.f3597k);
                        break;
                    case 26:
                        this.f3557G = obtainStyledAttributes.getInt(index, this.f3557G);
                        break;
                    case 27:
                        this.f3559I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3559I);
                        break;
                    case 28:
                        this.f3599l = C0763e.m3867l(obtainStyledAttributes, index, this.f3599l);
                        break;
                    case 29:
                        this.f3601m = C0763e.m3867l(obtainStyledAttributes, index, this.f3601m);
                        break;
                    case 30:
                        this.f3563M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3563M);
                        break;
                    case 31:
                        this.f3614u = C0763e.m3867l(obtainStyledAttributes, index, this.f3614u);
                        break;
                    case 32:
                        this.f3615v = C0763e.m3867l(obtainStyledAttributes, index, this.f3615v);
                        break;
                    case 33:
                        this.f3560J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3560J);
                        break;
                    case 34:
                        this.f3605o = C0763e.m3867l(obtainStyledAttributes, index, this.f3605o);
                        break;
                    case 35:
                        this.f3603n = C0763e.m3867l(obtainStyledAttributes, index, this.f3603n);
                        break;
                    case 36:
                        this.f3619z = obtainStyledAttributes.getFloat(index, this.f3619z);
                        break;
                    case 37:
                        this.f3573W = obtainStyledAttributes.getFloat(index, this.f3573W);
                        break;
                    case 38:
                        this.f3572V = obtainStyledAttributes.getFloat(index, this.f3572V);
                        break;
                    case 39:
                        this.f3574X = obtainStyledAttributes.getInt(index, this.f3574X);
                        break;
                    case 40:
                        this.f3575Y = obtainStyledAttributes.getInt(index, this.f3575Y);
                        break;
                    case 41:
                        C0763e.m3868m(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0763e.m3868m(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f3552B = C0763e.m3867l(obtainStyledAttributes, index, this.f3552B);
                                break;
                            case 62:
                                this.f3553C = obtainStyledAttributes.getDimensionPixelSize(index, this.f3553C);
                                break;
                            case 63:
                                this.f3554D = obtainStyledAttributes.getFloat(index, this.f3554D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f3588f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f3590g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f3592h0 = obtainStyledAttributes.getInt(index, this.f3592h0);
                                        continue;
                                    case 73:
                                        this.f3594i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3594i0);
                                        continue;
                                    case 74:
                                        this.f3600l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f3608p0 = obtainStyledAttributes.getBoolean(index, this.f3608p0);
                                        continue;
                                    case 76:
                                        this.f3610q0 = obtainStyledAttributes.getInt(index, this.f3610q0);
                                        continue;
                                    case 77:
                                        this.f3612s = C0763e.m3867l(obtainStyledAttributes, index, this.f3612s);
                                        continue;
                                    case 78:
                                        this.f3613t = C0763e.m3867l(obtainStyledAttributes, index, this.f3613t);
                                        continue;
                                    case 79:
                                        this.f3571U = obtainStyledAttributes.getDimensionPixelSize(index, this.f3571U);
                                        continue;
                                    case 80:
                                        this.f3564N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3564N);
                                        continue;
                                    case 81:
                                        this.f3576Z = obtainStyledAttributes.getInt(index, this.f3576Z);
                                        continue;
                                    case 82:
                                        this.f3578a0 = obtainStyledAttributes.getInt(index, this.f3578a0);
                                        continue;
                                    case 83:
                                        this.f3582c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3582c0);
                                        continue;
                                    case 84:
                                        this.f3580b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3580b0);
                                        continue;
                                    case 85:
                                        this.f3586e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3586e0);
                                        continue;
                                    case 86:
                                        this.f3584d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3584d0);
                                        continue;
                                    case 87:
                                        this.f3604n0 = obtainStyledAttributes.getBoolean(index, this.f3604n0);
                                        continue;
                                    case 88:
                                        this.f3606o0 = obtainStyledAttributes.getBoolean(index, this.f3606o0);
                                        continue;
                                    case 89:
                                        this.f3602m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f3593i = obtainStyledAttributes.getBoolean(index, this.f3593i);
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
                                sb2.append(f3550r0.get(index));
                                Log.w("ConstraintSet", sb2.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: o */
        private static SparseIntArray f3620o;

        /* renamed from: a */
        public boolean f3621a = false;

        /* renamed from: b */
        public int f3622b = -1;

        /* renamed from: c */
        public int f3623c = 0;

        /* renamed from: d */
        public String f3624d = null;

        /* renamed from: e */
        public int f3625e = -1;

        /* renamed from: f */
        public int f3626f = 0;

        /* renamed from: g */
        public float f3627g = Float.NaN;

        /* renamed from: h */
        public int f3628h = -1;

        /* renamed from: i */
        public float f3629i = Float.NaN;

        /* renamed from: j */
        public float f3630j = Float.NaN;

        /* renamed from: k */
        public int f3631k = -1;

        /* renamed from: l */
        public String f3632l = null;

        /* renamed from: m */
        public int f3633m = -3;

        /* renamed from: n */
        public int f3634n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3620o = sparseIntArray;
            sparseIntArray.append(C0769k.f4062t6, 1);
            f3620o.append(C0769k.f4080v6, 2);
            f3620o.append(C0769k.f4116z6, 3);
            f3620o.append(C0769k.f4053s6, 4);
            f3620o.append(C0769k.f4044r6, 5);
            f3620o.append(C0769k.f4035q6, 6);
            f3620o.append(C0769k.f4071u6, 7);
            f3620o.append(C0769k.f4107y6, 8);
            f3620o.append(C0769k.f4098x6, 9);
            f3620o.append(C0769k.f4089w6, 10);
        }

        /* renamed from: a */
        public void m3894a(c cVar) {
            this.f3621a = cVar.f3621a;
            this.f3622b = cVar.f3622b;
            this.f3624d = cVar.f3624d;
            this.f3625e = cVar.f3625e;
            this.f3626f = cVar.f3626f;
            this.f3629i = cVar.f3629i;
            this.f3627g = cVar.f3627g;
            this.f3628h = cVar.f3628h;
        }

        /* renamed from: b */
        void m3895b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0769k.f4026p6);
            this.f3621a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3620o.get(index)) {
                    case 1:
                        this.f3629i = obtainStyledAttributes.getFloat(index, this.f3629i);
                        break;
                    case 2:
                        this.f3625e = obtainStyledAttributes.getInt(index, this.f3625e);
                        break;
                    case 3:
                        this.f3624d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C9338b.f22599c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f3626f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3622b = C0763e.m3867l(obtainStyledAttributes, index, this.f3622b);
                        break;
                    case 6:
                        this.f3623c = obtainStyledAttributes.getInteger(index, this.f3623c);
                        break;
                    case 7:
                        this.f3627g = obtainStyledAttributes.getFloat(index, this.f3627g);
                        break;
                    case 8:
                        this.f3631k = obtainStyledAttributes.getInteger(index, this.f3631k);
                        break;
                    case 9:
                        this.f3630j = obtainStyledAttributes.getFloat(index, this.f3630j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3634n = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.f3633m = -2;
                            break;
                        } else if (i11 != 3) {
                            this.f3633m = obtainStyledAttributes.getInteger(index, this.f3634n);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.f3632l = string;
                            if (string.indexOf("/") <= 0) {
                                this.f3633m = -1;
                                break;
                            } else {
                                this.f3634n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f3633m = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public boolean f3635a = false;

        /* renamed from: b */
        public int f3636b = 0;

        /* renamed from: c */
        public int f3637c = 0;

        /* renamed from: d */
        public float f3638d = 1.0f;

        /* renamed from: e */
        public float f3639e = Float.NaN;

        /* renamed from: a */
        public void m3896a(d dVar) {
            this.f3635a = dVar.f3635a;
            this.f3636b = dVar.f3636b;
            this.f3638d = dVar.f3638d;
            this.f3639e = dVar.f3639e;
            this.f3637c = dVar.f3637c;
        }

        /* renamed from: b */
        void m3897b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0769k.f3779M6);
            this.f3635a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f3795O6) {
                    this.f3638d = obtainStyledAttributes.getFloat(index, this.f3638d);
                } else if (index == C0769k.f3787N6) {
                    this.f3636b = obtainStyledAttributes.getInt(index, this.f3636b);
                    this.f3636b = C0763e.f3522f[this.f3636b];
                } else if (index == C0769k.f3811Q6) {
                    this.f3637c = obtainStyledAttributes.getInt(index, this.f3637c);
                } else if (index == C0769k.f3803P6) {
                    this.f3639e = obtainStyledAttributes.getFloat(index, this.f3639e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: o */
        private static SparseIntArray f3640o;

        /* renamed from: a */
        public boolean f3641a = false;

        /* renamed from: b */
        public float f3642b = 0.0f;

        /* renamed from: c */
        public float f3643c = 0.0f;

        /* renamed from: d */
        public float f3644d = 0.0f;

        /* renamed from: e */
        public float f3645e = 1.0f;

        /* renamed from: f */
        public float f3646f = 1.0f;

        /* renamed from: g */
        public float f3647g = Float.NaN;

        /* renamed from: h */
        public float f3648h = Float.NaN;

        /* renamed from: i */
        public int f3649i = -1;

        /* renamed from: j */
        public float f3650j = 0.0f;

        /* renamed from: k */
        public float f3651k = 0.0f;

        /* renamed from: l */
        public float f3652l = 0.0f;

        /* renamed from: m */
        public boolean f3653m = false;

        /* renamed from: n */
        public float f3654n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3640o = sparseIntArray;
            sparseIntArray.append(C0769k.f3991l7, 1);
            f3640o.append(C0769k.f4000m7, 2);
            f3640o.append(C0769k.f4009n7, 3);
            f3640o.append(C0769k.f3973j7, 4);
            f3640o.append(C0769k.f3982k7, 5);
            f3640o.append(C0769k.f3937f7, 6);
            f3640o.append(C0769k.f3946g7, 7);
            f3640o.append(C0769k.f3955h7, 8);
            f3640o.append(C0769k.f3964i7, 9);
            f3640o.append(C0769k.f4018o7, 10);
            f3640o.append(C0769k.f4027p7, 11);
            f3640o.append(C0769k.f4036q7, 12);
        }

        /* renamed from: a */
        public void m3898a(e eVar) {
            this.f3641a = eVar.f3641a;
            this.f3642b = eVar.f3642b;
            this.f3643c = eVar.f3643c;
            this.f3644d = eVar.f3644d;
            this.f3645e = eVar.f3645e;
            this.f3646f = eVar.f3646f;
            this.f3647g = eVar.f3647g;
            this.f3648h = eVar.f3648h;
            this.f3649i = eVar.f3649i;
            this.f3650j = eVar.f3650j;
            this.f3651k = eVar.f3651k;
            this.f3652l = eVar.f3652l;
            this.f3653m = eVar.f3653m;
            this.f3654n = eVar.f3654n;
        }

        /* renamed from: b */
        void m3899b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0769k.f3928e7);
            this.f3641a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3640o.get(index)) {
                    case 1:
                        this.f3642b = obtainStyledAttributes.getFloat(index, this.f3642b);
                        break;
                    case 2:
                        this.f3643c = obtainStyledAttributes.getFloat(index, this.f3643c);
                        break;
                    case 3:
                        this.f3644d = obtainStyledAttributes.getFloat(index, this.f3644d);
                        break;
                    case 4:
                        this.f3645e = obtainStyledAttributes.getFloat(index, this.f3645e);
                        break;
                    case 5:
                        this.f3646f = obtainStyledAttributes.getFloat(index, this.f3646f);
                        break;
                    case 6:
                        this.f3647g = obtainStyledAttributes.getDimension(index, this.f3647g);
                        break;
                    case 7:
                        this.f3648h = obtainStyledAttributes.getDimension(index, this.f3648h);
                        break;
                    case 8:
                        this.f3650j = obtainStyledAttributes.getDimension(index, this.f3650j);
                        break;
                    case 9:
                        this.f3651k = obtainStyledAttributes.getDimension(index, this.f3651k);
                        break;
                    case 10:
                        this.f3652l = obtainStyledAttributes.getDimension(index, this.f3652l);
                        break;
                    case 11:
                        this.f3653m = true;
                        this.f3654n = obtainStyledAttributes.getDimension(index, this.f3654n);
                        break;
                    case 12:
                        this.f3649i = C0763e.m3867l(obtainStyledAttributes, index, this.f3649i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f3523g.append(C0769k.f3674A0, 25);
        f3523g.append(C0769k.f3683B0, 26);
        f3523g.append(C0769k.f3701D0, 29);
        f3523g.append(C0769k.f3709E0, 30);
        f3523g.append(C0769k.f3757K0, 36);
        f3523g.append(C0769k.f3749J0, 35);
        f3523g.append(C0769k.f3948h0, 4);
        f3523g.append(C0769k.f3939g0, 3);
        f3523g.append(C0769k.f3903c0, 1);
        f3523g.append(C0769k.f3921e0, 91);
        f3523g.append(C0769k.f3912d0, 92);
        f3523g.append(C0769k.f3829T0, 6);
        f3523g.append(C0769k.f3837U0, 7);
        f3523g.append(C0769k.f4011o0, 17);
        f3523g.append(C0769k.f4020p0, 18);
        f3523g.append(C0769k.f4029q0, 19);
        f3523g.append(C0769k.f3868Y, 99);
        f3523g.append(C0769k.f4064u, 27);
        f3523g.append(C0769k.f3717F0, 32);
        f3523g.append(C0769k.f3725G0, 33);
        f3523g.append(C0769k.f4002n0, 10);
        f3523g.append(C0769k.f3993m0, 9);
        f3523g.append(C0769k.f3861X0, 13);
        f3523g.append(C0769k.f3886a1, 16);
        f3523g.append(C0769k.f3869Y0, 14);
        f3523g.append(C0769k.f3845V0, 11);
        f3523g.append(C0769k.f3877Z0, 15);
        f3523g.append(C0769k.f3853W0, 12);
        f3523g.append(C0769k.f3781N0, 40);
        f3523g.append(C0769k.f4101y0, 39);
        f3523g.append(C0769k.f4092x0, 41);
        f3523g.append(C0769k.f3773M0, 42);
        f3523g.append(C0769k.f4083w0, 20);
        f3523g.append(C0769k.f3765L0, 37);
        f3523g.append(C0769k.f3984l0, 5);
        f3523g.append(C0769k.f4110z0, 87);
        f3523g.append(C0769k.f3741I0, 87);
        f3523g.append(C0769k.f3692C0, 87);
        f3523g.append(C0769k.f3930f0, 87);
        f3523g.append(C0769k.f3894b0, 87);
        f3523g.append(C0769k.f4109z, 24);
        f3523g.append(C0769k.f3682B, 28);
        f3523g.append(C0769k.f3780N, 31);
        f3523g.append(C0769k.f3788O, 8);
        f3523g.append(C0769k.f3673A, 34);
        f3523g.append(C0769k.f3691C, 2);
        f3523g.append(C0769k.f4091x, 23);
        f3523g.append(C0769k.f4100y, 21);
        f3523g.append(C0769k.f3789O0, 95);
        f3523g.append(C0769k.f4038r0, 96);
        f3523g.append(C0769k.f4082w, 22);
        f3523g.append(C0769k.f3700D, 43);
        f3523g.append(C0769k.f3804Q, 44);
        f3523g.append(C0769k.f3764L, 45);
        f3523g.append(C0769k.f3772M, 46);
        f3523g.append(C0769k.f3756K, 60);
        f3523g.append(C0769k.f3740I, 47);
        f3523g.append(C0769k.f3748J, 48);
        f3523g.append(C0769k.f3708E, 49);
        f3523g.append(C0769k.f3716F, 50);
        f3523g.append(C0769k.f3724G, 51);
        f3523g.append(C0769k.f3732H, 52);
        f3523g.append(C0769k.f3796P, 53);
        f3523g.append(C0769k.f3797P0, 54);
        f3523g.append(C0769k.f4047s0, 55);
        f3523g.append(C0769k.f3805Q0, 56);
        f3523g.append(C0769k.f4056t0, 57);
        f3523g.append(C0769k.f3813R0, 58);
        f3523g.append(C0769k.f4065u0, 59);
        f3523g.append(C0769k.f3957i0, 61);
        f3523g.append(C0769k.f3975k0, 62);
        f3523g.append(C0769k.f3966j0, 63);
        f3523g.append(C0769k.f3812R, 64);
        f3523g.append(C0769k.f3976k1, 65);
        f3523g.append(C0769k.f3860X, 66);
        f3523g.append(C0769k.f3985l1, 67);
        f3523g.append(C0769k.f3913d1, 79);
        f3523g.append(C0769k.f4073v, 38);
        f3523g.append(C0769k.f3904c1, 68);
        f3523g.append(C0769k.f3821S0, 69);
        f3523g.append(C0769k.f4074v0, 70);
        f3523g.append(C0769k.f3895b1, 97);
        f3523g.append(C0769k.f3844V, 71);
        f3523g.append(C0769k.f3828T, 72);
        f3523g.append(C0769k.f3836U, 73);
        f3523g.append(C0769k.f3852W, 74);
        f3523g.append(C0769k.f3820S, 75);
        f3523g.append(C0769k.f3922e1, 76);
        f3523g.append(C0769k.f3733H0, 77);
        f3523g.append(C0769k.f3994m1, 78);
        f3523g.append(C0769k.f3885a0, 80);
        f3523g.append(C0769k.f3876Z, 81);
        f3523g.append(C0769k.f3931f1, 82);
        f3523g.append(C0769k.f3967j1, 83);
        f3523g.append(C0769k.f3958i1, 84);
        f3523g.append(C0769k.f3949h1, 85);
        f3523g.append(C0769k.f3940g1, 86);
        SparseIntArray sparseIntArray = f3524h;
        int i10 = C0769k.f3816R3;
        sparseIntArray.append(i10, 6);
        f3524h.append(i10, 7);
        f3524h.append(C0769k.f3775M2, 27);
        f3524h.append(C0769k.f3840U3, 13);
        f3524h.append(C0769k.f3864X3, 16);
        f3524h.append(C0769k.f3848V3, 14);
        f3524h.append(C0769k.f3824S3, 11);
        f3524h.append(C0769k.f3856W3, 15);
        f3524h.append(C0769k.f3832T3, 12);
        f3524h.append(C0769k.f3768L3, 40);
        f3524h.append(C0769k.f3712E3, 39);
        f3524h.append(C0769k.f3704D3, 41);
        f3524h.append(C0769k.f3760K3, 42);
        f3524h.append(C0769k.f3695C3, 20);
        f3524h.append(C0769k.f3752J3, 37);
        f3524h.append(C0769k.f4086w3, 5);
        f3524h.append(C0769k.f3720F3, 87);
        f3524h.append(C0769k.f3744I3, 87);
        f3524h.append(C0769k.f3728G3, 87);
        f3524h.append(C0769k.f4059t3, 87);
        f3524h.append(C0769k.f4050s3, 87);
        f3524h.append(C0769k.f3815R2, 24);
        f3524h.append(C0769k.f3831T2, 28);
        f3524h.append(C0769k.f3933f3, 31);
        f3524h.append(C0769k.f3942g3, 8);
        f3524h.append(C0769k.f3823S2, 34);
        f3524h.append(C0769k.f3839U2, 2);
        f3524h.append(C0769k.f3799P2, 23);
        f3524h.append(C0769k.f3807Q2, 21);
        f3524h.append(C0769k.f3776M3, 95);
        f3524h.append(C0769k.f4095x3, 96);
        f3524h.append(C0769k.f3791O2, 22);
        f3524h.append(C0769k.f3847V2, 43);
        f3524h.append(C0769k.f3960i3, 44);
        f3524h.append(C0769k.f3915d3, 45);
        f3524h.append(C0769k.f3924e3, 46);
        f3524h.append(C0769k.f3906c3, 60);
        f3524h.append(C0769k.f3888a3, 47);
        f3524h.append(C0769k.f3897b3, 48);
        f3524h.append(C0769k.f3855W2, 49);
        f3524h.append(C0769k.f3863X2, 50);
        f3524h.append(C0769k.f3871Y2, 51);
        f3524h.append(C0769k.f3879Z2, 52);
        f3524h.append(C0769k.f3951h3, 53);
        f3524h.append(C0769k.f3784N3, 54);
        f3524h.append(C0769k.f4104y3, 55);
        f3524h.append(C0769k.f3792O3, 56);
        f3524h.append(C0769k.f4113z3, 57);
        f3524h.append(C0769k.f3800P3, 58);
        f3524h.append(C0769k.f3677A3, 59);
        f3524h.append(C0769k.f4077v3, 62);
        f3524h.append(C0769k.f4068u3, 63);
        f3524h.append(C0769k.f3969j3, 64);
        f3524h.append(C0769k.f3961i4, 65);
        f3524h.append(C0769k.f4023p3, 66);
        f3524h.append(C0769k.f3970j4, 67);
        f3524h.append(C0769k.f3889a4, 79);
        f3524h.append(C0769k.f3783N2, 38);
        f3524h.append(C0769k.f3898b4, 98);
        f3524h.append(C0769k.f3880Z3, 68);
        f3524h.append(C0769k.f3808Q3, 69);
        f3524h.append(C0769k.f3686B3, 70);
        f3524h.append(C0769k.f4005n3, 71);
        f3524h.append(C0769k.f3987l3, 72);
        f3524h.append(C0769k.f3996m3, 73);
        f3524h.append(C0769k.f4014o3, 74);
        f3524h.append(C0769k.f3978k3, 75);
        f3524h.append(C0769k.f3907c4, 76);
        f3524h.append(C0769k.f3736H3, 77);
        f3524h.append(C0769k.f3979k4, 78);
        f3524h.append(C0769k.f4041r3, 80);
        f3524h.append(C0769k.f4032q3, 81);
        f3524h.append(C0769k.f3916d4, 82);
        f3524h.append(C0769k.f3952h4, 83);
        f3524h.append(C0769k.f3943g4, 84);
        f3524h.append(C0769k.f3934f4, 85);
        f3524h.append(C0769k.f3925e4, 86);
        f3524h.append(C0769k.f3872Y3, 97);
    }

    /* renamed from: h */
    private int[] m3865h(View view, String str) {
        int i10;
        Object m3820f;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = C0768j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m3820f = ((ConstraintLayout) view.getParent()).m3820f(0, trim)) != null && (m3820f instanceof Integer)) {
                i10 = ((Integer) m3820f).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    /* renamed from: i */
    private a m3866i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? C0769k.f3767L2 : C0769k.f4055t);
        m3871p(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m3867l(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3868m(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
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
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0757b
            if (r6 == 0) goto L3f
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0757b) r4
            if (r7 != 0) goto L3a
            r4.width = r2
            r4.f3428a0 = r5
            goto L6b
        L3a:
            r4.height = r2
            r4.f3430b0 = r5
            goto L6b
        L3f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0763e.b
            if (r6 == 0) goto L51
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.C0763e.b) r4
            if (r7 != 0) goto L4c
            r4.f3583d = r2
            r4.f3604n0 = r5
            goto L6b
        L4c:
            r4.f3585e = r2
            r4.f3606o0 = r5
            goto L6b
        L51:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.C0763e.a.C13155a
            if (r6 == 0) goto L6b
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.C0763e.a.C13155a) r4
            if (r7 != 0) goto L61
            r6 = 23
            r4.m3889b(r6, r2)
            r6 = 80
            goto L68
        L61:
            r6 = 21
            r4.m3889b(r6, r2)
            r6 = 81
        L68:
            r4.m3891d(r6, r5)
        L6b:
            return
        L6c:
            java.lang.String r5 = r5.getString(r6)
            m3869n(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0763e.m3868m(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: n */
    static void m3869n(Object obj, String str, int i10) {
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
                if (obj instanceof ConstraintLayout.C0757b) {
                    ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0757b).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0757b).height = 0;
                    }
                    m3870o(c0757b, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f3551A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C13155a) {
                        ((a.C13155a) obj).m3890c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.C0757b) {
                        ConstraintLayout.C0757b c0757b2 = (ConstraintLayout.C0757b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0757b2).width = 0;
                            c0757b2.f3412L = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0757b2).height = 0;
                            c0757b2.f3413M = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i10 == 0) {
                            bVar.f3583d = 0;
                            bVar.f3573W = parseFloat;
                            return;
                        } else {
                            bVar.f3585e = 0;
                            bVar.f3572V = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof a.C13155a) {
                        a.C13155a c13155a = (a.C13155a) obj;
                        if (i10 == 0) {
                            c13155a.m3889b(23, 0);
                            i12 = 39;
                        } else {
                            c13155a.m3889b(21, 0);
                            i12 = 40;
                        }
                        c13155a.m3888a(i12, parseFloat);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.C0757b) {
                        ConstraintLayout.C0757b c0757b3 = (ConstraintLayout.C0757b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0757b3).width = 0;
                            c0757b3.f3422V = max;
                            c0757b3.f3416P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0757b3).height = 0;
                            c0757b3.f3423W = max;
                            c0757b3.f3417Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i10 == 0) {
                            bVar2.f3583d = 0;
                            bVar2.f3588f0 = max;
                            bVar2.f3576Z = 2;
                            return;
                        } else {
                            bVar2.f3585e = 0;
                            bVar2.f3590g0 = max;
                            bVar2.f3578a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C13155a) {
                        a.C13155a c13155a2 = (a.C13155a) obj;
                        if (i10 == 0) {
                            c13155a2.m3889b(23, 0);
                            i11 = 54;
                        } else {
                            c13155a2.m3889b(21, 0);
                            i11 = 55;
                        }
                        c13155a2.m3889b(i11, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m3870o(ConstraintLayout.C0757b c0757b, String str) {
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
        c0757b.f3409I = str;
        c0757b.f3410J = f10;
        c0757b.f3411K = i10;
    }

    /* renamed from: p */
    private void m3871p(Context context, a aVar, TypedArray typedArray, boolean z10) {
        c cVar;
        String str;
        c cVar2;
        StringBuilder sb2;
        String str2;
        if (z10) {
            m3872q(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != C0769k.f4073v && C0769k.f3780N != index && C0769k.f3788O != index) {
                aVar.f3533d.f3621a = true;
                aVar.f3534e.f3579b = true;
                aVar.f3532c.f3635a = true;
                aVar.f3535f.f3641a = true;
            }
            switch (f3523g.get(index)) {
                case 1:
                    b bVar = aVar.f3534e;
                    bVar.f3611r = m3867l(typedArray, index, bVar.f3611r);
                    continue;
                case 2:
                    b bVar2 = aVar.f3534e;
                    bVar2.f3561K = typedArray.getDimensionPixelSize(index, bVar2.f3561K);
                    continue;
                case 3:
                    b bVar3 = aVar.f3534e;
                    bVar3.f3609q = m3867l(typedArray, index, bVar3.f3609q);
                    continue;
                case 4:
                    b bVar4 = aVar.f3534e;
                    bVar4.f3607p = m3867l(typedArray, index, bVar4.f3607p);
                    continue;
                case 5:
                    aVar.f3534e.f3551A = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f3534e;
                    bVar5.f3555E = typedArray.getDimensionPixelOffset(index, bVar5.f3555E);
                    continue;
                case 7:
                    b bVar6 = aVar.f3534e;
                    bVar6.f3556F = typedArray.getDimensionPixelOffset(index, bVar6.f3556F);
                    continue;
                case 8:
                    b bVar7 = aVar.f3534e;
                    bVar7.f3562L = typedArray.getDimensionPixelSize(index, bVar7.f3562L);
                    continue;
                case 9:
                    b bVar8 = aVar.f3534e;
                    bVar8.f3617x = m3867l(typedArray, index, bVar8.f3617x);
                    continue;
                case 10:
                    b bVar9 = aVar.f3534e;
                    bVar9.f3616w = m3867l(typedArray, index, bVar9.f3616w);
                    continue;
                case 11:
                    b bVar10 = aVar.f3534e;
                    bVar10.f3568R = typedArray.getDimensionPixelSize(index, bVar10.f3568R);
                    continue;
                case 12:
                    b bVar11 = aVar.f3534e;
                    bVar11.f3569S = typedArray.getDimensionPixelSize(index, bVar11.f3569S);
                    continue;
                case 13:
                    b bVar12 = aVar.f3534e;
                    bVar12.f3565O = typedArray.getDimensionPixelSize(index, bVar12.f3565O);
                    continue;
                case 14:
                    b bVar13 = aVar.f3534e;
                    bVar13.f3567Q = typedArray.getDimensionPixelSize(index, bVar13.f3567Q);
                    continue;
                case 15:
                    b bVar14 = aVar.f3534e;
                    bVar14.f3570T = typedArray.getDimensionPixelSize(index, bVar14.f3570T);
                    continue;
                case 16:
                    b bVar15 = aVar.f3534e;
                    bVar15.f3566P = typedArray.getDimensionPixelSize(index, bVar15.f3566P);
                    continue;
                case 17:
                    b bVar16 = aVar.f3534e;
                    bVar16.f3587f = typedArray.getDimensionPixelOffset(index, bVar16.f3587f);
                    continue;
                case 18:
                    b bVar17 = aVar.f3534e;
                    bVar17.f3589g = typedArray.getDimensionPixelOffset(index, bVar17.f3589g);
                    continue;
                case 19:
                    b bVar18 = aVar.f3534e;
                    bVar18.f3591h = typedArray.getFloat(index, bVar18.f3591h);
                    continue;
                case 20:
                    b bVar19 = aVar.f3534e;
                    bVar19.f3618y = typedArray.getFloat(index, bVar19.f3618y);
                    continue;
                case 21:
                    b bVar20 = aVar.f3534e;
                    bVar20.f3585e = typedArray.getLayoutDimension(index, bVar20.f3585e);
                    continue;
                case 22:
                    d dVar = aVar.f3532c;
                    dVar.f3636b = typedArray.getInt(index, dVar.f3636b);
                    d dVar2 = aVar.f3532c;
                    dVar2.f3636b = f3522f[dVar2.f3636b];
                    continue;
                case 23:
                    b bVar21 = aVar.f3534e;
                    bVar21.f3583d = typedArray.getLayoutDimension(index, bVar21.f3583d);
                    continue;
                case 24:
                    b bVar22 = aVar.f3534e;
                    bVar22.f3558H = typedArray.getDimensionPixelSize(index, bVar22.f3558H);
                    continue;
                case 25:
                    b bVar23 = aVar.f3534e;
                    bVar23.f3595j = m3867l(typedArray, index, bVar23.f3595j);
                    continue;
                case 26:
                    b bVar24 = aVar.f3534e;
                    bVar24.f3597k = m3867l(typedArray, index, bVar24.f3597k);
                    continue;
                case 27:
                    b bVar25 = aVar.f3534e;
                    bVar25.f3557G = typedArray.getInt(index, bVar25.f3557G);
                    continue;
                case 28:
                    b bVar26 = aVar.f3534e;
                    bVar26.f3559I = typedArray.getDimensionPixelSize(index, bVar26.f3559I);
                    continue;
                case 29:
                    b bVar27 = aVar.f3534e;
                    bVar27.f3599l = m3867l(typedArray, index, bVar27.f3599l);
                    continue;
                case 30:
                    b bVar28 = aVar.f3534e;
                    bVar28.f3601m = m3867l(typedArray, index, bVar28.f3601m);
                    continue;
                case 31:
                    b bVar29 = aVar.f3534e;
                    bVar29.f3563M = typedArray.getDimensionPixelSize(index, bVar29.f3563M);
                    continue;
                case 32:
                    b bVar30 = aVar.f3534e;
                    bVar30.f3614u = m3867l(typedArray, index, bVar30.f3614u);
                    continue;
                case 33:
                    b bVar31 = aVar.f3534e;
                    bVar31.f3615v = m3867l(typedArray, index, bVar31.f3615v);
                    continue;
                case 34:
                    b bVar32 = aVar.f3534e;
                    bVar32.f3560J = typedArray.getDimensionPixelSize(index, bVar32.f3560J);
                    continue;
                case 35:
                    b bVar33 = aVar.f3534e;
                    bVar33.f3605o = m3867l(typedArray, index, bVar33.f3605o);
                    continue;
                case 36:
                    b bVar34 = aVar.f3534e;
                    bVar34.f3603n = m3867l(typedArray, index, bVar34.f3603n);
                    continue;
                case 37:
                    b bVar35 = aVar.f3534e;
                    bVar35.f3619z = typedArray.getFloat(index, bVar35.f3619z);
                    continue;
                case 38:
                    aVar.f3530a = typedArray.getResourceId(index, aVar.f3530a);
                    continue;
                case 39:
                    b bVar36 = aVar.f3534e;
                    bVar36.f3573W = typedArray.getFloat(index, bVar36.f3573W);
                    continue;
                case 40:
                    b bVar37 = aVar.f3534e;
                    bVar37.f3572V = typedArray.getFloat(index, bVar37.f3572V);
                    continue;
                case 41:
                    b bVar38 = aVar.f3534e;
                    bVar38.f3574X = typedArray.getInt(index, bVar38.f3574X);
                    continue;
                case 42:
                    b bVar39 = aVar.f3534e;
                    bVar39.f3575Y = typedArray.getInt(index, bVar39.f3575Y);
                    continue;
                case 43:
                    d dVar3 = aVar.f3532c;
                    dVar3.f3638d = typedArray.getFloat(index, dVar3.f3638d);
                    continue;
                case 44:
                    e eVar = aVar.f3535f;
                    eVar.f3653m = true;
                    eVar.f3654n = typedArray.getDimension(index, eVar.f3654n);
                    continue;
                case 45:
                    e eVar2 = aVar.f3535f;
                    eVar2.f3643c = typedArray.getFloat(index, eVar2.f3643c);
                    continue;
                case 46:
                    e eVar3 = aVar.f3535f;
                    eVar3.f3644d = typedArray.getFloat(index, eVar3.f3644d);
                    continue;
                case 47:
                    e eVar4 = aVar.f3535f;
                    eVar4.f3645e = typedArray.getFloat(index, eVar4.f3645e);
                    continue;
                case 48:
                    e eVar5 = aVar.f3535f;
                    eVar5.f3646f = typedArray.getFloat(index, eVar5.f3646f);
                    continue;
                case 49:
                    e eVar6 = aVar.f3535f;
                    eVar6.f3647g = typedArray.getDimension(index, eVar6.f3647g);
                    continue;
                case 50:
                    e eVar7 = aVar.f3535f;
                    eVar7.f3648h = typedArray.getDimension(index, eVar7.f3648h);
                    continue;
                case 51:
                    e eVar8 = aVar.f3535f;
                    eVar8.f3650j = typedArray.getDimension(index, eVar8.f3650j);
                    continue;
                case 52:
                    e eVar9 = aVar.f3535f;
                    eVar9.f3651k = typedArray.getDimension(index, eVar9.f3651k);
                    continue;
                case 53:
                    e eVar10 = aVar.f3535f;
                    eVar10.f3652l = typedArray.getDimension(index, eVar10.f3652l);
                    continue;
                case 54:
                    b bVar40 = aVar.f3534e;
                    bVar40.f3576Z = typedArray.getInt(index, bVar40.f3576Z);
                    continue;
                case 55:
                    b bVar41 = aVar.f3534e;
                    bVar41.f3578a0 = typedArray.getInt(index, bVar41.f3578a0);
                    continue;
                case 56:
                    b bVar42 = aVar.f3534e;
                    bVar42.f3580b0 = typedArray.getDimensionPixelSize(index, bVar42.f3580b0);
                    continue;
                case 57:
                    b bVar43 = aVar.f3534e;
                    bVar43.f3582c0 = typedArray.getDimensionPixelSize(index, bVar43.f3582c0);
                    continue;
                case 58:
                    b bVar44 = aVar.f3534e;
                    bVar44.f3584d0 = typedArray.getDimensionPixelSize(index, bVar44.f3584d0);
                    continue;
                case 59:
                    b bVar45 = aVar.f3534e;
                    bVar45.f3586e0 = typedArray.getDimensionPixelSize(index, bVar45.f3586e0);
                    continue;
                case 60:
                    e eVar11 = aVar.f3535f;
                    eVar11.f3642b = typedArray.getFloat(index, eVar11.f3642b);
                    continue;
                case 61:
                    b bVar46 = aVar.f3534e;
                    bVar46.f3552B = m3867l(typedArray, index, bVar46.f3552B);
                    continue;
                case 62:
                    b bVar47 = aVar.f3534e;
                    bVar47.f3553C = typedArray.getDimensionPixelSize(index, bVar47.f3553C);
                    continue;
                case 63:
                    b bVar48 = aVar.f3534e;
                    bVar48.f3554D = typedArray.getFloat(index, bVar48.f3554D);
                    continue;
                case 64:
                    c cVar3 = aVar.f3533d;
                    cVar3.f3622b = m3867l(typedArray, index, cVar3.f3622b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f3533d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f3533d;
                        str = C9338b.f22599c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f3624d = str;
                    continue;
                case 66:
                    aVar.f3533d.f3626f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f3533d;
                    cVar4.f3629i = typedArray.getFloat(index, cVar4.f3629i);
                    continue;
                case 68:
                    d dVar4 = aVar.f3532c;
                    dVar4.f3639e = typedArray.getFloat(index, dVar4.f3639e);
                    continue;
                case 69:
                    aVar.f3534e.f3588f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f3534e.f3590g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f3534e;
                    bVar49.f3592h0 = typedArray.getInt(index, bVar49.f3592h0);
                    continue;
                case 73:
                    b bVar50 = aVar.f3534e;
                    bVar50.f3594i0 = typedArray.getDimensionPixelSize(index, bVar50.f3594i0);
                    continue;
                case 74:
                    aVar.f3534e.f3600l0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f3534e;
                    bVar51.f3608p0 = typedArray.getBoolean(index, bVar51.f3608p0);
                    continue;
                case 76:
                    c cVar5 = aVar.f3533d;
                    cVar5.f3625e = typedArray.getInt(index, cVar5.f3625e);
                    continue;
                case 77:
                    aVar.f3534e.f3602m0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f3532c;
                    dVar5.f3637c = typedArray.getInt(index, dVar5.f3637c);
                    continue;
                case 79:
                    c cVar6 = aVar.f3533d;
                    cVar6.f3627g = typedArray.getFloat(index, cVar6.f3627g);
                    continue;
                case 80:
                    b bVar52 = aVar.f3534e;
                    bVar52.f3604n0 = typedArray.getBoolean(index, bVar52.f3604n0);
                    continue;
                case 81:
                    b bVar53 = aVar.f3534e;
                    bVar53.f3606o0 = typedArray.getBoolean(index, bVar53.f3606o0);
                    continue;
                case 82:
                    c cVar7 = aVar.f3533d;
                    cVar7.f3623c = typedArray.getInteger(index, cVar7.f3623c);
                    continue;
                case 83:
                    e eVar12 = aVar.f3535f;
                    eVar12.f3649i = m3867l(typedArray, index, eVar12.f3649i);
                    continue;
                case 84:
                    c cVar8 = aVar.f3533d;
                    cVar8.f3631k = typedArray.getInteger(index, cVar8.f3631k);
                    continue;
                case 85:
                    c cVar9 = aVar.f3533d;
                    cVar9.f3630j = typedArray.getFloat(index, cVar9.f3630j);
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f3533d.f3634n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f3533d;
                        if (cVar2.f3634n == -1) {
                            continue;
                        }
                        cVar2.f3633m = -2;
                        break;
                    } else if (i11 != 3) {
                        c cVar10 = aVar.f3533d;
                        cVar10.f3633m = typedArray.getInteger(index, cVar10.f3634n);
                        break;
                    } else {
                        aVar.f3533d.f3632l = typedArray.getString(index);
                        if (aVar.f3533d.f3632l.indexOf("/") <= 0) {
                            aVar.f3533d.f3633m = -1;
                            break;
                        } else {
                            aVar.f3533d.f3634n = typedArray.getResourceId(index, -1);
                            cVar2 = aVar.f3533d;
                            cVar2.f3633m = -2;
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
                    b bVar54 = aVar.f3534e;
                    bVar54.f3612s = m3867l(typedArray, index, bVar54.f3612s);
                    continue;
                case 92:
                    b bVar55 = aVar.f3534e;
                    bVar55.f3613t = m3867l(typedArray, index, bVar55.f3613t);
                    continue;
                case 93:
                    b bVar56 = aVar.f3534e;
                    bVar56.f3564N = typedArray.getDimensionPixelSize(index, bVar56.f3564N);
                    continue;
                case 94:
                    b bVar57 = aVar.f3534e;
                    bVar57.f3571U = typedArray.getDimensionPixelSize(index, bVar57.f3571U);
                    continue;
                case 95:
                    m3868m(aVar.f3534e, typedArray, index, 0);
                    continue;
                case 96:
                    m3868m(aVar.f3534e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f3534e;
                    bVar58.f3610q0 = typedArray.getInt(index, bVar58.f3610q0);
                    continue;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f3523g.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
        b bVar59 = aVar.f3534e;
        if (bVar59.f3600l0 != null) {
            bVar59.f3598k0 = null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0032. Please report as an issue. */
    /* renamed from: q */
    private static void m3872q(Context context, a aVar, TypedArray typedArray) {
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
        a.C13155a c13155a = new a.C13155a();
        aVar.f3537h = c13155a;
        aVar.f3533d.f3621a = false;
        aVar.f3534e.f3579b = false;
        aVar.f3532c.f3635a = false;
        aVar.f3535f.f3641a = false;
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArray.getIndex(i14);
            switch (f3524h.get(index)) {
                case 2:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3561K);
                    i10 = 2;
                    c13155a.m3889b(i10, dimensionPixelSize);
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
                    sb2.append(f3523g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 5:
                    i11 = 5;
                    c13155a.m3890c(i11, typedArray.getString(index));
                    break;
                case 6:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3534e.f3555E);
                    i10 = 6;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 7:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3534e.f3556F);
                    i10 = 7;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 8:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3562L);
                    i10 = 8;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 11:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3568R);
                    i10 = 11;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 12:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3569S);
                    i10 = 12;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 13:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3565O);
                    i10 = 13;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 14:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3567Q);
                    i10 = 14;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 15:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3570T);
                    i10 = 15;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 16:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3566P);
                    i10 = 16;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 17:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3534e.f3587f);
                    i10 = 17;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 18:
                    dimensionPixelSize = typedArray.getDimensionPixelOffset(index, aVar.f3534e.f3589g);
                    i10 = 18;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 19:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3591h);
                    i12 = 19;
                    c13155a.m3888a(i12, f10);
                    break;
                case 20:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3618y);
                    i12 = 20;
                    c13155a.m3888a(i12, f10);
                    break;
                case 21:
                    dimensionPixelSize = typedArray.getLayoutDimension(index, aVar.f3534e.f3585e);
                    i10 = 21;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 22:
                    dimensionPixelSize = f3522f[typedArray.getInt(index, aVar.f3532c.f3636b)];
                    i10 = 22;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 23:
                    dimensionPixelSize = typedArray.getLayoutDimension(index, aVar.f3534e.f3583d);
                    i10 = 23;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 24:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3558H);
                    i10 = 24;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 27:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3557G);
                    i10 = 27;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 28:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3559I);
                    i10 = 28;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 31:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3563M);
                    i10 = 31;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 34:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3560J);
                    i10 = 34;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 37:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3619z);
                    i12 = 37;
                    c13155a.m3888a(i12, f10);
                    break;
                case 38:
                    dimensionPixelSize = typedArray.getResourceId(index, aVar.f3530a);
                    aVar.f3530a = dimensionPixelSize;
                    i10 = 38;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 39:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3573W);
                    i12 = 39;
                    c13155a.m3888a(i12, f10);
                    break;
                case 40:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3572V);
                    i12 = 40;
                    c13155a.m3888a(i12, f10);
                    break;
                case 41:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3574X);
                    i10 = 41;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 42:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3575Y);
                    i10 = 42;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 43:
                    f10 = typedArray.getFloat(index, aVar.f3532c.f3638d);
                    i12 = 43;
                    c13155a.m3888a(i12, f10);
                    break;
                case 44:
                    i12 = 44;
                    c13155a.m3891d(44, true);
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3654n);
                    c13155a.m3888a(i12, f10);
                    break;
                case 45:
                    f10 = typedArray.getFloat(index, aVar.f3535f.f3643c);
                    i12 = 45;
                    c13155a.m3888a(i12, f10);
                    break;
                case 46:
                    f10 = typedArray.getFloat(index, aVar.f3535f.f3644d);
                    i12 = 46;
                    c13155a.m3888a(i12, f10);
                    break;
                case 47:
                    f10 = typedArray.getFloat(index, aVar.f3535f.f3645e);
                    i12 = 47;
                    c13155a.m3888a(i12, f10);
                    break;
                case 48:
                    f10 = typedArray.getFloat(index, aVar.f3535f.f3646f);
                    i12 = 48;
                    c13155a.m3888a(i12, f10);
                    break;
                case 49:
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3647g);
                    i12 = 49;
                    c13155a.m3888a(i12, f10);
                    break;
                case 50:
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3648h);
                    i12 = 50;
                    c13155a.m3888a(i12, f10);
                    break;
                case 51:
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3650j);
                    i12 = 51;
                    c13155a.m3888a(i12, f10);
                    break;
                case 52:
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3651k);
                    i12 = 52;
                    c13155a.m3888a(i12, f10);
                    break;
                case 53:
                    f10 = typedArray.getDimension(index, aVar.f3535f.f3652l);
                    i12 = 53;
                    c13155a.m3888a(i12, f10);
                    break;
                case 54:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3576Z);
                    i10 = 54;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 55:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3578a0);
                    i10 = 55;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 56:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3580b0);
                    i10 = 56;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 57:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3582c0);
                    i10 = 57;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 58:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3584d0);
                    i10 = 58;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 59:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3586e0);
                    i10 = 59;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 60:
                    f10 = typedArray.getFloat(index, aVar.f3535f.f3642b);
                    i12 = 60;
                    c13155a.m3888a(i12, f10);
                    break;
                case 62:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3553C);
                    i10 = 62;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 63:
                    f10 = typedArray.getFloat(index, aVar.f3534e.f3554D);
                    i12 = 63;
                    c13155a.m3888a(i12, f10);
                    break;
                case 64:
                    dimensionPixelSize = m3867l(typedArray, index, aVar.f3533d.f3622b);
                    i10 = 64;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 65:
                    c13155a.m3890c(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : C9338b.f22599c[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i10 = 66;
                    dimensionPixelSize = typedArray.getInt(index, 0);
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 67:
                    f10 = typedArray.getFloat(index, aVar.f3533d.f3629i);
                    i12 = 67;
                    c13155a.m3888a(i12, f10);
                    break;
                case 68:
                    f10 = typedArray.getFloat(index, aVar.f3532c.f3639e);
                    i12 = 68;
                    c13155a.m3888a(i12, f10);
                    break;
                case 69:
                    i12 = 69;
                    f10 = typedArray.getFloat(index, 1.0f);
                    c13155a.m3888a(i12, f10);
                    break;
                case 70:
                    i12 = 70;
                    f10 = typedArray.getFloat(index, 1.0f);
                    c13155a.m3888a(i12, f10);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3592h0);
                    i10 = 72;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 73:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3594i0);
                    i10 = 73;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 74:
                    i11 = 74;
                    c13155a.m3890c(i11, typedArray.getString(index));
                    break;
                case 75:
                    z10 = typedArray.getBoolean(index, aVar.f3534e.f3608p0);
                    i13 = 75;
                    c13155a.m3891d(i13, z10);
                    break;
                case 76:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3533d.f3625e);
                    i10 = 76;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 77:
                    i11 = 77;
                    c13155a.m3890c(i11, typedArray.getString(index));
                    break;
                case 78:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3532c.f3637c);
                    i10 = 78;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 79:
                    f10 = typedArray.getFloat(index, aVar.f3533d.f3627g);
                    i12 = 79;
                    c13155a.m3888a(i12, f10);
                    break;
                case 80:
                    z10 = typedArray.getBoolean(index, aVar.f3534e.f3604n0);
                    i13 = 80;
                    c13155a.m3891d(i13, z10);
                    break;
                case 81:
                    z10 = typedArray.getBoolean(index, aVar.f3534e.f3606o0);
                    i13 = 81;
                    c13155a.m3891d(i13, z10);
                    break;
                case 82:
                    dimensionPixelSize = typedArray.getInteger(index, aVar.f3533d.f3623c);
                    i10 = 82;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 83:
                    dimensionPixelSize = m3867l(typedArray, index, aVar.f3535f.f3649i);
                    i10 = 83;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 84:
                    dimensionPixelSize = typedArray.getInteger(index, aVar.f3533d.f3631k);
                    i10 = 84;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 85:
                    f10 = typedArray.getFloat(index, aVar.f3533d.f3630j);
                    i12 = 85;
                    c13155a.m3888a(i12, f10);
                    break;
                case 86:
                    int i15 = typedArray.peekValue(index).type;
                    if (i15 == 1) {
                        aVar.f3533d.f3634n = typedArray.getResourceId(index, -1);
                        c13155a.m3889b(89, aVar.f3533d.f3634n);
                        cVar = aVar.f3533d;
                        if (cVar.f3634n == -1) {
                            break;
                        }
                        cVar.f3633m = -2;
                        c13155a.m3889b(88, -2);
                        break;
                    } else if (i15 != 3) {
                        c cVar2 = aVar.f3533d;
                        cVar2.f3633m = typedArray.getInteger(index, cVar2.f3634n);
                        c13155a.m3889b(88, aVar.f3533d.f3633m);
                        break;
                    } else {
                        aVar.f3533d.f3632l = typedArray.getString(index);
                        c13155a.m3890c(90, aVar.f3533d.f3632l);
                        if (aVar.f3533d.f3632l.indexOf("/") <= 0) {
                            aVar.f3533d.f3633m = -1;
                            c13155a.m3889b(88, -1);
                            break;
                        } else {
                            aVar.f3533d.f3634n = typedArray.getResourceId(index, -1);
                            c13155a.m3889b(89, aVar.f3533d.f3634n);
                            cVar = aVar.f3533d;
                            cVar.f3633m = -2;
                            c13155a.m3889b(88, -2);
                        }
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str = "unused attribute 0x";
                    sb2.append(str);
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f3523g.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3564N);
                    i10 = 93;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 94:
                    dimensionPixelSize = typedArray.getDimensionPixelSize(index, aVar.f3534e.f3571U);
                    i10 = 94;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 95:
                    m3868m(c13155a, typedArray, index, 0);
                    break;
                case 96:
                    m3868m(c13155a, typedArray, index, 1);
                    break;
                case 97:
                    dimensionPixelSize = typedArray.getInt(index, aVar.f3534e.f3610q0);
                    i10 = 97;
                    c13155a.m3889b(i10, dimensionPixelSize);
                    break;
                case 98:
                    if (C0753j.f3300F0) {
                        int resourceId = typedArray.getResourceId(index, aVar.f3530a);
                        aVar.f3530a = resourceId;
                        if (resourceId != -1) {
                            break;
                        }
                        aVar.f3531b = typedArray.getString(index);
                        break;
                    } else {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f3530a = typedArray.getResourceId(index, aVar.f3530a);
                            break;
                        }
                        aVar.f3531b = typedArray.getString(index);
                    }
                case 99:
                    z10 = typedArray.getBoolean(index, aVar.f3534e.f3593i);
                    i13 = 99;
                    c13155a.m3891d(i13, z10);
                    break;
            }
        }
    }

    /* renamed from: c */
    public void m3873c(ConstraintLayout constraintLayout) {
        m3874d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3874d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3529e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f3529e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C0744a.m3764b(childAt));
            } else {
                if (this.f3528d && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f3529e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f3529e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof C0759a) {
                                aVar.f3534e.f3596j0 = 1;
                                C0759a c0759a = (C0759a) childAt;
                                c0759a.setId(id2);
                                c0759a.setType(aVar.f3534e.f3592h0);
                                c0759a.setMargin(aVar.f3534e.f3594i0);
                                c0759a.setAllowsGoneWidget(aVar.f3534e.f3608p0);
                                b bVar = aVar.f3534e;
                                int[] iArr = bVar.f3598k0;
                                if (iArr != null) {
                                    c0759a.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f3600l0;
                                    if (str != null) {
                                        bVar.f3598k0 = m3865h(c0759a, str);
                                        c0759a.setReferencedIds(aVar.f3534e.f3598k0);
                                    }
                                }
                            }
                            ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) childAt.getLayoutParams();
                            c0757b.m3828a();
                            aVar.m3886d(c0757b);
                            if (z10) {
                                C0760b.m3837e(childAt, aVar.f3536g);
                            }
                            childAt.setLayoutParams(c0757b);
                            d dVar = aVar.f3532c;
                            if (dVar.f3637c == 0) {
                                childAt.setVisibility(dVar.f3636b);
                            }
                            childAt.setAlpha(aVar.f3532c.f3638d);
                            childAt.setRotation(aVar.f3535f.f3642b);
                            childAt.setRotationX(aVar.f3535f.f3643c);
                            childAt.setRotationY(aVar.f3535f.f3644d);
                            childAt.setScaleX(aVar.f3535f.f3645e);
                            childAt.setScaleY(aVar.f3535f.f3646f);
                            e eVar = aVar.f3535f;
                            if (eVar.f3649i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f3535f.f3649i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f3647g)) {
                                    childAt.setPivotX(aVar.f3535f.f3647g);
                                }
                                if (!Float.isNaN(aVar.f3535f.f3648h)) {
                                    childAt.setPivotY(aVar.f3535f.f3648h);
                                }
                            }
                            childAt.setTranslationX(aVar.f3535f.f3650j);
                            childAt.setTranslationY(aVar.f3535f.f3651k);
                            childAt.setTranslationZ(aVar.f3535f.f3652l);
                            e eVar2 = aVar.f3535f;
                            if (eVar2.f3653m) {
                                childAt.setElevation(eVar2.f3654n);
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
            a aVar2 = this.f3529e.get(num);
            if (aVar2 != null) {
                if (aVar2.f3534e.f3596j0 == 1) {
                    C0759a c0759a2 = new C0759a(constraintLayout.getContext());
                    c0759a2.setId(num.intValue());
                    b bVar2 = aVar2.f3534e;
                    int[] iArr2 = bVar2.f3598k0;
                    if (iArr2 != null) {
                        c0759a2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f3600l0;
                        if (str2 != null) {
                            bVar2.f3598k0 = m3865h(c0759a2, str2);
                            c0759a2.setReferencedIds(aVar2.f3534e.f3598k0);
                        }
                    }
                    c0759a2.setType(aVar2.f3534e.f3592h0);
                    c0759a2.setMargin(aVar2.f3534e.f3594i0);
                    ConstraintLayout.C0757b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    c0759a2.m3855s();
                    aVar2.m3886d(generateDefaultLayoutParams);
                    constraintLayout.addView(c0759a2, generateDefaultLayoutParams);
                }
                if (aVar2.f3534e.f3577a) {
                    View c0766h = new C0766h(constraintLayout.getContext());
                    c0766h.setId(num.intValue());
                    ConstraintLayout.C0757b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m3886d(generateDefaultLayoutParams2);
                    constraintLayout.addView(c0766h, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof AbstractC0761c) {
                ((AbstractC0761c) childAt2).mo3849i(constraintLayout);
            }
        }
    }

    /* renamed from: e */
    public void m3875e(Context context, int i10) {
        m3876f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    /* renamed from: f */
    public void m3876f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3529e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.C0757b c0757b = (ConstraintLayout.C0757b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3528d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3529e.containsKey(Integer.valueOf(id2))) {
                this.f3529e.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f3529e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f3536g = C0760b.m3835a(this.f3527c, childAt);
                aVar.m3883f(id2, c0757b);
                aVar.f3532c.f3636b = childAt.getVisibility();
                aVar.f3532c.f3638d = childAt.getAlpha();
                aVar.f3535f.f3642b = childAt.getRotation();
                aVar.f3535f.f3643c = childAt.getRotationX();
                aVar.f3535f.f3644d = childAt.getRotationY();
                aVar.f3535f.f3645e = childAt.getScaleX();
                aVar.f3535f.f3646f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f3535f;
                    eVar.f3647g = pivotX;
                    eVar.f3648h = pivotY;
                }
                aVar.f3535f.f3650j = childAt.getTranslationX();
                aVar.f3535f.f3651k = childAt.getTranslationY();
                aVar.f3535f.f3652l = childAt.getTranslationZ();
                e eVar2 = aVar.f3535f;
                if (eVar2.f3653m) {
                    eVar2.f3654n = childAt.getElevation();
                }
                if (childAt instanceof C0759a) {
                    C0759a c0759a = (C0759a) childAt;
                    aVar.f3534e.f3608p0 = c0759a.getAllowsGoneWidget();
                    aVar.f3534e.f3598k0 = c0759a.getReferencedIds();
                    aVar.f3534e.f3592h0 = c0759a.getType();
                    aVar.f3534e.f3594i0 = c0759a.getMargin();
                }
            }
        }
    }

    /* renamed from: g */
    public void m3877g(C0764f c0764f) {
        int childCount = c0764f.getChildCount();
        this.f3529e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c0764f.getChildAt(i10);
            C0764f.a aVar = (C0764f.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3528d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3529e.containsKey(Integer.valueOf(id2))) {
                this.f3529e.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f3529e.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof AbstractC0761c) {
                    aVar2.m3885h((AbstractC0761c) childAt, id2, aVar);
                }
                aVar2.m3884g(id2, aVar);
            }
        }
    }

    /* renamed from: j */
    public void m3878j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m3866i = m3866i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m3866i.f3534e.f3577a = true;
                    }
                    this.f3529e.put(Integer.valueOf(m3866i.f3530a), m3866i);
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
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3879k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0763e.m3879k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
