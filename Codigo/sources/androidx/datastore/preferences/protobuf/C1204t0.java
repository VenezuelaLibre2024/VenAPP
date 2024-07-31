package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1215y;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.t0 */
/* loaded from: classes.dex */
public final class C1204t0 {
    /* renamed from: a */
    private static final String m6421a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static boolean m6422b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof AbstractC1167h)) {
                return obj instanceof InterfaceC1198r0 ? obj == ((InterfaceC1198r0) obj).mo6378e() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC1167h.f4831b;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static final void m6423c(StringBuilder sb2, int i10, String str, Object obj) {
        String m6202a;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m6423c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m6423c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            m6202a = C1181l1.m6204c((String) obj);
        } else {
            if (!(obj instanceof AbstractC1167h)) {
                if (obj instanceof AbstractC1215y) {
                    sb2.append(" {");
                    m6424d((AbstractC1215y) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb2.append(": ");
                        sb2.append(obj.toString());
                        return;
                    }
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    m6423c(sb2, i13, Constants.KEY, entry.getKey());
                    m6423c(sb2, i13, "value", entry.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                }
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            m6202a = C1181l1.m6202a((AbstractC1167h) obj);
        }
        sb2.append(m6202a);
        sb2.append('\"');
    }

    /* renamed from: d */
    private static void m6424d(InterfaceC1198r0 interfaceC1198r0, StringBuilder sb2, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC1198r0.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m6423c(sb2, i10, m6421a(str2), AbstractC1215y.m6551z(method2, interfaceC1198r0, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m6423c(sb2, i10, m6421a(str3), AbstractC1215y.m6551z(method3, interfaceC1198r0, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object m6551z = AbstractC1215y.m6551z(method4, interfaceC1198r0, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) AbstractC1215y.m6551z(method5, interfaceC1198r0, new Object[0])).booleanValue();
                    } else if (m6422b(m6551z)) {
                        z10 = false;
                    }
                    if (z10) {
                        m6423c(sb2, i10, m6421a(str4), m6551z);
                    }
                }
            }
        }
        if (interfaceC1198r0 instanceof AbstractC1215y.c) {
            Iterator<Map.Entry<AbstractC1215y.d, Object>> m6454s = ((AbstractC1215y.c) interfaceC1198r0).extensions.m6454s();
            while (m6454s.hasNext()) {
                Map.Entry<AbstractC1215y.d, Object> next = m6454s.next();
                m6423c(sb2, i10, "[" + next.getKey().mo6458a() + "]", next.getValue());
            }
        }
        C1190o1 c1190o1 = ((AbstractC1215y) interfaceC1198r0).unknownFields;
        if (c1190o1 != null) {
            c1190o1.m6268m(sb2, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m6425e(InterfaceC1198r0 interfaceC1198r0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m6424d(interfaceC1198r0, sb2, 0);
        return sb2.toString();
    }
}
