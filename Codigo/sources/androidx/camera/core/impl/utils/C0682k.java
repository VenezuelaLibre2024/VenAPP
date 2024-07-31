package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.C0681j;
import androidx.core.util.C0984h;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.utils.k */
/* loaded from: classes.dex */
public final class C0682k extends FilterOutputStream {

    /* renamed from: r */
    private static final byte[] f2988r = "Exif\u0000\u0000".getBytes(C0680i.f2957e);

    /* renamed from: a */
    private final C0681j f2989a;

    /* renamed from: b */
    private final byte[] f2990b;

    /* renamed from: c */
    private final ByteBuffer f2991c;

    /* renamed from: d */
    private int f2992d;

    /* renamed from: e */
    private int f2993e;

    /* renamed from: f */
    private int f2994f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.k$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m3330a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public C0682k(OutputStream outputStream, C0681j c0681j) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f2990b = new byte[1];
        this.f2991c = ByteBuffer.allocate(4);
        this.f2992d = 0;
        this.f2989a = c0681j;
    }

    /* renamed from: a */
    private int m3328a(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f2991c.position());
        this.f2991c.put(bArr, i11, min);
        return min;
    }

    /* renamed from: b */
    private void m3329b(C0673b c0673b) {
        C0683l[][] c0683lArr = C0681j.f2971i;
        int[] iArr = new int[c0683lArr.length];
        int[] iArr2 = new int[c0683lArr.length];
        for (C0683l c0683l : C0681j.f2969g) {
            for (int i10 = 0; i10 < C0681j.f2971i.length; i10++) {
                this.f2989a.m3308c(i10).remove(c0683l.f2996b);
            }
        }
        if (!this.f2989a.m3308c(1).isEmpty()) {
            this.f2989a.m3308c(0).put(C0681j.f2969g[1].f2996b, C0680i.m3301f(0L, this.f2989a.m3309d()));
        }
        if (!this.f2989a.m3308c(2).isEmpty()) {
            this.f2989a.m3308c(0).put(C0681j.f2969g[2].f2996b, C0680i.m3301f(0L, this.f2989a.m3309d()));
        }
        if (!this.f2989a.m3308c(3).isEmpty()) {
            this.f2989a.m3308c(1).put(C0681j.f2969g[3].f2996b, C0680i.m3301f(0L, this.f2989a.m3309d()));
        }
        for (int i11 = 0; i11 < C0681j.f2971i.length; i11++) {
            Iterator<Map.Entry<String, C0680i>> it = this.f2989a.m3308c(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int m3305j = it.next().getValue().m3305j();
                if (m3305j > 4) {
                    i12 += m3305j;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < C0681j.f2971i.length; i14++) {
            if (!this.f2989a.m3308c(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f2989a.m3308c(i14).size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f2989a.m3308c(1).isEmpty()) {
            this.f2989a.m3308c(0).put(C0681j.f2969g[1].f2996b, C0680i.m3301f(iArr[1], this.f2989a.m3309d()));
        }
        if (!this.f2989a.m3308c(2).isEmpty()) {
            this.f2989a.m3308c(0).put(C0681j.f2969g[2].f2996b, C0680i.m3301f(iArr[2], this.f2989a.m3309d()));
        }
        if (!this.f2989a.m3308c(3).isEmpty()) {
            this.f2989a.m3308c(1).put(C0681j.f2969g[3].f2996b, C0680i.m3301f(iArr[3], this.f2989a.m3309d()));
        }
        c0673b.m3257i(i15);
        c0673b.write(f2988r);
        c0673b.m3255f(this.f2989a.m3309d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c0673b.m3252a(this.f2989a.m3309d());
        c0673b.m3257i(42);
        c0673b.m3256g(8L);
        for (int i16 = 0; i16 < C0681j.f2971i.length; i16++) {
            if (!this.f2989a.m3308c(i16).isEmpty()) {
                c0673b.m3257i(this.f2989a.m3308c(i16).size());
                int size = iArr[i16] + 2 + (this.f2989a.m3308c(i16).size() * 12) + 4;
                for (Map.Entry<String, C0680i> entry : this.f2989a.m3308c(i16).entrySet()) {
                    int i17 = ((C0683l) C0984h.m4834l(C0681j.b.f2980f.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f2995a;
                    C0680i value = entry.getValue();
                    int m3305j2 = value.m3305j();
                    c0673b.m3257i(i17);
                    c0673b.m3257i(value.f2961a);
                    c0673b.m3254e(value.f2962b);
                    if (m3305j2 > 4) {
                        c0673b.m3256g(size);
                        size += m3305j2;
                    } else {
                        c0673b.write(value.f2964d);
                        if (m3305j2 < 4) {
                            while (m3305j2 < 4) {
                                c0673b.m3253b(0);
                                m3305j2++;
                            }
                        }
                    }
                }
                c0673b.m3256g(0L);
                Iterator<Map.Entry<String, C0680i>> it2 = this.f2989a.m3308c(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f2964d;
                    if (bArr.length > 4) {
                        c0673b.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c0673b.m3252a(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f2990b;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C0682k.write(byte[], int, int):void");
    }
}
