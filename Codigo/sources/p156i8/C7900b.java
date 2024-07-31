package p156i8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120g8.C7484b;
import p363t8.C11144d0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: i8.b */
/* loaded from: classes.dex */
final class C7900b {

    /* renamed from: h */
    private static final byte[] f19206h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f19207i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f19208j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f19209a;

    /* renamed from: b */
    private final Paint f19210b;

    /* renamed from: c */
    private final Canvas f19211c;

    /* renamed from: d */
    private final b f19212d;

    /* renamed from: e */
    private final a f19213e;

    /* renamed from: f */
    private final h f19214f;

    /* renamed from: g */
    private Bitmap f19215g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f19216a;

        /* renamed from: b */
        public final int[] f19217b;

        /* renamed from: c */
        public final int[] f19218c;

        /* renamed from: d */
        public final int[] f19219d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f19216a = i10;
            this.f19217b = iArr;
            this.f19218c = iArr2;
            this.f19219d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f19220a;

        /* renamed from: b */
        public final int f19221b;

        /* renamed from: c */
        public final int f19222c;

        /* renamed from: d */
        public final int f19223d;

        /* renamed from: e */
        public final int f19224e;

        /* renamed from: f */
        public final int f19225f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f19220a = i10;
            this.f19221b = i11;
            this.f19222c = i12;
            this.f19223d = i13;
            this.f19224e = i14;
            this.f19225f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f19226a;

        /* renamed from: b */
        public final boolean f19227b;

        /* renamed from: c */
        public final byte[] f19228c;

        /* renamed from: d */
        public final byte[] f19229d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f19226a = i10;
            this.f19227b = z10;
            this.f19228c = bArr;
            this.f19229d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f19230a;

        /* renamed from: b */
        public final int f19231b;

        /* renamed from: c */
        public final int f19232c;

        /* renamed from: d */
        public final SparseArray<e> f19233d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f19230a = i10;
            this.f19231b = i11;
            this.f19232c = i12;
            this.f19233d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final int f19234a;

        /* renamed from: b */
        public final int f19235b;

        public e(int i10, int i11) {
            this.f19234a = i10;
            this.f19235b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final int f19236a;

        /* renamed from: b */
        public final boolean f19237b;

        /* renamed from: c */
        public final int f19238c;

        /* renamed from: d */
        public final int f19239d;

        /* renamed from: e */
        public final int f19240e;

        /* renamed from: f */
        public final int f19241f;

        /* renamed from: g */
        public final int f19242g;

        /* renamed from: h */
        public final int f19243h;

        /* renamed from: i */
        public final int f19244i;

        /* renamed from: j */
        public final int f19245j;

        /* renamed from: k */
        public final SparseArray<g> f19246k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f19236a = i10;
            this.f19237b = z10;
            this.f19238c = i11;
            this.f19239d = i12;
            this.f19240e = i13;
            this.f19241f = i14;
            this.f19242g = i15;
            this.f19243h = i16;
            this.f19244i = i17;
            this.f19245j = i18;
            this.f19246k = sparseArray;
        }

        /* renamed from: a */
        public void m24378a(f fVar) {
            SparseArray<g> sparseArray = fVar.f19246k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f19246k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final int f19247a;

        /* renamed from: b */
        public final int f19248b;

        /* renamed from: c */
        public final int f19249c;

        /* renamed from: d */
        public final int f19250d;

        /* renamed from: e */
        public final int f19251e;

        /* renamed from: f */
        public final int f19252f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f19247a = i10;
            this.f19248b = i11;
            this.f19249c = i12;
            this.f19250d = i13;
            this.f19251e = i14;
            this.f19252f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.b$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final int f19253a;

        /* renamed from: b */
        public final int f19254b;

        /* renamed from: c */
        public final SparseArray<f> f19255c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<a> f19256d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<c> f19257e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<a> f19258f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<c> f19259g = new SparseArray<>();

        /* renamed from: h */
        public b f19260h;

        /* renamed from: i */
        public d f19261i;

        public h(int i10, int i11) {
            this.f19253a = i10;
            this.f19254b = i11;
        }

        /* renamed from: a */
        public void m24379a() {
            this.f19255c.clear();
            this.f19256d.clear();
            this.f19257e.clear();
            this.f19258f.clear();
            this.f19259g.clear();
            this.f19260h = null;
            this.f19261i = null;
        }
    }

