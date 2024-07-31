package p089el;

import ck.C2017b;
import dk.C7033s;
import dk.C7039w;
import dk.C7042z;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: el.l */
/* loaded from: classes3.dex */
public final class C7230l {

    /* renamed from: a */
    public static final C7230l f16204a = new C7230l();

    private C7230l() {
    }

    /* renamed from: a */
    private final <S> S m21604a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m21605b(Class<S> cls, ClassLoader classLoader) {
        List<S> m20630f0;
        try {
            return m21609d(cls, classLoader);
        } catch (Throwable unused) {
            m20630f0 = C7042z.m20630f0(ServiceLoader.load(cls, classLoader));
            return m20630f0;
        }
    }

    /* renamed from: e */
    private final List<String> m21606e(URL url) {
        boolean m41031E;
        BufferedReader bufferedReader;
        String m41049D0;
        String m41058I0;
        String m41049D02;
        String url2 = url.toString();
        m41031E = C12524p.m41031E(url2, "jar", false, 2, null);
        if (!m41031E) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> m21607f = f16204a.m21607f(bufferedReader);
                C9602b.m28593a(bufferedReader, null);
                return m21607f;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        m41049D0 = C12525q.m41049D0(url2, "jar:file:", null, 2, null);
        m41058I0 = C12525q.m41058I0(m41049D0, '!', null, 2, null);
        m41049D02 = C12525q.m41049D0(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(m41058I0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m41049D02)), "UTF-8"));
            try {
                List<String> m21607f2 = f16204a.m21607f(bufferedReader);
                C9602b.m28593a(bufferedReader, null);
                jarFile.close();
                return m21607f2;
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    C2017b.m10328a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    /* renamed from: f */
    private final List<String> m21607f(BufferedReader bufferedReader) {
        List<String> m20630f0;
        String m41060J0;
        CharSequence m41062K0;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m20630f0 = C7042z.m20630f0(linkedHashSet);
                return m20630f0;
            }
            m41060J0 = C12525q.m41060J0(readLine, "#", null, 2, null);
            m41062K0 = C12525q.m41062K0(m41060J0);
            String obj = m41062K0.toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    /* renamed from: c */
    public final List<InterfaceC7246v> m21608c() {
        InterfaceC7246v interfaceC7246v;
        if (!C7232m.m21616a()) {
            return m21605b(InterfaceC7246v.class, InterfaceC7246v.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC7246v interfaceC7246v2 = null;
            try {
                interfaceC7246v = (InterfaceC7246v) InterfaceC7246v.class.cast(Class.forName("al.a", true, InterfaceC7246v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                interfaceC7246v = null;
            }
            if (interfaceC7246v != null) {
                arrayList.add(interfaceC7246v);
            }
            try {
                interfaceC7246v2 = (InterfaceC7246v) InterfaceC7246v.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC7246v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC7246v2 == null) {
                return arrayList;
            }
            arrayList.add(interfaceC7246v2);
            return arrayList;
        } catch (Throwable unused3) {
            return m21605b(InterfaceC7246v.class, InterfaceC7246v.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m21609d(Class<S> cls, ClassLoader classLoader) {
        Set m20634j0;
        int m20590r;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C9322n.m27780d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7039w.m20597u(arrayList, f16204a.m21606e((URL) it.next()));
        }
        m20634j0 = C7042z.m20634j0(arrayList);
        if (!(!m20634j0.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set = m20634j0;
        m20590r = C7033s.m20590r(set, 10);
        ArrayList arrayList2 = new ArrayList(m20590r);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f16204a.m21604a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
