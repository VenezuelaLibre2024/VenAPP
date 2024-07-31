package me;

import com.google.firebase.messaging.l0;
import md.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b */
    private static final b f21477b = new a().a();

    /* renamed from: a */
    private final me.a f21478a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private me.a f21479a = null;

        a() {
        }

        public b a() {
            return new b(this.f21479a);
        }

        public a b(me.a aVar) {
            this.f21479a = aVar;
            return this;
        }
    }

    b(me.a aVar) {
        this.f21478a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public me.a a() {
        return this.f21478a;
    }

    public byte[] c() {
        return l0.a(this);
    }
}
