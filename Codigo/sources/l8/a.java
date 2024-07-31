package l8;

import android.text.Layout;
import eb.e;
import g8.h;
import g8.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.c;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f20987t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    private final boolean f20988o;

    /* renamed from: p, reason: collision with root package name */
    private final b f20989p;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, c> f20990q;

    /* renamed from: r, reason: collision with root package name */
    private float f20991r;

    /* renamed from: s, reason: collision with root package name */
    private float f20992s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f20991r = -3.4028235E38f;
        this.f20992s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f20988o = false;
            this.f20989p = null;
            return;
        }
        this.f20988o = true;
        String D = r0.D(list.get(0));
        t8.a.a(D.startsWith("Format:"));
        this.f20989p = (b) t8.a.e(b.a(D));
        H(new e0(list.get(1)), e.f14596c);
    }

    private static int B(long j10, List<Long> list, List<List<g8.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float C(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static g8.b D(java.lang.String r8, l8.c r9, l8.c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.a.D(java.lang.String, l8.c, l8.c$b, float, float):g8.b");
    }

    private Charset E(e0 e0Var) {
        Charset P = e0Var.P();
        return P != null ? P : e.f14596c;
    }

    private void F(String str, b bVar, List<List<g8.b>> list, List<Long> list2) {
        int i10;
        StringBuilder sb2;
        t8.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f20997e);
        if (split.length != bVar.f20997e) {
            sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long K = K(split[bVar.f20993a]);
            if (K == -9223372036854775807L) {
                sb2 = new StringBuilder();
            } else {
                long K2 = K(split[bVar.f20994b]);
                if (K2 != -9223372036854775807L) {
                    Map<String, c> map = this.f20990q;
                    c cVar = (map == null || (i10 = bVar.f20995c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[bVar.f20996d];
                    g8.b D = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f20991r, this.f20992s);
                    int B = B(K2, list2, list);
                    for (int B2 = B(K, list2, list); B2 < B; B2++) {
                        list.get(B2).add(D);
                    }
                    return;
                }
                sb2 = new StringBuilder();
            }
            sb2.append("Skipping invalid timing: ");
        }
        sb2.append(str);
        s.i("SsaDecoder", sb2.toString());
    }

    private void G(e0 e0Var, List<List<g8.b>> list, List<Long> list2, Charset charset) {
        b bVar = this.f20988o ? this.f20989p : null;
        while (true) {
            String t10 = e0Var.t(charset);
            if (t10 == null) {
                return;
            }
            if (t10.startsWith("Format:")) {
                bVar = b.a(t10);
            } else if (t10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    s.i("SsaDecoder", "Skipping dialogue line before complete format: " + t10);
                } else {
                    F(t10, bVar, list, list2);
                }
            }
        }
    }

    private void H(e0 e0Var, Charset charset) {
        while (true) {
            String t10 = e0Var.t(charset);
            if (t10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(t10)) {
                I(e0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(t10)) {
                this.f20990q = J(e0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(t10)) {
                s.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(t10)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(t8.e0 r5, java.nio.charset.Charset r6) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.t(r6)
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            char r1 = r5.h(r6)
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = eb.c.e(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f20992s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f20991r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.a.I(t8.e0, java.nio.charset.Charset):void");
    }

    private static Map<String, c> J(e0 e0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String t10 = e0Var.t(charset);
            if (t10 == null || (e0Var.a() != 0 && e0Var.h(charset) == '[')) {
                break;
            }
            if (t10.startsWith("Format:")) {
                aVar = c.a.a(t10);
            } else if (t10.startsWith("Style:")) {
                if (aVar == null) {
                    s.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + t10);
                } else {
                    c b10 = c.b(t10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f20998a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = f20987t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) r0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) r0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) r0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) r0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int M(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment N(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                s.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // g8.h
    protected i z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e0 e0Var = new e0(bArr, i10);
        Charset E = E(e0Var);
        if (!this.f20988o) {
            H(e0Var, E);
        }
        G(e0Var, arrayList, arrayList2, E);
        return new d(arrayList, arrayList2);
    }
}
