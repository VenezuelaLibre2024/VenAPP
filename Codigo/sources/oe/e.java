package oe;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import we.k;

/* loaded from: classes.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    private static final re.a f22522i = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f22523a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f22524b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.f f22525c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f22526d;

    /* renamed from: e, reason: collision with root package name */
    private final zb.g f22527e;

    /* renamed from: f, reason: collision with root package name */
    private final ee.b<com.google.firebase.remoteconfig.c> f22528f;

    /* renamed from: g, reason: collision with root package name */
    private final fe.f f22529g;

    /* renamed from: h, reason: collision with root package name */
    private final ee.b<f6.g> f22530h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(zb.g gVar, ee.b<com.google.firebase.remoteconfig.c> bVar, fe.f fVar, ee.b<f6.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f22526d = null;
        this.f22527e = gVar;
        this.f22528f = bVar;
        this.f22529g = fVar;
        this.f22530h = bVar2;
        if (gVar == null) {
            this.f22526d = Boolean.FALSE;
            this.f22524b = aVar;
            this.f22525c = new com.google.firebase.perf.util.f(new Bundle());
            return;
        }
        k.k().r(gVar, fVar, bVar2);
        Context m10 = gVar.m();
        com.google.firebase.perf.util.f a10 = a(m10);
        this.f22525c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f22524b = aVar;
        aVar.Q(a10);
        aVar.O(m10);
        sessionManager.setApplicationContext(m10);
        this.f22526d = aVar.j();
        re.a aVar2 = f22522i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", re.b.b(gVar.r().g(), m10.getPackageName())));
        }
    }

    private static com.google.firebase.perf.util.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new com.google.firebase.perf.util.f(bundle) : new com.google.firebase.perf.util.f();
    }

    public static e c() {
        return (e) zb.g.o().k(e.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f22523a);
    }

    public boolean d() {
        Boolean bool = this.f22526d;
        return bool != null ? bool.booleanValue() : zb.g.o().x();
    }

    public se.g e(String str, String str2) {
        return new se.g(str, str2, k.k(), new l());
    }

    public Trace f(String str) {
        return Trace.c(str);
    }

    public synchronized void g(Boolean bool) {
        re.a aVar;
        String str;
        try {
            zb.g.o();
            if (this.f22524b.i().booleanValue()) {
                f22522i.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f22524b.P(bool);
            if (bool == null) {
                bool = this.f22524b.j();
            }
            this.f22526d = bool;
            if (!Boolean.TRUE.equals(this.f22526d)) {
                if (Boolean.FALSE.equals(this.f22526d)) {
                    aVar = f22522i;
                    str = "Firebase Performance is Disabled";
                }
            }
            aVar = f22522i;
            str = "Firebase Performance is Enabled";
            aVar.f(str);
        } catch (IllegalStateException unused) {
        }
    }
}
