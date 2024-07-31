package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.d;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaci;
import com.google.android.gms.internal.p002firebaseauthapi.zzacj;
import com.google.android.gms.internal.p002firebaseauthapi.zzack;
import com.google.android.gms.internal.p002firebaseauthapi.zzacw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ec.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import la.i;
import la.k;
import oc.c1;
import oc.e1;
import oc.m0;
import oc.p1;
import oc.q;
import oc.r1;
import zb.g;

/* loaded from: classes.dex */
public class RecaptchaActivity extends e implements zzack {

    /* renamed from: b, reason: collision with root package name */
    private static final String f11700b = "RecaptchaActivity";

    /* renamed from: c, reason: collision with root package name */
    private static long f11701c;

    /* renamed from: d, reason: collision with root package name */
    private static final e1 f11702d = e1.f();

    /* renamed from: a, reason: collision with root package name */
    private boolean f11703a = false;

    private final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        g p10 = g.p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p10);
        p1.c().d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String a10 = r1.c(getApplicationContext(), p10.s()).a();
        if (TextUtils.isEmpty(a10)) {
            Log.e(f11700b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            f(q.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m()) ? firebaseAuth.m() : zzacw.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", a10);
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Uri e(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            d dVar = (d) task.getResult();
            if (dVar.a() != null) {
                Log.w(f11700b, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(dVar.a()));
            }
            buildUpon.fragment("fac=" + dVar.b());
        } else {
            Log.e(f11700b, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    private final void f(Status status) {
        f11701c = 0L;
        this.f11703a = false;
        Intent intent = new Intent();
        c1.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        h(intent);
        f11702d.a(this);
        finish();
    }

    private final boolean h(Intent intent) {
        return k1.a.b(this).d(intent);
    }

    private final void i() {
        f11701c = 0L;
        this.f11703a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        h(intent);
        f11702d.a(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, Task task) {
        boolean z10 = false;
        if (!(getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
            Log.e(f11700b, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzacj.zzb(this, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            androidx.browser.customtabs.d b10 = new d.b().b();
            b10.f1766a.addFlags(1073741824);
            b10.f1766a.addFlags(268435456);
            b10.b(this, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f11700b, "Could not do operation - unknown action: " + action);
            i();
            return;
        }
        long a10 = i.d().a();
        if (a10 - f11701c < 30000) {
            Log.e(f11700b, "Could not start operation - already in progress");
            return;
        }
        f11701c = a10;
        if (bundle != null) {
            this.f11703a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f11703a) {
                i();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = k.b(la.a.a(this, packageName)).toLowerCase(Locale.US);
                g p10 = g.p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p10);
                if (zzaed.zza(p10)) {
                    zza(d(Uri.parse(zzaed.zza(p10.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.u0());
                } else {
                    new zzaci(packageName, lowerCase, intent, p10, this).executeOnExecutor(firebaseAuth.z0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f11700b, "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzacj.zzb(this, packageName);
            }
            this.f11703a = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            f(c1.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            i();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String g10 = p1.c().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(g10)) {
            Log.e(f11700b, "Failed to find registration for this event - failing to prevent session injection.");
            f(q.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = r1.c(getApplicationContext(), g.p(g10).s()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f11701c = 0L;
        this.f11703a = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (h(intent3)) {
            f11702d.a(this);
        } else {
            m0.f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f11703a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return d(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final String zza(String str) {
        return zzaed.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzack.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final void zza(final Uri uri, final String str, ee.b<jc.b> bVar) {
        jc.b bVar2 = bVar.get();
        (bVar2 != null ? bVar2.a(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return RecaptchaActivity.e(uri, task);
            }
        }) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.this.g(str, task);
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzack
    public final void zza(String str, Status status) {
        if (status == null) {
            i();
        } else {
            f(status);
        }
    }
}
