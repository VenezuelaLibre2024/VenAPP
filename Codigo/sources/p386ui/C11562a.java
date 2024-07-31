package p386ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;

/* renamed from: ui.a */
/* loaded from: classes3.dex */
public final class C11562a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a */
    private MethodChannel f30023a;

    /* renamed from: b */
    private Context f30024b;

    /* renamed from: a */
    private final void m36237a(Signature signature, MethodChannel.Result result) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        C9322n.m27780d(messageDigest, "getInstance(...)");
        messageDigest.update(signature.toByteArray());
        byte[] digest = messageDigest.digest();
        C9322n.m27780d(digest, "digest(...)");
        BigInteger bigInteger = new BigInteger(1, digest);
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
        C9322n.m27780d(format, "format(format, *args)");
        result.success(format);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f30024b = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "google_api_headers");
        methodChannel.setMethodCallHandler(this);
        this.f30023a = methodChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f30023a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f30023a = null;
        this.f30024b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (!C9322n.m27777a(call.method, "getSigningCertSha1")) {
            result.notImplemented();
            return;
        }
        try {
            Context context = this.f30024b;
            C9322n.m27778b(context);
            PackageManager packageManager = context.getPackageManager();
            Object arguments = call.arguments();
            C9322n.m27778b(arguments);
            String str = (String) arguments;
            int i10 = 0;
            if (Build.VERSION.SDK_INT < 28) {
                Signature[] signatures = packageManager.getPackageInfo(str, 64).signatures;
                C9322n.m27780d(signatures, "signatures");
                int length = signatures.length;
                while (i10 < length) {
                    Signature signature = signatures[i10];
                    C9322n.m27778b(signature);
                    m36237a(signature, result);
                    i10++;
                }
                return;
            }
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            C9322n.m27780d(apkContentsSigners, "getApkContentsSigners(...)");
            int length2 = apkContentsSigners.length;
            while (i10 < length2) {
                Signature signature2 = apkContentsSigners[i10];
                C9322n.m27778b(signature2);
                m36237a(signature2, result);
                i10++;
            }
        } catch (Exception e10) {
            result.error("ERROR", e10.toString(), null);
        }
    }
}
