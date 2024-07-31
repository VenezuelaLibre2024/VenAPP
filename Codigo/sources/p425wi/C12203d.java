package p425wi;

import dm.C7061e;
import io.grpc.internal.C8872l2;
import io.grpc.internal.C8890q0;
import java.util.ArrayList;
import java.util.List;
import p082eb.C7159o;
import p448xi.C12491d;
import vi.C11926k0;
import vi.C11953w0;

/* renamed from: wi.d */
/* loaded from: classes3.dex */
class C12203d {

    /* renamed from: a */
    public static final C12491d f32504a;

    /* renamed from: b */
    public static final C12491d f32505b;

    /* renamed from: c */
    public static final C12491d f32506c;

    /* renamed from: d */
    public static final C12491d f32507d;

    /* renamed from: e */
    public static final C12491d f32508e;

    /* renamed from: f */
    public static final C12491d f32509f;

    static {
        C7061e c7061e = C12491d.f33840g;
        f32504a = new C12491d(c7061e, "https");
        f32505b = new C12491d(c7061e, "http");
        C7061e c7061e2 = C12491d.f33838e;
        f32506c = new C12491d(c7061e2, "POST");
        f32507d = new C12491d(c7061e2, "GET");
        f32508e = new C12491d(C8890q0.f20837j.m38328d(), "application/grpc");
        f32509f = new C12491d("te", "trailers");
    }

    /* renamed from: a */
    private static List<C12491d> m39178a(List<C12491d> list, C11953w0 c11953w0) {
        byte[][] m25667d = C8872l2.m25667d(c11953w0);
        for (int i10 = 0; i10 < m25667d.length; i10 += 2) {
            C7061e m20754u = C7061e.m20754u(m25667d[i10]);
            if (m20754u.m20756B() != 0 && m20754u.m20765m(0) != 58) {
                list.add(new C12491d(m20754u, C7061e.m20754u(m25667d[i10 + 1])));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<C12491d> m39179b(C11953w0 c11953w0, String str, String str2, String str3, boolean z10, boolean z11) {
        C7159o.m21313p(c11953w0, "headers");
        C7159o.m21313p(str, "defaultPath");
        C7159o.m21313p(str2, "authority");
        m39180c(c11953w0);
        ArrayList arrayList = new ArrayList(C11926k0.m38188a(c11953w0) + 7);
        arrayList.add(z11 ? f32505b : f32504a);
        arrayList.add(z10 ? f32507d : f32506c);
        arrayList.add(new C12491d(C12491d.f33841h, str2));
        arrayList.add(new C12491d(C12491d.f33839f, str));
        arrayList.add(new C12491d(C8890q0.f20839l.m38328d(), str3));
        arrayList.add(f32508e);
        arrayList.add(f32509f);
        return m39178a(arrayList, c11953w0);
    }

    /* renamed from: c */
    private static void m39180c(C11953w0 c11953w0) {
        c11953w0.m38309e(C8890q0.f20837j);
        c11953w0.m38309e(C8890q0.f20838k);
        c11953w0.m38309e(C8890q0.f20839l);
    }
}
