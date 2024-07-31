package p251n8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p120g8.C7484b;
import p363t8.C11137a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n8.d */
/* loaded from: classes.dex */
public final class C9678d {

    /* renamed from: a */
    public final String f23794a;

    /* renamed from: b */
    public final String f23795b;

    /* renamed from: c */
    public final boolean f23796c;

    /* renamed from: d */
    public final long f23797d;

    /* renamed from: e */
    public final long f23798e;

    /* renamed from: f */
    public final C9681g f23799f;

    /* renamed from: g */
    private final String[] f23800g;

    /* renamed from: h */
    public final String f23801h;

    /* renamed from: i */
    public final String f23802i;

    /* renamed from: j */
    public final C9678d f23803j;

    /* renamed from: k */
    private final HashMap<String, Integer> f23804k;

    /* renamed from: l */
    private final HashMap<String, Integer> f23805l;

    /* renamed from: m */
    private List<C9678d> f23806m;

    private C9678d(String str, String str2, long j10, long j11, C9681g c9681g, String[] strArr, String str3, String str4, C9678d c9678d) {
        this.f23794a = str;
        this.f23795b = str2;
        this.f23802i = str4;
        this.f23799f = c9681g;
        this.f23800g = strArr;
        this.f23796c = str2 != null;
        this.f23797d = j10;
        this.f23798e = j11;
        this.f23801h = (String) C11137a.m34603e(str3);
        this.f23803j = c9678d;
        this.f23804k = new HashMap<>();
        this.f23805l = new HashMap<>();
    }

