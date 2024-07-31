package p039c7;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p363t8.C11146e0;
import p459y6.C12620j;

/* renamed from: c7.d */
/* loaded from: classes.dex */
final class C1882d extends AbstractC1883e {

    /* renamed from: b */
    private long f7841b;

    /* renamed from: c */
    private long[] f7842c;

    /* renamed from: d */
    private long[] f7843d;

    public C1882d() {
        super(new C12620j());
        this.f7841b = -9223372036854775807L;
        this.f7842c = new long[0];
        this.f7843d = new long[0];
    }

    /* renamed from: g */
    private static Boolean m9996g(C11146e0 c11146e0) {
        return Boolean.valueOf(c11146e0.m34664H() == 1);
    }

    /* renamed from: h */
    private static Object m9997h(C11146e0 c11146e0, int i10) {
        if (i10 == 0) {
            return m9999j(c11146e0);
        }
        if (i10 == 1) {
            return m9996g(c11146e0);
        }
        if (i10 == 2) {
            return m10003n(c11146e0);
        }
        if (i10 == 3) {
            return m10001l(c11146e0);
        }
        if (i10 == 8) {
            return m10000k(c11146e0);
        }
        if (i10 == 10) {
            return m10002m(c11146e0);
        }
        if (i10 != 11) {
            return null;
        }
        return m9998i(c11146e0);
    }

    /* renamed from: i */
    private static Date m9998i(C11146e0 c11146e0) {
        Date date = new Date((long) m9999j(c11146e0).doubleValue());
        c11146e0.m34678V(2);
        return date;
    }

    /* renamed from: j */
    private static Double m9999j(C11146e0 c11146e0) {
        return Double.valueOf(Double.longBitsToDouble(c11146e0.m34657A()));
    }

    /* renamed from: k */
    private static HashMap<String, Object> m10000k(C11146e0 c11146e0) {
        int m34668L = c11146e0.m34668L();
        HashMap<String, Object> hashMap = new HashMap<>(m34668L);
        for (int i10 = 0; i10 < m34668L; i10++) {
            String m10003n = m10003n(c11146e0);
            Object m9997h = m9997h(c11146e0, m10004o(c11146e0));
            if (m9997h != null) {
                hashMap.put(m10003n, m9997h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private static HashMap<String, Object> m10001l(C11146e0 c11146e0) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m10003n = m10003n(c11146e0);
            int m10004o = m10004o(c11146e0);
            if (m10004o == 9) {
                return hashMap;
            }
            Object m9997h = m9997h(c11146e0, m10004o);
            if (m9997h != null) {
                hashMap.put(m10003n, m9997h);
            }
        }
    }

    /* renamed from: m */
    private static ArrayList<Object> m10002m(C11146e0 c11146e0) {
        int m34668L = c11146e0.m34668L();
        ArrayList<Object> arrayList = new ArrayList<>(m34668L);
        for (int i10 = 0; i10 < m34668L; i10++) {
            Object m9997h = m9997h(c11146e0, m10004o(c11146e0));
            if (m9997h != null) {
                arrayList.add(m9997h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static String m10003n(C11146e0 c11146e0) {
        int m34670N = c11146e0.m34670N();
        int m34683f = c11146e0.m34683f();
        c11146e0.m34678V(m34670N);
        return new String(c11146e0.m34682e(), m34683f, m34670N);
    }

    /* renamed from: o */
    private static int m10004o(C11146e0 c11146e0) {
        return c11146e0.m34664H();
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: b */
    protected boolean mo9985b(C11146e0 c11146e0) {
        return true;
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: c */
    protected boolean mo9986c(C11146e0 c11146e0, long j10) {
        if (m10004o(c11146e0) != 2 || !"onMetaData".equals(m10003n(c11146e0)) || c11146e0.m34679a() == 0 || m10004o(c11146e0) != 8) {
            return false;
        }
        HashMap<String, Object> m10000k = m10000k(c11146e0);
        Object obj = m10000k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f7841b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m10000k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f7842c = new long[size];
                this.f7843d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f7842c = new long[0];
                        this.f7843d = new long[0];
                        break;
                    }
                    this.f7842c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f7843d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m10005d() {
        return this.f7841b;
    }

    /* renamed from: e */
    public long[] m10006e() {
        return this.f7843d;
    }

    /* renamed from: f */
    public long[] m10007f() {
        return this.f7842c;
    }
}
