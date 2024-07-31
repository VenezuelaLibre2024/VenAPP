package p115g3;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p115g3.InterfaceC7442a;

/* renamed from: g3.e */
/* loaded from: classes.dex */
public class C7446e implements InterfaceC7442a {

    /* renamed from: u */
    private static final String f17327u = "e";

    /* renamed from: a */
    private int[] f17328a;

    /* renamed from: b */
    private final int[] f17329b;

    /* renamed from: c */
    private final InterfaceC7442a.a f17330c;

    /* renamed from: d */
    private ByteBuffer f17331d;

    /* renamed from: e */
    private byte[] f17332e;

    /* renamed from: f */
    private short[] f17333f;

    /* renamed from: g */
    private byte[] f17334g;

    /* renamed from: h */
    private byte[] f17335h;

    /* renamed from: i */
    private byte[] f17336i;

    /* renamed from: j */
    private int[] f17337j;

    /* renamed from: k */
    private int f17338k;

    /* renamed from: l */
    private C7444c f17339l;

    /* renamed from: m */
    private Bitmap f17340m;

    /* renamed from: n */
    private boolean f17341n;

    /* renamed from: o */
    private int f17342o;

    /* renamed from: p */
    private int f17343p;

    /* renamed from: q */
    private int f17344q;

    /* renamed from: r */
    private int f17345r;

    /* renamed from: s */
    private Boolean f17346s;

    /* renamed from: t */
    private Bitmap.Config f17347t;

    public C7446e(InterfaceC7442a.a aVar) {
        this.f17329b = new int[RecognitionOptions.QR_CODE];
        this.f17347t = Bitmap.Config.ARGB_8888;
        this.f17330c = aVar;
        this.f17339l = new C7444c();
    }

    public C7446e(InterfaceC7442a.a aVar, C7444c c7444c, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        m22491q(c7444c, byteBuffer, i10);
    }

