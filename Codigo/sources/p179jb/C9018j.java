package p179jb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: jb.j */
/* loaded from: classes2.dex */
final class C9018j {

    /* renamed from: b */
    private static final Logger f21615b = Logger.getLogger(C9018j.class.getName());

    /* renamed from: a */
    private final ConcurrentMap<String, b> f21616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb.j$a */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ AbstractC5932d f21617a;

        a(AbstractC5932d abstractC5932d) {
            this.f21617a = abstractC5932d;
        }

        @Override // p179jb.C9018j.b
        /* renamed from: a */
        public Class<?> mo26452a() {
            return this.f21617a.getClass();
        }

        @Override // p179jb.C9018j.b
        /* renamed from: b */
        public Set<Class<?>> mo26453b() {
            return this.f21617a.m15211i();
        }

        @Override // p179jb.C9018j.b
        /* renamed from: c */
        public <Q> InterfaceC9016h<Q> mo26454c(Class<Q> cls) {
            try {
                return new C9017i(this.f21617a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // p179jb.C9018j.b
        /* renamed from: d */
        public InterfaceC9016h<?> mo26455d() {
            AbstractC5932d abstractC5932d = this.f21617a;
            return new C9017i(abstractC5932d, abstractC5932d.m15204b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jb.j$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        Class<?> mo26452a();

        /* renamed from: b */
        Set<Class<?>> mo26453b();

        /* renamed from: c */
        <P> InterfaceC9016h<P> mo26454c(Class<P> cls);

        /* renamed from: d */
        InterfaceC9016h<?> mo26455d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9018j() {
        this.f21616a = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9018j(C9018j c9018j) {
        this.f21616a = new ConcurrentHashMap(c9018j.f21616a);
    }

    /* renamed from: a */
    private static <T> T m26442a(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: b */
    private static <KeyProtoT extends InterfaceC6001r0> b m26443b(AbstractC5932d<KeyProtoT> abstractC5932d) {
        return new a(abstractC5932d);
    }

    /* renamed from: d */
    private synchronized b m26444d(String str) {
        if (!this.f21616a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f21616a.get(str);
    }

    /* renamed from: e */
    private <P> InterfaceC9016h<P> m26445e(String str, Class<P> cls) {
        b m26444d = m26444d(str);
        if (cls == null) {
            return (InterfaceC9016h<P>) m26444d.mo26455d();
        }
        if (m26444d.mo26453b().contains(cls)) {
            return m26444d.mo26454c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + m26444d.mo26452a() + ", supported primitives: " + m26447i(m26444d.mo26453b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r5.f21616a.putIfAbsent(r0, r6);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized <P> void m26446h(p179jb.C9018j.b r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            jb.h r0 = r6.mo26455d()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.mo26435b()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r1 = r5.f21616a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6f
            jb.j$b r1 = (p179jb.C9018j.b) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L60
            java.lang.Class r2 = r1.mo26452a()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r3 = r6.mo26452a()     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L22
            goto L60
        L22:
            java.util.logging.Logger r7 = p179jb.C9018j.f21615b     // Catch: java.lang.Throwable -> L6f
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
            java.lang.Class r0 = r1.mo26452a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6f
            r1 = 1
            r3[r1] = r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r6 = r6.mo26452a()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6f
            r0 = 2
            r3[r0] = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L60:
            if (r7 != 0) goto L68
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r7 = r5.f21616a     // Catch: java.lang.Throwable -> L6f
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L68:
            java.util.concurrent.ConcurrentMap<java.lang.String, jb.j$b> r7 = r5.f21616a     // Catch: java.lang.Throwable -> L6f
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r5)
            return
        L6f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p179jb.C9018j.m26446h(jb.j$b, boolean):void");
    }

    /* renamed from: i */
    private static String m26447i(Set<Class<?>> set) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <P> InterfaceC9016h<P> m26448c(String str, Class<P> cls) {
        return m26445e(str, (Class) m26442a(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC9016h<?> m26449f(String str) {
        return m26444d(str).mo26455d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized <KeyProtoT extends InterfaceC6001r0> void m26450g(AbstractC5932d<KeyProtoT> abstractC5932d) {
        if (!abstractC5932d.mo15203a().mo29502b()) {
            throw new GeneralSecurityException("failed to register key manager " + abstractC5932d.getClass() + " as it is not FIPS compatible.");
        }
        m26446h(m26443b(abstractC5932d), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m26451j(String str) {
        return this.f21616a.containsKey(str);
    }
}
