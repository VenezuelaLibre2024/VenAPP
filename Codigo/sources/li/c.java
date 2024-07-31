package li;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import dk.m;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: c, reason: collision with root package name */
    public static final a f21257c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f21258a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f21259b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            cArr2[i12] = cArr[i11 >>> 4];
            cArr2[i12 + 1] = cArr[i11 & 15];
        }
        return new String(cArr2);
    }

    private final String b(PackageManager packageManager) {
        Object u10;
        Object u11;
        String e10;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Object u12;
        Signature[] apkContentsSigners;
        Object u13;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f21258a;
                n.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    n.d(apkContentsSigners, "getApkContentsSigners(...)");
                    u13 = m.u(apkContentsSigners);
                    byte[] byteArray = ((Signature) u13).toByteArray();
                    n.d(byteArray, "toByteArray(...)");
                    e10 = e(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    n.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    u12 = m.u(signingCertificateHistory);
                    byte[] byteArray2 = ((Signature) u12).toByteArray();
                    n.d(byteArray2, "toByteArray(...)");
                    e10 = e(byteArray2);
                }
            } else {
                Context context2 = this.f21258a;
                n.b(context2);
                Signature[] signatures = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                boolean z10 = true;
                if (signatures != null) {
                    if (!(signatures.length == 0)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    return null;
                }
                n.d(signatures, "signatures");
                u10 = m.u(signatures);
                if (u10 == null) {
                    return null;
                }
                n.b(signatures);
                u11 = m.u(signatures);
                byte[] byteArray3 = ((Signature) u11).toByteArray();
                n.d(byteArray3, "toByteArray(...)");
                e10 = e(byteArray3);
            }
            return e10;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final String c() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.f21258a;
        n.b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f21258a;
        n.b(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(packageName);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
        return initiatingPackageName;
    }

    private final long d(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    private final String e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        n.b(digest);
        return a(digest);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f21258a = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f21259b = methodChannel;
        n.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f21258a = null;
        MethodChannel methodChannel = this.f21259b;
        n.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f21259b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        try {
            if (!n.a(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f21258a;
            n.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f21258a;
            n.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            n.b(packageManager);
            String b10 = b(packageManager);
            String c10 = c();
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f21258a;
            n.b(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            n.b(packageInfo);
            hashMap.put("buildNumber", String.valueOf(d(packageInfo)));
            if (b10 != null) {
                hashMap.put("buildSignature", b10);
            }
            if (c10 != null) {
                hashMap.put("installerStore", c10);
            }
            result.success(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
