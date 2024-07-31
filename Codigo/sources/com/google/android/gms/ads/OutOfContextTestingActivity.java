package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.l2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.zzbsr;
import x8.v;
import x8.w;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2 f10 = x.a().f(this, new zzbsr());
        if (f10 == null) {
            finish();
            return;
        }
        setContentView(w.f30709a);
        LinearLayout linearLayout = (LinearLayout) findViewById(v.f30708a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            f10.zze(stringExtra, d.h2(this), d.h2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
