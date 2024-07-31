package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.C4745m;
import com.google.common.collect.AbstractC5877h1;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5909x;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7152h;
import p082eb.C7165u;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.u */
/* loaded from: classes.dex */
public final class C4753u {

    /* renamed from: a */
    private static final Pattern f9498a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b */
    private static final Pattern f9499b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c */
    private static final Pattern f9500c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d */
    private static final Pattern f9501d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e */
    private static final Pattern f9502e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f */
    private static final Pattern f9503f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g */
    private static final String f9504g = new String(new byte[]{10});

    /* renamed from: h */
    private static final String f9505h = new String(new byte[]{13, 10});

    /* renamed from: com.google.android.exoplayer2.source.rtsp.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f9506a;

        /* renamed from: b */
        public final String f9507b;

        public a(String str, String str2) {
            this.f9506a = str;
            this.f9507b = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.u$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f9508a;

        /* renamed from: b */
        public final long f9509b;

        public b(String str, long j10) {
            this.f9508a = str;
            this.f9509b = j10;
        }
    }

    /* renamed from: a */
    public static byte[] m12229a(List<String> list) {
        return C7152h.m21265g(f9505h).m21269d(list).getBytes(C4751s.f9476r);
    }

    /* renamed from: b */
    private static String m12230b(int i10) {
        if (i10 == 200) {
            return "OK";
        }
        if (i10 == 461) {
            return "Unsupported Transport";
        }
        if (i10 == 500) {
            return "Internal Server Error";
        }
        if (i10 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i10 == 301) {
            return "Move Permanently";
        }
        if (i10 == 302) {
            return "Move Temporarily";
        }
        if (i10 == 400) {
            return "Bad Request";
        }
        if (i10 == 401) {
            return "Unauthorized";
        }
        if (i10 == 404) {
            return "Not Found";
        }
        if (i10 == 405) {
            return "Method Not Allowed";
        }
        switch (i10) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static byte[] m12231c(String str) {
        return str.getBytes(C4751s.f9476r);
    }

    /* renamed from: d */
    public static boolean m12232d(List<String> list) {
        return f9499b.matcher(list.get(0)).matches();
    }

    /* renamed from: e */
    public static boolean m12233e(String str) {
        return f9498a.matcher(str).matches() || f9499b.matcher(str).matches();
    }

    /* renamed from: f */
    public static long m12234f(String str) {
        try {
            Matcher matcher = f9500c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) C11137a.m34603e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw C11005b3.m33717c(str, e10);
        }
    }

