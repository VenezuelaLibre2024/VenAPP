package p8;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import g8.b;
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
import p8.f;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f22896a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f22897b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f22898c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f22899d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f22900c = new Comparator() { // from class: p8.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e10;
                e10 = f.b.e((f.b) obj, (f.b) obj2);
                return e10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final c f22901a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22902b;

        private b(c cVar, int i10) {
            this.f22901a = cVar;
            this.f22902b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f22901a.f22904b, bVar2.f22901a.f22904b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f22903a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22904b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22905c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f22906d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f22904b = i10;
            this.f22903a = str;
            this.f22905c = str2;
            this.f22906d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            t8.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] R0 = r0.R0(trim, "\\.");
            String str3 = R0[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < R0.length; i11++) {
                hashSet.add(R0[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final int f22907a;

        /* renamed from: b, reason: collision with root package name */
        public final p8.d f22908b;

        public d(int i10, p8.d dVar) {
            this.f22907a = i10;
            this.f22908b = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f22907a, dVar.f22907a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f22911c;

        /* renamed from: a, reason: collision with root package name */
        public long f22909a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f22910b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f22912d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f22913e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f22914f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f22915g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f22916h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f22917i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f22918j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f22919k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            s.i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
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

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
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

        public p8.e a() {
            return new p8.e(g().a(), this.f22909a, this.f22910b);
        }

        public b.C0262b g() {
            float f10 = this.f22916h;
            if (f10 == -3.4028235E38f) {
                f10 = e(this.f22912d);
            }
            int i10 = this.f22917i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = f(this.f22912d);
            }
            b.C0262b r10 = new b.C0262b().p(c(this.f22912d)).h(b(this.f22913e, this.f22914f), this.f22914f).i(this.f22915g).k(f10).l(i10).n(Math.min(this.f22918j, d(i10, f10))).r(this.f22919k);
            CharSequence charSequence = this.f22911c;
            if (charSequence != null) {
                r10.o(charSequence);
            }
            return r10;
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
        f22898c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f22899d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f22898c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f22899d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, i11, 33);
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
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
                s.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<p8.d> list2) {
        int i10 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f22900c);
        int i11 = cVar.f22904b;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if ("rt".equals(((b) arrayList.get(i13)).f22901a.f22903a)) {
                b bVar = (b) arrayList.get(i13);
                int g10 = g(i(list2, str, bVar.f22901a), i10, 1);
                int i14 = bVar.f22901a.f22904b - i12;
                int i15 = bVar.f22902b - i12;
                CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                spannableStringBuilder.delete(i14, i15);
                spannableStringBuilder.setSpan(new k8.c(subSequence.toString(), g10), i11, i14, 33);
                i12 += subSequence.length();
                i11 = i14;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0071. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[LOOP:0: B:38:0x0097->B:40:0x009d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(java.lang.String r8, p8.f.c r9, java.util.List<p8.f.b> r10, android.text.SpannableStringBuilder r11, java.util.List<p8.d> r12) {
        /*
            int r0 = r9.f22904b
            int r1 = r11.length()
            java.lang.String r2 = r9.f22903a
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
            c(r11, r8, r9, r10, r12)
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
            java.util.Set<java.lang.String> r10 = r9.f22906d
            a(r11, r10, r0, r1)
            goto L93
        L8b:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
        L90:
            r11.setSpan(r10, r0, r1, r2)
        L93:
            java.util.List r8 = h(r12, r8, r9)
        L97:
            int r9 = r8.size()
            if (r5 >= r9) goto Lab
            java.lang.Object r9 = r8.get(r5)
            p8.f$d r9 = (p8.f.d) r9
            p8.d r9 = r9.f22908b
            e(r11, r9, r0, r1)
            int r5 = r5 + 1
            goto L97
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.f.d(java.lang.String, p8.f$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(android.text.SpannableStringBuilder r4, p8.d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.i()
            r0.<init>(r1)
            k8.d.a(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.c()
            r0.<init>(r1)
            k8.d.a(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.a()
            r0.<init>(r1)
            k8.d.a(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.d()
            r0.<init>(r1)
            k8.d.a(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.f()
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L85
            r1 = 3
            if (r0 == r1) goto L78
            goto L9c
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L99
        L85:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r0.<init>(r1)
            goto L99
        L8f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L99:
            k8.d.a(r4, r0, r6, r7, r2)
        L9c:
            boolean r5 = r5.b()
            if (r5 == 0) goto Laa
            k8.a r5 = new k8.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.f.e(android.text.SpannableStringBuilder, p8.d, int, int):void");
    }

    private static int f(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i10, int i11, int i12) {
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

    private static List<d> h(List<p8.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p8.d dVar = list.get(i10);
            int h10 = dVar.h(str, cVar.f22903a, cVar.f22906d, cVar.f22905c);
            if (h10 > 0) {
                arrayList.add(new d(h10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<p8.d> list, String str, c cVar) {
        List<d> h10 = h(list, str, cVar);
        for (int i10 = 0; i10 < h10.size(); i10++) {
            p8.d dVar = h10.get(i10).f22908b;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        t8.a.a(!trim.isEmpty());
        return r0.S0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
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
    public static g8.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f22911c = charSequence;
        return eVar.g().a();
    }

    private static p8.e m(String str, Matcher matcher, e0 e0Var, List<p8.d> list) {
        e eVar = new e();
        try {
            eVar.f22909a = i.d((String) t8.a.e(matcher.group(1)));
            eVar.f22910b = i.d((String) t8.a.e(matcher.group(2)));
            p((String) t8.a.e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String s10 = e0Var.s();
                if (TextUtils.isEmpty(s10)) {
                    eVar.f22911c = q(str, sb2.toString(), list);
                    return eVar.a();
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(s10.trim());
            }
        } catch (NumberFormatException unused) {
            s.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static p8.e n(e0 e0Var, List<p8.d> list) {
        String s10 = e0Var.s();
        if (s10 == null) {
            return null;
        }
        Pattern pattern = f22896a;
        Matcher matcher = pattern.matcher(s10);
        if (matcher.matches()) {
            return m(null, matcher, e0Var, list);
        }
        String s11 = e0Var.s();
        if (s11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(s11);
        if (matcher2.matches()) {
            return m(s10.trim(), matcher2, e0Var, list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b.C0262b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f22897b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) t8.a.e(matcher.group(1));
            String str3 = (String) t8.a.e(matcher.group(2));
            try {
                if (Constants.LINE.equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f22912d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f22918j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f22919k = w(str3);
                } else {
                    s.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                s.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpannedString q(String str, String str2, List<p8.d> list) {
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
                    b(str2.substring(i10, indexOf), spannableStringBuilder);
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
                    i11 = f(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String j10 = j(substring);
                        if (k(j10)) {
                            if (!z10) {
                                if (!z11) {
                                    arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                c cVar = (c) arrayDeque.pop();
                                d(str, cVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                }
                                if (cVar.f22903a.equals(j10)) {
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
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
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
                s.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f22915g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f22913e = i.c(str);
            eVar.f22914f = 0;
        } else {
            eVar.f22913e = Integer.parseInt(str);
            eVar.f22914f = 1;
        }
    }

    private static int t(String str) {
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
                s.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f22917i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f22916h = i.c(str);
    }

    private static int v(String str) {
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
                s.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        s.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
