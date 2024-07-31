package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ca.C1894b;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.C5283u0;
import java.util.Set;
import p013ab.BinderC0085d;
import p013ab.C0093l;
import za.C12858e;
import za.InterfaceC12859f;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
/* loaded from: classes.dex */
public final class BinderC5160m1 extends BinderC0085d implements AbstractC5106f.a, AbstractC5106f.b {

    /* renamed from: s */
    private static final C5101a.a f10538s = C12858e.f35054c;

    /* renamed from: a */
    private final Context f10539a;

    /* renamed from: b */
    private final Handler f10540b;

    /* renamed from: c */
    private final C5101a.a f10541c;

    /* renamed from: d */
    private final Set f10542d;

    /* renamed from: e */
    private final C5234e f10543e;

    /* renamed from: f */
    private InterfaceC12859f f10544f;

    /* renamed from: r */
    private InterfaceC5157l1 f10545r;

    public BinderC5160m1(Context context, Handler handler, C5234e c5234e) {
        C5101a.a aVar = f10538s;
        this.f10539a = context;
        this.f10540b = handler;
        this.f10543e = (C5234e) C5276s.m13325k(c5234e, "ClientSettings must not be null");
        this.f10542d = c5234e.m13237g();
        this.f10541c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2 */
    public static /* bridge */ /* synthetic */ void m13139g2(BinderC5160m1 binderC5160m1, C0093l c0093l) {
        C1894b m381u1 = c0093l.m381u1();
        if (m381u1.m10054y1()) {
            C5283u0 c5283u0 = (C5283u0) C5276s.m13324j(c0093l.m382v1());
            m381u1 = c5283u0.m13349u1();
            if (m381u1.m10054y1()) {
                binderC5160m1.f10545r.mo13133b(c5283u0.m13350v1(), binderC5160m1.f10542d);
                binderC5160m1.f10544f.disconnect();
            } else {
                String valueOf = String.valueOf(m381u1);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        binderC5160m1.f10545r.mo13132a(m381u1);
        binderC5160m1.f10544f.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, za.f] */
    /* renamed from: h2 */
    public final void m13140h2(InterfaceC5157l1 interfaceC5157l1) {
        InterfaceC12859f interfaceC12859f = this.f10544f;
        if (interfaceC12859f != null) {
            interfaceC12859f.disconnect();
        }
        this.f10543e.m13241k(Integer.valueOf(System.identityHashCode(this)));
        C5101a.a aVar = this.f10541c;
        Context context = this.f10539a;
        Looper looper = this.f10540b.getLooper();
        C5234e c5234e = this.f10543e;
        this.f10544f = aVar.buildClient(context, looper, c5234e, (C5234e) c5234e.m13238h(), (AbstractC5106f.a) this, (AbstractC5106f.b) this);
        this.f10545r = interfaceC5157l1;
        Set set = this.f10542d;
        if (set == null || set.isEmpty()) {
            this.f10540b.post(new RunnableC5149j1(this));
        } else {
            this.f10544f.mo377a();
        }
    }

    /* renamed from: i2 */
    public final void m13141i2() {
        InterfaceC12859f interfaceC12859f = this.f10544f;
        if (interfaceC12859f != null) {
            interfaceC12859f.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5131f
    public final void onConnected(Bundle bundle) {
        this.f10544f.mo378b(this);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5161n
    public final void onConnectionFailed(C1894b c1894b) {
        this.f10545r.mo13132a(c1894b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5131f
    public final void onConnectionSuspended(int i10) {
        this.f10544f.disconnect();
    }

    @Override // p013ab.InterfaceC0087f
    /* renamed from: v0 */
    public final void mo379v0(C0093l c0093l) {
        this.f10540b.post(new RunnableC5153k1(this, c0093l));
    }
}