    /* renamed from: i */
    private int m22482i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f17343p + i10; i18++) {
            byte[] bArr = this.f17336i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f17328a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f17343p + i20; i21++) {
            byte[] bArr2 = this.f17336i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f17328a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    /* renamed from: j */
    private void m22483j(C7443b c7443b) {
        Boolean bool;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f17337j;
        int i15 = c7443b.f17302d;
        int i16 = this.f17343p;
        int i17 = i15 / i16;
        int i18 = c7443b.f17300b / i16;
        int i19 = c7443b.f17301c / i16;
        int i20 = c7443b.f17299a / i16;
        boolean z10 = this.f17338k == 0;
        int i21 = this.f17345r;
        int i22 = this.f17344q;
        byte[] bArr = this.f17336i;
        int[] iArr2 = this.f17328a;
        Boolean bool2 = this.f17346s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (true) {
            bool = bool2;
            if (i25 >= i17) {
                break;
            }
            if (c7443b.f17303e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 == 2) {
                        i24 = 4;
                        i26 = i27;
                    } else if (i27 != 3) {
                        i26 = i27;
                        if (i27 == 4) {
                            i24 = 1;
                            i23 = 2;
                        }
                    } else {
                        i23 = 4;
                        i26 = i27;
                        i24 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * c7443b.f17301c;
                if (z11) {
                    int i34 = i30;
                    while (true) {
                        i13 = i18;
                        if (i34 >= i31) {
                            break;
                        }
                        int i35 = iArr2[bArr[i33] & 255];
                        if (i35 != 0) {
                            iArr[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i13;
                    }
                } else {
                    i13 = i18;
                    int i36 = ((i31 - i30) * i16) + i33;
                    int i37 = i30;
                    while (true) {
                        i14 = i19;
                        if (i37 < i31) {
                            int m22482i = m22482i(i33, i36, c7443b.f17301c);
                            if (m22482i != 0) {
                                iArr[i37] = m22482i;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i33 += i16;
                            i37++;
                            i19 = i14;
                        }
                    }
                    bool2 = bool;
                    i25++;
                    i18 = i13;
                    i17 = i10;
                    i19 = i14;
                    i24 = i12;
                }
            } else {
                i12 = i11;
                i13 = i18;
            }
            i14 = i19;
            bool2 = bool;
            i25++;
            i18 = i13;
            i17 = i10;
            i19 = i14;
            i24 = i12;
        }
        if (this.f17346s == null) {
            this.f17346s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: k */
    private void m22484k(C7443b c7443b) {
        C7443b c7443b2 = c7443b;
        int[] iArr = this.f17337j;
        int i10 = c7443b2.f17302d;
        int i11 = c7443b2.f17300b;
        int i12 = c7443b2.f17301c;
        int i13 = c7443b2.f17299a;
        boolean z10 = this.f17338k == 0;
        int i14 = this.f17345r;
        byte[] bArr = this.f17336i;
        int[] iArr2 = this.f17328a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = c7443b2.f17301c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            c7443b2 = c7443b;
        }
        Boolean bool = this.f17346s;
        this.f17346s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f17346s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* renamed from: l */
    private void m22485l(C7443b c7443b) {
        int i10;
        int i11;
        short s10;
        C7446e c7446e = this;
        if (c7443b != null) {
            c7446e.f17331d.position(c7443b.f17308j);
        }
        if (c7443b == null) {
            C7444c c7444c = c7446e.f17339l;
            i10 = c7444c.f17315f;
            i11 = c7444c.f17316g;
        } else {
            i10 = c7443b.f17301c;
            i11 = c7443b.f17302d;
        }
        int i12 = i10 * i11;
        byte[] bArr = c7446e.f17336i;
        if (bArr == null || bArr.length < i12) {
            c7446e.f17336i = c7446e.f17330c.mo22455b(i12);
        }
        byte[] bArr2 = c7446e.f17336i;
        if (c7446e.f17333f == null) {
            c7446e.f17333f = new short[RecognitionOptions.AZTEC];
        }
        short[] sArr = c7446e.f17333f;
        if (c7446e.f17334g == null) {
            c7446e.f17334g = new byte[RecognitionOptions.AZTEC];
        }
        byte[] bArr3 = c7446e.f17334g;
        if (c7446e.f17335h == null) {
            c7446e.f17335h = new byte[4097];
        }
        byte[] bArr4 = c7446e.f17335h;
        int m22488p = m22488p();
        int i13 = 1 << m22488p;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = m22488p + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = c7446e.f17332e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = m22487o();
                if (i23 <= 0) {
                    c7446e.f17342o = 3;
                    break;
                }
                i24 = 0;
            }
            i26 += (bArr5[i24] & 255) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i21;
            int i33 = i20;
            int i34 = i30;
            int i35 = i16;
            int i36 = i28;
            while (true) {
                if (i31 < i33) {
                    i30 = i34;
                    i21 = i32;
                    i25 = i31;
                    c7446e = this;
                    i28 = i36;
                    i16 = i35;
                    i20 = i33;
                    break;
                }
                int i37 = i15;
                int i38 = i26 & i22;
                i26 >>= i33;
                i31 -= i33;
                if (i38 == i13) {
                    i22 = i17;
                    i33 = i35;
                    i32 = i37;
                    i15 = i32;
                    i34 = -1;
                } else {
                    if (i38 == i14) {
                        i25 = i31;
                        i28 = i36;
                        i21 = i32;
                        i16 = i35;
                        i15 = i37;
                        i30 = i34;
                        i20 = i33;
                        c7446e = this;
                        break;
                    }
                    if (i34 == -1) {
                        bArr2[i27] = bArr3[i38];
                        i27++;
                        i18++;
                        i34 = i38;
                        i36 = i34;
                        i15 = i37;
                        i31 = i31;
                    } else {
                        if (i38 >= i32) {
                            bArr4[i29] = (byte) i36;
                            i29++;
                            s10 = i34;
                        } else {
                            s10 = i38;
                        }
                        while (s10 >= i13) {
                            bArr4[i29] = bArr3[s10];
                            i29++;
                            s10 = sArr[s10];
                        }
                        i36 = bArr3[s10] & 255;
                        byte b10 = (byte) i36;
                        bArr2[i27] = b10;
                        while (true) {
                            i27++;
                            i18++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr2[i27] = bArr4[i29];
                        }
                        byte[] bArr6 = bArr4;
                        if (i32 < 4096) {
                            sArr[i32] = (short) i34;
                            bArr3[i32] = b10;
                            i32++;
                            if ((i32 & i22) == 0 && i32 < 4096) {
                                i33++;
                                i22 += i32;
                            }
                        }
                        i34 = i38;
                        i15 = i37;
                        i31 = i31;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i27, i12, (byte) 0);
    }

    /* renamed from: n */
    private Bitmap m22486n() {
        Boolean bool = this.f17346s;
        Bitmap mo22456c = this.f17330c.mo22456c(this.f17345r, this.f17344q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f17347t);
        mo22456c.setHasAlpha(true);
        return mo22456c;
    }

    /* renamed from: o */
    private int m22487o() {
        int m22488p = m22488p();
        if (m22488p <= 0) {
            return m22488p;
        }
        ByteBuffer byteBuffer = this.f17331d;
        byteBuffer.get(this.f17332e, 0, Math.min(m22488p, byteBuffer.remaining()));
        return m22488p;
    }

    /* renamed from: p */
    private int m22488p() {
        return this.f17331d.get() & 255;
    }

    /* renamed from: r */
    private Bitmap m22489r(C7443b c7443b, C7443b c7443b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f17337j;
        int i12 = 0;
        if (c7443b2 == null) {
            Bitmap bitmap2 = this.f17340m;
            if (bitmap2 != null) {
                this.f17330c.mo22454a(bitmap2);
            }
            this.f17340m = null;
            Arrays.fill(iArr, 0);
        }
        if (c7443b2 != null && c7443b2.f17305g == 3 && this.f17340m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c7443b2 != null && (i11 = c7443b2.f17305g) > 0) {
            if (i11 == 2) {
                if (!c7443b.f17304f) {
                    C7444c c7444c = this.f17339l;
                    int i13 = c7444c.f17321l;
                    if (c7443b.f17309k == null || c7444c.f17319j != c7443b.f17306h) {
                        i12 = i13;
                    }
                }
                int i14 = c7443b2.f17302d;
                int i15 = this.f17343p;
                int i16 = i14 / i15;
                int i17 = c7443b2.f17300b / i15;
                int i18 = c7443b2.f17301c / i15;
                int i19 = c7443b2.f17299a / i15;
                int i20 = this.f17345r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f17345r;
                }
            } else if (i11 == 3 && (bitmap = this.f17340m) != null) {
                int i25 = this.f17345r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f17344q);
            }
        }
        m22485l(c7443b);
        if (c7443b.f17303e || this.f17343p != 1) {
            m22483j(c7443b);
        } else {
            m22484k(c7443b);
        }
        if (this.f17341n && ((i10 = c7443b.f17305g) == 0 || i10 == 1)) {
            if (this.f17340m == null) {
                this.f17340m = m22486n();
            }
            Bitmap bitmap3 = this.f17340m;
            int i26 = this.f17345r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f17344q);
        }
        Bitmap m22486n = m22486n();
        int i27 = this.f17345r;
        m22486n.setPixels(iArr, 0, i27, 0, 0, i27, this.f17344q);
        return m22486n;
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: a */
    public synchronized Bitmap mo22446a() {
        if (this.f17339l.f17312c <= 0 || this.f17338k < 0) {
            String str = f17327u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f17339l.f17312c + ", framePointer=" + this.f17338k);
            }
            this.f17342o = 1;
        }
        int i10 = this.f17342o;
        if (i10 != 1 && i10 != 2) {
            this.f17342o = 0;
            if (this.f17332e == null) {
                this.f17332e = this.f17330c.mo22455b(255);
            }
            C7443b c7443b = this.f17339l.f17314e.get(this.f17338k);
            int i11 = this.f17338k - 1;
            C7443b c7443b2 = i11 >= 0 ? this.f17339l.f17314e.get(i11) : null;
            int[] iArr = c7443b.f17309k;
            if (iArr == null) {
                iArr = this.f17339l.f17310a;
            }
            this.f17328a = iArr;
            if (iArr == null) {
                String str2 = f17327u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f17338k);
                }
                this.f17342o = 1;
                return null;
            }
            if (c7443b.f17304f) {
                System.arraycopy(iArr, 0, this.f17329b, 0, iArr.length);
                int[] iArr2 = this.f17329b;
                this.f17328a = iArr2;
                iArr2[c7443b.f17306h] = 0;
                if (c7443b.f17305g == 2 && this.f17338k == 0) {
                    this.f17346s = Boolean.TRUE;
                }
            }
            return m22489r(c7443b, c7443b2);
        }
        String str3 = f17327u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f17342o);
        }
        return null;
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: b */
    public void mo22447b() {
        this.f17338k = (this.f17338k + 1) % this.f17339l.f17312c;
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: c */
    public int mo22448c() {
        return this.f17339l.f17312c;
    }

    @Override // p115g3.InterfaceC7442a
    public void clear() {
        this.f17339l = null;
        byte[] bArr = this.f17336i;
        if (bArr != null) {
            this.f17330c.mo22458e(bArr);
        }
        int[] iArr = this.f17337j;
        if (iArr != null) {
            this.f17330c.mo22459f(iArr);
        }
        Bitmap bitmap = this.f17340m;
        if (bitmap != null) {
            this.f17330c.mo22454a(bitmap);
        }
        this.f17340m = null;
        this.f17331d = null;
        this.f17346s = null;
        byte[] bArr2 = this.f17332e;
        if (bArr2 != null) {
            this.f17330c.mo22458e(bArr2);
        }
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: d */
    public void mo22449d(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f17347t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: e */
    public int mo22450e() {
        int i10;
        if (this.f17339l.f17312c <= 0 || (i10 = this.f17338k) < 0) {
            return 0;
        }
        return m22490m(i10);
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: f */
    public void mo22451f() {
        this.f17338k = -1;
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: g */
    public int mo22452g() {
        return this.f17338k;
    }

    @Override // p115g3.InterfaceC7442a
    public ByteBuffer getData() {
        return this.f17331d;
    }

    @Override // p115g3.InterfaceC7442a
    /* renamed from: h */
    public int mo22453h() {
        return this.f17331d.limit() + this.f17336i.length + (this.f17337j.length * 4);
    }

    /* renamed from: m */
    public int m22490m(int i10) {
        if (i10 >= 0) {
            C7444c c7444c = this.f17339l;
            if (i10 < c7444c.f17312c) {
                return c7444c.f17314e.get(i10).f17307i;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public synchronized void m22491q(C7444c c7444c, ByteBuffer byteBuffer, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
        int highestOneBit = Integer.highestOneBit(i10);
        this.f17342o = 0;
        this.f17339l = c7444c;
        this.f17338k = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17331d = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f17331d.order(ByteOrder.LITTLE_ENDIAN);
        this.f17341n = false;
        Iterator<C7443b> it = c7444c.f17314e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f17305g == 3) {
                this.f17341n = true;
                break;
            }
        }
        this.f17343p = highestOneBit;
        int i11 = c7444c.f17315f;
        this.f17345r = i11 / highestOneBit;
        int i12 = c7444c.f17316g;
        this.f17344q = i12 / highestOneBit;
        this.f17336i = this.f17330c.mo22455b(i11 * i12);
        this.f17337j = this.f17330c.mo22457d(this.f17345r * this.f17344q);
    }
}
