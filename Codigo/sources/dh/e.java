package dh;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final mg.c f14165a = new mg.c(mg.a.f21490l);

    private void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f14165a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (mg.e unused) {
            throw dg.d.a();
        }
    }

    private kg.e b(a aVar, Map<dg.e, ?> map) {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b bVar : b10) {
            i10 += bVar.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar2 : b10) {
            byte[] a10 = bVar2.a();
            int c10 = bVar2.c();
            a(a10, c10);
            int i12 = 0;
            while (i12 < c10) {
                bArr[i11] = a10[i12];
                i12++;
                i11++;
            }
        }
        return d.a(bArr, e10, d10, map);
    }

    public kg.e c(kg.b bVar, Map<dg.e, ?> map) {
        dg.d e10;
        a aVar = new a(bVar);
        dg.h hVar = null;
        try {
            return b(aVar, map);
        } catch (dg.d e11) {
            e10 = e11;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                kg.e b10 = b(aVar, map);
                b10.n(new i(true));
                return b10;
            } catch (dg.d | dg.h unused) {
                if (hVar != null) {
                    throw hVar;
                }
                throw e10;
            }
        } catch (dg.h e12) {
            e10 = null;
            hVar = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            kg.e b102 = b(aVar, map);
            b102.n(new i(true));
            return b102;
        }
    }
}
