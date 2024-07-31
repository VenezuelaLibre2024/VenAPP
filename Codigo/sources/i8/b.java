package i8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g8.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t8.d0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
final class b {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f17545h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f17546i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f17547j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f17548a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f17549b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f17550c;

    /* renamed from: d, reason: collision with root package name */
    private final C0285b f17551d;

    /* renamed from: e, reason: collision with root package name */
    private final a f17552e;

    /* renamed from: f, reason: collision with root package name */
    private final h f17553f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f17554g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17555a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f17556b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f17557c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f17558d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f17555a = i10;
            this.f17556b = iArr;
            this.f17557c = iArr2;
            this.f17558d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0285b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17559a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17560b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17561c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17562d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17563e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17564f;

        public C0285b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f17559a = i10;
            this.f17560b = i11;
            this.f17561c = i12;
            this.f17562d = i13;
            this.f17563e = i14;
            this.f17564f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f17565a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17566b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f17567c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f17568d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f17565a = i10;
            this.f17566b = z10;
            this.f17567c = bArr;
            this.f17568d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f17569a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17570b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17571c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f17572d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f17569a = i10;
            this.f17570b = i11;
            this.f17571c = i12;
            this.f17572d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f17573a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17574b;

        public e(int i10, int i11) {
            this.f17573a = i10;
            this.f17574b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f17575a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17576b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17577c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17578d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17579e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17580f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17581g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17582h;

        /* renamed from: i, reason: collision with root package name */
        public final int f17583i;

        /* renamed from: j, reason: collision with root package name */
        public final int f17584j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f17585k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f17575a = i10;
            this.f17576b = z10;
            this.f17577c = i11;
            this.f17578d = i12;
            this.f17579e = i13;
            this.f17580f = i14;
            this.f17581g = i15;
            this.f17582h = i16;
            this.f17583i = i17;
            this.f17584j = i18;
            this.f17585k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f17585k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f17585k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f17586a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17587b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17588c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17589d;

        /* renamed from: e, reason: collision with root package name */
        public final int f17590e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17591f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f17586a = i10;
            this.f17587b = i11;
            this.f17588c = i12;
            this.f17589d = i13;
            this.f17590e = i14;
            this.f17591f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f17592a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17593b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f17594c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f17595d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f17596e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f17597f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f17598g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0285b f17599h;

        /* renamed from: i, reason: collision with root package name */
        public d f17600i;

        public h(int i10, int i11) {
            this.f17592a = i10;
            this.f17593b = i11;
        }

        public void a() {
            this.f17594c.clear();
            this.f17595d.clear();
            this.f17596e.clear();
            this.f17597f.clear();
            this.f17598g.clear();
            this.f17599h = null;
            this.f17600i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f17548a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f17549b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f17550c = new Canvas();
        this.f17551d = new C0285b(719, 575, 0, 719, 0, 575);
        this.f17552e = new a(0, c(), d(), e());
        this.f17553f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, d0 d0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) d0Var.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[RecognitionOptions.QR_CODE];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(d0 d0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int h11 = d0Var.h(2);
            if (h11 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (d0Var.g()) {
                    h10 = d0Var.h(3) + 3;
                } else {
                    if (d0Var.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int h12 = d0Var.h(2);
                        if (h12 == 0) {
                            z10 = true;
                        } else if (h12 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (h12 == 2) {
                            h10 = d0Var.h(4) + 12;
                        } else if (h12 != 3) {
                            z10 = z11;
                        } else {
                            h10 = d0Var.h(8) + 29;
                        }
                        h11 = 0;
                        i12 = 0;
                    }
                    h11 = 0;
                }
                z10 = z11;
                i12 = h10;
                h11 = d0Var.h(2);
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int h(d0 d0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int h11 = d0Var.h(4);
            if (h11 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (d0Var.g()) {
                if (d0Var.g()) {
                    int h12 = d0Var.h(2);
                    if (h12 == 0) {
                        z10 = z11;
                        i12 = 1;
                    } else if (h12 == 1) {
                        z10 = z11;
                        i12 = 2;
                    } else if (h12 == 2) {
                        h10 = d0Var.h(4) + 9;
                    } else if (h12 != 3) {
                        z10 = z11;
                        h11 = 0;
                        i12 = 0;
                    } else {
                        h10 = d0Var.h(8) + 25;
                    }
                    h11 = 0;
                } else {
                    h10 = d0Var.h(2) + 4;
                }
                z10 = z11;
                i12 = h10;
                h11 = d0Var.h(4);
            } else {
                int h13 = d0Var.h(3);
                if (h13 != 0) {
                    z10 = z11;
                    i12 = h13 + 2;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int i(d0 d0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int h11 = d0Var.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (d0Var.g()) {
                z10 = z11;
                h10 = d0Var.h(7);
                h11 = d0Var.h(8);
            } else {
                int h12 = d0Var.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    h10 = 0;
                }
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i12, i11, i12 + h10, i11 + 1, paint);
            }
            i12 += h10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        d0 d0Var = new d0(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (d0Var.b() != 0) {
            int h10 = d0Var.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                i13 = g(d0Var, iArr, bArr2, i13, i14, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f17545h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f17546i : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = g(d0Var, iArr, bArr2, i13, i14, paint, canvas);
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f17547j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(d0Var, iArr, bArr4, i13, i14, paint, canvas);
                        break;
                    case 18:
                        i13 = i(d0Var, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (h10) {
                            case 32:
                                bArr7 = a(4, 4, d0Var);
                                break;
                            case 33:
                                bArr5 = a(4, 8, d0Var);
                                break;
                            case 34:
                                bArr6 = a(16, 8, d0Var);
                                break;
                            default:
                                continue;
                        }
                }
                d0Var.c();
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f17558d : i10 == 2 ? aVar.f17557c : aVar.f17556b;
        j(cVar.f17567c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f17568d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(d0 d0Var, int i10) {
        int h10;
        int i11;
        int h11;
        int i12;
        int i13;
        int i14 = 8;
        int h12 = d0Var.h(8);
        d0Var.r(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i16 > 0) {
            int h13 = d0Var.h(i14);
            int h14 = d0Var.h(i14);
            int i17 = i16 - 2;
            int[] iArr = (h14 & RecognitionOptions.ITF) != 0 ? c10 : (h14 & 64) != 0 ? d10 : e10;
            if ((h14 & 1) != 0) {
                i12 = d0Var.h(i14);
                i13 = d0Var.h(i14);
                h10 = d0Var.h(i14);
                h11 = d0Var.h(i14);
                i11 = i17 - 4;
            } else {
                int h15 = d0Var.h(6) << i15;
                int h16 = d0Var.h(4) << 4;
                h10 = d0Var.h(4) << 4;
                i11 = i17 - 2;
                h11 = d0Var.h(i15) << 6;
                i12 = h15;
                i13 = h16;
            }
            if (i12 == 0) {
                h11 = 255;
                i13 = 0;
                h10 = 0;
            }
            double d11 = i12;
            double d12 = i13 - 128;
            double d13 = h10 - 128;
            iArr[h13] = f((byte) (255 - (h11 & 255)), r0.q((int) (d11 + (1.402d * d12)), 0, 255), r0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), r0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i16 = i11;
            h12 = h12;
            i14 = 8;
            i15 = 2;
        }
        return new a(h12, c10, d10, e10);
    }

    private static C0285b m(d0 d0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        d0Var.r(4);
        boolean g10 = d0Var.g();
        d0Var.r(3);
        int h10 = d0Var.h(16);
        int h11 = d0Var.h(16);
        if (g10) {
            int h12 = d0Var.h(16);
            int h13 = d0Var.h(16);
            int h14 = d0Var.h(16);
            i13 = d0Var.h(16);
            i12 = h13;
            i11 = h14;
            i10 = h12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = h10;
            i13 = h11;
        }
        return new C0285b(h10, h11, i10, i12, i11, i13);
    }

    private static c n(d0 d0Var) {
        byte[] bArr;
        int h10 = d0Var.h(16);
        d0Var.r(4);
        int h11 = d0Var.h(2);
        boolean g10 = d0Var.g();
        d0Var.r(1);
        byte[] bArr2 = r0.f26749f;
        if (h11 == 1) {
            d0Var.r(d0Var.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = d0Var.h(16);
            int h13 = d0Var.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                d0Var.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                d0Var.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(d0 d0Var, int i10) {
        int h10 = d0Var.h(8);
        int h11 = d0Var.h(4);
        int h12 = d0Var.h(2);
        d0Var.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = d0Var.h(8);
            d0Var.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(d0Var.h(16), d0Var.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(d0 d0Var, int i10) {
        int h10;
        int h11;
        int h12 = d0Var.h(8);
        d0Var.r(4);
        boolean g10 = d0Var.g();
        d0Var.r(3);
        int i11 = 16;
        int h13 = d0Var.h(16);
        int h14 = d0Var.h(16);
        int h15 = d0Var.h(3);
        int h16 = d0Var.h(3);
        int i12 = 2;
        d0Var.r(2);
        int h17 = d0Var.h(8);
        int h18 = d0Var.h(8);
        int h19 = d0Var.h(4);
        int h20 = d0Var.h(2);
        d0Var.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h21 = d0Var.h(i11);
            int h22 = d0Var.h(i12);
            int h23 = d0Var.h(i12);
            int h24 = d0Var.h(12);
            int i14 = h20;
            d0Var.r(4);
            int h25 = d0Var.h(12);
            i13 -= 6;
            if (h22 == 1 || h22 == 2) {
                i13 -= 2;
                h10 = d0Var.h(8);
                h11 = d0Var.h(8);
            } else {
                h10 = 0;
                h11 = 0;
            }
            sparseArray.put(h21, new g(h22, h23, h24, h25, h10, h11));
            h20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(h12, g10, h13, h14, h15, h16, h17, h18, h19, h20, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void q(d0 d0Var, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        a aVar2;
        c cVar;
        int h10 = d0Var.h(8);
        int h11 = d0Var.h(16);
        int h12 = d0Var.h(16);
        int d10 = d0Var.d() + h12;
        if (h12 * 8 > d0Var.b()) {
            s.i("DvbParser", "Data field length exceeds limit");
            d0Var.r(d0Var.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f17592a) {
                    d dVar = hVar.f17600i;
                    d o10 = o(d0Var, h12);
                    if (o10.f17571c == 0) {
                        if (dVar != null && dVar.f17570b != o10.f17570b) {
                            hVar.f17600i = o10;
                            break;
                        }
                    } else {
                        hVar.f17600i = o10;
                        hVar.f17594c.clear();
                        hVar.f17595d.clear();
                        hVar.f17596e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f17600i;
                if (h11 == hVar.f17592a && dVar2 != null) {
                    f p10 = p(d0Var, h12);
                    if (dVar2.f17571c == 0 && (fVar = hVar.f17594c.get(p10.f17575a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f17594c.put(p10.f17575a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 == hVar.f17592a) {
                    a l10 = l(d0Var, h12);
                    sparseArray = hVar.f17595d;
                    aVar = l10;
                } else if (h11 == hVar.f17593b) {
                    a l11 = l(d0Var, h12);
                    sparseArray = hVar.f17597f;
                    aVar = l11;
                }
                i10 = aVar.f17555a;
                aVar2 = aVar;
                sparseArray.put(i10, aVar2);
                break;
            case 19:
                if (h11 == hVar.f17592a) {
                    c n10 = n(d0Var);
                    sparseArray = hVar.f17596e;
                    cVar = n10;
                } else if (h11 == hVar.f17593b) {
                    c n11 = n(d0Var);
                    sparseArray = hVar.f17598g;
                    cVar = n11;
                }
                i10 = cVar.f17565a;
                aVar2 = cVar;
                sparseArray.put(i10, aVar2);
                break;
            case 20:
                if (h11 == hVar.f17592a) {
                    hVar.f17599h = m(d0Var);
                    break;
                }
                break;
        }
        d0Var.s(d10 - d0Var.d());
    }

    public List<g8.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        d0 d0Var = new d0(bArr, i10);
        while (d0Var.b() >= 48 && d0Var.h(8) == 15) {
            q(d0Var, this.f17553f);
        }
        h hVar = this.f17553f;
        d dVar = hVar.f17600i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0285b c0285b = hVar.f17599h;
        if (c0285b == null) {
            c0285b = this.f17551d;
        }
        Bitmap bitmap = this.f17554g;
        if (bitmap == null || c0285b.f17559a + 1 != bitmap.getWidth() || c0285b.f17560b + 1 != this.f17554g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0285b.f17559a + 1, c0285b.f17560b + 1, Bitmap.Config.ARGB_8888);
            this.f17554g = createBitmap;
            this.f17550c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f17572d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f17550c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f17553f.f17594c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f17573a + c0285b.f17561c;
            int i14 = valueAt.f17574b + c0285b.f17563e;
            this.f17550c.clipRect(i13, i14, Math.min(fVar.f17577c + i13, c0285b.f17562d), Math.min(fVar.f17578d + i14, c0285b.f17564f));
            a aVar = this.f17553f.f17595d.get(fVar.f17581g);
            if (aVar == null && (aVar = this.f17553f.f17597f.get(fVar.f17581g)) == null) {
                aVar = this.f17552e;
            }
            SparseArray<g> sparseArray3 = fVar.f17585k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f17553f.f17596e.get(keyAt);
                c cVar2 = cVar == null ? this.f17553f.f17598g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f17580f, valueAt2.f17588c + i13, i14 + valueAt2.f17589d, cVar2.f17566b ? null : this.f17548a, this.f17550c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f17576b) {
                int i16 = fVar.f17580f;
                this.f17549b.setColor(i16 == 3 ? aVar.f17558d[fVar.f17582h] : i16 == 2 ? aVar.f17557c[fVar.f17583i] : aVar.f17556b[fVar.f17584j]);
                this.f17550c.drawRect(i13, i14, fVar.f17577c + i13, fVar.f17578d + i14, this.f17549b);
            }
            arrayList.add(new b.C0262b().f(Bitmap.createBitmap(this.f17554g, i13, i14, fVar.f17577c, fVar.f17578d)).k(i13 / c0285b.f17559a).l(0).h(i14 / c0285b.f17560b, 0).i(0).n(fVar.f17577c / c0285b.f17559a).g(fVar.f17578d / c0285b.f17560b).a());
            this.f17550c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f17550c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f17553f.a();
    }
}
