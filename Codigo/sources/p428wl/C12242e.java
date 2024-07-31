package p428wl;

import dm.C7056b;
import dm.C7061e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p319ql.C10525c0;
import p319ql.C10533h;
import p319ql.C10538m;
import p319ql.C10545t;
import p319ql.C10546u;
import p319ql.InterfaceC10539n;
import p341rl.C10727d;
import p450xk.C12524p;
import p495zl.C13148j;

/* renamed from: wl.e */
/* loaded from: classes3.dex */
public final class C12242e {

    /* renamed from: a */
    private static final C7061e f32715a;

    /* renamed from: b */
    private static final C7061e f32716b;

    static {
        C7061e.a aVar = C7061e.f15649d;
        f32715a = aVar.m20781c("\"\\");
        f32716b = aVar.m20781c("\t ,=");
    }

    /* renamed from: a */
    public static final List<C10533h> m39403a(C10545t c10545t, String headerName) {
        boolean m41037r;
        C9322n.m27781e(c10545t, "<this>");
        C9322n.m27781e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c10545t.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            m41037r = C12524p.m41037r(headerName, c10545t.m31846d(i10), true);
            if (m41037r) {
                try {
                    m39405c(new C7056b().mo20705T(c10545t.m31849l(i10)), arrayList);
                } catch (EOFException e10) {
                    C13148j.f35535a.m43385g().m43375j("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m39404b(C10525c0 c10525c0) {
        boolean m41037r;
        C9322n.m27781e(c10525c0, "<this>");
        if (C9322n.m27777a(c10525c0.m31639O().m31606g(), "HEAD")) {
            return false;
        }
        int m31645g = c10525c0.m31645g();
        if (((m31645g >= 100 && m31645g < 200) || m31645g == 204 || m31645g == 304) && C10727d.m32662v(c10525c0) == -1) {
            m41037r = C12524p.m41037r("chunked", C10525c0.m31634n(c10525c0, "Transfer-Encoding", null, 2, null), true);
            if (!m41037r) {
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m39405c(dm.C7056b r7, java.util.List<p319ql.C10533h> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m39409g(r7)
            java.lang.String r1 = m39407e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m39409g(r7)
            java.lang.String r3 = m39407e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo20695G0()
            if (r7 != 0) goto L1f
            return
        L1f:
            ql.h r7 = new ql.h
            java.util.Map r0 = dk.C7012h0.m20364h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = p341rl.C10727d.m32625K(r7, r4)
            boolean r6 = m39409g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.mo20695G0()
            if (r2 == 0) goto L5c
        L40:
            ql.h r2 = new ql.h
            java.lang.String r4 = "="
            java.lang.String r4 = p450xk.C12515g.m41011w(r4, r5)
            java.lang.String r3 = kotlin.jvm.internal.C9322n.m27787k(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.C9322n.m27780d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p341rl.C10727d.m32625K(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = m39407e(r7)
            boolean r5 = m39409g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = p341rl.C10727d.m32625K(r7, r4)
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
            boolean r6 = m39409g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = m39410h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = m39406d(r7)
            goto La0
        L9c:
            java.lang.String r6 = m39407e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = m39409g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.mo20695G0()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: p428wl.C12242e.m39405c(dm.b, java.util.List):void");
    }

    /* renamed from: d */
    private static final String m39406d(C7056b c7056b) {
        if (!(c7056b.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C7056b c7056b2 = new C7056b();
        while (true) {
            long m20735r = c7056b.m20735r(f32715a);
            if (m20735r == -1) {
                return null;
            }
            if (c7056b.m20729l(m20735r) == 34) {
                c7056b2.mo19710K0(c7056b, m20735r);
                c7056b.readByte();
                return c7056b2.m20723h0();
            }
            if (c7056b.size() == m20735r + 1) {
                return null;
            }
            c7056b2.mo19710K0(c7056b, m20735r);
            c7056b.readByte();
            c7056b2.mo19710K0(c7056b, 1L);
        }
    }

    /* renamed from: e */
    private static final String m39407e(C7056b c7056b) {
        long m20735r = c7056b.m20735r(f32716b);
        if (m20735r == -1) {
            m20735r = c7056b.size();
        }
        if (m20735r != 0) {
            return c7056b.m20725i0(m20735r);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m39408f(InterfaceC10539n interfaceC10539n, C10546u url, C10545t headers) {
        C9322n.m27781e(interfaceC10539n, "<this>");
        C9322n.m27781e(url, "url");
        C9322n.m27781e(headers, "headers");
        if (interfaceC10539n == InterfaceC10539n.f26430b) {
            return;
        }
        List<C10538m> m31789e = C10538m.f26415j.m31789e(url, headers);
        if (m31789e.isEmpty()) {
            return;
        }
        interfaceC10539n.mo31791b(url, m31789e);
    }

    /* renamed from: g */
    private static final boolean m39409g(C7056b c7056b) {
        boolean z10 = false;
        while (!c7056b.mo20695G0()) {
            byte m20729l = c7056b.m20729l(0L);
            boolean z11 = true;
            if (m20729l != 44) {
                if (m20729l != 32 && m20729l != 9) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                c7056b.readByte();
            } else {
                c7056b.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    private static final boolean m39410h(C7056b c7056b, byte b10) {
        return !c7056b.mo20695G0() && c7056b.m20729l(0L) == b10;
    }
}
