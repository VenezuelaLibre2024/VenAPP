package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: de.f */
/* loaded from: classes.dex */
public class C6893f extends AbstractC6896i {

    /* renamed from: e */
    private final C6901n f15267e;

    /* renamed from: f */
    private final C6901n f15268f;

    /* renamed from: g */
    private final String f15269g;

    /* renamed from: h */
    private final C6888a f15270h;

    /* renamed from: i */
    private final C6888a f15271i;

    /* renamed from: j */
    private final C6894g f15272j;

    /* renamed from: k */
    private final C6894g f15273k;

    /* renamed from: de.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        C6894g f15274a;

        /* renamed from: b */
        C6894g f15275b;

        /* renamed from: c */
        String f15276c;

        /* renamed from: d */
        C6888a f15277d;

        /* renamed from: e */
        C6901n f15278e;

        /* renamed from: f */
        C6901n f15279f;

        /* renamed from: g */
        C6888a f15280g;

        /* renamed from: a */
        public C6893f m19912a(C6892e c6892e, Map<String, String> map) {
            C6888a c6888a = this.f15277d;
            if (c6888a == null) {
                throw new IllegalArgumentException("Card model must have a primary action");
            }
            if (c6888a.m19872c() == null) {
                throw new IllegalArgumentException("Card model must have a primary action button");
            }
            C6888a c6888a2 = this.f15280g;
            if (c6888a2 != null && c6888a2.m19872c() == null) {
                throw new IllegalArgumentException("Card model secondary action must be null or have a button");
            }
            if (this.f15278e == null) {
                throw new IllegalArgumentException("Card model must have a title");
            }
            if (this.f15274a == null && this.f15275b == null) {
                throw new IllegalArgumentException("Card model must have at least one image");
            }
            if (TextUtils.isEmpty(this.f15276c)) {
                throw new IllegalArgumentException("Card model must have a background color");
            }
            return new C6893f(c6892e, this.f15278e, this.f15279f, this.f15274a, this.f15275b, this.f15276c, this.f15277d, this.f15280g, map);
        }

        /* renamed from: b */
        public b m19913b(String str) {
            this.f15276c = str;
            return this;
        }

        /* renamed from: c */
        public b m19914c(C6901n c6901n) {
            this.f15279f = c6901n;
            return this;
        }

        /* renamed from: d */
        public b m19915d(C6894g c6894g) {
            this.f15275b = c6894g;
            return this;
        }

        /* renamed from: e */
        public b m19916e(C6894g c6894g) {
            this.f15274a = c6894g;
            return this;
        }

        /* renamed from: f */
        public b m19917f(C6888a c6888a) {
            this.f15277d = c6888a;
            return this;
        }

        /* renamed from: g */
        public b m19918g(C6888a c6888a) {
            this.f15280g = c6888a;
            return this;
        }

        /* renamed from: h */
        public b m19919h(C6901n c6901n) {
            this.f15278e = c6901n;
            return this;
        }
    }

    private C6893f(C6892e c6892e, C6901n c6901n, C6901n c6901n2, C6894g c6894g, C6894g c6894g2, String str, C6888a c6888a, C6888a c6888a2, Map<String, String> map) {
        super(c6892e, MessageType.CARD, map);
        this.f15267e = c6901n;
        this.f15268f = c6901n2;
        this.f15272j = c6894g;
        this.f15273k = c6894g2;
        this.f15269g = str;
        this.f15270h = c6888a;
        this.f15271i = c6888a2;
    }

    /* renamed from: d */
    public static b m19904d() {
        return new b();
    }

    @Override // de.AbstractC6896i
    @Deprecated
    /* renamed from: b */
    public C6894g mo19884b() {
        return this.f15272j;
    }

    /* renamed from: e */
    public String m19905e() {
        return this.f15269g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6893f)) {
            return false;
        }
        C6893f c6893f = (C6893f) obj;
        if (hashCode() != c6893f.hashCode()) {
            return false;
        }
        C6901n c6901n = this.f15268f;
        if ((c6901n == null && c6893f.f15268f != null) || (c6901n != null && !c6901n.equals(c6893f.f15268f))) {
            return false;
        }
        C6888a c6888a = this.f15271i;
        if ((c6888a == null && c6893f.f15271i != null) || (c6888a != null && !c6888a.equals(c6893f.f15271i))) {
            return false;
        }
        C6894g c6894g = this.f15272j;
        if ((c6894g == null && c6893f.f15272j != null) || (c6894g != null && !c6894g.equals(c6893f.f15272j))) {
            return false;
        }
        C6894g c6894g2 = this.f15273k;
        return (c6894g2 != null || c6893f.f15273k == null) && (c6894g2 == null || c6894g2.equals(c6893f.f15273k)) && this.f15267e.equals(c6893f.f15267e) && this.f15270h.equals(c6893f.f15270h) && this.f15269g.equals(c6893f.f15269g);
    }

    /* renamed from: f */
    public C6901n m19906f() {
        return this.f15268f;
    }

    /* renamed from: g */
    public C6894g m19907g() {
        return this.f15273k;
    }

    /* renamed from: h */
    public C6894g m19908h() {
        return this.f15272j;
    }

    public int hashCode() {
        C6901n c6901n = this.f15268f;
        int hashCode = c6901n != null ? c6901n.hashCode() : 0;
        C6888a c6888a = this.f15271i;
        int hashCode2 = c6888a != null ? c6888a.hashCode() : 0;
        C6894g c6894g = this.f15272j;
        int hashCode3 = c6894g != null ? c6894g.hashCode() : 0;
        C6894g c6894g2 = this.f15273k;
        return this.f15267e.hashCode() + hashCode + this.f15269g.hashCode() + this.f15270h.hashCode() + hashCode2 + hashCode3 + (c6894g2 != null ? c6894g2.hashCode() : 0);
    }

    /* renamed from: i */
    public C6888a m19909i() {
        return this.f15270h;
    }

    /* renamed from: j */
    public C6888a m19910j() {
        return this.f15271i;
    }

    /* renamed from: k */
    public C6901n m19911k() {
        return this.f15267e;
    }
}
