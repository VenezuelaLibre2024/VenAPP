package com.google.protobuf;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f13348a;

    static {
        char[] cArr = new char[80];
        f13348a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f13348a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
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
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof g)) {
                return obj instanceof r0 ? obj == ((r0) obj).e() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = g.f13185b;
        }
        return obj.equals(obj2);
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StringBuilder sb2, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        sb2.append(c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            a10 = l1.c((String) obj);
        } else {
            if (!(obj instanceof g)) {
                if (obj instanceof x) {
                    sb2.append(" {");
                    e((x) obj, sb2, i10 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb2.append(": ");
                    sb2.append(obj);
                    return;
                } else {
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i11 = i10 + 2;
                    d(sb2, i11, Constants.KEY, entry.getKey());
                    d(sb2, i11, "value", entry.getValue());
                }
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            a10 = l1.a((g) obj);
        }
        sb2.append(a10);
        sb2.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(com.google.protobuf.r0 r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.e(com.google.protobuf.r0, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(r0 r0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        e(r0Var, sb2, 0);
        return sb2.toString();
    }
}