    /* renamed from: b */
    private void m29003b(Map<String, C9681g> map, C7484b.b bVar, int i10, int i11, int i12) {
        C9681g m29024f = C9680f.m29024f(this.f23799f, this.f23800g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m22768e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m22778o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (m29024f != null) {
            C9680f.m29019a(spannableStringBuilder2, i10, i11, m29024f, this.f23803j, map, i12);
            if ("p".equals(this.f23794a)) {
                if (m29024f.m29047k() != Float.MAX_VALUE) {
                    bVar.m22776m((m29024f.m29047k() * (-90.0f)) / 100.0f);
                }
                if (m29024f.m29049m() != null) {
                    bVar.m22779p(m29024f.m29049m());
                }
                if (m29024f.m29044h() != null) {
                    bVar.m22773j(m29024f.m29044h());
                }
            }
        }
    }

    /* renamed from: c */
    public static C9678d m29004c(String str, long j10, long j11, C9681g c9681g, String[] strArr, String str2, String str3, C9678d c9678d) {
        return new C9678d(str, null, j10, j11, c9681g, strArr, str2, str3, c9678d);
    }

    /* renamed from: d */
    public static C9678d m29005d(String str) {
        return new C9678d(null, C9680f.m29020b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    private static void m29006e(SpannableStringBuilder spannableStringBuilder) {
        for (C9675a c9675a : (C9675a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9675a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c9675a), spannableStringBuilder.getSpanEnd(c9675a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: i */
    private void m29007i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f23794a);
        boolean equals2 = "div".equals(this.f23794a);
        if (z10 || equals || (equals2 && this.f23802i != null)) {
            long j10 = this.f23797d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f23798e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f23806m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f23806m.size(); i10++) {
            this.f23806m.get(i10).m29007i(treeSet, z10 || equals);
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m29008k(String str, Map<String, C7484b.b> map) {
        if (!map.containsKey(str)) {
            C7484b.b bVar = new C7484b.b();
            bVar.m22778o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C11137a.m34603e(map.get(str).m22768e());
    }

    /* renamed from: n */
    private void m29009n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f23801h)) {
            str = this.f23801h;
        }
        if (m29018m(j10) && "div".equals(this.f23794a) && this.f23802i != null) {
            list.add(new Pair<>(str, this.f23802i));
            return;
        }
        for (int i10 = 0; i10 < m29014g(); i10++) {
            m29013f(i10).m29009n(j10, str, list);
        }
    }

    /* renamed from: o */
    private void m29010o(long j10, Map<String, C9681g> map, Map<String, C9679e> map2, String str, Map<String, C7484b.b> map3) {
        int i10;
        if (m29018m(j10)) {
            String str2 = "".equals(this.f23801h) ? str : this.f23801h;
            Iterator<Map.Entry<String, Integer>> it = this.f23805l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f23804k.containsKey(key) ? this.f23804k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    m29003b(map, (C7484b.b) C11137a.m34603e(map3.get(key)), intValue, intValue2, ((C9679e) C11137a.m34603e(map2.get(str2))).f23816j);
                }
            }
            while (i10 < m29014g()) {
                m29013f(i10).m29010o(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    /* renamed from: p */
    private void m29011p(long j10, boolean z10, String str, Map<String, C7484b.b> map) {
        this.f23804k.clear();
        this.f23805l.clear();
        if ("metadata".equals(this.f23794a)) {
            return;
        }
        if (!"".equals(this.f23801h)) {
            str = this.f23801h;
        }
        if (this.f23796c && z10) {
            m29008k(str, map).append((CharSequence) C11137a.m34603e(this.f23795b));
            return;
        }
        if ("br".equals(this.f23794a) && z10) {
            m29008k(str, map).append('\n');
            return;
        }
        if (m29018m(j10)) {
            for (Map.Entry<String, C7484b.b> entry : map.entrySet()) {
                this.f23804k.put(entry.getKey(), Integer.valueOf(((CharSequence) C11137a.m34603e(entry.getValue().m22768e())).length()));
            }
            boolean equals = "p".equals(this.f23794a);
            for (int i10 = 0; i10 < m29014g(); i10++) {
                m29013f(i10).m29011p(j10, z10 || equals, str, map);
            }
            if (equals) {
                C9680f.m29021c(m29008k(str, map));
            }
            for (Map.Entry<String, C7484b.b> entry2 : map.entrySet()) {
                this.f23805l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C11137a.m34603e(entry2.getValue().m22768e())).length()));
            }
        }
    }

    /* renamed from: a */
    public void m29012a(C9678d c9678d) {
        if (this.f23806m == null) {
            this.f23806m = new ArrayList();
        }
        this.f23806m.add(c9678d);
    }

    /* renamed from: f */
    public C9678d m29013f(int i10) {
        List<C9678d> list = this.f23806m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m29014g() {
        List<C9678d> list = this.f23806m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C7484b> m29015h(long j10, Map<String, C9681g> map, Map<String, C9679e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m29009n(j10, this.f23801h, arrayList);
        TreeMap treeMap = new TreeMap();
        m29011p(j10, false, this.f23801h, treeMap);
        m29010o(j10, map, map2, this.f23801h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C9679e c9679e = (C9679e) C11137a.m34603e(map2.get(pair.first));
                arrayList2.add(new C7484b.b().m22769f(decodeByteArray).m22774k(c9679e.f23808b).m22775l(0).m22771h(c9679e.f23809c, 0).m22772i(c9679e.f23811e).m22777n(c9679e.f23812f).m22770g(c9679e.f23813g).m22781r(c9679e.f23816j).m22764a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C9679e c9679e2 = (C9679e) C11137a.m34603e(map2.get(entry.getKey()));
            C7484b.b bVar = (C7484b.b) entry.getValue();
            m29006e((SpannableStringBuilder) C11137a.m34603e(bVar.m22768e()));
            bVar.m22771h(c9679e2.f23809c, c9679e2.f23810d);
            bVar.m22772i(c9679e2.f23811e);
            bVar.m22774k(c9679e2.f23808b);
            bVar.m22777n(c9679e2.f23812f);
            bVar.m22780q(c9679e2.f23815i, c9679e2.f23814h);
            bVar.m22781r(c9679e2.f23816j);
            arrayList2.add(bVar.m22764a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public long[] m29016j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        m29007i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m29017l() {
        return this.f23800g;
    }

    /* renamed from: m */
    public boolean m29018m(long j10) {
        long j11 = this.f23797d;
        return (j11 == -9223372036854775807L && this.f23798e == -9223372036854775807L) || (j11 <= j10 && this.f23798e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f23798e) || (j11 <= j10 && j10 < this.f23798e));
    }
}
