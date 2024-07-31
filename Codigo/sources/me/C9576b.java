package me;

import com.google.firebase.messaging.AbstractC6242l0;
import md.InterfaceC9569d;

/* renamed from: me.b */
/* loaded from: classes.dex */
public final class C9576b {

    /* renamed from: b */
    private static final C9576b f23331b = new a().m28517a();

    /* renamed from: a */
    private final C9575a f23332a;

    /* renamed from: me.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C9575a f23333a = null;

        a() {
        }

        /* renamed from: a */
        public C9576b m28517a() {
            return new C9576b(this.f23333a);
        }

        /* renamed from: b */
        public a m28518b(C9575a c9575a) {
            this.f23333a = c9575a;
            return this;
        }
    }

    C9576b(C9575a c9575a) {
        this.f23332a = c9575a;
    }

    /* renamed from: b */
    public static a m28514b() {
        return new a();
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: a */
    public C9575a m28515a() {
        return this.f23332a;
    }

    /* renamed from: c */
    public byte[] m28516c() {
        return AbstractC6242l0.m17106a(this);
    }
}
