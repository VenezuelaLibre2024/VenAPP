package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.m;
import com.google.common.collect.h1;
import com.google.common.collect.w;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    private static final Pattern f8443a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b */
    private static final Pattern f8444b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c */
    private static final Pattern f8445c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d */
    private static final Pattern f8446d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e */
    private static final Pattern f8447e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f */
    private static final Pattern f8448f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g */
    private static final String f8449g = new String(new byte[]{10});

    /* renamed from: h */
    private static final String f8450h = new String(new byte[]{13, 10});

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f8451a;

        /* renamed from: b */
        public final String f8452b;

        public a(String str, String str2) {
            this.f8451a = str;
            this.f8452b = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f8453a;

        /* renamed from: b */
        public final long f8454b;

        public b(String str, long j10) {
            this.f8453a = str;
            this.f8454b = j10;
        }
    }

    public static byte[] a(List<String> list) {
        return eb.h.g(f8450h).d(list).getBytes(s.f8421r);
    }

    private static String b(int i10) {
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

    public static byte[] c(String str) {
        return str.getBytes(s.f8421r);
    }

    public static boolean d(List<String> list) {
        return f8444b.matcher(list.get(0)).matches();
    }

    public static boolean e(String str) {
        return f8443a.matcher(str).matches() || f8444b.matcher(str).matches();
    }

    public static long f(String str) {
        try {
            Matcher matcher = f8445c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) t8.a.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e10) {
            throw b3.c(str, e10);
        }
    }

    public static int g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw b3.c(str, e10);
        }
    }

    private static int h(String str) {
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

    public static com.google.common.collect.w<Integer> i(String str) {
        if (str == null) {
            return com.google.common.collect.w.v();
        }
        w.a aVar = new w.a();
        for (String str2 : r0.R0(str, ",\\s?")) {
            aVar.a(Integer.valueOf(h(str2)));
        }
        return aVar.k();
    }

    public static x j(List<String> list) {
        Matcher matcher = f8443a.matcher(list.get(0));
        t8.a.a(matcher.matches());
        int h10 = h((String) t8.a.e(matcher.group(1)));
        Uri parse = Uri.parse((String) t8.a.e(matcher.group(2)));
        int indexOf = list.indexOf("");
        t8.a.a(indexOf > 0);
        return new x(parse, h10, new m.b().c(list.subList(1, indexOf)).e(), eb.h.g(f8450h).d(list.subList(indexOf + 1, list.size())));
    }

    public static y k(List<String> list) {
        Matcher matcher = f8444b.matcher(list.get(0));
        t8.a.a(matcher.matches());
        int parseInt = Integer.parseInt((String) t8.a.e(matcher.group(1)));
        int indexOf = list.indexOf("");
        t8.a.a(indexOf > 0);
        return new y(parseInt, new m.b().c(list.subList(1, indexOf)).e(), eb.h.g(f8450h).d(list.subList(indexOf + 1, list.size())));
    }

    public static b l(String str) {
        long parseInt;
        Matcher matcher = f8446d.matcher(str);
        if (!matcher.matches()) {
            throw b3.c(str, null);
        }
        String str2 = (String) t8.a.e(matcher.group(1));
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e10) {
                throw b3.c(str, e10);
            }
        } else {
            parseInt = 60000;
        }
        return new b(str2, parseInt);
    }

    public static a m(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] S0 = r0.S0(userInfo, ":");
        return new a(S0[0], S0[1]);
    }

    public static i n(String str) {
        Matcher matcher = f8447e.matcher(str);
        if (matcher.find()) {
            return new i(2, (String) t8.a.e(matcher.group(1)), (String) t8.a.e(matcher.group(3)), eb.u.e(matcher.group(4)));
        }
        Matcher matcher2 = f8448f.matcher(str);
        if (matcher2.matches()) {
            return new i(1, (String) t8.a.e(matcher2.group(1)), "", "");
        }
        String valueOf = String.valueOf(str);
        throw b3.c(valueOf.length() != 0 ? "Invalid WWW-Authenticate header ".concat(valueOf) : new String("Invalid WWW-Authenticate header "), null);
    }

    public static Uri o(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) t8.a.e(uri.getAuthority());
        t8.a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(r0.R0(str, "@")[1]).build();
    }

    public static com.google.common.collect.w<String> p(x xVar) {
        t8.a.a(xVar.f8462c.d("CSeq") != null);
        w.a aVar = new w.a();
        aVar.a(r0.C("%s %s %s", s(xVar.f8461b), xVar.f8460a, "RTSP/1.0"));
        com.google.common.collect.x<String, String> b10 = xVar.f8462c.b();
        h1<String> it = b10.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            com.google.common.collect.w<String> wVar = b10.get(next);
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                aVar.a(r0.C("%s: %s", next, wVar.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(xVar.f8463d);
        return aVar.k();
    }

    public static com.google.common.collect.w<String> q(y yVar) {
        t8.a.a(yVar.f8465b.d("CSeq") != null);
        w.a aVar = new w.a();
        aVar.a(r0.C("%s %s %s", "RTSP/1.0", Integer.valueOf(yVar.f8464a), b(yVar.f8464a)));
        com.google.common.collect.x<String, String> b10 = yVar.f8465b.b();
        h1<String> it = b10.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            com.google.common.collect.w<String> wVar = b10.get(next);
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                aVar.a(r0.C("%s: %s", next, wVar.get(i10)));
            }
        }
        aVar.a("");
        aVar.a(yVar.f8466c);
        return aVar.k();
    }

    public static String[] r(String str) {
        String str2 = f8450h;
        if (!str.contains(str2)) {
            str2 = f8449g;
        }
        return r0.R0(str, str2);
    }

    public static String s(int i10) {
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
