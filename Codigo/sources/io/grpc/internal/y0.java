package io.grpc.internal;

import io.grpc.internal.c0;
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
/* loaded from: classes3.dex */
public final class y0 implements c0.g {

    /* renamed from: a, reason: collision with root package name */
    private static final Throwable f19262a = d();

    /* loaded from: classes3.dex */
    static final class a implements c {
        a() {
        }

        private static void b() {
            if (y0.f19262a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", y0.f19262a);
            }
        }

        private static void c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        private static void d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        @Override // io.grpc.internal.y0.c
        public List<String> a(String str, String str2) {
            b();
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
                                c(all2, e10);
                            }
                        }
                        all2.close();
                    } catch (NamingException e11) {
                        c(all, e11);
                    }
                }
                all.close();
            } catch (NamingException e12) {
                d(initialDirContext, e12);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements c0.f {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f19263b = Logger.getLogger(b.class.getName());

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f19264c = Pattern.compile("\\s+");

        /* renamed from: a, reason: collision with root package name */
        private final c f19265a;

        public b(c cVar) {
            this.f19265a = cVar;
        }

        static String b(String str) {
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

        @Override // io.grpc.internal.c0.f
        public List<String> a(String str) {
            Logger logger = f19263b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> a10 = this.f19265a.a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a10.size())});
            }
            ArrayList arrayList = new ArrayList(a10.size());
            Iterator<String> it = a10.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* loaded from: classes3.dex */
    interface c {
        List<String> a(String str, String str2);
    }

    private static Throwable d() {
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

    @Override // io.grpc.internal.c0.g
    public c0.f a() {
        if (b() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.c0.g
    public Throwable b() {
        return f19262a;
    }
}
