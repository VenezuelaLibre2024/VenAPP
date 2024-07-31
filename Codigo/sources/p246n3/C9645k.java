package p246n3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n3.k */
/* loaded from: classes.dex */
public final class C9645k implements InterfaceC9643i {

    /* renamed from: c */
    private final Map<String, List<InterfaceC9644j>> f23662c;

    /* renamed from: d */
    private volatile Map<String, String> f23663d;

    /* renamed from: n3.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d */
        private static final String f23664d;

        /* renamed from: e */
        private static final Map<String, List<InterfaceC9644j>> f23665e;

        /* renamed from: a */
        private boolean f23666a = true;

        /* renamed from: b */
        private Map<String, List<InterfaceC9644j>> f23667b = f23665e;

        /* renamed from: c */
        private boolean f23668c = true;

        static {
            String m28902g = m28902g();
            f23664d = m28902g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m28902g)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(m28902g)));
            }
            f23665e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        private Map<String, List<InterfaceC9644j>> m28899d() {
            HashMap hashMap = new HashMap(this.f23667b.size());
            for (Map.Entry<String, List<InterfaceC9644j>> entry : this.f23667b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        private void m28900e() {
            if (this.f23666a) {
                this.f23666a = false;
                this.f23667b = m28899d();
            }
        }

        /* renamed from: f */
        private List<InterfaceC9644j> m28901f(String str) {
            List<InterfaceC9644j> list = this.f23667b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f23667b.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: g */
        static String m28902g() {
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

        /* renamed from: a */
        public a m28903a(String str, String str2) {
            return m28904b(str, new b(str2));
        }

        /* renamed from: b */
        public a m28904b(String str, InterfaceC9644j interfaceC9644j) {
            if (this.f23668c && "User-Agent".equalsIgnoreCase(str)) {
                return m28906h(str, interfaceC9644j);
            }
            m28900e();
            m28901f(str).add(interfaceC9644j);
            return this;
        }

        /* renamed from: c */
        public C9645k m28905c() {
            this.f23666a = true;
            return new C9645k(this.f23667b);
        }

        /* renamed from: h */
        public a m28906h(String str, InterfaceC9644j interfaceC9644j) {
            m28900e();
            if (interfaceC9644j == null) {
                this.f23667b.remove(str);
            } else {
                List<InterfaceC9644j> m28901f = m28901f(str);
                m28901f.clear();
                m28901f.add(interfaceC9644j);
            }
            if (this.f23668c && "User-Agent".equalsIgnoreCase(str)) {
                this.f23668c = false;
            }
            return this;
        }
    }

    /* renamed from: n3.k$b */
    /* loaded from: classes.dex */
    static final class b implements InterfaceC9644j {

        /* renamed from: a */
        private final String f23669a;

        b(String str) {
            this.f23669a = str;
        }

        @Override // p246n3.InterfaceC9644j
        /* renamed from: a */
        public String mo28896a() {
            return this.f23669a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f23669a.equals(((b) obj).f23669a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23669a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f23669a + "'}";
        }
    }

    C9645k(Map<String, List<InterfaceC9644j>> map) {
        this.f23662c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m28897b(List<InterfaceC9644j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String mo28896a = list.get(i10).mo28896a();
            if (!TextUtils.isEmpty(mo28896a)) {
                sb2.append(mo28896a);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    private Map<String, String> m28898c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC9644j>> entry : this.f23662c.entrySet()) {
            String m28897b = m28897b(entry.getValue());
            if (!TextUtils.isEmpty(m28897b)) {
                hashMap.put(entry.getKey(), m28897b);
            }
        }
        return hashMap;
    }

    @Override // p246n3.InterfaceC9643i
    /* renamed from: a */
    public Map<String, String> mo28895a() {
        if (this.f23663d == null) {
            synchronized (this) {
                if (this.f23663d == null) {
                    this.f23663d = Collections.unmodifiableMap(m28898c());
                }
            }
        }
        return this.f23663d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9645k) {
            return this.f23662c.equals(((C9645k) obj).f23662c);
        }
        return false;
    }

    public int hashCode() {
        return this.f23662c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f23662c + '}';
    }
}
