package p446xg;

import com.google.android.gms.common.api.C5101a;
import java.util.ArrayList;
import java.util.Map;
import kg.C9267e;
import p014ah.C0115a;
import p014ah.C0116b;
import p066dg.C6942c;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6954o;
import p468yg.C12694j;

/* renamed from: xg.b */
/* loaded from: classes2.dex */
public final class C12484b implements InterfaceC6954o {

    /* renamed from: a */
    private static final C6956q[] f33823a = new C6956q[0];

    /* renamed from: c */
    private static C6956q[] m40820c(C6942c c6942c, Map<EnumC6944e, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        C0116b m547b = C0115a.m547b(c6942c, map, z10);
        for (C6958s[] c6958sArr : m547b.m554b()) {
            C9267e m41820i = C12694j.m41820i(m547b.m553a(), c6958sArr[4], c6958sArr[5], c6958sArr[6], c6958sArr[7], m40823f(c6958sArr), m40821d(c6958sArr));
            C6956q c6956q = new C6956q(m41820i.m27633i(), m41820i.m27629e(), c6958sArr, EnumC6940a.PDF_417);
            c6956q.m20115h(EnumC6957r.ERROR_CORRECTION_LEVEL, m41820i.m27626b());
            C12485c c12485c = (C12485c) m41820i.m27628d();
            if (c12485c != null) {
                c6956q.m20115h(EnumC6957r.PDF417_EXTRA_METADATA, c12485c);
            }
            c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]L" + m41820i.m27632h());
            arrayList.add(c6956q);
        }
        return (C6956q[]) arrayList.toArray(f33823a);
    }

    /* renamed from: d */
    private static int m40821d(C6958s[] c6958sArr) {
        return Math.max(Math.max(m40822e(c6958sArr[0], c6958sArr[4]), (m40822e(c6958sArr[6], c6958sArr[2]) * 17) / 18), Math.max(m40822e(c6958sArr[1], c6958sArr[5]), (m40822e(c6958sArr[7], c6958sArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    private static int m40822e(C6958s c6958s, C6958s c6958s2) {
        if (c6958s == null || c6958s2 == null) {
            return 0;
        }
        return (int) Math.abs(c6958s.m20119c() - c6958s2.m20119c());
    }

    /* renamed from: f */
    private static int m40823f(C6958s[] c6958sArr) {
        return Math.min(Math.min(m40824g(c6958sArr[0], c6958sArr[4]), (m40824g(c6958sArr[6], c6958sArr[2]) * 17) / 18), Math.min(m40824g(c6958sArr[1], c6958sArr[5]), (m40824g(c6958sArr[7], c6958sArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    private static int m40824g(C6958s c6958s, C6958s c6958s2) {
        return (c6958s == null || c6958s2 == null) ? C5101a.e.API_PRIORITY_OTHER : (int) Math.abs(c6958s.m20119c() - c6958s2.m20119c());
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        C6956q c6956q;
        C6956q[] m40820c = m40820c(c6942c, map, false);
        if (m40820c.length == 0 || (c6956q = m40820c[0]) == null) {
            throw C6952m.m20106a();
        }
        return c6956q;
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}
