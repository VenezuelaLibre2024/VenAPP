package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.AbstractC1329a;
import com.google.android.gms.common.api.AbstractC5106f;
import p169j1.C8938b;
import p484z9.C12834g;
import p484z9.C12853z;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: classes.dex */
final class C5100a implements AbstractC1329a.a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f10394a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5100a(SignInHubActivity signInHubActivity, C12853z c12853z) {
        this.f10394a = signInHubActivity;
    }

    @Override // androidx.loader.app.AbstractC1329a.a
    /* renamed from: a */
    public final void mo7415a(C8938b c8938b) {
    }

    @Override // androidx.loader.app.AbstractC1329a.a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7416b(C8938b c8938b, Object obj) {
        SignInHubActivity signInHubActivity = this.f10394a;
        signInHubActivity.setResult(SignInHubActivity.m12959d(signInHubActivity), SignInHubActivity.m12960e(signInHubActivity));
        this.f10394a.finish();
    }

    @Override // androidx.loader.app.AbstractC1329a.a
    /* renamed from: c */
    public final C8938b mo7417c(int i10, Bundle bundle) {
        return new C12834g(this.f10394a, AbstractC5106f.m12983c());
    }
}
