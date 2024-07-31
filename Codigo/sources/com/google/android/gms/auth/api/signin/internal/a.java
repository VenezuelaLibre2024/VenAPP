package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.f;
import j1.b;
import z9.g;
import z9.z;

/* loaded from: classes.dex */
final class a implements a.InterfaceC0074a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f9286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ a(SignInHubActivity signInHubActivity, z zVar) {
        this.f9286a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0074a
    public final void a(b bVar) {
    }

    @Override // androidx.loader.app.a.InterfaceC0074a
    public final /* bridge */ /* synthetic */ void b(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f9286a;
        signInHubActivity.setResult(SignInHubActivity.d(signInHubActivity), SignInHubActivity.e(signInHubActivity));
        this.f9286a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0074a
    public final b c(int i10, Bundle bundle) {
        return new g(this.f9286a, f.c());
    }
}
