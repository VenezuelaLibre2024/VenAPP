package vi;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p082eb.C7152h;
import p082eb.C7159o;
import vi.InterfaceC11928l;

/* renamed from: vi.v */
/* loaded from: classes3.dex */
public final class C11950v {

    /* renamed from: c */
    static final C7152h f31647c = C7152h.m21264f(',');

    /* renamed from: d */
    private static final C11950v f31648d = m38277a().m38282f(new InterfaceC11928l.a(), true).m38282f(InterfaceC11928l.b.f31595a, false);

    /* renamed from: a */
    private final Map<String, a> f31649a;

    /* renamed from: b */
    private final byte[] f31650b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.v$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        final InterfaceC11948u f31651a;

        /* renamed from: b */
        final boolean f31652b;

        a(InterfaceC11948u interfaceC11948u, boolean z10) {
            this.f31651a = (InterfaceC11948u) C7159o.m21313p(interfaceC11948u, "decompressor");
            this.f31652b = z10;
        }
    }

    private C11950v() {
        this.f31649a = new LinkedHashMap(0);
        this.f31650b = new byte[0];
    }

    private C11950v(InterfaceC11948u interfaceC11948u, boolean z10, C11950v c11950v) {
        String mo38199a = interfaceC11948u.mo38199a();
        C7159o.m21302e(!mo38199a.contains(","), "Comma is currently not allowed in message encoding");
        int size = c11950v.f31649a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c11950v.f31649a.containsKey(interfaceC11948u.mo38199a()) ? size : size + 1);
        for (a aVar : c11950v.f31649a.values()) {
            String mo38199a2 = aVar.f31651a.mo38199a();
            if (!mo38199a2.equals(mo38199a)) {
                linkedHashMap.put(mo38199a2, new a(aVar.f31651a, aVar.f31652b));
            }
        }
        linkedHashMap.put(mo38199a, new a(interfaceC11948u, z10));
        this.f31649a = Collections.unmodifiableMap(linkedHashMap);
        this.f31650b = f31647c.m21269d(m38279b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C11950v m38277a() {
        return new C11950v();
    }

    /* renamed from: c */
    public static C11950v m38278c() {
        return f31648d;
    }

    /* renamed from: b */
    public Set<String> m38279b() {
        HashSet hashSet = new HashSet(this.f31649a.size());
        for (Map.Entry<String, a> entry : this.f31649a.entrySet()) {
            if (entry.getValue().f31652b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] m38280d() {
        return this.f31650b;
    }

    /* renamed from: e */
    public InterfaceC11948u m38281e(String str) {
        a aVar = this.f31649a.get(str);
        if (aVar != null) {
            return aVar.f31651a;
        }
        return null;
    }

    /* renamed from: f */
    public C11950v m38282f(InterfaceC11948u interfaceC11948u, boolean z10) {
        return new C11950v(interfaceC11948u, z10, this);
    }
}
