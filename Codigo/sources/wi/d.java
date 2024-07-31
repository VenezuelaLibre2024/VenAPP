package wi;

import io.grpc.internal.l2;
import io.grpc.internal.q0;
import java.util.ArrayList;
import java.util.List;
import vi.k0;
import vi.w0;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    public static final xi.d f30035a;

    /* renamed from: b, reason: collision with root package name */
    public static final xi.d f30036b;

    /* renamed from: c, reason: collision with root package name */
    public static final xi.d f30037c;

    /* renamed from: d, reason: collision with root package name */
    public static final xi.d f30038d;

    /* renamed from: e, reason: collision with root package name */
    public static final xi.d f30039e;

    /* renamed from: f, reason: collision with root package name */
    public static final xi.d f30040f;

    static {
        dm.e eVar = xi.d.f31320g;
        f30035a = new xi.d(eVar, "https");
        f30036b = new xi.d(eVar, "http");
        dm.e eVar2 = xi.d.f31318e;
        f30037c = new xi.d(eVar2, "POST");
        f30038d = new xi.d(eVar2, "GET");
        f30039e = new xi.d(q0.f19090j.d(), "application/grpc");
        f30040f = new xi.d("te", "trailers");
    }

    private static List<xi.d> a(List<xi.d> list, w0 w0Var) {
        byte[][] d10 = l2.d(w0Var);
        for (int i10 = 0; i10 < d10.length; i10 += 2) {
            dm.e u10 = dm.e.u(d10[i10]);
            if (u10.B() != 0 && u10.m(0) != 58) {
                list.add(new xi.d(u10, dm.e.u(d10[i10 + 1])));
            }
        }
        return list;
    }

    public static List<xi.d> b(w0 w0Var, String str, String str2, String str3, boolean z10, boolean z11) {
        eb.o.p(w0Var, "headers");
        eb.o.p(str, "defaultPath");
        eb.o.p(str2, "authority");
        c(w0Var);
        ArrayList arrayList = new ArrayList(k0.a(w0Var) + 7);
        arrayList.add(z11 ? f30036b : f30035a);
        arrayList.add(z10 ? f30038d : f30037c);
        arrayList.add(new xi.d(xi.d.f31321h, str2));
        arrayList.add(new xi.d(xi.d.f31319f, str));
        arrayList.add(new xi.d(q0.f19092l.d(), str3));
        arrayList.add(f30039e);
        arrayList.add(f30040f);
        return a(arrayList, w0Var);
    }

    private static void c(w0 w0Var) {
        w0Var.e(q0.f19090j);
        w0Var.e(q0.f19091k);
        w0Var.e(q0.f19092l);
    }
}
