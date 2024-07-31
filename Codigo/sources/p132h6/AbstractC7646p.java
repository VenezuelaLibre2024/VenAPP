package p132h6;

import android.util.Base64;
import p098f6.EnumC7300d;
import p132h6.C7634d;

/* renamed from: h6.p */
/* loaded from: classes.dex */
public abstract class AbstractC7646p {

    /* renamed from: h6.p$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC7646p mo23194a();

        /* renamed from: b */
        public abstract a mo23195b(String str);

        /* renamed from: c */
        public abstract a mo23196c(byte[] bArr);

        /* renamed from: d */
        public abstract a mo23197d(EnumC7300d enumC7300d);
    }

    /* renamed from: a */
    public static a m23225a() {
        return new C7634d.b().mo23197d(EnumC7300d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo23191b();

    /* renamed from: c */
    public abstract byte[] mo23192c();

    /* renamed from: d */
    public abstract EnumC7300d mo23193d();

    /* renamed from: e */
    public boolean m23226e() {
        return mo23192c() != null;
    }

    /* renamed from: f */
    public AbstractC7646p m23227f(EnumC7300d enumC7300d) {
        return m23225a().mo23195b(mo23191b()).mo23197d(enumC7300d).mo23196c(mo23192c()).mo23194a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo23191b();
        objArr[1] = mo23193d();
        objArr[2] = mo23192c() == null ? "" : Base64.encodeToString(mo23192c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
