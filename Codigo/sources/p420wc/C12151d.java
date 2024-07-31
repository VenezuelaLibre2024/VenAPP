package p420wc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.C10889g;
import vc.C11839i;

/* renamed from: wc.d */
/* loaded from: classes.dex */
class C12151d {

    /* renamed from: a */
    private final Map<String, String> f32303a = new HashMap();

    /* renamed from: b */
    private final int f32304b;

    /* renamed from: c */
    private final int f32305c;

    public C12151d(int i10, int i11) {
        this.f32304b = i10;
        this.f32305c = i11;
    }

    /* renamed from: b */
    private String m38925b(String str) {
        if (str != null) {
            return m38926c(str, this.f32305c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m38926c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i10 ? trim.substring(0, i10) : trim;
    }

    /* renamed from: a */
    public synchronized Map<String, String> m38927a() {
        return Collections.unmodifiableMap(new HashMap(this.f32303a));
    }

    /* renamed from: d */
    public synchronized boolean m38928d(String str, String str2) {
        String m38925b = m38925b(str);
        if (this.f32303a.size() >= this.f32304b && !this.f32303a.containsKey(m38925b)) {
            C10889g.m33216f().m33225k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f32304b);
            return false;
        }
        String m38926c = m38926c(str2, this.f32305c);
        if (C11839i.m37744y(this.f32303a.get(m38925b), m38926c)) {
            return false;
        }
        Map<String, String> map = this.f32303a;
        if (str2 == null) {
            m38926c = "";
        }
        map.put(m38925b, m38926c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m38929e(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m38925b = m38925b(entry.getKey());
            if (this.f32303a.size() >= this.f32304b && !this.f32303a.containsKey(m38925b)) {
                i10++;
            }
            String value = entry.getValue();
            this.f32303a.put(m38925b, value == null ? "" : m38926c(value, this.f32305c));
        }
        if (i10 > 0) {
            C10889g.m33216f().m33225k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f32304b);
        }
    }
}
