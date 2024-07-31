package n8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import g8.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final String f21861a;

    /* renamed from: b */
    public final String f21862b;

    /* renamed from: c */
    public final boolean f21863c;

    /* renamed from: d */
    public final long f21864d;

    /* renamed from: e */
    public final long f21865e;

    /* renamed from: f */
    public final g f21866f;

    /* renamed from: g */
    private final String[] f21867g;

    /* renamed from: h */
    public final String f21868h;

    /* renamed from: i */
    public final String f21869i;

    /* renamed from: j */
    public final d f21870j;

    /* renamed from: k */
    private final HashMap<String, Integer> f21871k;

    /* renamed from: l */
    private final HashMap<String, Integer> f21872l;

    /* renamed from: m */
    private List<d> f21873m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f21861a = str;
        this.f21862b = str2;
        this.f21869i = str4;
        this.f21866f = gVar;
        this.f21867g = strArr;
        this.f21863c = str2 != null;
        this.f21864d = j10;
        this.f21865e = j11;
        this.f21868h = (String) t8.a.e(str3);
        this.f21870j = dVar;
        this.f21871k = new HashMap<>();
        this.f21872l = new HashMap<>();
    }

    private void b(Map<String, g> map, b.C0262b c0262b, int i10, int i11, int i12) {
        g f10 = f.f(this.f21866f, this.f21867g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0262b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0262b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f21870j, map, i12);
            if ("p".equals(this.f21861a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    c0262b.m((f10.k() * (-90.0f)) / 100.0f);
                }
                if (f10.m() != null) {
                    c0262b.p(f10.m());
                }
                if (f10.h() != null) {
                    c0262b.j(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
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

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f21861a);
        boolean equals2 = "div".equals(this.f21861a);
        if (z10 || equals || (equals2 && this.f21869i != null)) {
            long j10 = this.f21864d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f21865e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f21873m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f21873m.size(); i10++) {
            this.f21873m.get(i10).i(treeSet, z10 || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0262b> map) {
        if (!map.containsKey(str)) {
            b.C0262b c0262b = new b.C0262b();
            c0262b.o(new SpannableStringBuilder());
            map.put(str, c0262b);
        }
        return (SpannableStringBuilder) t8.a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f21868h)) {
            str = this.f21868h;
        }
        if (m(j10) && "div".equals(this.f21861a) && this.f21869i != null) {
            list.add(new Pair<>(str, this.f21869i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0262b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f21868h) ? str : this.f21868h;
            Iterator<Map.Entry<String, Integer>> it = this.f21872l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f21871k.containsKey(key) ? this.f21871k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    b(map, (b.C0262b) t8.a.e(map3.get(key)), intValue, intValue2, ((e) t8.a.e(map2.get(str2))).f21883j);
                }
            }
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, b.C0262b> map) {
        this.f21871k.clear();
        this.f21872l.clear();
        if ("metadata".equals(this.f21861a)) {
            return;
        }
        if (!"".equals(this.f21868h)) {
            str = this.f21868h;
        }
        if (this.f21863c && z10) {
            k(str, map).append((CharSequence) t8.a.e(this.f21862b));
            return;
        }
        if ("br".equals(this.f21861a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, b.C0262b> entry : map.entrySet()) {
                this.f21871k.put(entry.getKey(), Integer.valueOf(((CharSequence) t8.a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.f21861a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, b.C0262b> entry2 : map.entrySet()) {
                this.f21872l.put(entry2.getKey(), Integer.valueOf(((CharSequence) t8.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f21873m == null) {
            this.f21873m = new ArrayList();
        }
        this.f21873m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f21873m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f21873m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<g8.b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f21868h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f21868h, treeMap);
        o(j10, map, map2, this.f21868h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) t8.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0262b().f(decodeByteArray).k(eVar.f21875b).l(0).h(eVar.f21876c, 0).i(eVar.f21878e).n(eVar.f21879f).g(eVar.f21880g).r(eVar.f21883j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) t8.a.e(map2.get(entry.getKey()));
            b.C0262b c0262b = (b.C0262b) entry.getValue();
            e((SpannableStringBuilder) t8.a.e(c0262b.e()));
            c0262b.h(eVar2.f21876c, eVar2.f21877d);
            c0262b.i(eVar2.f21878e);
            c0262b.k(eVar2.f21875b);
            c0262b.n(eVar2.f21879f);
            c0262b.q(eVar2.f21882i, eVar2.f21881h);
            c0262b.r(eVar2.f21883j);
            arrayList2.add(c0262b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f21867g;
    }

    public boolean m(long j10) {
        long j11 = this.f21864d;
        return (j11 == -9223372036854775807L && this.f21865e == -9223372036854775807L) || (j11 <= j10 && this.f21865e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f21865e) || (j11 <= j10 && j10 < this.f21865e));
    }
}
