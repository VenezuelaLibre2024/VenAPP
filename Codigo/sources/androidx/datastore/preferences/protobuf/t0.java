package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 {
    private static final String a(String str) {
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

    private static boolean b(Object obj) {
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
            if (!(obj instanceof h)) {
                return obj instanceof r0 ? obj == ((r0) obj).e() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = h.f4120b;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i10, str, (Map.Entry) it2.next());
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
            a10 = l1.c((String) obj);
        } else {
            if (!(obj instanceof h)) {
                if (obj instanceof y) {
                    sb2.append(" {");
                    d((y) obj, sb2, i10 + 2);
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
                    c(sb2, i13, Constants.KEY, entry.getKey());
                    c(sb2, i13, "value", entry.getValue());
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
            a10 = l1.a((h) obj);
        }
        sb2.append(a10);
        sb2.append('\"');
    }

    private static void d(r0 r0Var, StringBuilder sb2, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : r0Var.getClass().getDeclaredMethods()) {
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
                    c(sb2, i10, a(str2), y.z(method2, r0Var, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), y.z(method3, r0Var, new Object[0]));
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
                    Object z11 = y.z(method4, r0Var, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) y.z(method5, r0Var, new Object[0])).booleanValue();
                    } else if (b(z11)) {
                        z10 = false;
                    }
                    if (z10) {
                        c(sb2, i10, a(str4), z11);
                    }
                }
            }
        }
        if (r0Var instanceof y.c) {
            Iterator<Map.Entry<y.d, Object>> s10 = ((y.c) r0Var).extensions.s();
            while (s10.hasNext()) {
                Map.Entry<y.d, Object> next = s10.next();
                c(sb2, i10, "[" + next.getKey().a() + "]", next.getValue());
            }
        }
        o1 o1Var = ((y) r0Var).unknownFields;
        if (o1Var != null) {
            o1Var.m(sb2, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(r0 r0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(r0Var, sb2, 0);
        return sb2.toString();
    }
}
