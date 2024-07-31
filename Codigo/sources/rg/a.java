package rg;

import dg.e;
import dg.m;
import dg.o;
import dg.q;
import dg.r;
import dg.s;
import java.util.Map;
import kg.b;
import sg.c;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f24952b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final c f24953a = new c();

    private static b c(b bVar) {
        int[] i10 = bVar.i();
        if (i10 == null) {
            throw m.a();
        }
        int i11 = i10[0];
        int i12 = i10[1];
        int i13 = i10[2];
        int i14 = i10[3];
        b bVar2 = new b(30, 33);
        for (int i15 = 0; i15 < 33; i15++) {
            int min = Math.min((((i15 * i14) + (i14 / 2)) / 33) + i12, i14 - 1);
            for (int i16 = 0; i16 < 30; i16++) {
                if (bVar.g(Math.min((((i16 * i13) + (i13 / 2)) + (((i15 & 1) * i13) / 2)) / 30, i13 - 1) + i11, min)) {
                    bVar2.r(i16, i15);
                }
            }
        }
        return bVar2;
    }

    @Override // dg.o
    public q a(dg.c cVar) {
        return b(cVar, null);
    }

    @Override // dg.o
    public q b(dg.c cVar, Map<e, ?> map) {
        kg.e b10 = this.f24953a.b(c(cVar.a()), map);
        q qVar = new q(b10.i(), b10.e(), f24952b, dg.a.MAXICODE);
        String b11 = b10.b();
        if (b11 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b11);
        }
        return qVar;
    }

    @Override // dg.o
    public void reset() {
    }
}
