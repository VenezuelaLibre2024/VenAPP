package p217l8;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7147c;
import p137hb.C7690e;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l8.c */
/* loaded from: classes.dex */
public final class C9409c {

    /* renamed from: a */
    public final String f22829a;

    /* renamed from: b */
    public final int f22830b;

    /* renamed from: c */
    public final Integer f22831c;

    /* renamed from: d */
    public final Integer f22832d;

    /* renamed from: e */
    public final float f22833e;

    /* renamed from: f */
    public final boolean f22834f;

    /* renamed from: g */
    public final boolean f22835g;

    /* renamed from: h */
    public final boolean f22836h;

    /* renamed from: i */
    public final boolean f22837i;

    /* renamed from: j */
    public final int f22838j;

    /* renamed from: l8.c$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        public final int f22839a;

        /* renamed from: b */
        public final int f22840b;

        /* renamed from: c */
        public final int f22841c;

        /* renamed from: d */
        public final int f22842d;

        /* renamed from: e */
        public final int f22843e;

        /* renamed from: f */
        public final int f22844f;

        /* renamed from: g */
        public final int f22845g;

        /* renamed from: h */
        public final int f22846h;

        /* renamed from: i */
        public final int f22847i;

        /* renamed from: j */
        public final int f22848j;

        /* renamed from: k */
        public final int f22849k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f22839a = i10;
            this.f22840b = i11;
            this.f22841c = i12;
            this.f22842d = i13;
            this.f22843e = i14;
            this.f22844f = i15;
            this.f22845g = i16;
            this.f22846h = i17;
            this.f22847i = i18;
            this.f22848j = i19;
            this.f22849k = i20;
        }

        /* renamed from: a */
        public static a m28038a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < split.length; i20++) {
                String m21253e = C7147c.m21253e(split[i20].trim());
                m21253e.hashCode();
                switch (m21253e.hashCode()) {
                    case -1178781136:
                        if (m21253e.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (m21253e.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (m21253e.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (m21253e.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (m21253e.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m21253e.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (m21253e.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 767321349:
                        if (m21253e.equals("borderstyle")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (m21253e.equals("alignment")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1988365454:
                        if (m21253e.equals("outlinecolour")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        i16 = i20;
                        break;
                    case 1:
                        i17 = i20;
                        break;
                    case 2:
                        i18 = i20;
                        break;
                    case 3:
                        i12 = i20;
                        break;
                    case 4:
                        i15 = i20;
                        break;
                    case 5:
                        i10 = i20;
                        break;
                    case 6:
                        i14 = i20;
                        break;
                    case 7:
                        i19 = i20;
                        break;
                    case '\b':
                        i11 = i20;
                        break;
                    case '\t':
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, split.length);
            }
            return null;
        }
    }

    /* renamed from: l8.c$b */
    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: c */
        private static final Pattern f22850c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f22851d = Pattern.compile(C11172r0.m34860C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f22852e = Pattern.compile(C11172r0.m34860C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f22853f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f22854a;

        /* renamed from: b */
        public final PointF f22855b;

        private b(int i10, PointF pointF) {
            this.f22854a = i10;
            this.f22855b = pointF;
        }

        /* renamed from: a */
        private static int m28039a(String str) {
            Matcher matcher = f22853f.matcher(str);
            if (matcher.find()) {
                return C9409c.m28033e((String) C11137a.m34603e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static b m28040b(String str) {
            Matcher matcher = f22850c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) C11137a.m34603e(matcher.group(1));
                try {
                    PointF m28041c = m28041c(str2);
                    if (m28041c != null) {
                        pointF = m28041c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int m28039a = m28039a(str2);
                    if (m28039a != -1) {
                        i10 = m28039a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        /* renamed from: c */
        private static PointF m28041c(String str) {
            String group;
            String group2;
            Matcher matcher = f22851d.matcher(str);
            Matcher matcher2 = f22852e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C11173s.m34967f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C11137a.m34603e(group)).trim()), Float.parseFloat(((String) C11137a.m34603e(group2)).trim()));
        }

        /* renamed from: d */
        public static String m28042d(String str) {
            return f22850c.matcher(str).replaceAll("");
        }
    }

    private C9409c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f22829a = str;
        this.f22830b = i10;
        this.f22831c = num;
        this.f22832d = num2;
        this.f22833e = f10;
        this.f22834f = z10;
        this.f22835g = z11;
        this.f22836h = z12;
        this.f22837i = z13;
        this.f22838j = i11;
    }

    /* renamed from: b */
    public static C9409c m28030b(String str, a aVar) {
        C11137a.m34599a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f22849k;
        if (length != i10) {
            C11173s.m34970i("SsaStyle", C11172r0.m34860C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f22839a].trim();
            int i11 = aVar.f22840b;
            int m28033e = i11 != -1 ? m28033e(split[i11].trim()) : -1;
            int i12 = aVar.f22841c;
            Integer m28036h = i12 != -1 ? m28036h(split[i12].trim()) : null;
            int i13 = aVar.f22842d;
            Integer m28036h2 = i13 != -1 ? m28036h(split[i13].trim()) : null;
            int i14 = aVar.f22843e;
            float m28037i = i14 != -1 ? m28037i(split[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f22844f;
            boolean z10 = i15 != -1 && m28034f(split[i15].trim());
            int i16 = aVar.f22845g;
            boolean z11 = i16 != -1 && m28034f(split[i16].trim());
            int i17 = aVar.f22846h;
            boolean z12 = i17 != -1 && m28034f(split[i17].trim());
            int i18 = aVar.f22847i;
            boolean z13 = i18 != -1 && m28034f(split[i18].trim());
            int i19 = aVar.f22848j;
            return new C9409c(trim, m28033e, m28036h, m28036h2, m28037i, z10, z11, z12, z13, i19 != -1 ? m28035g(split[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            C11173s.m34971j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m28031c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static boolean m28032d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static int m28033e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m28031c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C11173s.m34970i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    private static boolean m28034f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            C11173s.m34971j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    /* renamed from: g */
    private static int m28035g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m28032d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C11173s.m34970i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m28036h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C11137a.m34599a(parseLong <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(C7690e.m23413d(((parseLong >> 24) & 255) ^ 255), C7690e.m23413d(parseLong & 255), C7690e.m23413d((parseLong >> 8) & 255), C7690e.m23413d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            C11173s.m34971j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: i */
    private static float m28037i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            C11173s.m34971j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
