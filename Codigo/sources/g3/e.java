package g3;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f15745u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f15746a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f15747b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0256a f15748c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f15749d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f15750e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f15751f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f15752g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f15753h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f15754i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f15755j;

    /* renamed from: k, reason: collision with root package name */
    private int f15756k;

    /* renamed from: l, reason: collision with root package name */
    private c f15757l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f15758m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15759n;

    /* renamed from: o, reason: collision with root package name */
    private int f15760o;

    /* renamed from: p, reason: collision with root package name */
    private int f15761p;

    /* renamed from: q, reason: collision with root package name */
    private int f15762q;

    /* renamed from: r, reason: collision with root package name */
    private int f15763r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f15764s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f15765t;

    public e(a.InterfaceC0256a interfaceC0256a) {
        this.f15747b = new int[RecognitionOptions.QR_CODE];
        this.f15765t = Bitmap.Config.ARGB_8888;
        this.f15748c = interfaceC0256a;
        this.f15757l = new c();
    }

    public e(a.InterfaceC0256a interfaceC0256a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0256a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f15761p + i10; i18++) {
            byte[] bArr = this.f15754i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f15746a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f15761p + i20; i21++) {
            byte[] bArr2 = this.f15754i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f15746a[bArr2[i21] & 255];
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

    private void j(b bVar) {
        Boolean bool;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f15755j;
        int i15 = bVar.f15720d;
        int i16 = this.f15761p;
        int i17 = i15 / i16;
        int i18 = bVar.f15718b / i16;
        int i19 = bVar.f15719c / i16;
        int i20 = bVar.f15717a / i16;
        boolean z10 = this.f15756k == 0;
        int i21 = this.f15763r;
        int i22 = this.f15762q;
        byte[] bArr = this.f15754i;
        int[] iArr2 = this.f15746a;
        Boolean bool2 = this.f15764s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (true) {
            bool = bool2;
            if (i25 >= i17) {
                break;
            }
            if (bVar.f15721e) {
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
                int i33 = i25 * i16 * bVar.f15719c;
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
                            int i38 = i(i33, i36, bVar.f15719c);
                            if (i38 != 0) {
                                iArr[i37] = i38;
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
        if (this.f15764s == null) {
            this.f15764s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f15755j;
        int i10 = bVar2.f15720d;
        int i11 = bVar2.f15718b;
        int i12 = bVar2.f15719c;
        int i13 = bVar2.f15717a;
        boolean z10 = this.f15756k == 0;
        int i14 = this.f15763r;
        byte[] bArr = this.f15754i;
        int[] iArr2 = this.f15746a;
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
            int i20 = bVar2.f15719c * i15;
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
            bVar2 = bVar;
        }
        Boolean bool = this.f15764s;
        this.f15764s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f15764s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f15749d.position(bVar.f15726j);
        }
        if (bVar == null) {
            c cVar = eVar.f15757l;
            i10 = cVar.f15733f;
            i11 = cVar.f15734g;
        } else {
            i10 = bVar.f15719c;
            i11 = bVar.f15720d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f15754i;
        if (bArr == null || bArr.length < i12) {
            eVar.f15754i = eVar.f15748c.b(i12);
        }
        byte[] bArr2 = eVar.f15754i;
        if (eVar.f15751f == null) {
            eVar.f15751f = new short[RecognitionOptions.AZTEC];
        }
        short[] sArr = eVar.f15751f;
        if (eVar.f15752g == null) {
            eVar.f15752g = new byte[RecognitionOptions.AZTEC];
        }
        byte[] bArr3 = eVar.f15752g;
        if (eVar.f15753h == null) {
            eVar.f15753h = new byte[4097];
        }
        byte[] bArr4 = eVar.f15753h;
        int p10 = p();
        int i13 = 1 << p10;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = p10 + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f15750e;
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
                i23 = o();
                if (i23 <= 0) {
                    eVar.f15760o = 3;
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
                    eVar = this;
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
                        eVar = this;
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

    private Bitmap n() {
        Boolean bool = this.f15764s;
        Bitmap c10 = this.f15748c.c(this.f15763r, this.f15762q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f15765t);
        c10.setHasAlpha(true);
        return c10;
    }

    private int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f15749d;
        byteBuffer.get(this.f15750e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    private int p() {
        return this.f15749d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f15755j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f15758m;
            if (bitmap2 != null) {
                this.f15748c.a(bitmap2);
            }
            this.f15758m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f15723g == 3 && this.f15758m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f15723g) > 0) {
            if (i11 == 2) {
                if (!bVar.f15722f) {
                    c cVar = this.f15757l;
                    int i13 = cVar.f15739l;
                    if (bVar.f15727k == null || cVar.f15737j != bVar.f15724h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f15720d;
                int i15 = this.f15761p;
                int i16 = i14 / i15;
                int i17 = bVar2.f15718b / i15;
                int i18 = bVar2.f15719c / i15;
                int i19 = bVar2.f15717a / i15;
                int i20 = this.f15763r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f15763r;
                }
            } else if (i11 == 3 && (bitmap = this.f15758m) != null) {
                int i25 = this.f15763r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f15762q);
            }
        }
        l(bVar);
        if (bVar.f15721e || this.f15761p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f15759n && ((i10 = bVar.f15723g) == 0 || i10 == 1)) {
            if (this.f15758m == null) {
                this.f15758m = n();
            }
            Bitmap bitmap3 = this.f15758m;
            int i26 = this.f15763r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f15762q);
        }
        Bitmap n10 = n();
        int i27 = this.f15763r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f15762q);
        return n10;
    }

    @Override // g3.a
    public synchronized Bitmap a() {
        if (this.f15757l.f15730c <= 0 || this.f15756k < 0) {
            String str = f15745u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f15757l.f15730c + ", framePointer=" + this.f15756k);
            }
            this.f15760o = 1;
        }
        int i10 = this.f15760o;
        if (i10 != 1 && i10 != 2) {
            this.f15760o = 0;
            if (this.f15750e == null) {
                this.f15750e = this.f15748c.b(255);
            }
            b bVar = this.f15757l.f15732e.get(this.f15756k);
            int i11 = this.f15756k - 1;
            b bVar2 = i11 >= 0 ? this.f15757l.f15732e.get(i11) : null;
            int[] iArr = bVar.f15727k;
            if (iArr == null) {
                iArr = this.f15757l.f15728a;
            }
            this.f15746a = iArr;
            if (iArr == null) {
                String str2 = f15745u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f15756k);
                }
                this.f15760o = 1;
                return null;
            }
            if (bVar.f15722f) {
                System.arraycopy(iArr, 0, this.f15747b, 0, iArr.length);
                int[] iArr2 = this.f15747b;
                this.f15746a = iArr2;
                iArr2[bVar.f15724h] = 0;
                if (bVar.f15723g == 2 && this.f15756k == 0) {
                    this.f15764s = Boolean.TRUE;
                }
            }
            return r(bVar, bVar2);
        }
        String str3 = f15745u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f15760o);
        }
        return null;
    }

    @Override // g3.a
    public void b() {
        this.f15756k = (this.f15756k + 1) % this.f15757l.f15730c;
    }

    @Override // g3.a
    public int c() {
        return this.f15757l.f15730c;
    }

    @Override // g3.a
    public void clear() {
        this.f15757l = null;
        byte[] bArr = this.f15754i;
        if (bArr != null) {
            this.f15748c.e(bArr);
        }
        int[] iArr = this.f15755j;
        if (iArr != null) {
            this.f15748c.f(iArr);
        }
        Bitmap bitmap = this.f15758m;
        if (bitmap != null) {
            this.f15748c.a(bitmap);
        }
        this.f15758m = null;
        this.f15749d = null;
        this.f15764s = null;
        byte[] bArr2 = this.f15750e;
        if (bArr2 != null) {
            this.f15748c.e(bArr2);
        }
    }

    @Override // g3.a
    public void d(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f15765t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // g3.a
    public int e() {
        int i10;
        if (this.f15757l.f15730c <= 0 || (i10 = this.f15756k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // g3.a
    public void f() {
        this.f15756k = -1;
    }

    @Override // g3.a
    public int g() {
        return this.f15756k;
    }

    @Override // g3.a
    public ByteBuffer getData() {
        return this.f15749d;
    }

    @Override // g3.a
    public int h() {
        return this.f15749d.limit() + this.f15754i.length + (this.f15755j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f15757l;
            if (i10 < cVar.f15730c) {
                return cVar.f15732e.get(i10).f15725i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
        int highestOneBit = Integer.highestOneBit(i10);
        this.f15760o = 0;
        this.f15757l = cVar;
        this.f15756k = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f15749d = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f15749d.order(ByteOrder.LITTLE_ENDIAN);
        this.f15759n = false;
        Iterator<b> it = cVar.f15732e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f15723g == 3) {
                this.f15759n = true;
                break;
            }
        }
        this.f15761p = highestOneBit;
        int i11 = cVar.f15733f;
        this.f15763r = i11 / highestOneBit;
        int i12 = cVar.f15734g;
        this.f15762q = i12 / highestOneBit;
        this.f15754i = this.f15748c.b(i11 * i12);
        this.f15755j = this.f15748c.d(this.f15763r * this.f15762q);
    }
}
