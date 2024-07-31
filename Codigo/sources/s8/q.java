package s8;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashMap;
import java.util.Map;
import s8.e;
import t8.r0;
import t8.z;

/* loaded from: classes.dex */
public final class q implements e, m0 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25326p = com.google.common.collect.w.z(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25327q = com.google.common.collect.w.z(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25328r = com.google.common.collect.w.z(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25329s = com.google.common.collect.w.z(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25330t = com.google.common.collect.w.z(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.common.collect.w<Long> f25331u = com.google.common.collect.w.z(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: v, reason: collision with root package name */
    private static q f25332v;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.y<Integer, Long> f25333a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.C0420a f25334b;

    /* renamed from: c, reason: collision with root package name */
    private final k0 f25335c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.d f25336d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25337e;

    /* renamed from: f, reason: collision with root package name */
    private int f25338f;

    /* renamed from: g, reason: collision with root package name */
    private long f25339g;

    /* renamed from: h, reason: collision with root package name */
    private long f25340h;

    /* renamed from: i, reason: collision with root package name */
    private int f25341i;

    /* renamed from: j, reason: collision with root package name */
    private long f25342j;

    /* renamed from: k, reason: collision with root package name */
    private long f25343k;

    /* renamed from: l, reason: collision with root package name */
    private long f25344l;

    /* renamed from: m, reason: collision with root package name */
    private long f25345m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25346n;

    /* renamed from: o, reason: collision with root package name */
    private int f25347o;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25348a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f25349b;

        /* renamed from: c, reason: collision with root package name */
        private int f25350c;

        /* renamed from: d, reason: collision with root package name */
        private t8.d f25351d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25352e;

        public b(Context context) {
            this.f25348a = context == null ? null : context.getApplicationContext();
            this.f25349b = b(r0.N(context));
            this.f25350c = AdError.SERVER_ERROR_CODE;
            this.f25351d = t8.d.f26644a;
            this.f25352e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] l10 = q.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            com.google.common.collect.w<Long> wVar = q.f25326p;
            hashMap.put(2, wVar.get(l10[0]));
            hashMap.put(3, q.f25327q.get(l10[1]));
            hashMap.put(4, q.f25328r.get(l10[2]));
            hashMap.put(5, q.f25329s.get(l10[3]));
            hashMap.put(10, q.f25330t.get(l10[4]));
            hashMap.put(9, q.f25331u.get(l10[5]));
            hashMap.put(7, wVar.get(l10[0]));
            return hashMap;
        }

        public q a() {
            return new q(this.f25348a, this.f25349b, this.f25350c, this.f25351d, this.f25352e);
        }
    }

    private q(Context context, Map<Integer, Long> map, int i10, t8.d dVar, boolean z10) {
        this.f25333a = com.google.common.collect.y.c(map);
        this.f25334b = new e.a.C0420a();
        this.f25335c = new k0(i10);
        this.f25336d = dVar;
        this.f25337e = z10;
        if (context == null) {
            this.f25341i = 0;
            this.f25344l = m(0);
            return;
        }
        t8.z d10 = t8.z.d(context);
        int f10 = d10.f();
        this.f25341i = f10;
        this.f25344l = m(f10);
        d10.i(new z.c() { // from class: s8.p
            @Override // t8.z.c
            public final void a(int i11) {
                q.this.q(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] l(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = '\n';
                    break;
                }
                break;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                if (str.equals("AU")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
                    break;
                }
                break;
        }
        int[] iArr = {2, 2, 0, 0, 2, 2};
        switch (c10) {
            case 0:
            case '1':
                return iArr;
            case 1:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 2:
            case 166:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 3:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 4:
            case 16:
            case 25:
            case 28:
            case '8':
            case 'D':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 5:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 6:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 7:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\b':
            case '>':
            case 188:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\t':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\n':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 1;
                iArr[5] = 4;
                return iArr;
            case 11:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 0;
                return iArr;
            case '\f':
            case 'U':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\r':
            case '2':
            case 'x':
            case 140:
            case 143:
            case 170:
            case 193:
            case 223:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 14:
            case 19:
            case ':':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 15:
            case '^':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 17:
            case 't':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 18:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 20:
            case '?':
            case 'S':
            case 189:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 21:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 22:
            case '[':
            case 133:
            case 153:
            case 204:
            case 225:
            case 233:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 23:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 24:
            case 132:
            case 175:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 26:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 27:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 29:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 0;
                return iArr;
            case 30:
            case 'v':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 31:
            case 150:
            case 231:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ' ':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '!':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\"':
            case ')':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '#':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 3;
                return iArr;
            case '$':
            case 'o':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '%':
            case 183:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '&':
            case 'L':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\'':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 3;
                return iArr;
            case '(':
            case '=':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '*':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '+':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ',':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 1;
                return iArr;
            case '-':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '.':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '/':
            case 'n':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '0':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '3':
            case 'Z':
            case '~':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '4':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case '5':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '6':
            case 201:
            case 207:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '7':
            case '<':
            case '\\':
            case '|':
            case 144:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '9':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case ';':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '@':
            case 194:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'A':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'B':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'C':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'E':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'F':
            case 205:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'G':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'H':
            case 'p':
            case 's':
            case 'w':
            case 200:
            case 224:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'I':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'J':
            case 168:
            case 192:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'K':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'M':
            case 'g':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'N':
            case 208:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'O':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'P':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'Q':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'R':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'T':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'V':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'W':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'X':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case 'Y':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ']':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '_':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case '`':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'a':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 'b':
            case 215:
            case 230:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'c':
            case 190:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'd':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 'e':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'h':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'i':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'j':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 4;
                return iArr;
            case 'k':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'l':
            case 141:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'm':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'q':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 4;
                return iArr;
            case 'r':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'u':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'y':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 'z':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '{':
            case 219:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '}':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 127:
            case 212:
            case 237:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case RecognitionOptions.ITF /* 128 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 129:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 130:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 131:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 134:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 135:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 136:
            case 217:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 137:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 138:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 139:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 142:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 145:
            case 182:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 146:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 147:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 148:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 149:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 151:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 152:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 154:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 155:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 156:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 4;
                return iArr;
            case 157:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 158:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 159:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 160:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 161:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 162:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 163:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 164:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 165:
            case 199:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 167:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case 169:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 171:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 172:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 173:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 174:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 176:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 177:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 178:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 179:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 180:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 3;
                iArr[5] = 3;
                return iArr;
            case 181:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 184:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 185:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 186:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 187:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 3;
                return iArr;
            case 191:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 195:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 196:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 197:
            case 210:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 198:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 202:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 203:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 206:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 209:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 211:
            case 221:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 213:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 214:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 216:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 0;
                return iArr;
            case 218:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 220:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 1;
                return iArr;
            case 222:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 226:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 227:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 228:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 229:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 232:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 234:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 235:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 236:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            default:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
        }
    }

    private long m(int i10) {
        Long l10 = this.f25333a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f25333a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized q n(Context context) {
        q qVar;
        synchronized (q.class) {
            if (f25332v == null) {
                f25332v = new b(context).a();
            }
            qVar = f25332v;
        }
        return qVar;
    }

    private static boolean o(n nVar, boolean z10) {
        return z10 && !nVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f25345m) {
            return;
        }
        this.f25345m = j11;
        this.f25334b.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i10) {
        int i11 = this.f25341i;
        if (i11 == 0 || this.f25337e) {
            if (this.f25346n) {
                i10 = this.f25347o;
            }
            if (i11 == i10) {
                return;
            }
            this.f25341i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f25344l = m(i10);
                long b10 = this.f25336d.b();
                p(this.f25338f > 0 ? (int) (b10 - this.f25339g) : 0, this.f25340h, this.f25344l);
                this.f25339g = b10;
                this.f25340h = 0L;
                this.f25343k = 0L;
                this.f25342j = 0L;
                this.f25335c.i();
            }
        }
    }

    @Override // s8.m0
    public synchronized void a(j jVar, n nVar, boolean z10, int i10) {
        if (o(nVar, z10)) {
            this.f25340h += i10;
        }
    }

    @Override // s8.m0
    public synchronized void c(j jVar, n nVar, boolean z10) {
        if (o(nVar, z10)) {
            t8.a.g(this.f25338f > 0);
            long b10 = this.f25336d.b();
            int i10 = (int) (b10 - this.f25339g);
            this.f25342j += i10;
            long j10 = this.f25343k;
            long j11 = this.f25340h;
            this.f25343k = j10 + j11;
            if (i10 > 0) {
                this.f25335c.c((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.f25342j >= 2000 || this.f25343k >= 524288) {
                    this.f25344l = this.f25335c.f(0.5f);
                }
                p(i10, this.f25340h, this.f25344l);
                this.f25339g = b10;
                this.f25340h = 0L;
            }
            this.f25338f--;
        }
    }

    @Override // s8.e
    public m0 d() {
        return this;
    }

    @Override // s8.e
    public void e(e.a aVar) {
        this.f25334b.e(aVar);
    }

    @Override // s8.m0
    public void f(j jVar, n nVar, boolean z10) {
    }

    @Override // s8.e
    public synchronized long g() {
        return this.f25344l;
    }

    @Override // s8.e
    public void h(Handler handler, e.a aVar) {
        t8.a.e(handler);
        t8.a.e(aVar);
        this.f25334b.b(handler, aVar);
    }

    @Override // s8.m0
    public synchronized void i(j jVar, n nVar, boolean z10) {
        if (o(nVar, z10)) {
            if (this.f25338f == 0) {
                this.f25339g = this.f25336d.b();
            }
            this.f25338f++;
        }
    }
}
