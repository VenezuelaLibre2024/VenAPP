package p392v2;

import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: v2.c */
/* loaded from: classes.dex */
public final class C11617c implements FlutterPlugin {

    /* renamed from: a */
    private C11618d f30206a;

    /* renamed from: b */
    private C11616b f30207b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C11616b c11616b = new C11616b(flutterPluginBinding.getApplicationContext());
        this.f30207b = c11616b;
        C11618d c11618d = new C11618d(c11616b);
        this.f30206a = c11618d;
        c11618d.m36412f(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C11618d c11618d = this.f30206a;
        if (c11618d == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        c11618d.m36413g();
        this.f30206a = null;
        this.f30207b = null;
    }
}
