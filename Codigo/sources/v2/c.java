package v2;

import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;

/* loaded from: classes.dex */
public final class c implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private d f27882a;

    /* renamed from: b, reason: collision with root package name */
    private b f27883b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b bVar = new b(flutterPluginBinding.getApplicationContext());
        this.f27883b = bVar;
        d dVar = new d(bVar);
        this.f27882a = dVar;
        dVar.f(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        d dVar = this.f27882a;
        if (dVar == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        dVar.g();
        this.f27882a = null;
        this.f27883b = null;
    }
}
