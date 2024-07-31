package n3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f21729c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f21730d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f21731d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map<String, List<j>> f21732e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f21733a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f21734b = f21732e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21735c = true;

        static {
            String g10 = g();
            f21731d = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g10)));
            }
            f21732e = Collections.unmodifiableMap(hashMap);
        }

        private Map<String, List<j>> d() {
            HashMap hashMap = new HashMap(this.f21734b.size());
            for (Map.Entry<String, List<j>> entry : this.f21734b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f21733a) {
                this.f21733a = false;
                this.f21734b = d();
            }
        }

        private List<j> f(String str) {
            List<j> list = this.f21734b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f21734b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    charAt = '?';
                }
                sb2.append(charAt);
            }
            return sb2.toString();
        }

        public a a(String str, String str2) {
            return b(str, new b(str2));
        }

        public a b(String str, j jVar) {
            if (this.f21735c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public k c() {
            this.f21733a = true;
            return new k(this.f21734b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f21734b.remove(str);
            } else {
                List<j> f10 = f(str);
                f10.clear();
                f10.add(jVar);
            }
            if (this.f21735c && "User-Agent".equalsIgnoreCase(str)) {
                this.f21735c = false;
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f21736a;

        b(String str) {
            this.f21736a = str;
        }

        @Override // n3.j
        public String a() {
            return this.f21736a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f21736a.equals(((b) obj).f21736a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21736a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f21736a + "'}";
        }
    }

    k(Map<String, List<j>> map) {
        this.f21729c = Collections.unmodifiableMap(map);
    }

    private String b(List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f21729c.entrySet()) {
            String b10 = b(entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    @Override // n3.i
    public Map<String, String> a() {
        if (this.f21730d == null) {
            synchronized (this) {
                if (this.f21730d == null) {
                    this.f21730d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f21730d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f21729c.equals(((k) obj).f21729c);
        }
        return false;
    }

    public int hashCode() {
        return this.f21729c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f21729c + '}';
    }
}
