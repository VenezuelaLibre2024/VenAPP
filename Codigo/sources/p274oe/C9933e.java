package p274oe;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C6332f;
import com.google.firebase.perf.util.C6338l;
import com.google.firebase.remoteconfig.C6344c;
import ee.InterfaceC7183b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p422we.C12178k;
import p485zb.C12867g;
import re.C10696a;
import re.C10697b;
import se.C10908g;

/* renamed from: oe.e */
/* loaded from: classes.dex */
public class C9933e {

    /* renamed from: i */
    private static final C10696a f24455i = C10696a.m32565e();

    /* renamed from: a */
    private final Map<String, String> f24456a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C6277a f24457b;

    /* renamed from: c */
    private final C6332f f24458c;

    /* renamed from: d */
    private Boolean f24459d;

    /* renamed from: e */
    private final C12867g f24460e;

    /* renamed from: f */
    private final InterfaceC7183b<C6344c> f24461f;

    /* renamed from: g */
    private final InterfaceC7337f f24462g;

    /* renamed from: h */
    private final InterfaceC7183b<InterfaceC7303g> f24463h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9933e(C12867g c12867g, InterfaceC7183b<C6344c> interfaceC7183b, InterfaceC7337f interfaceC7337f, InterfaceC7183b<InterfaceC7303g> interfaceC7183b2, RemoteConfigManager remoteConfigManager, C6277a c6277a, SessionManager sessionManager) {
        this.f24459d = null;
        this.f24460e = c12867g;
        this.f24461f = interfaceC7183b;
        this.f24462g = interfaceC7337f;
        this.f24463h = interfaceC7183b2;
        if (c12867g == null) {
            this.f24459d = Boolean.FALSE;
            this.f24457b = c6277a;
            this.f24458c = new C6332f(new Bundle());
            return;
        }
        C12178k.m39078k().m39095r(c12867g, interfaceC7337f, interfaceC7183b2);
        Context m42630m = c12867g.m42630m();
        C6332f m29661a = m29661a(m42630m);
        this.f24458c = m29661a;
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC7183b);
        this.f24457b = c6277a;
        c6277a.m17285Q(m29661a);
        c6277a.m17283O(m42630m);
        sessionManager.setApplicationContext(m42630m);
        this.f24459d = c6277a.m17290j();
        C10696a c10696a = f24455i;
        if (c10696a.m32572h() && m29664d()) {
            c10696a.m32570f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", C10697b.m32577b(c12867g.m42632r().m42648g(), m42630m.getPackageName())));
        }
    }

    /* renamed from: a */
    private static C6332f m29661a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new C6332f(bundle) : new C6332f();
    }

    /* renamed from: c */
    public static C9933e m29662c() {
        return (C9933e) C12867g.m42617o().m42629k(C9933e.class);
    }

    /* renamed from: b */
    public Map<String, String> m29663b() {
        return new HashMap(this.f24456a);
    }

    /* renamed from: d */
    public boolean m29664d() {
        Boolean bool = this.f24459d;
        return bool != null ? bool.booleanValue() : C12867g.m42617o().m42634x();
    }

    /* renamed from: e */
    public C10908g m29665e(String str, String str2) {
        return new C10908g(str, str2, C12178k.m39078k(), new C6338l());
    }

    /* renamed from: f */
    public Trace m29666f(String str) {
        return Trace.m17383c(str);
    }

    /* renamed from: g */
    public synchronized void m29667g(Boolean bool) {
        C10696a c10696a;
        String str;
        try {
            C12867g.m42617o();
            if (this.f24457b.m17289i().booleanValue()) {
                f24455i.m32570f("Firebase Performance is permanently disabled");
                return;
            }
            this.f24457b.m17284P(bool);
            if (bool == null) {
                bool = this.f24457b.m17290j();
            }
            this.f24459d = bool;
            if (!Boolean.TRUE.equals(this.f24459d)) {
                if (Boolean.FALSE.equals(this.f24459d)) {
                    c10696a = f24455i;
                    str = "Firebase Performance is Disabled";
                }
            }
            c10696a = f24455i;
            str = "Firebase Performance is Enabled";
            c10696a.m32570f(str);
        } catch (IllegalStateException unused) {
        }
    }
}
