package p196k6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.InterfaceC9569d;

/* renamed from: k6.d */
/* loaded from: classes.dex */
public final class C9172d {

    /* renamed from: c */
    private static final C9172d f22148c = new a().m27109a();

    /* renamed from: a */
    private final String f22149a;

    /* renamed from: b */
    private final List<C9171c> f22150b;

    /* renamed from: k6.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f22151a = "";

        /* renamed from: b */
        private List<C9171c> f22152b = new ArrayList();

        a() {
        }

        /* renamed from: a */
        public C9172d m27109a() {
            return new C9172d(this.f22151a, Collections.unmodifiableList(this.f22152b));
        }

        /* renamed from: b */
        public a m27110b(List<C9171c> list) {
            this.f22152b = list;
            return this;
        }

        /* renamed from: c */
        public a m27111c(String str) {
            this.f22151a = str;
            return this;
        }
    }

    C9172d(String str, List<C9171c> list) {
        this.f22149a = str;
        this.f22150b = list;
    }

    /* renamed from: c */
    public static a m27106c() {
        return new a();
    }

    @InterfaceC9569d(tag = 2)
    /* renamed from: a */
    public List<C9171c> m27107a() {
        return this.f22150b;
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: b */
    public String m27108b() {
        return this.f22149a;
    }
}