    public C7900b(int i10, int i11) {
        Paint paint = new Paint();
        this.f19209a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f19210b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f19211c = new Canvas();
        this.f19212d = new b(719, 575, 0, 719, 0, 575);
        this.f19213e = new a(0, m24361c(), m24362d(), m24363e());
        this.f19214f = new h(i10, i11);
    }

    /* renamed from: a */
    private static byte[] m24360a(int i10, int i11, C11144d0 c11144d0) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c11144d0.m34632h(i11);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m24361c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m24362d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = m24364f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = m24364f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m24363e() {
        int[] iArr = new int[RecognitionOptions.QR_CODE];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = m24364f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = m24364f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = m24364f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = m24364f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = m24364f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m24364f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* renamed from: g */
    private static int m24365g(C11144d0 c11144d0, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int m34632h;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int m34632h2 = c11144d0.m34632h(2);
            if (m34632h2 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (c11144d0.m34631g()) {
                    m34632h = c11144d0.m34632h(3) + 3;
                } else {
                    if (c11144d0.m34631g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int m34632h3 = c11144d0.m34632h(2);
                        if (m34632h3 == 0) {
                            z10 = true;
                        } else if (m34632h3 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (m34632h3 == 2) {
                            m34632h = c11144d0.m34632h(4) + 12;
                        } else if (m34632h3 != 3) {
                            z10 = z11;
                        } else {
                            m34632h = c11144d0.m34632h(8) + 29;
                        }
                        m34632h2 = 0;
                        i12 = 0;
                    }
                    m34632h2 = 0;
                }
                z10 = z11;
                i12 = m34632h;
                m34632h2 = c11144d0.m34632h(2);
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    m34632h2 = bArr[m34632h2];
                }
                paint.setColor(iArr[m34632h2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    /* renamed from: h */
    private static int m24366h(C11144d0 c11144d0, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int m34632h;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int m34632h2 = c11144d0.m34632h(4);
            if (m34632h2 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (c11144d0.m34631g()) {
                if (c11144d0.m34631g()) {
                    int m34632h3 = c11144d0.m34632h(2);
                    if (m34632h3 == 0) {
                        z10 = z11;
                        i12 = 1;
                    } else if (m34632h3 == 1) {
                        z10 = z11;
                        i12 = 2;
                    } else if (m34632h3 == 2) {
                        m34632h = c11144d0.m34632h(4) + 9;
                    } else if (m34632h3 != 3) {
                        z10 = z11;
                        m34632h2 = 0;
                        i12 = 0;
                    } else {
                        m34632h = c11144d0.m34632h(8) + 25;
                    }
                    m34632h2 = 0;
                } else {
                    m34632h = c11144d0.m34632h(2) + 4;
                }
                z10 = z11;
                i12 = m34632h;
                m34632h2 = c11144d0.m34632h(4);
            } else {
                int m34632h4 = c11144d0.m34632h(3);
                if (m34632h4 != 0) {
                    z10 = z11;
                    i12 = m34632h4 + 2;
                    m34632h2 = 0;
                } else {
                    z10 = true;
                    m34632h2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    m34632h2 = bArr[m34632h2];
                }
                paint.setColor(iArr[m34632h2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    /* renamed from: i */
    private static int m24367i(C11144d0 c11144d0, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int m34632h;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int m34632h2 = c11144d0.m34632h(8);
            if (m34632h2 != 0) {
                z10 = z11;
                m34632h = 1;
            } else if (c11144d0.m34631g()) {
                z10 = z11;
                m34632h = c11144d0.m34632h(7);
                m34632h2 = c11144d0.m34632h(8);
            } else {
                int m34632h3 = c11144d0.m34632h(7);
                if (m34632h3 != 0) {
                    z10 = z11;
                    m34632h = m34632h3;
                    m34632h2 = 0;
                } else {
                    z10 = true;
                    m34632h2 = 0;
                    m34632h = 0;
                }
            }
            if (m34632h != 0 && paint != null) {
                if (bArr != null) {
                    m34632h2 = bArr[m34632h2];
                }
                paint.setColor(iArr[m34632h2]);
                canvas.drawRect(i12, i11, i12 + m34632h, i11 + 1, paint);
            }
            i12 += m34632h;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    /* renamed from: j */
    private static void m24368j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C11144d0 c11144d0 = new C11144d0(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (c11144d0.m34626b() != 0) {
            int m34632h = c11144d0.m34632h(8);
            if (m34632h != 240) {
                switch (m34632h) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                i13 = m24365g(c11144d0, iArr, bArr2, i13, i14, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f19206h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f19207i : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = m24365g(c11144d0, iArr, bArr2, i13, i14, paint, canvas);
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f19208j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = m24366h(c11144d0, iArr, bArr4, i13, i14, paint, canvas);
                        break;
                    case 18:
                        i13 = m24367i(c11144d0, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (m34632h) {
                            case 32:
                                bArr7 = m24360a(4, 4, c11144d0);
                                break;
                            case 33:
                                bArr5 = m24360a(4, 8, c11144d0);
                                break;
                            case 34:
                                bArr6 = m24360a(16, 8, c11144d0);
                                break;
                            default:
                                continue;
                        }
                }
                c11144d0.m34627c();
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    /* renamed from: k */
    private static void m24369k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f19219d : i10 == 2 ? aVar.f19218c : aVar.f19217b;
        m24368j(cVar.f19228c, iArr, i10, i11, i12, paint, canvas);
        m24368j(cVar.f19229d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    /* renamed from: l */
    private static a m24370l(C11144d0 c11144d0, int i10) {
        int m34632h;
        int i11;
        int m34632h2;
        int i12;
        int i13;
        int i14 = 8;
        int m34632h3 = c11144d0.m34632h(8);
        c11144d0.m34642r(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] m24361c = m24361c();
        int[] m24362d = m24362d();
        int[] m24363e = m24363e();
        while (i16 > 0) {
            int m34632h4 = c11144d0.m34632h(i14);
            int m34632h5 = c11144d0.m34632h(i14);
            int i17 = i16 - 2;
            int[] iArr = (m34632h5 & RecognitionOptions.ITF) != 0 ? m24361c : (m34632h5 & 64) != 0 ? m24362d : m24363e;
            if ((m34632h5 & 1) != 0) {
                i12 = c11144d0.m34632h(i14);
                i13 = c11144d0.m34632h(i14);
                m34632h = c11144d0.m34632h(i14);
                m34632h2 = c11144d0.m34632h(i14);
                i11 = i17 - 4;
            } else {
                int m34632h6 = c11144d0.m34632h(6) << i15;
                int m34632h7 = c11144d0.m34632h(4) << 4;
                m34632h = c11144d0.m34632h(4) << 4;
                i11 = i17 - 2;
                m34632h2 = c11144d0.m34632h(i15) << 6;
                i12 = m34632h6;
                i13 = m34632h7;
            }
            if (i12 == 0) {
                m34632h2 = 255;
                i13 = 0;
                m34632h = 0;
            }
            double d10 = i12;
            double d11 = i13 - 128;
            double d12 = m34632h - 128;
            iArr[m34632h4] = m24364f((byte) (255 - (m34632h2 & 255)), C11172r0.m34942q((int) (d10 + (1.402d * d11)), 0, 255), C11172r0.m34942q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), C11172r0.m34942q((int) (d10 + (d12 * 1.772d)), 0, 255));
            i16 = i11;
            m34632h3 = m34632h3;
            i14 = 8;
            i15 = 2;
        }
        return new a(m34632h3, m24361c, m24362d, m24363e);
    }

    /* renamed from: m */
    private static b m24371m(C11144d0 c11144d0) {
        int i10;
        int i11;
        int i12;
        int i13;
        c11144d0.m34642r(4);
        boolean m34631g = c11144d0.m34631g();
        c11144d0.m34642r(3);
        int m34632h = c11144d0.m34632h(16);
        int m34632h2 = c11144d0.m34632h(16);
        if (m34631g) {
            int m34632h3 = c11144d0.m34632h(16);
            int m34632h4 = c11144d0.m34632h(16);
            int m34632h5 = c11144d0.m34632h(16);
            i13 = c11144d0.m34632h(16);
            i12 = m34632h4;
            i11 = m34632h5;
            i10 = m34632h3;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = m34632h;
            i13 = m34632h2;
        }
        return new b(m34632h, m34632h2, i10, i12, i11, i13);
    }

    /* renamed from: n */
    private static c m24372n(C11144d0 c11144d0) {
        byte[] bArr;
        int m34632h = c11144d0.m34632h(16);
        c11144d0.m34642r(4);
        int m34632h2 = c11144d0.m34632h(2);
        boolean m34631g = c11144d0.m34631g();
        c11144d0.m34642r(1);
        byte[] bArr2 = C11172r0.f29045f;
        if (m34632h2 == 1) {
            c11144d0.m34642r(c11144d0.m34632h(8) * 16);
        } else if (m34632h2 == 0) {
            int m34632h3 = c11144d0.m34632h(16);
            int m34632h4 = c11144d0.m34632h(16);
            if (m34632h3 > 0) {
                bArr2 = new byte[m34632h3];
                c11144d0.m34635k(bArr2, 0, m34632h3);
            }
            if (m34632h4 > 0) {
                bArr = new byte[m34632h4];
                c11144d0.m34635k(bArr, 0, m34632h4);
                return new c(m34632h, m34631g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(m34632h, m34631g, bArr2, bArr);
    }

    /* renamed from: o */
    private static d m24373o(C11144d0 c11144d0, int i10) {
        int m34632h = c11144d0.m34632h(8);
        int m34632h2 = c11144d0.m34632h(4);
        int m34632h3 = c11144d0.m34632h(2);
        c11144d0.m34642r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int m34632h4 = c11144d0.m34632h(8);
            c11144d0.m34642r(8);
            i11 -= 6;
            sparseArray.put(m34632h4, new e(c11144d0.m34632h(16), c11144d0.m34632h(16)));
        }
        return new d(m34632h, m34632h2, m34632h3, sparseArray);
    }

    /* renamed from: p */
    private static f m24374p(C11144d0 c11144d0, int i10) {
        int m34632h;
        int m34632h2;
        int m34632h3 = c11144d0.m34632h(8);
        c11144d0.m34642r(4);
        boolean m34631g = c11144d0.m34631g();
        c11144d0.m34642r(3);
        int i11 = 16;
        int m34632h4 = c11144d0.m34632h(16);
        int m34632h5 = c11144d0.m34632h(16);
        int m34632h6 = c11144d0.m34632h(3);
        int m34632h7 = c11144d0.m34632h(3);
        int i12 = 2;
        c11144d0.m34642r(2);
        int m34632h8 = c11144d0.m34632h(8);
        int m34632h9 = c11144d0.m34632h(8);
        int m34632h10 = c11144d0.m34632h(4);
        int m34632h11 = c11144d0.m34632h(2);
        c11144d0.m34642r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int m34632h12 = c11144d0.m34632h(i11);
            int m34632h13 = c11144d0.m34632h(i12);
            int m34632h14 = c11144d0.m34632h(i12);
            int m34632h15 = c11144d0.m34632h(12);
            int i14 = m34632h11;
            c11144d0.m34642r(4);
            int m34632h16 = c11144d0.m34632h(12);
            i13 -= 6;
            if (m34632h13 == 1 || m34632h13 == 2) {
                i13 -= 2;
                m34632h = c11144d0.m34632h(8);
                m34632h2 = c11144d0.m34632h(8);
            } else {
                m34632h = 0;
                m34632h2 = 0;
            }
            sparseArray.put(m34632h12, new g(m34632h13, m34632h14, m34632h15, m34632h16, m34632h, m34632h2));
            m34632h11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(m34632h3, m34631g, m34632h4, m34632h5, m34632h6, m34632h7, m34632h8, m34632h9, m34632h10, m34632h11, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    private static void m24375q(C11144d0 c11144d0, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        a aVar2;
        c cVar;
        int m34632h = c11144d0.m34632h(8);
        int m34632h2 = c11144d0.m34632h(16);
        int m34632h3 = c11144d0.m34632h(16);
        int m34628d = c11144d0.m34628d() + m34632h3;
        if (m34632h3 * 8 > c11144d0.m34626b()) {
            C11173s.m34970i("DvbParser", "Data field length exceeds limit");
            c11144d0.m34642r(c11144d0.m34626b());
            return;
        }
        switch (m34632h) {
            case 16:
                if (m34632h2 == hVar.f19253a) {
                    d dVar = hVar.f19261i;
                    d m24373o = m24373o(c11144d0, m34632h3);
                    if (m24373o.f19232c == 0) {
                        if (dVar != null && dVar.f19231b != m24373o.f19231b) {
                            hVar.f19261i = m24373o;
                            break;
                        }
                    } else {
                        hVar.f19261i = m24373o;
                        hVar.f19255c.clear();
                        hVar.f19256d.clear();
                        hVar.f19257e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f19261i;
                if (m34632h2 == hVar.f19253a && dVar2 != null) {
                    f m24374p = m24374p(c11144d0, m34632h3);
                    if (dVar2.f19232c == 0 && (fVar = hVar.f19255c.get(m24374p.f19236a)) != null) {
                        m24374p.m24378a(fVar);
                    }
                    hVar.f19255c.put(m24374p.f19236a, m24374p);
                    break;
                }
                break;
            case 18:
                if (m34632h2 == hVar.f19253a) {
                    a m24370l = m24370l(c11144d0, m34632h3);
                    sparseArray = hVar.f19256d;
                    aVar = m24370l;
                } else if (m34632h2 == hVar.f19254b) {
                    a m24370l2 = m24370l(c11144d0, m34632h3);
                    sparseArray = hVar.f19258f;
                    aVar = m24370l2;
                }
                i10 = aVar.f19216a;
                aVar2 = aVar;
                sparseArray.put(i10, aVar2);
                break;
            case 19:
                if (m34632h2 == hVar.f19253a) {
                    c m24372n = m24372n(c11144d0);
                    sparseArray = hVar.f19257e;
                    cVar = m24372n;
                } else if (m34632h2 == hVar.f19254b) {
                    c m24372n2 = m24372n(c11144d0);
                    sparseArray = hVar.f19259g;
                    cVar = m24372n2;
                }
                i10 = cVar.f19226a;
                aVar2 = cVar;
                sparseArray.put(i10, aVar2);
                break;
            case 20:
                if (m34632h2 == hVar.f19253a) {
                    hVar.f19260h = m24371m(c11144d0);
                    break;
                }
                break;
        }
        c11144d0.m34643s(m34628d - c11144d0.m34628d());
    }

    /* renamed from: b */
    public List<C7484b> m24376b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        C11144d0 c11144d0 = new C11144d0(bArr, i10);
        while (c11144d0.m34626b() >= 48 && c11144d0.m34632h(8) == 15) {
            m24375q(c11144d0, this.f19214f);
        }
        h hVar = this.f19214f;
        d dVar = hVar.f19261i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f19260h;
        if (bVar == null) {
            bVar = this.f19212d;
        }
        Bitmap bitmap = this.f19215g;
        if (bitmap == null || bVar.f19220a + 1 != bitmap.getWidth() || bVar.f19221b + 1 != this.f19215g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f19220a + 1, bVar.f19221b + 1, Bitmap.Config.ARGB_8888);
            this.f19215g = createBitmap;
            this.f19211c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f19233d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f19211c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f19214f.f19255c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f19234a + bVar.f19222c;
            int i14 = valueAt.f19235b + bVar.f19224e;
            this.f19211c.clipRect(i13, i14, Math.min(fVar.f19238c + i13, bVar.f19223d), Math.min(fVar.f19239d + i14, bVar.f19225f));
            a aVar = this.f19214f.f19256d.get(fVar.f19242g);
            if (aVar == null && (aVar = this.f19214f.f19258f.get(fVar.f19242g)) == null) {
                aVar = this.f19213e;
            }
            SparseArray<g> sparseArray3 = fVar.f19246k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f19214f.f19257e.get(keyAt);
                c cVar2 = cVar == null ? this.f19214f.f19259g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    m24369k(cVar2, aVar, fVar.f19241f, valueAt2.f19249c + i13, i14 + valueAt2.f19250d, cVar2.f19227b ? null : this.f19209a, this.f19211c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f19237b) {
                int i16 = fVar.f19241f;
                this.f19210b.setColor(i16 == 3 ? aVar.f19219d[fVar.f19243h] : i16 == 2 ? aVar.f19218c[fVar.f19244i] : aVar.f19217b[fVar.f19245j]);
                this.f19211c.drawRect(i13, i14, fVar.f19238c + i13, fVar.f19239d + i14, this.f19210b);
            }
            arrayList.add(new C7484b.b().m22769f(Bitmap.createBitmap(this.f19215g, i13, i14, fVar.f19238c, fVar.f19239d)).m22774k(i13 / bVar.f19220a).m22775l(0).m22771h(i14 / bVar.f19221b, 0).m22772i(0).m22777n(fVar.f19238c / bVar.f19220a).m22770g(fVar.f19239d / bVar.f19221b).m22764a());
            this.f19211c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f19211c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void m24377r() {
        this.f19214f.m24379a();
    }
}
