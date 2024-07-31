package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import de.a;
import de.c;
import de.d;
import de.f;
import de.h;
import de.j;
import de.n;
import java.util.Map;
import qd.a0;
import qd.b0;
import qd.c0;
import qd.d0;
import qd.e0;
import qd.f0;
import qd.g0;
import qd.z;
import zd.l2;

/* loaded from: classes.dex */
public class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends i {
        a(e eVar, MessageType messageType, Map map) {
            super(eVar, messageType, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13949a;

        static {
            int[] iArr = new int[d0.b.values().length];
            f13949a = iArr;
            try {
                iArr[d0.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13949a[d0.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13949a[d0.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13949a[d0.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static a.b a(z zVar) {
        a.b a10 = de.a.a();
        if (!TextUtils.isEmpty(zVar.b0())) {
            a10.b(zVar.b0());
        }
        return a10;
    }

    private static de.a b(z zVar, b0 b0Var) {
        a.b a10 = a(zVar);
        if (!b0Var.equals(b0.d0())) {
            d.b a11 = d.a();
            if (!TextUtils.isEmpty(b0Var.b0())) {
                a11.b(b0Var.b0());
            }
            if (b0Var.f0()) {
                n.b a12 = n.a();
                g0 e02 = b0Var.e0();
                if (!TextUtils.isEmpty(e02.e0())) {
                    a12.c(e02.e0());
                }
                if (!TextUtils.isEmpty(e02.d0())) {
                    a12.b(e02.d0());
                }
                a11.c(a12.a());
            }
            a10.c(a11.a());
        }
        return a10.a();
    }

    public static i c(d0 d0Var, String str, String str2, boolean z10, Map<String, String> map) {
        eb.o.p(d0Var, "FirebaseInAppMessaging content cannot be null.");
        eb.o.p(str, "FirebaseInAppMessaging campaign id cannot be null.");
        eb.o.p(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        l2.a("Decoding message: " + d0Var.toString());
        e eVar = new e(str, str2, z10);
        int i10 = b.f13949a[d0Var.g0().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new a(new e(str, str2, z10), MessageType.UNSUPPORTED, map) : f(d0Var.d0()).a(eVar, map) : h(d0Var.h0()).a(eVar, map) : g(d0Var.f0()).a(eVar, map) : e(d0Var.b0()).a(eVar, map);
    }

    private static n d(g0 g0Var) {
        n.b a10 = n.a();
        if (!TextUtils.isEmpty(g0Var.d0())) {
            a10.b(g0Var.d0());
        }
        if (!TextUtils.isEmpty(g0Var.e0())) {
            a10.c(g0Var.e0());
        }
        return a10.a();
    }

    private static c.b e(a0 a0Var) {
        c.b d10 = c.d();
        if (!TextUtils.isEmpty(a0Var.d0())) {
            d10.c(a0Var.d0());
        }
        if (!TextUtils.isEmpty(a0Var.g0())) {
            d10.e(g.a().b(a0Var.g0()).a());
        }
        if (a0Var.i0()) {
            d10.b(a(a0Var.b0()).a());
        }
        if (a0Var.j0()) {
            d10.d(d(a0Var.e0()));
        }
        if (a0Var.k0()) {
            d10.f(d(a0Var.h0()));
        }
        return d10;
    }

    private static f.b f(c0 c0Var) {
        f.b d10 = f.d();
        if (c0Var.r0()) {
            d10.h(d(c0Var.l0()));
        }
        if (c0Var.m0()) {
            d10.c(d(c0Var.d0()));
        }
        if (!TextUtils.isEmpty(c0Var.b0())) {
            d10.b(c0Var.b0());
        }
        if (c0Var.n0() || c0Var.o0()) {
            d10.f(b(c0Var.h0(), c0Var.i0()));
        }
        if (c0Var.p0() || c0Var.q0()) {
            d10.g(b(c0Var.j0(), c0Var.k0()));
        }
        if (!TextUtils.isEmpty(c0Var.g0())) {
            d10.e(g.a().b(c0Var.g0()).a());
        }
        if (!TextUtils.isEmpty(c0Var.f0())) {
            d10.d(g.a().b(c0Var.f0()).a());
        }
        return d10;
    }

    private static h.b g(e0 e0Var) {
        h.b d10 = h.d();
        if (!TextUtils.isEmpty(e0Var.e0())) {
            d10.c(g.a().b(e0Var.e0()).a());
        }
        if (e0Var.f0()) {
            d10.b(a(e0Var.b0()).a());
        }
        return d10;
    }

    private static j.b h(f0 f0Var) {
        j.b d10 = j.d();
        if (!TextUtils.isEmpty(f0Var.e0())) {
            d10.c(f0Var.e0());
        }
        if (!TextUtils.isEmpty(f0Var.h0())) {
            d10.e(g.a().b(f0Var.h0()).a());
        }
        if (f0Var.j0()) {
            d10.b(b(f0Var.b0(), f0Var.d0()));
        }
        if (f0Var.k0()) {
            d10.d(d(f0Var.f0()));
        }
        if (f0Var.l0()) {
            d10.f(d(f0Var.i0()));
        }
        return d10;
    }
}
