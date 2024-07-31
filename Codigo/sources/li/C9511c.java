package li;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import dk.C7021m;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: li.c */
/* loaded from: classes3.dex */
public final class C9511c implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: c */
    public static final a f23110c = new a(null);

    /* renamed from: a */
    private Context f23111a;

    /* renamed from: b */
    private MethodChannel f23112b;

    /* renamed from: li.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: a */
    private final String m28304a(byte[] bArr) {
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

    /* renamed from: b */
    private final String m28305b(PackageManager packageManager) {
        Object m20493u;
        Object m20493u2;
        String m28308e;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Object m20493u3;
        Signature[] apkContentsSigners;
        Object m20493u4;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f23111a;
                C9322n.m27778b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    C9322n.m27780d(apkContentsSigners, "getApkContentsSigners(...)");
                    m20493u4 = C7021m.m20493u(apkContentsSigners);
                    byte[] byteArray = ((Signature) m20493u4).toByteArray();
                    C9322n.m27780d(byteArray, "toByteArray(...)");
                    m28308e = m28308e(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    C9322n.m27780d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    m20493u3 = C7021m.m20493u(signingCertificateHistory);
                    byte[] byteArray2 = ((Signature) m20493u3).toByteArray();
                    C9322n.m27780d(byteArray2, "toByteArray(...)");
                    m28308e = m28308e(byteArray2);
                }
            } else {
                Context context2 = this.f23111a;
                C9322n.m27778b(context2);
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
                C9322n.m27780d(signatures, "signatures");
                m20493u = C7021m.m20493u(signatures);
                if (m20493u == null) {
                    return null;
                }
                C9322n.m27778b(signatures);
                m20493u2 = C7021m.m20493u(signatures);
                byte[] byteArray3 = ((Signature) m20493u2).toByteArray();
                C9322n.m27780d(byteArray3, "toByteArray(...)");
                m28308e = m28308e(byteArray3);
            }
            return m28308e;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final String m28306c() {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        Context context = this.f23111a;
        C9322n.m27778b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f23111a;
        C9322n.m27778b(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(packageName);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
        return initiatingPackageName;
    }

    /* renamed from: d */
    private final long m28307d(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    /* renamed from: e */
    private final String m28308e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        C9322n.m27778b(digest);
        return m28304a(digest);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f23111a = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f23112b = methodChannel;
        C9322n.m27778b(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f23111a = null;
        MethodChannel methodChannel = this.f23112b;
        C9322n.m27778b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f23112b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        try {
            if (!C9322n.m27777a(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f23111a;
            C9322n.m27778b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f23111a;
            C9322n.m27778b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            C9322n.m27778b(packageManager);
            String m28305b = m28305b(packageManager);
            String m28306c = m28306c();
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f23111a;
            C9322n.m27778b(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            C9322n.m27778b(packageInfo);
            hashMap.put("buildNumber", String.valueOf(m28307d(packageInfo)));
            if (m28305b != null) {
                hashMap.put("buildSignature", m28305b);
            }
            if (m28306c != null) {
                hashMap.put("installerStore", m28306c);
            }
            result.success(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
