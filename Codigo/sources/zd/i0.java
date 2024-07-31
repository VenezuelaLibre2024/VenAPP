package zd;

import android.os.Bundle;
import cc.a;

/* loaded from: classes.dex */
final class i0 implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private dj.g<String> f32613a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(dj.g<String> gVar) {
        this.f32613a = gVar;
    }

    @Override // cc.a.b
    public void a(int i10, Bundle bundle) {
        if (i10 == 2) {
            this.f32613a.c(bundle.getString("events"));
        }
    }
}
