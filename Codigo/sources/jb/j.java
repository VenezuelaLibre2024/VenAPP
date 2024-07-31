package jb;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b */
    private static final Logger f19836b = Logger.getLogger(j.class.getName());

    /* renamed from: a */
    private final ConcurrentMap<String, b> f19837a;

    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ com.google.crypto.tink.internal.d f19838a;

        a(com.google.crypto.tink.internal.d dVar) {
            this.f19838a = dVar;
        }

        @Override // jb.j.b
        public Class<?> a() {
            return this.f19838a.getClass();
        }

        @Override // jb.j.b
        public Set<Class<?>> b() {
            return this.f19838a.i();
        }

        @Override // jb.j.b
        public <Q> h<Q> c(Class<Q> cls) {
            try {
                return new i(this.f19838a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // jb.j.b
        public h<?> d() {
            com.google.crypto.tink.internal.d dVar = this.f19838a;
            return new i(dVar, dVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        Class<?> a();

        Set<Class<?>> b();

        <P> h<P> c(Class<P> cls);

        h<?> d();
    }

    public j() {
        this.f19837a = new ConcurrentHashMap();
    }

    public j(j jVar) {
        this.f19837a = new ConcurrentHashMap(jVar.f19837a);
    }

    private static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    private static <KeyProtoT extends r0> b b(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f19837a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f19837a.get(str);
    }

    private <P> h<P> e(String str, Class<P> cls) {
        b d10 = d(str);
        if (cls == null) {
            return (h<P>) d10.d();
        }
        if (d10.b().contains(cls)) {
            return d10.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d10.a() + ", supported primitives: " + i(d10.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r5.f19837a.putIfAbsent(r0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized <P> void h(jb.j.b r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            jb.h r0 = r6.d()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r1 = r5.f19837a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6f
            jb.j$b r1 = (jb.j.b) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L60
            java.lang.Class r2 = r1.a()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r3 = r6.a()     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L22
            goto L60
        L22:
            java.util.logging.Logger r7 = jb.j.f19836b     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            r7.warning(r2)     // Catch: java.lang.Throwable -> L6f
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r0 = r1.a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6f
            r1 = 1
            r3[r1] = r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r6 = r6.a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6f
            r0 = 2
            r3[r0] = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L60:
            if (r7 != 0) goto L68
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r7 = r5.f19837a     // Catch: java.lang.Throwable -> L6f
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L68:
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r7 = r5.f19837a     // Catch: java.lang.Throwable -> L6f
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r5)
            return
        L6f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.j.h(jb.j$b, boolean):void");
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls : set) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    public <P> h<P> c(String str, Class<P> cls) {
        return e(str, (Class) a(cls));
    }

    public h<?> f(String str) {
        return d(str).d();
    }

    public synchronized <KeyProtoT extends r0> void g(com.google.crypto.tink.internal.d<KeyProtoT> dVar) {
        if (!dVar.a().b()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    public boolean j(String str) {
        return this.f19837a.containsKey(str);
    }
}
