package p217l8;

import android.text.Layout;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7149e;
import p120g8.AbstractC7490h;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p217l8.C9409c;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: l8.a */
/* loaded from: classes.dex */
public final class C9407a extends AbstractC7490h {

    /* renamed from: t */
    private static final Pattern f22818t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    private final boolean f22819o;

    /* renamed from: p */
    private final C9408b f22820p;

    /* renamed from: q */
    private Map<String, C9409c> f22821q;

    /* renamed from: r */
    private float f22822r;

    /* renamed from: s */
    private float f22823s;

    public C9407a(List<byte[]> list) {
        super("SsaDecoder");
        this.f22822r = -3.4028235E38f;
        this.f22823s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f22819o = false;
            this.f22820p = null;
            return;
        }
        this.f22819o = true;
        String m34862D = C11172r0.m34862D(list.get(0));
        C11137a.m34599a(m34862D.startsWith("Format:"));
        this.f22820p = (C9408b) C11137a.m34603e(C9408b.m28028a(m34862D));
        m28021H(new C11146e0(list.get(1)), C7149e.f16019c);
    }

    /* renamed from: B */
    private static int m28015B(long j10, List<Long> list, List<List<C7484b>> list2) {
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

    /* renamed from: C */
    private static float m28016C(int i10) {
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
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p120g8.C7484b m28017D(java.lang.String r8, p217l8.C9409c r9, p217l8.C9409c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p217l8.C9407a.m28017D(java.lang.String, l8.c, l8.c$b, float, float):g8.b");
    }

    /* renamed from: E */
    private Charset m28018E(C11146e0 c11146e0) {
        Charset m34672P = c11146e0.m34672P();
        return m34672P != null ? m34672P : C7149e.f16019c;
    }

    /* renamed from: F */
    private void m28019F(String str, C9408b c9408b, List<List<C7484b>> list, List<Long> list2) {
        int i10;
        StringBuilder sb2;
        C11137a.m34599a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c9408b.f22828e);
        if (split.length != c9408b.f22828e) {
            sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long m28024K = m28024K(split[c9408b.f22824a]);
            if (m28024K == -9223372036854775807L) {
                sb2 = new StringBuilder();
            } else {
                long m28024K2 = m28024K(split[c9408b.f22825b]);
                if (m28024K2 != -9223372036854775807L) {
                    Map<String, C9409c> map = this.f22821q;
                    C9409c c9409c = (map == null || (i10 = c9408b.f22826c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[c9408b.f22827d];
                    C7484b m28017D = m28017D(C9409c.b.m28042d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c9409c, C9409c.b.m28040b(str2), this.f22822r, this.f22823s);
                    int m28015B = m28015B(m28024K2, list2, list);
                    for (int m28015B2 = m28015B(m28024K, list2, list); m28015B2 < m28015B; m28015B2++) {
                        list.get(m28015B2).add(m28017D);
                    }
                    return;
                }
                sb2 = new StringBuilder();
            }
            sb2.append("Skipping invalid timing: ");
        }
        sb2.append(str);
        C11173s.m34970i("SsaDecoder", sb2.toString());
    }

    /* renamed from: G */
    private void m28020G(C11146e0 c11146e0, List<List<C7484b>> list, List<Long> list2, Charset charset) {
        C9408b c9408b = this.f22819o ? this.f22820p : null;
        while (true) {
            String m34695t = c11146e0.m34695t(charset);
            if (m34695t == null) {
                return;
            }
            if (m34695t.startsWith("Format:")) {
                c9408b = C9408b.m28028a(m34695t);
            } else if (m34695t.startsWith("Dialogue:")) {
                if (c9408b == null) {
                    C11173s.m34970i("SsaDecoder", "Skipping dialogue line before complete format: " + m34695t);
                } else {
                    m28019F(m34695t, c9408b, list, list2);
                }
            }
        }
    }

    /* renamed from: H */
    private void m28021H(C11146e0 c11146e0, Charset charset) {
        while (true) {
            String m34695t = c11146e0.m34695t(charset);
            if (m34695t == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m34695t)) {
                m28022I(c11146e0, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(m34695t)) {
                this.f22821q = m28023J(c11146e0, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(m34695t)) {
                C11173s.m34967f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m34695t)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0006  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28022I(p363t8.C11146e0 r5, java.nio.charset.Charset r6) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.m34695t(r6)
            if (r0 == 0) goto L59
            int r1 = r5.m34679a()
            if (r1 == 0) goto L14
            char r1 = r5.m34685h(r6)
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
            java.lang.String r1 = p082eb.C7147c.m21253e(r1)
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
            r4.f22823s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f22822r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p217l8.C9407a.m28022I(t8.e0, java.nio.charset.Charset):void");
    }

    /* renamed from: J */
    private static Map<String, C9409c> m28023J(C11146e0 c11146e0, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C9409c.a aVar = null;
        while (true) {
            String m34695t = c11146e0.m34695t(charset);
            if (m34695t == null || (c11146e0.m34679a() != 0 && c11146e0.m34685h(charset) == '[')) {
                break;
            }
            if (m34695t.startsWith("Format:")) {
                aVar = C9409c.a.m28038a(m34695t);
            } else if (m34695t.startsWith("Style:")) {
                if (aVar == null) {
                    C11173s.m34970i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + m34695t);
                } else {
                    C9409c m28030b = C9409c.m28030b(m34695t, aVar);
                    if (m28030b != null) {
                        linkedHashMap.put(m28030b.f22829a, m28030b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    private static long m28024K(String str) {
        Matcher matcher = f22818t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) C11172r0.m34928j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C11172r0.m34928j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C11172r0.m34928j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C11172r0.m34928j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: L */
    private static int m28025L(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C11173s.m34970i("SsaDecoder", "Unknown alignment: " + i10);
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

    /* renamed from: M */
    private static int m28026M(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C11173s.m34970i("SsaDecoder", "Unknown alignment: " + i10);
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

    /* renamed from: N */
    private static Layout.Alignment m28027N(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                C11173s.m34970i("SsaDecoder", "Unknown alignment: " + i10);
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

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C11146e0 c11146e0 = new C11146e0(bArr, i10);
        Charset m28018E = m28018E(c11146e0);
        if (!this.f22819o) {
            m28021H(c11146e0, m28018E);
        }
        m28020G(c11146e0, arrayList, arrayList2, m28018E);
        return new C9410d(arrayList, arrayList2);
    }
}
