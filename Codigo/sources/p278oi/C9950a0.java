package p278oi;

import android.graphics.Point;
import ck.C2028m;
import ck.C2033r;
import dk.C7018k0;
import dk.C7033s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p445xf.C12482a;

/* renamed from: oi.a0 */
/* loaded from: classes3.dex */
public final class C9950a0 {
    /* renamed from: a */
    private static final Map<String, Double> m29736a(Point point) {
        Map<String, Double> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("x", Double.valueOf(point.x)), C2033r.m10353a("y", Double.valueOf(point.y)));
        return m20424k;
    }

    /* renamed from: b */
    private static final Map<String, Object> m29737b(C12482a.a aVar) {
        Map<String, Object> m20424k;
        C2028m[] c2028mArr = new C2028m[2];
        String[] m40765a = aVar.m40765a();
        C9322n.m27780d(m40765a, "getAddressLines(...)");
        ArrayList arrayList = new ArrayList(m40765a.length);
        for (String str : m40765a) {
            arrayList.add(str.toString());
        }
        c2028mArr[0] = C2033r.m10353a("addressLines", arrayList);
        c2028mArr[1] = C2033r.m10353a("type", Integer.valueOf(aVar.m40766b()));
        m20424k = C7018k0.m20424k(c2028mArr);
        return m20424k;
    }

    /* renamed from: c */
    private static final Map<String, Object> m29738c(C12482a.c cVar) {
        Map<String, Object> m20424k;
        C2028m[] c2028mArr = new C2028m[7];
        c2028mArr[0] = C2033r.m10353a("description", cVar.m40768a());
        C12482a.b m40769b = cVar.m40769b();
        c2028mArr[1] = C2033r.m10353a("end", m40769b != null ? m40769b.m40767a() : null);
        c2028mArr[2] = C2033r.m10353a("location", cVar.m40770c());
        c2028mArr[3] = C2033r.m10353a("organizer", cVar.m40771d());
        C12482a.b m40772e = cVar.m40772e();
        c2028mArr[4] = C2033r.m10353a("start", m40772e != null ? m40772e.m40767a() : null);
        c2028mArr[5] = C2033r.m10353a("status", cVar.m40773f());
        c2028mArr[6] = C2033r.m10353a("summary", cVar.m40774g());
        m20424k = C7018k0.m20424k(c2028mArr);
        return m20424k;
    }

    /* renamed from: d */
    private static final Map<String, Object> m29739d(C12482a.d dVar) {
        int m20590r;
        int m20590r2;
        int m20590r3;
        Map<String, Object> m20424k;
        C2028m[] c2028mArr = new C2028m[7];
        List<C12482a.a> m40775a = dVar.m40775a();
        C9322n.m27780d(m40775a, "getAddresses(...)");
        List<C12482a.a> list = m40775a;
        m20590r = C7033s.m20590r(list, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        for (C12482a.a aVar : list) {
            C9322n.m27778b(aVar);
            arrayList.add(m29737b(aVar));
        }
        c2028mArr[0] = C2033r.m10353a("addresses", arrayList);
        List<C12482a.f> m40776b = dVar.m40776b();
        C9322n.m27780d(m40776b, "getEmails(...)");
        List<C12482a.f> list2 = m40776b;
        m20590r2 = C7033s.m20590r(list2, 10);
        ArrayList arrayList2 = new ArrayList(m20590r2);
        for (C12482a.f fVar : list2) {
            C9322n.m27778b(fVar);
            arrayList2.add(m29741f(fVar));
        }
        c2028mArr[1] = C2033r.m10353a("emails", arrayList2);
        C12482a.h m40777c = dVar.m40777c();
        c2028mArr[2] = C2033r.m10353a("name", m40777c != null ? m29743h(m40777c) : null);
        c2028mArr[3] = C2033r.m10353a("organization", dVar.m40778d());
        List<C12482a.i> m40779e = dVar.m40779e();
        C9322n.m27780d(m40779e, "getPhones(...)");
        List<C12482a.i> list3 = m40779e;
        m20590r3 = C7033s.m20590r(list3, 10);
        ArrayList arrayList3 = new ArrayList(m20590r3);
        for (C12482a.i iVar : list3) {
            C9322n.m27778b(iVar);
            arrayList3.add(m29744i(iVar));
        }
        c2028mArr[4] = C2033r.m10353a("phones", arrayList3);
        c2028mArr[5] = C2033r.m10353a("title", dVar.m40780f());
        c2028mArr[6] = C2033r.m10353a("urls", dVar.m40781g());
        m20424k = C7018k0.m20424k(c2028mArr);
        return m20424k;
    }

    /* renamed from: e */
    private static final Map<String, Object> m29740e(C12482a.e eVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("addressCity", eVar.m40782a()), C2033r.m10353a("addressState", eVar.m40783b()), C2033r.m10353a("addressStreet", eVar.m40784c()), C2033r.m10353a("addressZip", eVar.m40785d()), C2033r.m10353a("birthDate", eVar.m40786e()), C2033r.m10353a("documentType", eVar.m40787f()), C2033r.m10353a("expiryDate", eVar.m40788g()), C2033r.m10353a("firstName", eVar.m40789h()), C2033r.m10353a("gender", eVar.m40790i()), C2033r.m10353a("issueDate", eVar.m40791j()), C2033r.m10353a("issuingCountry", eVar.m40792k()), C2033r.m10353a("lastName", eVar.m40793l()), C2033r.m10353a("licenseNumber", eVar.m40794m()), C2033r.m10353a("middleName", eVar.m40795n()));
        return m20424k;
    }

    /* renamed from: f */
    private static final Map<String, Object> m29741f(C12482a.f fVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("address", fVar.m40796a()), C2033r.m10353a("body", fVar.m40797b()), C2033r.m10353a("subject", fVar.m40798c()), C2033r.m10353a("type", Integer.valueOf(fVar.m40799d())));
        return m20424k;
    }

    /* renamed from: g */
    private static final Map<String, Object> m29742g(C12482a.g gVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("latitude", Double.valueOf(gVar.m40800a())), C2033r.m10353a("longitude", Double.valueOf(gVar.m40801b())));
        return m20424k;
    }

    /* renamed from: h */
    private static final Map<String, Object> m29743h(C12482a.h hVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("first", hVar.m40802a()), C2033r.m10353a("formattedName", hVar.m40803b()), C2033r.m10353a("last", hVar.m40804c()), C2033r.m10353a("middle", hVar.m40805d()), C2033r.m10353a("prefix", hVar.m40806e()), C2033r.m10353a("pronunciation", hVar.m40807f()), C2033r.m10353a("suffix", hVar.m40808g()));
        return m20424k;
    }

    /* renamed from: i */
    private static final Map<String, Object> m29744i(C12482a.i iVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("number", iVar.m40809a()), C2033r.m10353a("type", Integer.valueOf(iVar.m40810b())));
        return m20424k;
    }

    /* renamed from: j */
    private static final Map<String, Object> m29745j(C12482a.j jVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a(Constants.MESSAGE, jVar.m40811a()), C2033r.m10353a("phoneNumber", jVar.m40812b()));
        return m20424k;
    }

    /* renamed from: k */
    private static final Map<String, Object> m29746k(C12482a.k kVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("title", kVar.m40813a()), C2033r.m10353a("url", kVar.m40814b()));
        return m20424k;
    }

    /* renamed from: l */
    private static final Map<String, Object> m29747l(C12482a.l lVar) {
        Map<String, Object> m20424k;
        m20424k = C7018k0.m20424k(C2033r.m10353a("encryptionType", Integer.valueOf(lVar.m40815a())), C2033r.m10353a("password", lVar.m40816b()), C2033r.m10353a("ssid", lVar.m40817c()));
        return m20424k;
    }

    /* renamed from: m */
    public static final Map<String, Object> m29748m(C12482a c12482a) {
        ArrayList arrayList;
        Map<String, Object> m20424k;
        C9322n.m27781e(c12482a, "<this>");
        C2028m[] c2028mArr = new C2028m[15];
        Point[] m40752d = c12482a.m40752d();
        if (m40752d != null) {
            arrayList = new ArrayList(m40752d.length);
            for (Point point : m40752d) {
                C9322n.m27778b(point);
                arrayList.add(m29736a(point));
            }
        } else {
            arrayList = null;
        }
        c2028mArr[0] = C2033r.m10353a("corners", arrayList);
        c2028mArr[1] = C2033r.m10353a("format", Integer.valueOf(c12482a.m40756h()));
        c2028mArr[2] = C2033r.m10353a("rawBytes", c12482a.m40759k());
        c2028mArr[3] = C2033r.m10353a("rawValue", c12482a.m40760l());
        c2028mArr[4] = C2033r.m10353a("type", Integer.valueOf(c12482a.m40763o()));
        C12482a.c m40750b = c12482a.m40750b();
        c2028mArr[5] = C2033r.m10353a("calendarEvent", m40750b != null ? m29738c(m40750b) : null);
        C12482a.d m40751c = c12482a.m40751c();
        c2028mArr[6] = C2033r.m10353a("contactInfo", m40751c != null ? m29739d(m40751c) : null);
        C12482a.e m40754f = c12482a.m40754f();
        c2028mArr[7] = C2033r.m10353a("driverLicense", m40754f != null ? m29740e(m40754f) : null);
        C12482a.f m40755g = c12482a.m40755g();
        c2028mArr[8] = C2033r.m10353a(io.flutter.plugins.firebase.auth.Constants.EMAIL, m40755g != null ? m29741f(m40755g) : null);
        C12482a.g m40757i = c12482a.m40757i();
        c2028mArr[9] = C2033r.m10353a("geoPoint", m40757i != null ? m29742g(m40757i) : null);
        C12482a.i m40758j = c12482a.m40758j();
        c2028mArr[10] = C2033r.m10353a(io.flutter.plugins.firebase.auth.Constants.SIGN_IN_METHOD_PHONE, m40758j != null ? m29744i(m40758j) : null);
        C12482a.j m40761m = c12482a.m40761m();
        c2028mArr[11] = C2033r.m10353a("sms", m40761m != null ? m29745j(m40761m) : null);
        C12482a.k m40762n = c12482a.m40762n();
        c2028mArr[12] = C2033r.m10353a("url", m40762n != null ? m29746k(m40762n) : null);
        C12482a.l m40764p = c12482a.m40764p();
        c2028mArr[13] = C2033r.m10353a("wifi", m40764p != null ? m29747l(m40764p) : null);
        c2028mArr[14] = C2033r.m10353a("displayValue", c12482a.m40753e());
        m20424k = C7018k0.m20424k(c2028mArr);
        return m20424k;
    }
}
