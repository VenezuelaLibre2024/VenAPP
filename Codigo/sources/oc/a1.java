package oc;

import com.google.android.gms.common.api.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a1 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x0 f22342a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(x0 x0Var) {
        this.f22342a = x0Var;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        boolean e10;
        s sVar;
        if (z10) {
            this.f22342a.f22480c = true;
            this.f22342a.b();
            return;
        }
        this.f22342a.f22480c = false;
        e10 = this.f22342a.e();
        if (e10) {
            sVar = this.f22342a.f22479b;
            sVar.c();
        }
    }
}
