package p450xk;

import dk.C7027p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.i */
/* loaded from: classes3.dex */
public class C12517i extends C12516h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xk.i$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9323o implements InterfaceC9998l<String, String> {

        /* renamed from: a */
        public static final a f33936a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            C9322n.m27781e(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xk.i$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9323o implements InterfaceC9998l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f33937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f33937a = str;
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            C9322n.m27781e(line, "line");
            return this.f33937a + line;
        }
    }

    /* renamed from: b */
    private static final InterfaceC9998l<String, String> m41014b(String str) {
        return str.length() == 0 ? a.f33936a : new b(str);
    }

    /* renamed from: c */
    private static final int m41015c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!C12510b.m40958c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* renamed from: d */
    public static final String m41016d(String str, String newIndent) {
        String invoke;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(newIndent, "newIndent");
        List<String> m41080c0 = C12525q.m41080c0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m41080c0) {
            if (!C12515g.m41007t((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7027p.m20555r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m41015c((String) it.next())));
        }
        Integer num = (Integer) C7027p.m20523P(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * m41080c0.size());
        InterfaceC9998l<String, String> m41014b = m41014b(newIndent);
        int m20548k = C7027p.m20548k(m41080c0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m41080c0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C7027p.m20554q();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == m20548k) && C12515g.m41007t(str2)) {
                str2 = null;
            } else {
                String m41107L0 = C12527s.m41107L0(str2, intValue);
                if (m41107L0 != null && (invoke = m41014b.invoke(m41107L0)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) C7027p.m20520K(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        C9322n.m27780d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m41017e(String str, String newIndent, String marginPrefix) {
        int i10;
        String invoke;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(newIndent, "newIndent");
        C9322n.m27781e(marginPrefix, "marginPrefix");
        if (!(!C12515g.m41007t(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> m41080c0 = C12525q.m41080c0(str);
        int length = str.length() + (newIndent.length() * m41080c0.size());
        InterfaceC9998l<String, String> m41014b = m41014b(newIndent);
        int m20548k = C7027p.m20548k(m41080c0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : m41080c0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7027p.m20554q();
            }
            String str2 = (String) obj;
            String str3 = null;
            if ((i11 == 0 || i11 == m20548k) && C12515g.m41007t(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!C12510b.m40958c(str2.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (C12515g.m40976D(str2, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        C9322n.m27779c(str2, "null cannot be cast to non-null type java.lang.String");
                        str3 = str2.substring(length3);
                        C9322n.m27780d(str3, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (str3 != null && (invoke = m41014b.invoke(str3)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) C7027p.m20520K(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        C9322n.m27780d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    /* renamed from: f */
    public static String m41018f(String str) {
        C9322n.m27781e(str, "<this>");
        return m41016d(str, "");
    }

    /* renamed from: g */
    public static final String m41019g(String str, String marginPrefix) {
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(marginPrefix, "marginPrefix");
        return m41017e(str, "", marginPrefix);
    }

    /* renamed from: h */
    public static /* synthetic */ String m41020h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return m41019g(str, str2);
    }
}
