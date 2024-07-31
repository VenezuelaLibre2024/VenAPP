package oi;

import android.graphics.Point;
import dk.k0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xf.a;

/* loaded from: classes3.dex */
public final class a0 {
    private static final Map<String, Double> a(Point point) {
        Map<String, Double> k10;
        k10 = k0.k(ck.r.a("x", Double.valueOf(point.x)), ck.r.a("y", Double.valueOf(point.y)));
        return k10;
    }

    private static final Map<String, Object> b(a.C0524a c0524a) {
        Map<String, Object> k10;
        ck.m[] mVarArr = new ck.m[2];
        String[] a10 = c0524a.a();
        kotlin.jvm.internal.n.d(a10, "getAddressLines(...)");
        ArrayList arrayList = new ArrayList(a10.length);
        for (String str : a10) {
            arrayList.add(str.toString());
        }
        mVarArr[0] = ck.r.a("addressLines", arrayList);
        mVarArr[1] = ck.r.a("type", Integer.valueOf(c0524a.b()));
        k10 = k0.k(mVarArr);
        return k10;
    }

    private static final Map<String, Object> c(a.c cVar) {
        Map<String, Object> k10;
        ck.m[] mVarArr = new ck.m[7];
        mVarArr[0] = ck.r.a("description", cVar.a());
        a.b b10 = cVar.b();
        mVarArr[1] = ck.r.a("end", b10 != null ? b10.a() : null);
        mVarArr[2] = ck.r.a("location", cVar.c());
        mVarArr[3] = ck.r.a("organizer", cVar.d());
        a.b e10 = cVar.e();
        mVarArr[4] = ck.r.a("start", e10 != null ? e10.a() : null);
        mVarArr[5] = ck.r.a("status", cVar.f());
        mVarArr[6] = ck.r.a("summary", cVar.g());
        k10 = k0.k(mVarArr);
        return k10;
    }

    private static final Map<String, Object> d(a.d dVar) {
        int r10;
        int r11;
        int r12;
        Map<String, Object> k10;
        ck.m[] mVarArr = new ck.m[7];
        List<a.C0524a> a10 = dVar.a();
        kotlin.jvm.internal.n.d(a10, "getAddresses(...)");
        List<a.C0524a> list = a10;
        r10 = dk.s.r(list, 10);
        ArrayList arrayList = new ArrayList(r10);
        for (a.C0524a c0524a : list) {
            kotlin.jvm.internal.n.b(c0524a);
            arrayList.add(b(c0524a));
        }
        mVarArr[0] = ck.r.a("addresses", arrayList);
        List<a.f> b10 = dVar.b();
        kotlin.jvm.internal.n.d(b10, "getEmails(...)");
        List<a.f> list2 = b10;
        r11 = dk.s.r(list2, 10);
        ArrayList arrayList2 = new ArrayList(r11);
        for (a.f fVar : list2) {
            kotlin.jvm.internal.n.b(fVar);
            arrayList2.add(f(fVar));
        }
        mVarArr[1] = ck.r.a("emails", arrayList2);
        a.h c10 = dVar.c();
        mVarArr[2] = ck.r.a("name", c10 != null ? h(c10) : null);
        mVarArr[3] = ck.r.a("organization", dVar.d());
        List<a.i> e10 = dVar.e();
        kotlin.jvm.internal.n.d(e10, "getPhones(...)");
        List<a.i> list3 = e10;
        r12 = dk.s.r(list3, 10);
        ArrayList arrayList3 = new ArrayList(r12);
        for (a.i iVar : list3) {
            kotlin.jvm.internal.n.b(iVar);
            arrayList3.add(i(iVar));
        }
        mVarArr[4] = ck.r.a("phones", arrayList3);
        mVarArr[5] = ck.r.a("title", dVar.f());
        mVarArr[6] = ck.r.a("urls", dVar.g());
        k10 = k0.k(mVarArr);
        return k10;
    }

