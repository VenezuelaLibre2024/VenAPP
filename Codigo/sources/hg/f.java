package hg;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    static final f f16776f = new f(g.f16782b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f16777a;

    /* renamed from: b, reason: collision with root package name */
    private final g f16778b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16779c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16780d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16781e;

    private f(g gVar, int i10, int i11, int i12) {
        this.f16778b = gVar;
        this.f16777a = i10;
        this.f16779c = i11;
        this.f16780d = i12;
        this.f16781e = c(i11);
    }

    private static int c(int i10) {
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f a(int i10) {
        g gVar = this.f16778b;
        int i11 = this.f16777a;
        int i12 = this.f16780d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f16768d[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f16779c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f16779c == 2078 ? fVar.d(i10 + 1) : fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f b(int i10) {
        g gVar;
        g gVar2 = j(4, 0).f16778b;
        int i11 = 3;
        if (i10 < 0) {
            gVar = gVar2.a(0, 3);
        } else {
            if (i10 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i10).getBytes(StandardCharsets.ISO_8859_1);
            g a10 = gVar2.a(bytes.length, 3);
            for (byte b10 : bytes) {
                a10 = a10.a((b10 - 48) + 2, 4);
            }
            i11 = 3 + (bytes.length * 4);
            gVar = a10;
        }
        return new f(gVar, this.f16777a, 0, this.f16780d + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f d(int i10) {
        int i11 = this.f16779c;
        return i11 == 0 ? this : new f(this.f16778b.b(i10 - i11, i11), this.f16777a, 0, this.f16780d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f16779c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f16780d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f16777a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(f fVar) {
        int i10 = this.f16780d + (d.f16768d[this.f16777a][fVar.f16777a] >> 16);
        int i11 = this.f16779c;
        int i12 = fVar.f16779c;
        if (i11 < i12) {
            i10 += fVar.f16781e - this.f16781e;
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= fVar.f16780d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f i(int i10, int i11) {
        int i12 = this.f16780d;
        g gVar = this.f16778b;
        int i13 = this.f16777a;
        if (i10 != i13) {
            int i14 = d.f16768d[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f j(int i10, int i11) {
        g gVar = this.f16778b;
        int i12 = this.f16777a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f16770f[i12][i10], i13).a(i11, 5), this.f16777a, 0, this.f16780d + i13 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kg.a k(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (g gVar = d(bArr.length).f16778b; gVar != null; gVar = gVar.d()) {
            arrayList.add(gVar);
        }
        kg.a aVar = new kg.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g) arrayList.get(size)).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f16767c[this.f16777a], Integer.valueOf(this.f16780d), Integer.valueOf(this.f16779c));
    }
}
