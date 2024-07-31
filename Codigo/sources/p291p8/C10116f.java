package p291p8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p120g8.C7484b;
import p198k8.C9208c;
import p291p8.C10116f;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: p8.f */
/* loaded from: classes.dex */
public final class C10116f {

    /* renamed from: a */
    public static final Pattern f24829a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f24830b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f24831c;

    /* renamed from: d */
    private static final Map<String, Integer> f24832d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p8.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator<b> f24833c = new Comparator() { // from class: p8.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m30223e;
                m30223e = C10116f.b.m30223e((C10116f.b) obj, (C10116f.b) obj2);
                return m30223e;
            }
        };

        /* renamed from: a */
        private final c f24834a;

        /* renamed from: b */
        private final int f24835b;

        private b(c cVar, int i10) {
            this.f24834a = cVar;
            this.f24835b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m30223e(b bVar, b bVar2) {
            return Integer.compare(bVar.f24834a.f24837b, bVar2.f24834a.f24837b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p8.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final String f24836a;

        /* renamed from: b */
        public final int f24837b;

        /* renamed from: c */
        public final String f24838c;

        /* renamed from: d */
        public final Set<String> f24839d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f24837b = i10;
            this.f24836a = str;
            this.f24838c = str2;
            this.f24839d = set;
        }

        /* renamed from: a */
        public static c m30224a(String str, int i10) {
            String str2;
            String trim = str.trim();
            C11137a.m34599a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m34891R0 = C11172r0.m34891R0(trim, "\\.");
            String str3 = m34891R0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < m34891R0.length; i11++) {
                hashSet.add(m34891R0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        /* renamed from: b */
        public static c m30225b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p8.f$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final int f24840a;

        /* renamed from: b */
        public final C10114d f24841b;

        public d(int i10, C10114d c10114d) {
            this.f24840a = i10;
            this.f24841b = c10114d;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f24840a, dVar.f24840a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p8.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f24844c;

        /* renamed from: a */
        public long f24842a = 0;

        /* renamed from: b */
        public long f24843b = 0;

        /* renamed from: d */
        public int f24845d = 2;

        /* renamed from: e */
        public float f24846e = -3.4028235E38f;

        /* renamed from: f */
        public int f24847f = 1;

        /* renamed from: g */
        public int f24848g = 0;

        /* renamed from: h */
        public float f24849h = -3.4028235E38f;

        /* renamed from: i */
        public int f24850i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f24851j = 1.0f;

        /* renamed from: k */
        public int f24852k = Integer.MIN_VALUE;

        /* renamed from: b */
        private static float m30227b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        private static Layout.Alignment m30228c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            C11173s.m34970i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        private static float m30229d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        /* renamed from: e */
        private static float m30230e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        private static int m30231f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C10115e m30232a() {
            return new C10115e(m30233g().m22764a(), this.f24842a, this.f24843b);
        }

        /* renamed from: g */
        public C7484b.b m30233g() {
            float f10 = this.f24849h;
            if (f10 == -3.4028235E38f) {
                f10 = m30230e(this.f24845d);
            }
            int i10 = this.f24850i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = m30231f(this.f24845d);
            }
            C7484b.b m22781r = new C7484b.b().m22779p(m30228c(this.f24845d)).m22771h(m30227b(this.f24846e, this.f24847f), this.f24847f).m22772i(this.f24848g).m22774k(f10).m22775l(i10).m22777n(Math.min(this.f24851j, m30229d(i10, f10))).m22781r(this.f24852k);
            CharSequence charSequence = this.f24844c;
            if (charSequence != null) {
                m22781r.m22778o(charSequence);
            }
            return m22781r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24831c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24832d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m30196a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f24831c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f24832d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, i11, 33);
        }
    }

    /* renamed from: b */
    private static void m30197b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c11 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c11 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c11 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                c10 = '>';
                break;
            case 1:
                c10 = '<';
                break;
            case 2:
                c10 = '&';
                break;
            case 3:
                c10 = ' ';
                break;
            default:
                C11173s.m34970i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    /* renamed from: c */
    private static void m30198c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<C10114d> list2) {
        int m30204i = m30204i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f24833c);
        int i10 = cVar.f24837b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).f24834a.f24836a)) {
                b bVar = (b) arrayList.get(i12);
                int m30202g = m30202g(m30204i(list2, str, bVar.f24834a), m30204i, 1);
                int i13 = bVar.f24834a.f24837b - i11;
                int i14 = bVar.f24835b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new C9208c(subSequence.toString(), m30202g), i10, i13, 33);
                i11 += subSequence.length();
                i10 = i13;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0071. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[LOOP:0: B:38:0x0097->B:40:0x009d, LOOP_END] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m30199d(java.lang.String r8, p291p8.C10116f.c r9, java.util.List<p291p8.C10116f.b> r10, android.text.SpannableStringBuilder r11, java.util.List<p291p8.C10114d> r12) {
        /*
            int r0 = r9.f24837b
            int r1 = r11.length()
            java.lang.String r2 = r9.f24836a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L65;
                case 98: goto L5a;
                case 99: goto L4f;
                case 105: goto L44;
                case 117: goto L39;
                case 118: goto L2e;
                case 3314158: goto L23;
                case 3511770: goto L18;
                default: goto L16;
            }
        L16:
            goto L6f
        L18:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
            goto L6f
        L21:
            r7 = 7
            goto L6f
        L23:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L6f
        L2c:
            r7 = 6
            goto L6f
        L2e:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L6f
        L37:
            r7 = 5
            goto L6f
        L39:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L6f
        L42:
            r7 = 4
            goto L6f
        L44:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L6f
        L4d:
            r7 = 3
            goto L6f
        L4f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto L6f
        L58:
            r7 = r4
            goto L6f
        L5a:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L63
            goto L6f
        L63:
            r7 = r6
            goto L6f
        L65:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6e
            goto L6f
        L6e:
            r7 = r5
        L6f:
            r2 = 33
            switch(r7) {
                case 0: goto L93;
                case 1: goto L8b;
                case 2: goto L85;
                case 3: goto L7f;
                case 4: goto L79;
                case 5: goto L93;
                case 6: goto L93;
                case 7: goto L75;
                default: goto L74;
            }
        L74:
            return
        L75:
            m30198c(r11, r8, r9, r10, r12)
            goto L93
        L79:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            goto L90
        L7f:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r4)
            goto L90
        L85:
            java.util.Set<java.lang.String> r10 = r9.f24839d
            m30196a(r11, r10, r0, r1)
            goto L93
        L8b:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
        L90:
            r11.setSpan(r10, r0, r1, r2)
        L93:
            java.util.List r8 = m30203h(r12, r8, r9)
        L97:
            int r9 = r8.size()
            if (r5 >= r9) goto Lab
            java.lang.Object r9 = r8.get(r5)
            p8.f$d r9 = (p291p8.C10116f.d) r9
            p8.d r9 = r9.f24841b
            m30200e(r11, r9, r0, r1)
            int r5 = r5 + 1
            goto L97
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291p8.C10116f.m30199d(java.lang.String, p8.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m30200e(android.text.SpannableStringBuilder r4, p291p8.C10114d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.m30178i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.m30178i()
            r0.<init>(r1)
            p198k8.C9209d.m27392a(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.m30181l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m30182m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.m30180k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.m30172c()
            r0.<init>(r1)
            p198k8.C9209d.m27392a(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.m30179j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.m30170a()
            r0.<init>(r1)
            p198k8.C9209d.m27392a(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.m30173d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.m30173d()
            r0.<init>(r1)
            p198k8.C9209d.m27392a(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.m30175f()
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L85
            r1 = 3
            if (r0 == r1) goto L78
            goto L9c
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.m30174e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L99
        L85:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.m30174e()
            r0.<init>(r1)
            goto L99
        L8f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.m30174e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L99:
            p198k8.C9209d.m27392a(r4, r0, r6, r7, r2)
        L9c:
            boolean r5 = r5.m30171b()
            if (r5 == 0) goto Laa
            k8.a r5 = new k8.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291p8.C10116f.m30200e(android.text.SpannableStringBuilder, p8.d, int, int):void");
    }

    /* renamed from: f */
    private static int m30201f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    private static int m30202g(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static List<d> m30203h(List<C10114d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C10114d c10114d = list.get(i10);
            int m30177h = c10114d.m30177h(str, cVar.f24836a, cVar.f24839d, cVar.f24838c);
            if (m30177h > 0) {
                arrayList.add(new d(m30177h, c10114d));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static int m30204i(List<C10114d> list, String str, c cVar) {
        List<d> m30203h = m30203h(list, str, cVar);
        for (int i10 = 0; i10 < m30203h.size(); i10++) {
            C10114d c10114d = m30203h.get(i10).f24841b;
            if (c10114d.m30176g() != -1) {
                return c10114d.m30176g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static String m30205j(String str) {
        String trim = str.trim();
        C11137a.m34599a(!trim.isEmpty());
        return C11172r0.m34893S0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    private static boolean m30206k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C7484b m30207l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f24844c = charSequence;
        return eVar.m30233g().m22764a();
    }

    /* renamed from: m */
    private static C10115e m30208m(String str, Matcher matcher, C11146e0 c11146e0, List<C10114d> list) {
        e eVar = new e();
        try {
            eVar.f24842a = C10119i.m30239d((String) C11137a.m34603e(matcher.group(1)));
            eVar.f24843b = C10119i.m30239d((String) C11137a.m34603e(matcher.group(2)));
            m30211p((String) C11137a.m34603e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String m34694s = c11146e0.m34694s();
                if (TextUtils.isEmpty(m34694s)) {
                    eVar.f24844c = m30212q(str, sb2.toString(), list);
                    return eVar.m30232a();
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(m34694s.trim());
            }
        } catch (NumberFormatException unused) {
            C11173s.m34970i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: n */
    public static C10115e m30209n(C11146e0 c11146e0, List<C10114d> list) {
        String m34694s = c11146e0.m34694s();
        if (m34694s == null) {
            return null;
        }
        Pattern pattern = f24829a;
        Matcher matcher = pattern.matcher(m34694s);
        if (matcher.matches()) {
            return m30208m(null, matcher, c11146e0, list);
        }
        String m34694s2 = c11146e0.m34694s();
        if (m34694s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m34694s2);
        if (matcher2.matches()) {
            return m30208m(m34694s.trim(), matcher2, c11146e0, list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C7484b.b m30210o(String str) {
        e eVar = new e();
        m30211p(str, eVar);
        return eVar.m30233g();
    }

    /* renamed from: p */
    private static void m30211p(String str, e eVar) {
        Matcher matcher = f24830b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C11137a.m34603e(matcher.group(1));
            String str3 = (String) C11137a.m34603e(matcher.group(2));
            try {
                if (Constants.LINE.equals(str2)) {
                    m30214s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f24845d = m30217v(str3);
                } else if ("position".equals(str2)) {
                    m30216u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f24851j = C10119i.m30238c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f24852k = m30218w(str3);
                } else {
                    C11173s.m34970i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C11173s.m34970i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static SpannedString m30212q(String str, String str2, List<C10114d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m30197b(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = m30201f(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String m30205j = m30205j(substring);
                        if (m30206k(m30205j)) {
                            if (!z10) {
                                if (!z11) {
                                    arrayDeque.push(c.m30224a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                c cVar = (c) arrayDeque.pop();
                                m30199d(str, cVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                }
                                if (cVar.f24836a.equals(m30205j)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m30199d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m30199d(str, c.m30225b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    private static int m30213r(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C11173s.m34970i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    private static void m30214s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f24848g = m30213r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f24846e = C10119i.m30238c(str);
            eVar.f24847f = 0;
        } else {
            eVar.f24846e = Integer.parseInt(str);
            eVar.f24847f = 1;
        }
    }

    /* renamed from: t */
    private static int m30215t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C11173s.m34970i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    private static void m30216u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f24850i = m30215t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f24849h = C10119i.m30238c(str);
    }

    /* renamed from: v */
    private static int m30217v(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C11173s.m34970i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    private static int m30218w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C11173s.m34970i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
