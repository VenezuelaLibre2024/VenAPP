package ui;

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
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f27700a;

    /* renamed from: b, reason: collision with root package name */
    private Context f27701b;

    private final void a(Signature signature, MethodChannel.Result result) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        n.d(messageDigest, "getInstance(...)");
        messageDigest.update(signature.toByteArray());
        byte[] digest = messageDigest.digest();
        n.d(digest, "digest(...)");
        BigInteger bigInteger = new BigInteger(1, digest);
        a0 a0Var = a0.f20743a;
        String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
        n.d(format, "format(format, *args)");
        result.success(format);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f27701b = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "google_api_headers");
        methodChannel.setMethodCallHandler(this);
        this.f27700a = methodChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f27700a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f27700a = null;
        this.f27701b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        n.e(call, "call");
        n.e(result, "result");
        if (!n.a(call.method, "getSigningCertSha1")) {
            result.notImplemented();
            return;
        }
        try {
            Context context = this.f27701b;
            n.b(context);
            PackageManager packageManager = context.getPackageManager();
            Object arguments = call.arguments();
            n.b(arguments);
            String str = (String) arguments;
            int i10 = 0;
            if (Build.VERSION.SDK_INT < 28) {
                Signature[] signatures = packageManager.getPackageInfo(str, 64).signatures;
                n.d(signatures, "signatures");
                int length = signatures.length;
                while (i10 < length) {
                    Signature signature = signatures[i10];
                    n.b(signature);
                    a(signature, result);
                    i10++;
                }
                return;
            }
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            n.d(apkContentsSigners, "getApkContentsSigners(...)");
            int length2 = apkContentsSigners.length;
            while (i10 < length2) {
                Signature signature2 = apkContentsSigners[i10];
                n.b(signature2);
                a(signature2, result);
                i10++;
            }
        } catch (Exception e10) {
            result.error("ERROR", e10.toString(), null);
        }
    }
}
