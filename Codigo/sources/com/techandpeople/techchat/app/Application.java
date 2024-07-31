package com.techandpeople.techchat.app;

import io.flutter.app.FlutterApplication;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.FlutterMain;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class Application extends FlutterApplication implements PluginRegistry.PluginRegistrantCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13561a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static String f13562b;

    /* renamed from: c, reason: collision with root package name */
    public static String f13563c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(String str) {
            n.e(str, "<set-?>");
            Application.f13562b = str;
        }

        public final void b(String str) {
            n.e(str, "<set-?>");
            Application.f13563c = str;
        }
    }

    @Override // io.flutter.app.FlutterApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        a aVar = f13561a;
        String string = getString(2131886116);
        n.d(string, "getString(...)");
        aVar.a(string);
        String string2 = getString(2131886277);
        n.d(string2, "getString(...)");
        aVar.b(string2);
        uh.b.f27698a.a(this);
        FlutterMain.startInitialization(this);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
    public void registerWith(PluginRegistry registry) {
        n.e(registry, "registry");
        b.f13569a.b(registry);
    }
}
