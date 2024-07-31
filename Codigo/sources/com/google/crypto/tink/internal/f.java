package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import jb.v;
import tb.b;
import tb.c;
import vb.z;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f11289a = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11290a;

        static {
            int[] iArr = new int[z.values().length];
            f11290a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11290a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11290a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class b implements b.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // tb.b.a
        public void a(int i10, long j10) {
        }

        @Override // tb.b.a
        public void b() {
        }
    }

    public static <P> tb.c a(v<P> vVar) {
        c.b a10 = tb.c.a();
        a10.d(vVar.d());
        Iterator<List<v.c<P>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<P> cVar : it.next()) {
                a10.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            a10.e(vVar.e().d());
        }
        try {
            return a10.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static jb.k c(z zVar) {
        int i10 = a.f11290a[zVar.ordinal()];
        if (i10 == 1) {
            return jb.k.f19839b;
        }
        if (i10 == 2) {
            return jb.k.f19840c;
        }
        if (i10 == 3) {
            return jb.k.f19841d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
