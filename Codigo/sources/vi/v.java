package vi;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import vi.l;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    static final eb.h f29212c = eb.h.f(',');

    /* renamed from: d, reason: collision with root package name */
    private static final v f29213d = a().f(new l.a(), true).f(l.b.f29160a, false);

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f29214a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f29215b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final u f29216a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f29217b;

        a(u uVar, boolean z10) {
            this.f29216a = (u) eb.o.p(uVar, "decompressor");
            this.f29217b = z10;
        }
    }

    private v() {
        this.f29214a = new LinkedHashMap(0);
        this.f29215b = new byte[0];
    }

    private v(u uVar, boolean z10, v vVar) {
        String a10 = uVar.a();
        eb.o.e(!a10.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f29214a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(vVar.f29214a.containsKey(uVar.a()) ? size : size + 1);
        for (a aVar : vVar.f29214a.values()) {
            String a11 = aVar.f29216a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new a(aVar.f29216a, aVar.f29217b));
            }
        }
        linkedHashMap.put(a10, new a(uVar, z10));
        this.f29214a = Collections.unmodifiableMap(linkedHashMap);
        this.f29215b = f29212c.d(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static v a() {
        return new v();
    }

    public static v c() {
        return f29213d;
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f29214a.size());
        for (Map.Entry<String, a> entry : this.f29214a.entrySet()) {
            if (entry.getValue().f29217b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] d() {
        return this.f29215b;
    }

    public u e(String str) {
        a aVar = this.f29214a.get(str);
        if (aVar != null) {
            return aVar.f29216a;
        }
        return null;
    }

    public v f(u uVar, boolean z10) {
        return new v(uVar, z10, this);
    }
}
