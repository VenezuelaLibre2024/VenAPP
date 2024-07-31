package p073e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C7100d {

    /* renamed from: a */
    private List<b> f15804a;

    /* renamed from: b */
    private List<String> f15805b;

    /* renamed from: c */
    private boolean f15806c;

    /* renamed from: e2.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        private boolean f15809c = false;

        /* renamed from: a */
        private List<b> f15807a = new ArrayList();

        /* renamed from: b */
        private List<String> f15808b = new ArrayList();

        /* renamed from: f */
        private List<String> m20930f() {
            return this.f15808b;
        }

        /* renamed from: h */
        private List<b> m20931h() {
            return this.f15807a;
        }

        /* renamed from: j */
        private boolean m20932j() {
            return this.f15809c;
        }

        /* renamed from: a */
        public a m20933a(String str) {
            this.f15808b.add(str);
            return this;
        }

        /* renamed from: b */
        public a m20934b(String str) {
            this.f15807a.add(new b(str, "direct://"));
            return this;
        }

        /* renamed from: c */
        public a m20935c(String str) {
            this.f15807a.add(new b(str));
            return this;
        }

        /* renamed from: d */
        public a m20936d(String str, String str2) {
            this.f15807a.add(new b(str2, str));
            return this;
        }

        /* renamed from: e */
        public C7100d m20937e() {
            return new C7100d(m20931h(), m20930f(), m20932j());
        }

        /* renamed from: g */
        public a m20938g() {
            return m20933a("<local>");
        }

        /* renamed from: i */
        public a m20939i() {
            return m20933a("<-loopback>");
        }

        /* renamed from: k */
        public a m20940k(boolean z10) {
            this.f15809c = z10;
            return this;
        }
    }

    /* renamed from: e2.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private String f15810a;

        /* renamed from: b */
        private String f15811b;

        public b(String str) {
            this("*", str);
        }

        public b(String str, String str2) {
            this.f15810a = str;
            this.f15811b = str2;
        }

        /* renamed from: a */
        public String m20941a() {
            return this.f15810a;
        }

        /* renamed from: b */
        public String m20942b() {
            return this.f15811b;
        }
    }

    public C7100d(List<b> list, List<String> list2, boolean z10) {
        this.f15804a = list;
        this.f15805b = list2;
        this.f15806c = z10;
    }

    /* renamed from: a */
    public List<String> m20927a() {
        return Collections.unmodifiableList(this.f15805b);
    }

    /* renamed from: b */
    public List<b> m20928b() {
        return Collections.unmodifiableList(this.f15804a);
    }

    /* renamed from: c */
    public boolean m20929c() {
        return this.f15806c;
    }
}