    /* renamed from: g */
    public static int m12235g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw C11005b3.m33717c(str, e10);
        }
    }

    /* renamed from: h */
    private static int m12236h(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c10 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c10 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c10 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c10 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c10 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c10 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public static AbstractC5907w<Integer> m12237i(String str) {
        if (str == null) {
            return AbstractC5907w.m15081v();
        }
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        for (String str2 : C11172r0.m34891R0(str, ",\\s?")) {
            aVar.mo14724a(Integer.valueOf(m12236h(str2)));
        }
        return aVar.m15094k();
    }

    /* renamed from: j */
    public static C4756x m12238j(List<String> list) {
        Matcher matcher = f9498a.matcher(list.get(0));
        C11137a.m34599a(matcher.matches());
        int m12236h = m12236h((String) C11137a.m34603e(matcher.group(1)));
        Uri parse = Uri.parse((String) C11137a.m34603e(matcher.group(2)));
        int indexOf = list.indexOf("");
        C11137a.m34599a(indexOf > 0);
        return new C4756x(parse, m12236h, new C4745m.b().m12135c(list.subList(1, indexOf)).m12137e(), C7152h.m21265g(f9505h).m21269d(list.subList(indexOf + 1, list.size())));
    }

    /* renamed from: k */
    public static C4757y m12239k(List<String> list) {
        Matcher matcher = f9499b.matcher(list.get(0));
        C11137a.m34599a(matcher.matches());
        int parseInt = Integer.parseInt((String) C11137a.m34603e(matcher.group(1)));
        int indexOf = list.indexOf("");
        C11137a.m34599a(indexOf > 0);
        return new C4757y(parseInt, new C4745m.b().m12135c(list.subList(1, indexOf)).m12137e(), C7152h.m21265g(f9505h).m21269d(list.subList(indexOf + 1, list.size())));
    }

    /* renamed from: l */
    public static b m12240l(String str) {
        long parseInt;
        Matcher matcher = f9501d.matcher(str);
        if (!matcher.matches()) {
            throw C11005b3.m33717c(str, null);
        }
        String str2 = (String) C11137a.m34603e(matcher.group(1));
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(str, e10);
            }
        } else {
            parseInt = 60000;
        }
        return new b(str2, parseInt);
    }

    /* renamed from: m */
    public static a m12241m(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] m34893S0 = C11172r0.m34893S0(userInfo, ":");
        return new a(m34893S0[0], m34893S0[1]);
    }

    /* renamed from: n */
    public static C4741i m12242n(String str) {
        Matcher matcher = f9502e.matcher(str);
        if (matcher.find()) {
            return new C4741i(2, (String) C11137a.m34603e(matcher.group(1)), (String) C11137a.m34603e(matcher.group(3)), C7165u.m21352e(matcher.group(4)));
        }
        Matcher matcher2 = f9503f.matcher(str);
        if (matcher2.matches()) {
            return new C4741i(1, (String) C11137a.m34603e(matcher2.group(1)), "", "");
        }
        String valueOf = String.valueOf(str);
        throw C11005b3.m33717c(valueOf.length() != 0 ? "Invalid WWW-Authenticate header ".concat(valueOf) : new String("Invalid WWW-Authenticate header "), null);
    }

    /* renamed from: o */
    public static Uri m12243o(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) C11137a.m34603e(uri.getAuthority());
        C11137a.m34599a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(C11172r0.m34891R0(str, "@")[1]).build();
    }

    /* renamed from: p */
    public static AbstractC5907w<String> m12244p(C4756x c4756x) {
        C11137a.m34599a(c4756x.f9517c.m12131d("CSeq") != null);
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        aVar.mo14724a(C11172r0.m34860C("%s %s %s", m12247s(c4756x.f9516b), c4756x.f9515a, "RTSP/1.0"));
        C5909x<String, String> m12130b = c4756x.f9517c.m12130b();
        AbstractC5877h1<String> it = m12130b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC5907w<String> abstractC5907w = m12130b.get(next);
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                aVar.mo14724a(C11172r0.m34860C("%s: %s", next, abstractC5907w.get(i10)));
            }
        }
        aVar.mo14724a("");
        aVar.mo14724a(c4756x.f9518d);
        return aVar.m15094k();
    }

    /* renamed from: q */
    public static AbstractC5907w<String> m12245q(C4757y c4757y) {
        C11137a.m34599a(c4757y.f9520b.m12131d("CSeq") != null);
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        aVar.mo14724a(C11172r0.m34860C("%s %s %s", "RTSP/1.0", Integer.valueOf(c4757y.f9519a), m12230b(c4757y.f9519a)));
        C5909x<String, String> m12130b = c4757y.f9520b.m12130b();
        AbstractC5877h1<String> it = m12130b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC5907w<String> abstractC5907w = m12130b.get(next);
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                aVar.mo14724a(C11172r0.m34860C("%s: %s", next, abstractC5907w.get(i10)));
            }
        }
        aVar.mo14724a("");
        aVar.mo14724a(c4757y.f9521c);
        return aVar.m15094k();
    }

    /* renamed from: r */
    public static String[] m12246r(String str) {
        String str2 = f9505h;
        if (!str.contains(str2)) {
            str2 = f9504g;
        }
        return C11172r0.m34891R0(str, str2);
    }

    /* renamed from: s */
    public static String m12247s(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
