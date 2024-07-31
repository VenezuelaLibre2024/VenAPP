package jb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import vb.a0;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f19874a = Logger.getLogger(x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<j> f19875b = new AtomicReference<>(new j());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f19876c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f19877d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f19878e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<String, l> f19879f = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.crypto.tink.internal.d f19880a;

        a(com.google.crypto.tink.internal.d dVar) {
            this.f19880a = dVar;
        }
    }

    /* loaded from: classes2.dex */
    private interface b {
    }

    private x() {
    }

    private static <KeyProtoT extends r0> b a(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (jb.x.f19879f.containsKey(r5.getKey()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r5.getKey() + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r3.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (jb.x.f19879f.containsKey(r4.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (jb.x.f19875b.get().j(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.r0, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.r0> void b(java.lang.String r3, java.util.Map<java.lang.String, com.google.crypto.tink.internal.d.a.C0170a<KeyFormatProtoT>> r4, boolean r5) {
        /*
            java.lang.Class<jb.x> r0 = jb.x.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = jb.x.f19877d     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference<jb.j> r5 = jb.x.f19875b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            jb.j r5 = (jb.j) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.l> r1 = jb.x.f19879f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.l> r5 = jb.x.f19879f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.x.b(java.lang.String, java.util.Map, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <KeyT extends g, P> P c(KeyT keyt, Class<P> cls) {
        return (P) com.google.crypto.tink.internal.h.c().b(keyt, cls);
    }

    public static Class<?> d(Class<?> cls) {
        try {
            return com.google.crypto.tink.internal.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P e(String str, com.google.crypto.tink.shaded.protobuf.h hVar, Class<P> cls) {
        return f19875b.get().c(str, cls).c(hVar);
    }

    public static <P> P f(String str, byte[] bArr, Class<P> cls) {
        return (P) e(str, com.google.crypto.tink.shaded.protobuf.h.k(bArr), cls);
    }

    public static <P> P g(vb.y yVar, Class<P> cls) {
        return (P) e(yVar.b0(), yVar.c0(), cls);
    }

    public static h<?> h(String str) {
        return f19875b.get().f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map<String, l> i() {
        Map<String, l> unmodifiableMap;
        synchronized (x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f19879f);
        }
        return unmodifiableMap;
    }

    public static synchronized r0 j(a0 a0Var) {
        r0 d10;
        synchronized (x.class) {
            h<?> h10 = h(a0Var.b0());
            if (!f19877d.get(a0Var.b0()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.b0());
            }
            d10 = h10.d(a0Var.c0());
        }
        return d10;
    }

    public static synchronized vb.y k(a0 a0Var) {
        vb.y a10;
        synchronized (x.class) {
            h<?> h10 = h(a0Var.b0());
            if (!f19877d.get(a0Var.b0()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.b0());
            }
            a10 = h10.a(a0Var.c0());
        }
        return a10;
    }

    public static synchronized <KeyProtoT extends r0> void l(com.google.crypto.tink.internal.d<KeyProtoT> dVar, boolean z10) {
        synchronized (x.class) {
            if (dVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<j> atomicReference = f19875b;
            j jVar = new j(atomicReference.get());
            jVar.g(dVar);
            String d10 = dVar.d();
            b(d10, z10 ? dVar.f().c() : Collections.emptyMap(), z10);
            if (!atomicReference.get().j(d10)) {
                f19876c.put(d10, a(dVar));
                if (z10) {
                    m(d10, dVar.f().c());
                }
            }
            f19877d.put(d10, Boolean.valueOf(z10));
            atomicReference.set(jVar);
        }
    }

    private static <KeyFormatProtoT extends r0> void m(String str, Map<String, d.a.C0170a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, d.a.C0170a<KeyFormatProtoT>> entry : map.entrySet()) {
            f19879f.put(entry.getKey(), l.a(str, entry.getValue().f11284a.h(), entry.getValue().f11285b));
        }
    }

    public static synchronized <B, P> void n(w<B, P> wVar) {
        synchronized (x.class) {
            com.google.crypto.tink.internal.h.c().e(wVar);
        }
    }

    public static <B, P> P o(v<B> vVar, Class<P> cls) {
        return (P) com.google.crypto.tink.internal.h.c().f(vVar, cls);
    }
}
