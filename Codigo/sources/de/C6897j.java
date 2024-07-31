package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: de.j */
/* loaded from: classes.dex */
public class C6897j extends AbstractC6896i {

    /* renamed from: e */
    private final C6901n f15293e;

    /* renamed from: f */
    private final C6901n f15294f;

    /* renamed from: g */
    private final C6894g f15295g;

    /* renamed from: h */
    private final C6888a f15296h;

    /* renamed from: i */
    private final String f15297i;

    /* renamed from: de.j$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        C6901n f15298a;

        /* renamed from: b */
        C6901n f15299b;

        /* renamed from: c */
        C6894g f15300c;

        /* renamed from: d */
        C6888a f15301d;

        /* renamed from: e */
        String f15302e;

        /* renamed from: a */
        public C6897j m19936a(C6892e c6892e, Map<String, String> map) {
            if (this.f15298a == null) {
                throw new IllegalArgumentException("Modal model must have a title");
            }
            C6888a c6888a = this.f15301d;
            if (c6888a != null && c6888a.m19872c() == null) {
                throw new IllegalArgumentException("Modal model action must be null or have a button");
            }
            if (TextUtils.isEmpty(this.f15302e)) {
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            return new C6897j(c6892e, this.f15298a, this.f15299b, this.f15300c, this.f15301d, this.f15302e, map);
        }

        /* renamed from: b */
        public b m19937b(C6888a c6888a) {
            this.f15301d = c6888a;
            return this;
        }

        /* renamed from: c */
        public b m19938c(String str) {
            this.f15302e = str;
            return this;
        }

        /* renamed from: d */
        public b m19939d(C6901n c6901n) {
            this.f15299b = c6901n;
            return this;
        }

        /* renamed from: e */
        public b m19940e(C6894g c6894g) {
            this.f15300c = c6894g;
            return this;
        }

        /* renamed from: f */
        public b m19941f(C6901n c6901n) {
            this.f15298a = c6901n;
            return this;
        }
    }

    private C6897j(C6892e c6892e, C6901n c6901n, C6901n c6901n2, C6894g c6894g, C6888a c6888a, String str, Map<String, String> map) {
        super(c6892e, MessageType.MODAL, map);
        this.f15293e = c6901n;
        this.f15294f = c6901n2;
        this.f15295g = c6894g;
        this.f15296h = c6888a;
        this.f15297i = str;
    }

    /* renamed from: d */
    public static b m19931d() {
        return new b();
    }

    @Override // de.AbstractC6896i
    /* renamed from: b */
    public C6894g mo19884b() {
        return this.f15295g;
    }

    /* renamed from: e */
    public C6888a m19932e() {
        return this.f15296h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6897j)) {
            return false;
        }
        C6897j c6897j = (C6897j) obj;
        if (hashCode() != c6897j.hashCode()) {
            return false;
        }
        C6901n c6901n = this.f15294f;
        if ((c6901n == null && c6897j.f15294f != null) || (c6901n != null && !c6901n.equals(c6897j.f15294f))) {
            return false;
        }
        C6888a c6888a = this.f15296h;
        if ((c6888a == null && c6897j.f15296h != null) || (c6888a != null && !c6888a.equals(c6897j.f15296h))) {
            return false;
        }
        C6894g c6894g = this.f15295g;
        return (c6894g != null || c6897j.f15295g == null) && (c6894g == null || c6894g.equals(c6897j.f15295g)) && this.f15293e.equals(c6897j.f15293e) && this.f15297i.equals(c6897j.f15297i);
    }

    /* renamed from: f */
    public String m19933f() {
        return this.f15297i;
    }

    /* renamed from: g */
    public C6901n m19934g() {
        return this.f15294f;
    }

    /* renamed from: h */
    public C6901n m19935h() {
        return this.f15293e;
    }

    public int hashCode() {
        C6901n c6901n = this.f15294f;
        int hashCode = c6901n != null ? c6901n.hashCode() : 0;
        C6888a c6888a = this.f15296h;
        int hashCode2 = c6888a != null ? c6888a.hashCode() : 0;
        C6894g c6894g = this.f15295g;
        return this.f15293e.hashCode() + hashCode + this.f15297i.hashCode() + hashCode2 + (c6894g != null ? c6894g.hashCode() : 0);
    }
}
