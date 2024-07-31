package p119g7;

import com.google.common.collect.AbstractC5907w;
import io.flutter.plugins.googlemobileads.Constants;
import p216l7.C9400a;
import p306q7.AbstractC10287i;
import p306q7.C10279a;
import p306q7.C10283e;
import p306q7.C10288j;
import p306q7.C10291m;
import p328r7.C10631a;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p363t8.C11173s;
import p459y6.C12632v;

/* renamed from: g7.h */
/* loaded from: classes.dex */
final class C7472h {

    /* renamed from: a */
    static final String[] f17550a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX, "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static C10283e m22691a(int i10, C11146e0 c11146e0) {
        int m34692q = c11146e0.m34692q();
        if (c11146e0.m34692q() == 1684108385) {
            c11146e0.m34678V(8);
            String m34659C = c11146e0.m34659C(m34692q - 16);
            return new C10283e("und", m34659C, m34659C);
        }
        C11173s.m34970i("MetadataUtil", "Failed to parse comment attribute: " + AbstractC7465a.m22590a(i10));
        return null;
    }

    /* renamed from: b */
    private static C10279a m22692b(C11146e0 c11146e0) {
        String str;
        int m34692q = c11146e0.m34692q();
        if (c11146e0.m34692q() == 1684108385) {
            int m22591b = AbstractC7465a.m22591b(c11146e0.m34692q());
            String str2 = m22591b == 13 ? "image/jpeg" : m22591b == 14 ? "image/png" : null;
            if (str2 != null) {
                c11146e0.m34678V(4);
                int i10 = m34692q - 16;
                byte[] bArr = new byte[i10];
                c11146e0.m34688l(bArr, 0, i10);
                return new C10279a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + m22591b;
        } else {
            str = "Failed to parse cover art attribute";
        }
        C11173s.m34970i("MetadataUtil", str);
        return null;
    }

    /* renamed from: c */
    public static C9400a.b m22693c(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f() + c11146e0.m34692q();
        int m34692q = c11146e0.m34692q();
        int i10 = (m34692q >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & m34692q;
                if (i11 == 6516084) {
                    return m22691a(m34692q, c11146e0);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return m22698h(m34692q, "TIT2", c11146e0);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return m22698h(m34692q, "TCOM", c11146e0);
                }
                if (i11 == 6578553) {
                    return m22698h(m34692q, "TDRC", c11146e0);
                }
                if (i11 == 4280916) {
                    return m22698h(m34692q, "TPE1", c11146e0);
                }
                if (i11 == 7630703) {
                    return m22698h(m34692q, "TSSE", c11146e0);
                }
                if (i11 == 6384738) {
                    return m22698h(m34692q, "TALB", c11146e0);
                }
                if (i11 == 7108978) {
                    return m22698h(m34692q, "USLT", c11146e0);
                }
                if (i11 == 6776174) {
                    return m22698h(m34692q, "TCON", c11146e0);
                }
                if (i11 == 6779504) {
                    return m22698h(m34692q, "TIT1", c11146e0);
                }
            } else {
                if (m34692q == 1735291493) {
                    return m22697g(c11146e0);
                }
                if (m34692q == 1684632427) {
                    return m22694d(m34692q, "TPOS", c11146e0);
                }
                if (m34692q == 1953655662) {
                    return m22694d(m34692q, "TRCK", c11146e0);
                }
                if (m34692q == 1953329263) {
                    return m22699i(m34692q, "TBPM", c11146e0, true, false);
                }
                if (m34692q == 1668311404) {
                    return m22699i(m34692q, "TCMP", c11146e0, true, true);
                }
                if (m34692q == 1668249202) {
                    return m22692b(c11146e0);
                }
                if (m34692q == 1631670868) {
                    return m22698h(m34692q, "TPE2", c11146e0);
                }
                if (m34692q == 1936682605) {
                    return m22698h(m34692q, "TSOT", c11146e0);
                }
                if (m34692q == 1936679276) {
                    return m22698h(m34692q, "TSO2", c11146e0);
                }
                if (m34692q == 1936679282) {
                    return m22698h(m34692q, "TSOA", c11146e0);
                }
                if (m34692q == 1936679265) {
                    return m22698h(m34692q, "TSOP", c11146e0);
                }
                if (m34692q == 1936679791) {
                    return m22698h(m34692q, "TSOC", c11146e0);
                }
                if (m34692q == 1920233063) {
                    return m22699i(m34692q, "ITUNESADVISORY", c11146e0, false, false);
                }
                if (m34692q == 1885823344) {
                    return m22699i(m34692q, "ITUNESGAPLESS", c11146e0, false, true);
                }
                if (m34692q == 1936683886) {
                    return m22698h(m34692q, "TVSHOWSORT", c11146e0);
                }
                if (m34692q == 1953919848) {
                    return m22698h(m34692q, "TVSHOW", c11146e0);
                }
                if (m34692q == 757935405) {
                    return m22695e(c11146e0, m34683f);
                }
            }
            C11173s.m34963b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC7465a.m22590a(m34692q));
            c11146e0.m34677U(m34683f);
            return null;
        } finally {
            c11146e0.m34677U(m34683f);
        }
    }

    /* renamed from: d */
    private static C10291m m22694d(int i10, String str, C11146e0 c11146e0) {
        int m34692q = c11146e0.m34692q();
        if (c11146e0.m34692q() == 1684108385 && m34692q >= 22) {
            c11146e0.m34678V(10);
            int m34670N = c11146e0.m34670N();
            if (m34670N > 0) {
                String str2 = "" + m34670N;
                int m34670N2 = c11146e0.m34670N();
                if (m34670N2 > 0) {
                    str2 = str2 + "/" + m34670N2;
                }
                return new C10291m(str, null, AbstractC5907w.m15082w(str2));
            }
        }
        C11173s.m34970i("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC7465a.m22590a(i10));
        return null;
    }

    /* renamed from: e */
    private static AbstractC10287i m22695e(C11146e0 c11146e0, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (c11146e0.m34683f() < i10) {
            int m34683f = c11146e0.m34683f();
            int m34692q = c11146e0.m34692q();
            int m34692q2 = c11146e0.m34692q();
            c11146e0.m34678V(4);
            if (m34692q2 == 1835360622) {
                str = c11146e0.m34659C(m34692q - 12);
            } else if (m34692q2 == 1851878757) {
                str2 = c11146e0.m34659C(m34692q - 12);
            } else {
                if (m34692q2 == 1684108385) {
                    i11 = m34683f;
                    i12 = m34692q;
                }
                c11146e0.m34678V(m34692q - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        c11146e0.m34677U(i11);
        c11146e0.m34678V(16);
        return new C10288j(str, str2, c11146e0.m34659C(i12 - 16));
    }

    /* renamed from: f */
    public static C10631a m22696f(C11146e0 c11146e0, int i10, String str) {
        while (true) {
            int m34683f = c11146e0.m34683f();
            if (m34683f >= i10) {
                return null;
            }
            int m34692q = c11146e0.m34692q();
            if (c11146e0.m34692q() == 1684108385) {
                int m34692q2 = c11146e0.m34692q();
                int m34692q3 = c11146e0.m34692q();
                int i11 = m34692q - 16;
                byte[] bArr = new byte[i11];
                c11146e0.m34688l(bArr, 0, i11);
                return new C10631a(str, bArr, m34692q3, m34692q2);
            }
            c11146e0.m34677U(m34683f + m34692q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p306q7.C10291m m22697g(p363t8.C11146e0 r3) {
        /*
            int r3 = m22700j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = p119g7.C7472h.f17550a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            q7.m r1 = new q7.m
            java.lang.String r2 = "TCON"
            com.google.common.collect.w r3 = com.google.common.collect.AbstractC5907w.m15082w(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p363t8.C11173s.m34970i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7472h.m22697g(t8.e0):q7.m");
    }

    /* renamed from: h */
    private static C10291m m22698h(int i10, String str, C11146e0 c11146e0) {
        int m34692q = c11146e0.m34692q();
        if (c11146e0.m34692q() == 1684108385) {
            c11146e0.m34678V(8);
            return new C10291m(str, null, AbstractC5907w.m15082w(c11146e0.m34659C(m34692q - 16)));
        }
        C11173s.m34970i("MetadataUtil", "Failed to parse text attribute: " + AbstractC7465a.m22590a(i10));
        return null;
    }

    /* renamed from: i */
    private static AbstractC10287i m22699i(int i10, String str, C11146e0 c11146e0, boolean z10, boolean z11) {
        int m22700j = m22700j(c11146e0);
        if (z11) {
            m22700j = Math.min(1, m22700j);
        }
        if (m22700j >= 0) {
            return z10 ? new C10291m(str, null, AbstractC5907w.m15082w(Integer.toString(m22700j))) : new C10283e("und", str, Integer.toString(m22700j));
        }
        C11173s.m34970i("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC7465a.m22590a(i10));
        return null;
    }

    /* renamed from: j */
    private static int m22700j(C11146e0 c11146e0) {
        c11146e0.m34678V(4);
        if (c11146e0.m34692q() == 1684108385) {
            c11146e0.m34678V(8);
            return c11146e0.m34664H();
        }
        C11173s.m34970i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m22701k(int i10, C12632v c12632v, C11108u1.b bVar) {
        if (i10 == 1 && c12632v.m41603a()) {
            bVar.m34535P(c12632v.f34324a).m34536Q(c12632v.f34325b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m22702l(int r5, p216l7.C9400a r6, p216l7.C9400a r7, p361t6.C11108u1.b r8, p216l7.C9400a... r9) {
        /*
            l7.a r0 = new l7.a
            r1 = 0
            l7.a$b[] r2 = new p216l7.C9400a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.m27999e()
            if (r5 >= r6) goto L3c
            l7.a$b r6 = r7.m27998d(r5)
            boolean r3 = r6 instanceof p328r7.C10631a
            if (r3 == 0) goto L39
            r7.a r6 = (p328r7.C10631a) r6
            java.lang.String r3 = r6.f26859a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            l7.a r5 = new l7.a
            l7.a$b[] r7 = new p216l7.C9400a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            l7.a r6 = r6.m27996b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.m27999e()
            if (r5 <= 0) goto L52
            r8.m34545Z(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7472h.m22702l(int, l7.a, l7.a, t6.u1$b, l7.a[]):void");
    }
}
