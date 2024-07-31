package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import z9.r;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends e {

    /* renamed from: f */
    private static boolean f9280f = false;

    /* renamed from: a */
    private boolean f9281a = false;

    /* renamed from: b */
    private SignInConfiguration f9282b;

    /* renamed from: c */
    private boolean f9283c;

    /* renamed from: d */
    private int f9284d;

    /* renamed from: e */
    private Intent f9285e;

    private final void f() {
        getSupportLoaderManager().c(0, null, new a(this, null));
        f9280f = false;
    }

    private final void g(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9280f = false;
    }

    private final void h(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f9282b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f9281a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            g(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f9281a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.u1() != null) {
                GoogleSignInAccount u12 = signInAccount.u1();
                r c10 = r.c(this);
                GoogleSignInOptions u13 = this.f9282b.u1();
                u12.getClass();
                c10.e(u13, u12);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", u12);
                this.f9283c = true;
                this.f9284d = i11;
                this.f9285e = intent;
                f();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                g(intExtra);
                return;
            }
        }
        g(8);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            g(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f9282b = signInConfiguration;
        if (bundle == null) {
            if (f9280f) {
                setResult(0);
                g(12502);
                return;
            } else {
                f9280f = true;
                h(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f9283c = z10;
        if (z10) {
            this.f9284d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f9285e = intent2;
            f();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f9280f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9283c);
        if (this.f9283c) {
            bundle.putInt("signInResultCode", this.f9284d);
            bundle.putParcelable("signInResultData", this.f9285e);
        }
    }
}
