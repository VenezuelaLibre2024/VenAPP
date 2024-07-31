package t2;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    static d f25768f;

    /* renamed from: a, reason: collision with root package name */
    static final Set<String> f25763a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b, reason: collision with root package name */
    static final Set<String> f25764b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    static final Set<String> f25765c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    static final Set<String> f25766d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e, reason: collision with root package name */
    static boolean f25767e = false;

    /* renamed from: g, reason: collision with root package name */
    static boolean f25769g = false;

    /* renamed from: h, reason: collision with root package name */
    static boolean f25770h = true;

    /* renamed from: i, reason: collision with root package name */
    static boolean f25771i = true;

    public static int a(StringBuilder sb2, String str, int i10, StackTraceElement stackTraceElement, boolean z10, boolean z11, String str2) {
        String c10;
        if (i10 > 0) {
            if (f25768f == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            sb2.append(str2);
            if (i10 == 1) {
                c10 = f25768f.b(stackTraceElement, z10, z11);
            } else {
                sb2.append(String.format("%s%s ... %d more", f25768f.a(stackTraceElement), str, Integer.valueOf(i10 - 1)));
                if (z11) {
                    c10 = f25768f.c(stackTraceElement);
                }
            }
            sb2.append(c10);
        }
        return 0;
    }

    public static boolean b(String str, Set<String> set) {
        return c(str, set) != null;
    }

    public static String c(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static StackTraceElement[] d(f fVar, int i10) {
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            e[] d10 = fVar.d();
            for (int i11 = 0; i11 < d10.length && i11 < i10; i11++) {
                arrayList.add(d10[i11].a());
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static StackTraceElement[] e(f fVar, Set<String> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fVar != null) {
            for (e eVar : fVar.d()) {
                String className = eVar.a().getClassName();
                if (!k(className)) {
                    if (b(className, set)) {
                        arrayList.addAll(arrayList2);
                        arrayList.add(eVar.a());
                    } else if (!b(className, set2)) {
                        arrayList2.add(eVar.a());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static String f(f fVar) {
        return h(fVar, f25763a, f25764b, f25765c, 0, f25767e, f25769g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[LOOP:1: B:42:0x0129->B:43:0x012b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(t2.f r22, java.lang.String r23, boolean r24, boolean r25, java.util.Set<java.lang.String> r26, java.util.Set<java.lang.String> r27, java.util.Set<java.lang.String> r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.a.g(t2.f, java.lang.String, boolean, boolean, java.util.Set, java.util.Set, java.util.Set, int, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static String h(f fVar, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11) {
        return i(fVar, set, set2, set3, i10, z10, z11, f25770h);
    }

    public static String i(f fVar, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11, boolean z12) {
        return j(fVar, false, false, set, set2, set3, i10, z10, z11, z12, f25771i);
    }

    public static String j(f fVar, boolean z10, boolean z11, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        return g(fVar, "", z10, z11, set, set2, set3, i10, z12, z13, z14, z15);
    }

    public static boolean k(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String l(Class<?> cls) {
        String url;
        int lastIndexOf;
        if (cls == null) {
            return null;
        }
        try {
            URL resource = cls.getClassLoader().getResource(cls.getName().replace('.', '/') + ".class");
            if (resource == null || (lastIndexOf = (url = resource.toString()).lastIndexOf(33)) <= 0) {
                return null;
            }
            String substring = url.substring(0, lastIndexOf);
            int lastIndexOf2 = substring.lastIndexOf(47);
            if (lastIndexOf2 > 0) {
                substring = substring.substring(lastIndexOf2 + 1);
            }
            int lastIndexOf3 = substring.lastIndexOf(92);
            return lastIndexOf3 > 0 ? substring.substring(lastIndexOf3 + 1) : substring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String m(String str, String str2) {
        boolean z10 = str != null;
        boolean z11 = str2 != null;
        if (!z10 && !z11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" [");
        if (z10) {
            sb2.append(str);
        }
        if (z11) {
            if (z10) {
                if (!str.contains(str2)) {
                    sb2.append(":");
                }
            }
            sb2.append(str2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static String n(String str) {
        int lastIndexOf;
        return (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(0, lastIndexOf) : "";
    }

    public static void o(String str) {
        f25763a.add(str);
    }

    public static void p(d dVar) {
        f25768f = dVar;
    }

    public static String q(c cVar, Class<?> cls, String str) {
        try {
            Package r02 = cls.getPackage();
            if (r02 != null) {
                return r02.getImplementationVersion();
            }
            Package a10 = cVar.a(cls.getClassLoader(), str);
            if (a10 != null) {
                return a10.getImplementationVersion();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
