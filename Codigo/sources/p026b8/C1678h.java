package p026b8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p361t6.C11108u1;
import p377u7.C11446c;
import p436x6.C12318m;

/* renamed from: b8.h */
/* loaded from: classes.dex */
public class C1678h extends AbstractC1679i {

    /* renamed from: n */
    public static final C1678h f7154n = new C1678h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f7155d;

    /* renamed from: e */
    public final List<b> f7156e;

    /* renamed from: f */
    public final List<a> f7157f;

    /* renamed from: g */
    public final List<a> f7158g;

    /* renamed from: h */
    public final List<a> f7159h;

    /* renamed from: i */
    public final List<a> f7160i;

    /* renamed from: j */
    public final C11108u1 f7161j;

    /* renamed from: k */
    public final List<C11108u1> f7162k;

    /* renamed from: l */
    public final Map<String, String> f7163l;

    /* renamed from: m */
    public final List<C12318m> f7164m;

    /* renamed from: b8.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f7165a;

        /* renamed from: b */
        public final C11108u1 f7166b;

        /* renamed from: c */
        public final String f7167c;

        /* renamed from: d */
        public final String f7168d;

        public a(Uri uri, C11108u1 c11108u1, String str, String str2) {
            this.f7165a = uri;
            this.f7166b = c11108u1;
            this.f7167c = str;
            this.f7168d = str2;
        }
    }

    /* renamed from: b8.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Uri f7169a;

        /* renamed from: b */
        public final C11108u1 f7170b;

        /* renamed from: c */
        public final String f7171c;

        /* renamed from: d */
        public final String f7172d;

        /* renamed from: e */
        public final String f7173e;

        /* renamed from: f */
        public final String f7174f;

        public b(Uri uri, C11108u1 c11108u1, String str, String str2, String str3, String str4) {
            this.f7169a = uri;
            this.f7170b = c11108u1;
            this.f7171c = str;
            this.f7172d = str2;
            this.f7173e = str3;
            this.f7174f = str4;
        }

        /* renamed from: b */
        public static b m9244b(Uri uri) {
            return new b(uri, new C11108u1.b().m34540U("0").m34532M("application/x-mpegURL").m34526G(), null, null, null, null);
        }

        /* renamed from: a */
        public b m9245a(C11108u1 c11108u1) {
            return new b(this.f7169a, c11108u1, this.f7171c, this.f7172d, this.f7173e, this.f7174f);
        }
    }

    public C1678h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C11108u1 c11108u1, List<C11108u1> list7, boolean z10, Map<String, String> map, List<C12318m> list8) {
        super(str, list, z10);
        this.f7155d = Collections.unmodifiableList(m9242f(list2, list3, list4, list5, list6));
        this.f7156e = Collections.unmodifiableList(list2);
        this.f7157f = Collections.unmodifiableList(list3);
        this.f7158g = Collections.unmodifiableList(list4);
        this.f7159h = Collections.unmodifiableList(list5);
        this.f7160i = Collections.unmodifiableList(list6);
        this.f7161j = c11108u1;
        this.f7162k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f7163l = Collections.unmodifiableMap(map);
        this.f7164m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    private static void m9239b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f7165a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m9240d(List<T> list, int i10, List<C11446c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    C11446c c11446c = list2.get(i12);
                    if (c11446c.f29634b == i10 && c11446c.f29635c == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C1678h m9241e(String str) {
        return new C1678h("", Collections.emptyList(), Collections.singletonList(b.m9244b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    private static List<Uri> m9242f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f7169a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m9239b(list2, arrayList);
        m9239b(list3, arrayList);
        m9239b(list4, arrayList);
        m9239b(list5, arrayList);
        return arrayList;
    }

    @Override // p377u7.InterfaceC11444a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1678h mo9230a(List<C11446c> list) {
        return new C1678h(this.f7175a, this.f7176b, m9240d(this.f7156e, 0, list), Collections.emptyList(), m9240d(this.f7158g, 1, list), m9240d(this.f7159h, 2, list), Collections.emptyList(), this.f7161j, this.f7162k, this.f7177c, this.f7163l, this.f7164m);
    }
}
