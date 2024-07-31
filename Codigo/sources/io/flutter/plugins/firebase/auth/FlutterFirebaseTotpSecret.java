package io.flutter.plugins.firebase.auth;

import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes3.dex */
public class FlutterFirebaseTotpSecret implements GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void generateQrCodeUrl(String str, String str2, String str3, GeneratedAndroidFirebaseAuth.Result<String> result) {
        com.google.firebase.auth.z0 z0Var = FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str);
        result.success((str2 == null || str3 == null) ? z0Var.f() : z0Var.e(str2, str3));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void openInOtpApp(String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str).i(str2);
        result.success(null);
    }
}
