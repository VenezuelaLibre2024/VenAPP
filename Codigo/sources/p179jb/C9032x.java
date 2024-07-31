package p179jb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.C5936h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p400vb.C11786a0;
import p400vb.C11821y;

/* renamed from: jb.x */
/* loaded from: classes2.dex */
public final class C9032x {

    /* renamed from: a */
    private static final Logger f21653a = Logger.getLogger(C9032x.class.getName());

    /* renamed from: b */
    private static final AtomicReference<C9018j> f21654b = new AtomicReference<>(new C9018j());

    /* renamed from: c */
    private static final ConcurrentMap<String, b> f21655c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f21656d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, Object> f21657e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<String, C9020l> f21658f = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb.x$a */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC5932d f21659a;

        a(AbstractC5932d abstractC5932d) {
            this.f21659a = abstractC5932d;
        }
    }

    /* renamed from: jb.x$b */
    /* loaded from: classes2.dex */
    private interface b {
    }

    private C9032x() {
    }

    /* renamed from: a */
    private static <KeyProtoT extends InterfaceC6001r0> b m26524a(AbstractC5932d<KeyProtoT> abstractC5932d) {
        return new a(abstractC5932d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (p179jb.C9032x.f21658f.containsKey(r5.getKey()) == false) goto L39;
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
    
        if (p179jb.C9032x.f21658f.containsKey(r4.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (p179jb.C9032x.f21654b.get().m26451j(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0> void m26525b(java.lang.String r3, java.util.Map<java.lang.String, com.google.crypto.tink.internal.AbstractC5932d.a.C13195a<KeyFormatProtoT>> r4, boolean r5) {
        /*
            java.lang.Class<jb.x> r0 = p179jb.C9032x.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = p179jb.C9032x.f21656d     // Catch: java.lang.Throwable -> L31
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
            java.util.concurrent.atomic.AtomicReference<jb.j> r5 = p179jb.C9032x.f21654b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            jb.j r5 = (p179jb.C9018j) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.m26451j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.l> r1 = p179jb.C9032x.f21658f     // Catch: java.lang.Throwable -> L31
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
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.l> r5 = p179jb.C9032x.f21658f     // Catch: java.lang.Throwable -> L31
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
        throw new UnsupportedOperationException("Method not decompiled: p179jb.C9032x.m26525b(java.lang.String, java.util.Map, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <KeyT extends AbstractC9015g, P> P m26526c(KeyT keyt, Class<P> cls) {
        return (P) C5936h.m15227c().m15229b(keyt, cls);
    }

    /* renamed from: d */
    public static Class<?> m26527d(Class<?> cls) {
        try {
            return C5936h.m15227c().m15228a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static <P> P m26528e(String str, AbstractC5970h abstractC5970h, Class<P> cls) {
        return f21654b.get().m26448c(str, cls).mo26436c(abstractC5970h);
    }

    /* renamed from: f */
    public static <P> P m26529f(String str, byte[] bArr, Class<P> cls) {
        return (P) m26528e(str, AbstractC5970h.m15486k(bArr), cls);
    }

    /* renamed from: g */
    public static <P> P m26530g(C11821y c11821y, Class<P> cls) {
        return (P) m26528e(c11821y.m37657b0(), c11821y.m37658c0(), cls);
    }

    /* renamed from: h */
    public static InterfaceC9016h<?> m26531h(String str) {
        return f21654b.get().m26449f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static synchronized Map<String, C9020l> m26532i() {
        Map<String, C9020l> unmodifiableMap;
        synchronized (C9032x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f21658f);
        }
        return unmodifiableMap;
    }

    /* renamed from: j */
    public static synchronized InterfaceC6001r0 m26533j(C11786a0 c11786a0) {
        InterfaceC6001r0 mo26437d;
        synchronized (C9032x.class) {
            InterfaceC9016h<?> m26531h = m26531h(c11786a0.m37298b0());
            if (!f21656d.get(c11786a0.m37298b0()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c11786a0.m37298b0());
            }
            mo26437d = m26531h.mo26437d(c11786a0.m37299c0());
        }
        return mo26437d;
    }

    /* renamed from: k */
    public static synchronized C11821y m26534k(C11786a0 c11786a0) {
        C11821y mo26434a;
        synchronized (C9032x.class) {
            InterfaceC9016h<?> m26531h = m26531h(c11786a0.m37298b0());
            if (!f21656d.get(c11786a0.m37298b0()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c11786a0.m37298b0());
            }
            mo26434a = m26531h.mo26434a(c11786a0.m37299c0());
        }
        return mo26434a;
    }

    /* renamed from: l */
    public static synchronized <KeyProtoT extends InterfaceC6001r0> void m26535l(AbstractC5932d<KeyProtoT> abstractC5932d, boolean z10) {
        synchronized (C9032x.class) {
            if (abstractC5932d == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<C9018j> atomicReference = f21654b;
            C9018j c9018j = new C9018j(atomicReference.get());
            c9018j.m26450g(abstractC5932d);
            String mo15206d = abstractC5932d.mo15206d();
            m26525b(mo15206d, z10 ? abstractC5932d.mo15208f().mo15215c() : Collections.emptyMap(), z10);
            if (!atomicReference.get().m26451j(mo15206d)) {
                f21655c.put(mo15206d, m26524a(abstractC5932d));
                if (z10) {
                    m26536m(mo15206d, abstractC5932d.mo15208f().mo15215c());
                }
            }
            f21656d.put(mo15206d, Boolean.valueOf(z10));
            atomicReference.set(c9018j);
        }
    }

    /* renamed from: m */
    private static <KeyFormatProtoT extends InterfaceC6001r0> void m26536m(String str, Map<String, AbstractC5932d.a.C13195a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, AbstractC5932d.a.C13195a<KeyFormatProtoT>> entry : map.entrySet()) {
            f21658f.put(entry.getKey(), C9020l.m26456a(str, entry.getValue().f12499a.mo15293h(), entry.getValue().f12500b));
        }
    }

    /* renamed from: n */
    public static synchronized <B, P> void m26537n(InterfaceC9031w<B, P> interfaceC9031w) {
        synchronized (C9032x.class) {
            C5936h.m15227c().m15231e(interfaceC9031w);
        }
    }

    /* renamed from: o */
    public static <B, P> P m26538o(C9030v<B> c9030v, Class<P> cls) {
        return (P) C5936h.m15227c().m15232f(c9030v, cls);
    }
}
