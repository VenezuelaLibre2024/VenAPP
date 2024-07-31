package com.techandpeople.techchat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import cb.b;
import cb.c;
import cb.d;
import cb.f;
import com.google.android.gms.ads.MobileAds;
import com.techandpeople.techchat.app.MainActivity;
import com.techandpeople.techchat.app.a;
import io.flutter.embedding.android.FlutterActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import sa.e;
import sa.g;

/* loaded from: classes3.dex */
public final class MainActivity extends FlutterActivity implements g {

    /* renamed from: b, reason: collision with root package name */
    private c f13565b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13564a = "MyActivity";

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f13566c = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13567a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13567a = iArr;
        }
    }

    private final void d() {
        if (this.f13566c.getAndSet(true)) {
            return;
        }
        a.C0197a c0197a = com.techandpeople.techchat.app.a.f13568a;
        Context context = getContext();
        n.d(context, "getContext(...)");
        c0197a.a(context);
        MobileAds.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final MainActivity this$0) {
        n.e(this$0, "this$0");
        f.b(this$0, new b.a() { // from class: th.c
            @Override // cb.b.a
            public final void onConsentFormDismissed(cb.e eVar) {
                MainActivity.f(MainActivity.this, eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MainActivity this$0, cb.e eVar) {
        n.e(this$0, "this$0");
        if (eVar != null) {
            Log.w(this$0.f13564a, eVar.a() + ": " + eVar.b());
        }
        c cVar = this$0.f13565b;
        if (cVar == null) {
            n.p("consentInformation");
            cVar = null;
        }
        if (cVar.canRequestAds()) {
            this$0.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MainActivity this$0, cb.e eVar) {
        n.e(this$0, "this$0");
        Log.w(this$0.f13564a, eVar.a() + ": " + eVar.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.b(getApplicationContext(), e.a.LATEST, this);
        d a10 = new d.a().a();
        c a11 = f.a(this);
        n.d(a11, "getConsentInformation(...)");
        this.f13565b = a11;
        c cVar = null;
        if (a11 == null) {
            n.p("consentInformation");
            a11 = null;
        }
        a11.requestConsentInfoUpdate(this, a10, new c.b() { // from class: th.a
            @Override // cb.c.b
            public final void onConsentInfoUpdateSuccess() {
                MainActivity.e(MainActivity.this);
            }
        }, new c.a() { // from class: th.b
            @Override // cb.c.a
            public final void onConsentInfoUpdateFailure(cb.e eVar) {
                MainActivity.g(MainActivity.this, eVar);
            }
        });
        c cVar2 = this.f13565b;
        if (cVar2 == null) {
            n.p("consentInformation");
        } else {
            cVar = cVar2;
        }
        if (cVar.canRequestAds()) {
            d();
        }
    }

    @Override // sa.g
    public void onMapsSdkInitialized(e.a renderer) {
        String str;
        n.e(renderer, "renderer");
        int i10 = a.f13567a[renderer.ordinal()];
        if (i10 == 1) {
            str = "The latest version of the renderer is used.";
        } else if (i10 != 2) {
            return;
        } else {
            str = "The legacy version of the renderer is used.";
        }
        Log.d("NewRendererLog", str);
    }
}
