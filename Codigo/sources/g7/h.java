package g7;

import com.google.common.collect.w;
import io.flutter.plugins.googlemobileads.Constants;
import l7.a;
import t6.u1;
import t8.e0;
import t8.s;
import y6.v;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f15957a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", Constants.REQUEST_AGENT_GAME_TEMPLATE_PREFIX, "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static q7.e a(int i10, e0 e0Var) {
        int q10 = e0Var.q();
        if (e0Var.q() == 1684108385) {
            e0Var.V(8);
            String C = e0Var.C(q10 - 16);
            return new q7.e("und", C, C);
        }
        s.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static q7.a b(e0 e0Var) {
        String str;
        int q10 = e0Var.q();
        if (e0Var.q() == 1684108385) {
            int b10 = a.b(e0Var.q());
            String str2 = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str2 != null) {
                e0Var.V(4);
                int i10 = q10 - 16;
                byte[] bArr = new byte[i10];
                e0Var.l(bArr, 0, i10);
                return new q7.a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + b10;
        } else {
            str = "Failed to parse cover art attribute";
        }
        s.i("MetadataUtil", str);
        return null;
    }

    public static a.b c(e0 e0Var) {
        int f10 = e0Var.f() + e0Var.q();
        int q10 = e0Var.q();
        int i10 = (q10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & q10;
                if (i11 == 6516084) {
                    return a(q10, e0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return h(q10, "TIT2", e0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return h(q10, "TCOM", e0Var);
                }
                if (i11 == 6578553) {
                    return h(q10, "TDRC", e0Var);
                }
                if (i11 == 4280916) {
                    return h(q10, "TPE1", e0Var);
                }
                if (i11 == 7630703) {
                    return h(q10, "TSSE", e0Var);
                }
                if (i11 == 6384738) {
                    return h(q10, "TALB", e0Var);
                }
                if (i11 == 7108978) {
                    return h(q10, "USLT", e0Var);
                }
                if (i11 == 6776174) {
                    return h(q10, "TCON", e0Var);
                }
                if (i11 == 6779504) {
                    return h(q10, "TIT1", e0Var);
                }
            } else {
                if (q10 == 1735291493) {
                    return g(e0Var);
                }
                if (q10 == 1684632427) {
                    return d(q10, "TPOS", e0Var);
                }
                if (q10 == 1953655662) {
                    return d(q10, "TRCK", e0Var);
                }
                if (q10 == 1953329263) {
                    return i(q10, "TBPM", e0Var, true, false);
                }
                if (q10 == 1668311404) {
                    return i(q10, "TCMP", e0Var, true, true);
                }
                if (q10 == 1668249202) {
                    return b(e0Var);
                }
                if (q10 == 1631670868) {
                    return h(q10, "TPE2", e0Var);
                }
                if (q10 == 1936682605) {
                    return h(q10, "TSOT", e0Var);
                }
                if (q10 == 1936679276) {
                    return h(q10, "TSO2", e0Var);
                }
                if (q10 == 1936679282) {
                    return h(q10, "TSOA", e0Var);
                }
                if (q10 == 1936679265) {
                    return h(q10, "TSOP", e0Var);
                }
                if (q10 == 1936679791) {
                    return h(q10, "TSOC", e0Var);
                }
                if (q10 == 1920233063) {
                    return i(q10, "ITUNESADVISORY", e0Var, false, false);
                }
                if (q10 == 1885823344) {
                    return i(q10, "ITUNESGAPLESS", e0Var, false, true);
                }
                if (q10 == 1936683886) {
                    return h(q10, "TVSHOWSORT", e0Var);
                }
                if (q10 == 1953919848) {
                    return h(q10, "TVSHOW", e0Var);
                }
                if (q10 == 757935405) {
                    return e(e0Var, f10);
                }
            }
            s.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(q10));
            e0Var.U(f10);
            return null;
        } finally {
            e0Var.U(f10);
        }
    }

    private static q7.m d(int i10, String str, e0 e0Var) {
        int q10 = e0Var.q();
        if (e0Var.q() == 1684108385 && q10 >= 22) {
            e0Var.V(10);
            int N = e0Var.N();
            if (N > 0) {
                String str2 = "" + N;
                int N2 = e0Var.N();
                if (N2 > 0) {
                    str2 = str2 + "/" + N2;
                }
                return new q7.m(str, null, w.w(str2));
            }
        }
        s.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static q7.i e(e0 e0Var, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (e0Var.f() < i10) {
            int f10 = e0Var.f();
            int q10 = e0Var.q();
            int q11 = e0Var.q();
            e0Var.V(4);
            if (q11 == 1835360622) {
                str = e0Var.C(q10 - 12);
            } else if (q11 == 1851878757) {
                str2 = e0Var.C(q10 - 12);
            } else {
                if (q11 == 1684108385) {
                    i11 = f10;
                    i12 = q10;
                }
                e0Var.V(q10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        e0Var.U(i11);
        e0Var.V(16);
        return new q7.j(str, str2, e0Var.C(i12 - 16));
    }

    public static r7.a f(e0 e0Var, int i10, String str) {
        while (true) {
            int f10 = e0Var.f();
            if (f10 >= i10) {
                return null;
            }
            int q10 = e0Var.q();
            if (e0Var.q() == 1684108385) {
                int q11 = e0Var.q();
                int q12 = e0Var.q();
                int i11 = q10 - 16;
                byte[] bArr = new byte[i11];
                e0Var.l(bArr, 0, i11);
                return new r7.a(str, bArr, q12, q11);
            }
            e0Var.U(f10 + q10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static q7.m g(t8.e0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = g7.h.f15957a
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
            com.google.common.collect.w r3 = com.google.common.collect.w.w(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            t8.s.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h.g(t8.e0):q7.m");
    }

    private static q7.m h(int i10, String str, e0 e0Var) {
        int q10 = e0Var.q();
        if (e0Var.q() == 1684108385) {
            e0Var.V(8);
            return new q7.m(str, null, w.w(e0Var.C(q10 - 16)));
        }
        s.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    private static q7.i i(int i10, String str, e0 e0Var, boolean z10, boolean z11) {
        int j10 = j(e0Var);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 >= 0) {
            return z10 ? new q7.m(str, null, w.w(Integer.toString(j10))) : new q7.e("und", str, Integer.toString(j10));
        }
        s.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    private static int j(e0 e0Var) {
        e0Var.V(4);
        if (e0Var.q() == 1684108385) {
            e0Var.V(8);
            return e0Var.H();
        }
        s.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, v vVar, u1.b bVar) {
        if (i10 == 1 && vVar.a()) {
            bVar.P(vVar.f31788a).Q(vVar.f31789b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(int r5, l7.a r6, l7.a r7, t6.u1.b r8, l7.a... r9) {
        /*
            l7.a r0 = new l7.a
            r1 = 0
            l7.a$b[] r2 = new l7.a.b[r1]
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
            int r6 = r7.e()
            if (r5 >= r6) goto L3c
            l7.a$b r6 = r7.d(r5)
            boolean r3 = r6 instanceof r7.a
            if (r3 == 0) goto L39
            r7.a r6 = (r7.a) r6
            java.lang.String r3 = r6.f24745a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            l7.a r5 = new l7.a
            l7.a$b[] r7 = new l7.a.b[r2]
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
            l7.a r6 = r6.b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.e()
            if (r5 <= 0) goto L52
            r8.Z(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h.l(int, l7.a, l7.a, t6.u1$b, l7.a[]):void");
    }
}
