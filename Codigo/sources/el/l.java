package el;

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

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f14781a = new l();

    private l() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> f02;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            f02 = dk.z.f0(ServiceLoader.load(cls, classLoader));
            return f02;
        }
    }

    private final List<String> e(URL url) {
        boolean E;
        BufferedReader bufferedReader;
        String D0;
        String I0;
        String D02;
        String url2 = url.toString();
        E = xk.p.E(url2, "jar", false, 2, null);
        if (!E) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f10 = f14781a.f(bufferedReader);
                mk.b.a(bufferedReader, null);
                return f10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        D0 = xk.q.D0(url2, "jar:file:", null, 2, null);
        I0 = xk.q.I0(D0, '!', null, 2, null);
        D02 = xk.q.D0(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(I0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(D02)), "UTF-8"));
            try {
                List<String> f11 = f14781a.f(bufferedReader);
                mk.b.a(bufferedReader, null);
                jarFile.close();
                return f11;
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
                    ck.b.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> f02;
        String J0;
        CharSequence K0;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                f02 = dk.z.f0(linkedHashSet);
                return f02;
            }
            J0 = xk.q.J0(readLine, "#", null, 2, null);
            K0 = xk.q.K0(J0);
            String obj = K0.toString();
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

    public final List<v> c() {
        v vVar;
        if (!m.a()) {
            return b(v.class, v.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            v vVar2 = null;
            try {
                vVar = (v) v.class.cast(Class.forName("al.a", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                vVar = null;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
            try {
                vVar2 = (v) v.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, v.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (vVar2 == null) {
                return arrayList;
            }
            arrayList.add(vVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(v.class, v.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set j02;
        int r10;
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        kotlin.jvm.internal.n.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dk.w.u(arrayList, f14781a.e((URL) it.next()));
        }
        j02 = dk.z.j0(arrayList);
        if (!(!j02.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set = j02;
        r10 = dk.s.r(set, 10);
        ArrayList arrayList2 = new ArrayList(r10);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f14781a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
