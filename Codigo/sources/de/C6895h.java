package de;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: de.h */
/* loaded from: classes.dex */
public class C6895h extends AbstractC6896i {

    /* renamed from: e */
    private C6894g f15285e;

    /* renamed from: f */
    private C6888a f15286f;

    /* renamed from: de.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        C6894g f15287a;

        /* renamed from: b */
        C6888a f15288b;

        /* renamed from: a */
        public C6895h m19926a(C6892e c6892e, Map<String, String> map) {
            C6894g c6894g = this.f15287a;
            if (c6894g != null) {
                return new C6895h(c6892e, c6894g, this.f15288b, map);
            }
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }

        /* renamed from: b */
        public b m19927b(C6888a c6888a) {
            this.f15288b = c6888a;
            return this;
        }

        /* renamed from: c */
        public b m19928c(C6894g c6894g) {
            this.f15287a = c6894g;
            return this;
        }
    }

    private C6895h(C6892e c6892e, C6894g c6894g, C6888a c6888a, Map<String, String> map) {
        super(c6892e, MessageType.IMAGE_ONLY, map);
        this.f15285e = c6894g;
        this.f15286f = c6888a;
    }

    /* renamed from: d */
    public static b m19924d() {
        return new b();
    }

    @Override // de.AbstractC6896i
    /* renamed from: b */
    public C6894g mo19884b() {
        return this.f15285e;
    }

    /* renamed from: e */
    public C6888a m19925e() {
        return this.f15286f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6895h)) {
            return false;
        }
        C6895h c6895h = (C6895h) obj;
        if (hashCode() != c6895h.hashCode()) {
            return false;
        }
        C6888a c6888a = this.f15286f;
        return (c6888a != null || c6895h.f15286f == null) && (c6888a == null || c6888a.equals(c6895h.f15286f)) && this.f15285e.equals(c6895h.f15285e);
    }

    public int hashCode() {
        C6888a c6888a = this.f15286f;
        return this.f15285e.hashCode() + (c6888a != null ? c6888a.hashCode() : 0);
    }
}
