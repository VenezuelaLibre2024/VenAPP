package b8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t6.u1;
import x6.m;

/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final h f6258n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f6259d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f6260e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f6261f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f6262g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f6263h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f6264i;

    /* renamed from: j, reason: collision with root package name */
    public final u1 f6265j;

    /* renamed from: k, reason: collision with root package name */
    public final List<u1> f6266k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f6267l;

    /* renamed from: m, reason: collision with root package name */
    public final List<m> f6268m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f6269a;

        /* renamed from: b, reason: collision with root package name */
        public final u1 f6270b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6271c;

        /* renamed from: d, reason: collision with root package name */
        public final String f6272d;

        public a(Uri uri, u1 u1Var, String str, String str2) {
            this.f6269a = uri;
            this.f6270b = u1Var;
            this.f6271c = str;
            this.f6272d = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f6273a;

        /* renamed from: b, reason: collision with root package name */
        public final u1 f6274b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6275c;

        /* renamed from: d, reason: collision with root package name */
        public final String f6276d;

        /* renamed from: e, reason: collision with root package name */
        public final String f6277e;

        /* renamed from: f, reason: collision with root package name */
        public final String f6278f;

        public b(Uri uri, u1 u1Var, String str, String str2, String str3, String str4) {
            this.f6273a = uri;
            this.f6274b = u1Var;
            this.f6275c = str;
            this.f6276d = str2;
            this.f6277e = str3;
            this.f6278f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new u1.b().U("0").M("application/x-mpegURL").G(), null, null, null, null);
        }

        public b a(u1 u1Var) {
            return new b(this.f6273a, u1Var, this.f6275c, this.f6276d, this.f6277e, this.f6278f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, u1 u1Var, List<u1> list7, boolean z10, Map<String, String> map, List<m> list8) {
        super(str, list, z10);
        this.f6259d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f6260e = Collections.unmodifiableList(list2);
        this.f6261f = Collections.unmodifiableList(list3);
        this.f6262g = Collections.unmodifiableList(list4);
        this.f6263h = Collections.unmodifiableList(list5);
        this.f6264i = Collections.unmodifiableList(list6);
        this.f6265j = u1Var;
        this.f6266k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f6267l = Collections.unmodifiableMap(map);
        this.f6268m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f6269a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<u7.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    u7.c cVar = list2.get(i12);
                    if (cVar.f27331b == i10 && cVar.f27332c == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f6273a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // u7.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h a(List<u7.c> list) {
        return new h(this.f6279a, this.f6280b, d(this.f6260e, 0, list), Collections.emptyList(), d(this.f6262g, 1, list), d(this.f6263h, 2, list), Collections.emptyList(), this.f6265j, this.f6266k, this.f6281c, this.f6267l, this.f6268m);
    }
}
