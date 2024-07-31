package wl;

import dm.e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import ql.c0;
import ql.m;
import ql.t;
import ql.u;
import xk.p;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final dm.e f30203a;

    /* renamed from: b, reason: collision with root package name */
    private static final dm.e f30204b;

    static {
        e.a aVar = dm.e.f14291d;
        f30203a = aVar.c("\"\\");
        f30204b = aVar.c("\t ,=");
    }

    public static final List<ql.h> a(t tVar, String headerName) {
        boolean r10;
        n.e(tVar, "<this>");
        n.e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            r10 = p.r(headerName, tVar.d(i10), true);
            if (r10) {
                try {
                    c(new dm.b().T(tVar.l(i10)), arrayList);
                } catch (EOFException e10) {
                    zl.j.f32984a.g().j("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean b(c0 c0Var) {
        boolean r10;
        n.e(c0Var, "<this>");
        if (n.a(c0Var.O().g(), "HEAD")) {
            return false;
        }
        int g10 = c0Var.g();
        if (((g10 >= 100 && g10 < 200) || g10 == 204 || g10 == 304) && rl.d.v(c0Var) == -1) {
            r10 = p.r("chunked", c0.n(c0Var, "Transfer-Encoding", null, 2, null), true);
            if (!r10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(dm.b r7, java.util.List<ql.h> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.G0()
            if (r7 != 0) goto L1f
            return
        L1f:
            ql.h r7 = new ql.h
            java.util.Map r0 = dk.h0.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = rl.d.K(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.G0()
            if (r2 == 0) goto L5c
        L40:
            ql.h r2 = new ql.h
            java.lang.String r4 = "="
            java.lang.String r4 = xk.g.w(r4, r5)
            java.lang.String r3 = kotlin.jvm.internal.n.k(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.n.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = rl.d.K(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = rl.d.K(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            ql.h r4 = new ql.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = d(r7)
            goto La0
        L9c:
            java.lang.String r6 = e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.G0()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.e.c(dm.b, java.util.List):void");
    }

    private static final String d(dm.b bVar) {
        if (!(bVar.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        dm.b bVar2 = new dm.b();
        while (true) {
            long r10 = bVar.r(f30203a);
            if (r10 == -1) {
                return null;
            }
            if (bVar.l(r10) == 34) {
                bVar2.K0(bVar, r10);
                bVar.readByte();
                return bVar2.h0();
            }
            if (bVar.size() == r10 + 1) {
                return null;
            }
            bVar2.K0(bVar, r10);
            bVar.readByte();
            bVar2.K0(bVar, 1L);
        }
    }

    private static final String e(dm.b bVar) {
        long r10 = bVar.r(f30204b);
        if (r10 == -1) {
            r10 = bVar.size();
        }
        if (r10 != 0) {
            return bVar.i0(r10);
        }
        return null;
    }

    public static final void f(ql.n nVar, u url, t headers) {
        n.e(nVar, "<this>");
        n.e(url, "url");
        n.e(headers, "headers");
        if (nVar == ql.n.f24336b) {
            return;
        }
        List<m> e10 = m.f24321j.e(url, headers);
        if (e10.isEmpty()) {
            return;
        }
        nVar.b(url, e10);
    }

    private static final boolean g(dm.b bVar) {
        boolean z10 = false;
        while (!bVar.G0()) {
            byte l10 = bVar.l(0L);
            boolean z11 = true;
            if (l10 != 44) {
                if (l10 != 32 && l10 != 9) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                bVar.readByte();
            } else {
                bVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(dm.b bVar, byte b10) {
        return !bVar.G0() && bVar.l(0L) == b10;
    }
}
