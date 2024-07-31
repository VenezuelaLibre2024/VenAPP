package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: de.c */
/* loaded from: classes.dex */
public class C6890c extends AbstractC6896i {

    /* renamed from: e */
    private final C6901n f15250e;

    /* renamed from: f */
    private final C6901n f15251f;

    /* renamed from: g */
    private final C6894g f15252g;

    /* renamed from: h */
    private final C6888a f15253h;

    /* renamed from: i */
    private final String f15254i;

    /* renamed from: de.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        C6901n f15255a;

        /* renamed from: b */
        C6901n f15256b;

        /* renamed from: c */
        C6894g f15257c;

        /* renamed from: d */
        C6888a f15258d;

        /* renamed from: e */
        String f15259e;

        /* renamed from: a */
        public C6890c m19889a(C6892e c6892e, Map<String, String> map) {
            if (this.f15255a == null) {
                throw new IllegalArgumentException("Banner model must have a title");
            }
            if (TextUtils.isEmpty(this.f15259e)) {
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            return new C6890c(c6892e, this.f15255a, this.f15256b, this.f15257c, this.f15258d, this.f15259e, map);
        }

        /* renamed from: b */
        public b m19890b(C6888a c6888a) {
            this.f15258d = c6888a;
            return this;
        }

        /* renamed from: c */
        public b m19891c(String str) {
            this.f15259e = str;
            return this;
        }

        /* renamed from: d */
        public b m19892d(C6901n c6901n) {
            this.f15256b = c6901n;
            return this;
        }

        /* renamed from: e */
        public b m19893e(C6894g c6894g) {
            this.f15257c = c6894g;
            return this;
        }

        /* renamed from: f */
        public b m19894f(C6901n c6901n) {
            this.f15255a = c6901n;
            return this;
        }
    }

    private C6890c(C6892e c6892e, C6901n c6901n, C6901n c6901n2, C6894g c6894g, C6888a c6888a, String str, Map<String, String> map) {
        super(c6892e, MessageType.BANNER, map);
        this.f15250e = c6901n;
        this.f15251f = c6901n2;
        this.f15252g = c6894g;
        this.f15253h = c6888a;
        this.f15254i = str;
    }

    /* renamed from: d */
    public static b m19883d() {
        return new b();
    }

    @Override // de.AbstractC6896i
    /* renamed from: b */
    public C6894g mo19884b() {
        return this.f15252g;
    }

    /* renamed from: e */
    public C6888a m19885e() {
        return this.f15253h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6890c)) {
            return false;
        }
        C6890c c6890c = (C6890c) obj;
        if (hashCode() != c6890c.hashCode()) {
            return false;
        }
        C6901n c6901n = this.f15251f;
        if ((c6901n == null && c6890c.f15251f != null) || (c6901n != null && !c6901n.equals(c6890c.f15251f))) {
            return false;
        }
        C6894g c6894g = this.f15252g;
        if ((c6894g == null && c6890c.f15252g != null) || (c6894g != null && !c6894g.equals(c6890c.f15252g))) {
            return false;
        }
        C6888a c6888a = this.f15253h;
        return (c6888a != null || c6890c.f15253h == null) && (c6888a == null || c6888a.equals(c6890c.f15253h)) && this.f15250e.equals(c6890c.f15250e) && this.f15254i.equals(c6890c.f15254i);
    }

    /* renamed from: f */
    public String m19886f() {
        return this.f15254i;
    }

    /* renamed from: g */
    public C6901n m19887g() {
        return this.f15251f;
    }

    /* renamed from: h */
    public C6901n m19888h() {
        return this.f15250e;
    }

    public int hashCode() {
        C6901n c6901n = this.f15251f;
        int hashCode = c6901n != null ? c6901n.hashCode() : 0;
        C6894g c6894g = this.f15252g;
        int hashCode2 = c6894g != null ? c6894g.hashCode() : 0;
        C6888a c6888a = this.f15253h;
        return this.f15250e.hashCode() + hashCode + hashCode2 + (c6888a != null ? c6888a.hashCode() : 0) + this.f15254i.hashCode();
    }
}
