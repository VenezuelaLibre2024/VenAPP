package com.google.crypto.tink.shaded.protobuf;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.t0 */
/* loaded from: classes2.dex */
public final class C6007t0 {

    /* renamed from: a */
    private static final char[] f12735a;

    static {
        char[] cArr = new char[80];
        f12735a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    private static void m16086a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f12735a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    /* renamed from: b */
    private static boolean m16087b(Object obj) {
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
            if (!(obj instanceof AbstractC5970h)) {
                return obj instanceof InterfaceC6001r0 ? obj == ((InterfaceC6001r0) obj).mo16043e() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC5970h.f12591b;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    private static String m16088c(String str) {
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
    /* renamed from: d */
    public static void m16089d(StringBuilder sb2, int i10, String str, Object obj) {
        String m15861a;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m16089d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m16089d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m16086a(i10, sb2);
        sb2.append(m16088c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            m15861a = C5984l1.m15863c((String) obj);
        } else {
            if (!(obj instanceof AbstractC5970h)) {
                if (obj instanceof AbstractC6018y) {
                    sb2.append(" {");
                    m16090e((AbstractC6018y) obj, sb2, i10 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb2.append(": ");
                    sb2.append(obj);
                    return;
                } else {
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i11 = i10 + 2;
                    m16089d(sb2, i11, Constants.KEY, entry.getKey());
                    m16089d(sb2, i11, "value", entry.getValue());
                }
                sb2.append("\n");
                m16086a(i10, sb2);
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            m15861a = C5984l1.m15861a((AbstractC5970h) obj);
        }
        sb2.append(m15861a);
        sb2.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L56;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m16090e(com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0 r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6007t0.m16090e(com.google.crypto.tink.shaded.protobuf.r0, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m16091f(InterfaceC6001r0 interfaceC6001r0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m16090e(interfaceC6001r0, sb2, 0);
        return sb2.toString();
    }
}
