package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.j;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends FilterOutputStream {

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f2644r = "Exif\u0000\u0000".getBytes(i.f2613e);

    /* renamed from: a, reason: collision with root package name */
    private final j f2645a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f2646b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f2647c;

    /* renamed from: d, reason: collision with root package name */
    private int f2648d;

    /* renamed from: e, reason: collision with root package name */
    private int f2649e;

    /* renamed from: f, reason: collision with root package name */
    private int f2650f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public k(OutputStream outputStream, j jVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f2646b = new byte[1];
        this.f2647c = ByteBuffer.allocate(4);
        this.f2648d = 0;
        this.f2645a = jVar;
    }

    private int a(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f2647c.position());
        this.f2647c.put(bArr, i11, min);
        return min;
    }

    private void b(b bVar) {
        l[][] lVarArr = j.f2627i;
        int[] iArr = new int[lVarArr.length];
        int[] iArr2 = new int[lVarArr.length];
        for (l lVar : j.f2625g) {
            for (int i10 = 0; i10 < j.f2627i.length; i10++) {
                this.f2645a.c(i10).remove(lVar.f2652b);
            }
        }
        if (!this.f2645a.c(1).isEmpty()) {
            this.f2645a.c(0).put(j.f2625g[1].f2652b, i.f(0L, this.f2645a.d()));
        }
        if (!this.f2645a.c(2).isEmpty()) {
            this.f2645a.c(0).put(j.f2625g[2].f2652b, i.f(0L, this.f2645a.d()));
        }
        if (!this.f2645a.c(3).isEmpty()) {
            this.f2645a.c(1).put(j.f2625g[3].f2652b, i.f(0L, this.f2645a.d()));
        }
        for (int i11 = 0; i11 < j.f2627i.length; i11++) {
            Iterator<Map.Entry<String, i>> it = this.f2645a.c(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int j10 = it.next().getValue().j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < j.f2627i.length; i14++) {
            if (!this.f2645a.c(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f2645a.c(i14).size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f2645a.c(1).isEmpty()) {
            this.f2645a.c(0).put(j.f2625g[1].f2652b, i.f(iArr[1], this.f2645a.d()));
        }
        if (!this.f2645a.c(2).isEmpty()) {
            this.f2645a.c(0).put(j.f2625g[2].f2652b, i.f(iArr[2], this.f2645a.d()));
        }
        if (!this.f2645a.c(3).isEmpty()) {
            this.f2645a.c(1).put(j.f2625g[3].f2652b, i.f(iArr[3], this.f2645a.d()));
        }
        bVar.i(i15);
        bVar.write(f2644r);
        bVar.f(this.f2645a.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f2645a.d());
        bVar.i(42);
        bVar.g(8L);
        for (int i16 = 0; i16 < j.f2627i.length; i16++) {
            if (!this.f2645a.c(i16).isEmpty()) {
                bVar.i(this.f2645a.c(i16).size());
                int size = iArr[i16] + 2 + (this.f2645a.c(i16).size() * 12) + 4;
                for (Map.Entry<String, i> entry : this.f2645a.c(i16).entrySet()) {
                    int i17 = ((l) androidx.core.util.h.l(j.b.f2636f.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f2651a;
                    i value = entry.getValue();
                    int j11 = value.j();
                    bVar.i(i17);
                    bVar.i(value.f2617a);
                    bVar.e(value.f2618b);
                    if (j11 > 4) {
                        bVar.g(size);
                        size += j11;
                    } else {
                        bVar.write(value.f2620d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                bVar.b(0);
                                j11++;
                            }
                        }
                    }
                }
                bVar.g(0L);
                Iterator<Map.Entry<String, i>> it2 = this.f2645a.c(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f2620d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f2646b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0105, code lost:
    
        if (r9 <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0107, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.k.write(byte[], int, int):void");
    }
}
