package io.grpc.internal;

import io.grpc.internal.C8834c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.y0 */
/* loaded from: classes3.dex */
public final class C8914y0 implements C8834c0.g {

    /* renamed from: a */
    private static final Throwable f21009a = m25940d();

    /* renamed from: io.grpc.internal.y0$a */
    /* loaded from: classes3.dex */
    static final class a implements c {
        a() {
        }

        /* renamed from: b */
        private static void m25941b() {
            if (C8914y0.f21009a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C8914y0.f21009a);
            }
        }

        /* renamed from: c */
        private static void m25942c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* renamed from: d */
        private static void m25943d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        @Override // io.grpc.internal.C8914y0.c
        /* renamed from: a */
        public List<String> mo25944a(String str, String str2) {
            m25941b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e10) {
                                m25942c(all2, e10);
                            }
                        }
                        all2.close();
                    } catch (NamingException e11) {
                        m25942c(all, e11);
                    }
                }
                all.close();
            } catch (NamingException e12) {
                m25943d(initialDirContext, e12);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* renamed from: io.grpc.internal.y0$b */
    /* loaded from: classes3.dex */
    static final class b implements C8834c0.f {

        /* renamed from: b */
        private static final Logger f21010b = Logger.getLogger(b.class.getName());

        /* renamed from: c */
        private static final Pattern f21011c = Pattern.compile("\\s+");

        /* renamed from: a */
        private final c f21012a;

        public b(c cVar) {
            this.f21012a = cVar;
        }

        /* renamed from: b */
        static String m25945b(String str) {
            StringBuilder sb2 = new StringBuilder(str.length());
            int i10 = 0;
            boolean z10 = false;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (z10) {
                    if (charAt == '\"') {
                        z10 = false;
                    } else {
                        if (charAt == '\\') {
                            i10++;
                            charAt = str.charAt(i10);
                        }
                        sb2.append(charAt);
                    }
                } else if (charAt != ' ') {
                    if (charAt == '\"') {
                        z10 = true;
                    }
                    sb2.append(charAt);
                }
                i10++;
            }
            return sb2.toString();
        }

        @Override // io.grpc.internal.C8834c0.f
        /* renamed from: a */
        public List<String> mo25355a(String str) {
            Logger logger = f21010b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> mo25944a = this.f21012a.mo25944a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(mo25944a.size())});
            }
            ArrayList arrayList = new ArrayList(mo25944a.size());
            Iterator<String> it = mo25944a.iterator();
            while (it.hasNext()) {
                arrayList.add(m25945b(it.next()));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* renamed from: io.grpc.internal.y0$c */
    /* loaded from: classes3.dex */
    interface c {
        /* renamed from: a */
        List<String> mo25944a(String str, String str2);
    }

    /* renamed from: d */
    private static Throwable m25940d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e10) {
            return e10;
        } catch (Error e11) {
            return e11;
        } catch (RuntimeException e12) {
            return e12;
        }
    }

    @Override // io.grpc.internal.C8834c0.g
    /* renamed from: a */
    public C8834c0.f mo25356a() {
        if (mo25357b() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.C8834c0.g
    /* renamed from: b */
    public Throwable mo25357b() {
        return f21009a;
    }
}
