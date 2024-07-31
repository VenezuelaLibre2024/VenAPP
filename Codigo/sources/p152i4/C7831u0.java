package p152i4;

import android.content.Intent;
import com.facebook.internal.C4634n0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p191k1.C9109a;

/* renamed from: i4.u0 */
/* loaded from: classes.dex */
public final class C7831u0 {

    /* renamed from: d */
    public static final a f18782d = new a(null);

    /* renamed from: e */
    private static volatile C7831u0 f18783e;

    /* renamed from: a */
    private final C9109a f18784a;

    /* renamed from: b */
    private final C7829t0 f18785b;

    /* renamed from: c */
    private C7827s0 f18786c;

    /* renamed from: i4.u0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C7831u0 m24119a() {
            C7831u0 c7831u0;
            if (C7831u0.f18783e == null) {
                C9109a m26825b = C9109a.m26825b(C7799e0.m23860l());
                C9322n.m27780d(m26825b, "getInstance(applicationContext)");
                C7831u0.f18783e = new C7831u0(m26825b, new C7829t0());
            }
            c7831u0 = C7831u0.f18783e;
            if (c7831u0 == null) {
                C9322n.m27792p("instance");
                throw null;
            }
            return c7831u0;
        }
    }

    public C7831u0(C9109a localBroadcastManager, C7829t0 profileCache) {
        C9322n.m27781e(localBroadcastManager, "localBroadcastManager");
        C9322n.m27781e(profileCache, "profileCache");
        this.f18784a = localBroadcastManager;
        this.f18785b = profileCache;
    }

    /* renamed from: e */
    private final void m24114e(C7827s0 c7827s0, C7827s0 c7827s02) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", c7827s0);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", c7827s02);
        this.f18784a.m26828d(intent);
    }

    /* renamed from: g */
    private final void m24115g(C7827s0 c7827s0, boolean z10) {
        C7827s0 c7827s02 = this.f18786c;
        this.f18786c = c7827s0;
        if (z10) {
            C7829t0 c7829t0 = this.f18785b;
            if (c7827s0 != null) {
                c7829t0.m24097c(c7827s0);
            } else {
                c7829t0.m24095a();
            }
        }
        if (C4634n0.m11301e(c7827s02, c7827s0)) {
            return;
        }
        m24114e(c7827s02, c7827s0);
    }

    /* renamed from: c */
    public final C7827s0 m24116c() {
        return this.f18786c;
    }

    /* renamed from: d */
    public final boolean m24117d() {
        C7827s0 m24096b = this.f18785b.m24096b();
        if (m24096b == null) {
            return false;
        }
        m24115g(m24096b, false);
        return true;
    }

    /* renamed from: f */
    public final void m24118f(C7827s0 c7827s0) {
        m24115g(c7827s0, true);
    }
}
