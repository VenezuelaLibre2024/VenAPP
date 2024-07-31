package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.common.b;
import com.facebook.common.c;
import com.facebook.internal.e0;
import com.facebook.internal.i;
import com.facebook.internal.n0;
import com.facebook.login.y;
import i4.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public class FacebookActivity extends e {

    /* renamed from: b */
    public static final a f7557b = new a(null);

    /* renamed from: c */
    private static final String f7558c = FacebookActivity.class.getName();

    /* renamed from: a */
    private Fragment f7559a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final void f() {
        Intent requestIntent = getIntent();
        e0 e0Var = e0.f7730a;
        n.d(requestIntent, "requestIntent");
        r q10 = e0.q(e0.u(requestIntent));
        Intent intent = getIntent();
        n.d(intent, "intent");
        setResult(0, e0.m(intent, null, q10));
        finish();
    }

    public final Fragment d() {
        return this.f7559a;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(prefix, "prefix");
            n.e(writer, "writer");
            d5.a.f13773a.a();
            if (n.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.d, com.facebook.internal.i, androidx.fragment.app.Fragment] */
    protected Fragment e() {
        y yVar;
        Intent intent = getIntent();
        androidx.fragment.app.n supportFragmentManager = getSupportFragmentManager();
        n.d(supportFragmentManager, "supportFragmentManager");
        Fragment h02 = supportFragmentManager.h0("SingleFragment");
        if (h02 != null) {
            return h02;
        }
        if (n.a("FacebookDialogFragment", intent.getAction())) {
            ?? iVar = new i();
            iVar.setRetainInstance(true);
            iVar.p(supportFragmentManager, "SingleFragment");
            yVar = iVar;
        } else {
            y yVar2 = new y();
            yVar2.setRetainInstance(true);
            supportFragmentManager.m().b(b.f7678c, yVar2, "SingleFragment").f();
            yVar = yVar2;
        }
        return yVar;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        n.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f7559a;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!i4.e0.F()) {
            n0 n0Var = n0.f7780a;
            n0.k0(f7558c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            n.d(applicationContext, "applicationContext");
            i4.e0.M(applicationContext);
        }
        setContentView(c.f7682a);
        if (n.a("PassThrough", intent.getAction())) {
            f();
        } else {
            this.f7559a = e();
        }
    }
}
