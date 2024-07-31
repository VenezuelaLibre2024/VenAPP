package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p179jb.C9019k;
import p179jb.C9030v;
import p366tb.C11236c;
import p366tb.InterfaceC11235b;
import p400vb.EnumC11822z;

/* renamed from: com.google.crypto.tink.internal.f */
/* loaded from: classes2.dex */
public final class C5934f {

    /* renamed from: a */
    public static final InterfaceC11235b.a f12504a = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12505a;

        static {
            int[] iArr = new int[EnumC11822z.values().length];
            f12505a = iArr;
            try {
                iArr[EnumC11822z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12505a[EnumC11822z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12505a[EnumC11822z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.internal.f$b */
    /* loaded from: classes2.dex */
    private static class b implements InterfaceC11235b.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p366tb.InterfaceC11235b.a
        /* renamed from: a */
        public void mo15222a(int i10, long j10) {
        }

        @Override // p366tb.InterfaceC11235b.a
        /* renamed from: b */
        public void mo15223b() {
        }
    }

    /* renamed from: a */
    public static <P> C11236c m15219a(C9030v<P> c9030v) {
        C11236c.b m35113a = C11236c.m35113a();
        m35113a.m35117d(c9030v.m26501d());
        Iterator<List<C9030v.c<P>>> it = c9030v.m26500c().iterator();
        while (it.hasNext()) {
            for (C9030v.c<P> cVar : it.next()) {
                m35113a.m35115a(m15221c(cVar.m26519h()), cVar.m26515d(), m15220b(cVar.m26516e()), cVar.m26517f().name());
            }
        }
        if (c9030v.m26502e() != null) {
            m35113a.m35118e(c9030v.m26502e().m26515d());
        }
        try {
            return m35113a.m35116b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: b */
    private static String m15220b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    /* renamed from: c */
    private static C9019k m15221c(EnumC11822z enumC11822z) {
        int i10 = a.f12505a[enumC11822z.ordinal()];
        if (i10 == 1) {
            return C9019k.f21618b;
        }
        if (i10 == 2) {
            return C9019k.f21619c;
        }
        if (i10 == 3) {
            return C9019k.f21620d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
