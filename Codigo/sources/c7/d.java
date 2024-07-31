package c7;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t8.e0;
import y6.j;

/* loaded from: classes.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private long f6892b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f6893c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f6894d;

    public d() {
        super(new j());
        this.f6892b = -9223372036854775807L;
        this.f6893c = new long[0];
        this.f6894d = new long[0];
    }

    private static Boolean g(e0 e0Var) {
        return Boolean.valueOf(e0Var.H() == 1);
    }

    private static Object h(e0 e0Var, int i10) {
        if (i10 == 0) {
            return j(e0Var);
        }
        if (i10 == 1) {
            return g(e0Var);
        }
        if (i10 == 2) {
            return n(e0Var);
        }
        if (i10 == 3) {
            return l(e0Var);
        }
        if (i10 == 8) {
            return k(e0Var);
        }
        if (i10 == 10) {
            return m(e0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(e0Var);
    }

    private static Date i(e0 e0Var) {
        Date date = new Date((long) j(e0Var).doubleValue());
        e0Var.V(2);
        return date;
    }

    private static Double j(e0 e0Var) {
        return Double.valueOf(Double.longBitsToDouble(e0Var.A()));
    }

    private static HashMap<String, Object> k(e0 e0Var) {
        int L = e0Var.L();
        HashMap<String, Object> hashMap = new HashMap<>(L);
        for (int i10 = 0; i10 < L; i10++) {
            String n10 = n(e0Var);
            Object h10 = h(e0Var, o(e0Var));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(e0 e0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(e0Var);
            int o10 = o(e0Var);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(e0Var, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList<Object> m(e0 e0Var) {
        int L = e0Var.L();
        ArrayList<Object> arrayList = new ArrayList<>(L);
        for (int i10 = 0; i10 < L; i10++) {
            Object h10 = h(e0Var, o(e0Var));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(e0 e0Var) {
        int N = e0Var.N();
        int f10 = e0Var.f();
        e0Var.V(N);
        return new String(e0Var.e(), f10, N);
    }

    private static int o(e0 e0Var) {
        return e0Var.H();
    }

    @Override // c7.e
    protected boolean b(e0 e0Var) {
        return true;
    }

    @Override // c7.e
    protected boolean c(e0 e0Var, long j10) {
        if (o(e0Var) != 2 || !"onMetaData".equals(n(e0Var)) || e0Var.a() == 0 || o(e0Var) != 8) {
            return false;
        }
        HashMap<String, Object> k10 = k(e0Var);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f6892b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6893c = new long[size];
                this.f6894d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6893c = new long[0];
                        this.f6894d = new long[0];
                        break;
                    }
                    this.f6893c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f6894d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f6892b;
    }

    public long[] e() {
        return this.f6894d;
    }

    public long[] f() {
        return this.f6893c;
    }
}