    private static final Map<String, Object> e(a.e eVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("addressCity", eVar.a()), ck.r.a("addressState", eVar.b()), ck.r.a("addressStreet", eVar.c()), ck.r.a("addressZip", eVar.d()), ck.r.a("birthDate", eVar.e()), ck.r.a("documentType", eVar.f()), ck.r.a("expiryDate", eVar.g()), ck.r.a("firstName", eVar.h()), ck.r.a("gender", eVar.i()), ck.r.a("issueDate", eVar.j()), ck.r.a("issuingCountry", eVar.k()), ck.r.a("lastName", eVar.l()), ck.r.a("licenseNumber", eVar.m()), ck.r.a("middleName", eVar.n()));
        return k10;
    }

    private static final Map<String, Object> f(a.f fVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("address", fVar.a()), ck.r.a("body", fVar.b()), ck.r.a("subject", fVar.c()), ck.r.a("type", Integer.valueOf(fVar.d())));
        return k10;
    }

    private static final Map<String, Object> g(a.g gVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("latitude", Double.valueOf(gVar.a())), ck.r.a("longitude", Double.valueOf(gVar.b())));
        return k10;
    }

    private static final Map<String, Object> h(a.h hVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("first", hVar.a()), ck.r.a("formattedName", hVar.b()), ck.r.a("last", hVar.c()), ck.r.a("middle", hVar.d()), ck.r.a("prefix", hVar.e()), ck.r.a("pronunciation", hVar.f()), ck.r.a("suffix", hVar.g()));
        return k10;
    }

    private static final Map<String, Object> i(a.i iVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("number", iVar.a()), ck.r.a("type", Integer.valueOf(iVar.b())));
        return k10;
    }

    private static final Map<String, Object> j(a.j jVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a(Constants.MESSAGE, jVar.a()), ck.r.a("phoneNumber", jVar.b()));
        return k10;
    }

    private static final Map<String, Object> k(a.k kVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("title", kVar.a()), ck.r.a("url", kVar.b()));
        return k10;
    }

    private static final Map<String, Object> l(a.l lVar) {
        Map<String, Object> k10;
        k10 = k0.k(ck.r.a("encryptionType", Integer.valueOf(lVar.a())), ck.r.a("password", lVar.b()), ck.r.a("ssid", lVar.c()));
        return k10;
    }

    public static final Map<String, Object> m(xf.a aVar) {
        ArrayList arrayList;
        Map<String, Object> k10;
        kotlin.jvm.internal.n.e(aVar, "<this>");
        ck.m[] mVarArr = new ck.m[15];
        Point[] d10 = aVar.d();
        if (d10 != null) {
            arrayList = new ArrayList(d10.length);
            for (Point point : d10) {
                kotlin.jvm.internal.n.b(point);
                arrayList.add(a(point));
            }
        } else {
            arrayList = null;
        }
        mVarArr[0] = ck.r.a("corners", arrayList);
        mVarArr[1] = ck.r.a("format", Integer.valueOf(aVar.h()));
        mVarArr[2] = ck.r.a("rawBytes", aVar.k());
        mVarArr[3] = ck.r.a("rawValue", aVar.l());
        mVarArr[4] = ck.r.a("type", Integer.valueOf(aVar.o()));
        a.c b10 = aVar.b();
        mVarArr[5] = ck.r.a("calendarEvent", b10 != null ? c(b10) : null);
        a.d c10 = aVar.c();
        mVarArr[6] = ck.r.a("contactInfo", c10 != null ? d(c10) : null);
        a.e f10 = aVar.f();
        mVarArr[7] = ck.r.a("driverLicense", f10 != null ? e(f10) : null);
        a.f g10 = aVar.g();
        mVarArr[8] = ck.r.a(io.flutter.plugins.firebase.auth.Constants.EMAIL, g10 != null ? f(g10) : null);
        a.g i10 = aVar.i();
        mVarArr[9] = ck.r.a("geoPoint", i10 != null ? g(i10) : null);
        a.i j10 = aVar.j();
        mVarArr[10] = ck.r.a(io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_PHONE, j10 != null ? i(j10) : null);
        a.j m10 = aVar.m();
        mVarArr[11] = ck.r.a("sms", m10 != null ? j(m10) : null);
        a.k n10 = aVar.n();
        mVarArr[12] = ck.r.a("url", n10 != null ? k(n10) : null);
        a.l p10 = aVar.p();
        mVarArr[13] = ck.r.a("wifi", p10 != null ? l(p10) : null);
        mVarArr[14] = ck.r.a("displayValue", aVar.e());
        k10 = k0.k(mVarArr);
        return k10;
    }
}
