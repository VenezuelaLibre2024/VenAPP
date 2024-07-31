package cd;

import cd.C1947d;
import org.json.JSONObject;
import vc.InterfaceC11867w;

/* renamed from: cd.b */
/* loaded from: classes.dex */
class C1945b implements InterfaceC1951h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1947d m10163b(InterfaceC11867w interfaceC11867w) {
        return new C1947d(interfaceC11867w.mo37894a() + 3600000, new C1947d.b(8, 4), new C1947d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // cd.InterfaceC1951h
    /* renamed from: a */
    public C1947d mo10164a(InterfaceC11867w interfaceC11867w, JSONObject jSONObject) {
        return m10163b(interfaceC11867w);
    }
}
