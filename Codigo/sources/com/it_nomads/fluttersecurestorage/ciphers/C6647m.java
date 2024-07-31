package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.m */
/* loaded from: classes.dex */
public class C6647m {

    /* renamed from: e */
    private static final EnumC6638d f14683e = EnumC6638d.RSA_ECB_PKCS1Padding;

    /* renamed from: f */
    private static final EnumC6646l f14684f = EnumC6646l.AES_CBC_PKCS7Padding;

    /* renamed from: a */
    private final EnumC6638d f14685a;

    /* renamed from: b */
    private final EnumC6646l f14686b;

    /* renamed from: c */
    private final EnumC6638d f14687c;

    /* renamed from: d */
    private final EnumC6646l f14688d;

    public C6647m(SharedPreferences sharedPreferences, Map<String, Object> map) {
        EnumC6638d enumC6638d = f14683e;
        this.f14685a = EnumC6638d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", enumC6638d.name()));
        EnumC6646l enumC6646l = f14684f;
        this.f14686b = EnumC6646l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", enumC6646l.name()));
        EnumC6638d valueOf = EnumC6638d.valueOf(m19381b(map, "keyCipherAlgorithm", enumC6638d.name()));
        int i10 = valueOf.minVersionCode;
        int i11 = Build.VERSION.SDK_INT;
        this.f14687c = i10 <= i11 ? valueOf : enumC6638d;
        EnumC6646l valueOf2 = EnumC6646l.valueOf(m19381b(map, "storageCipherAlgorithm", enumC6646l.name()));
        this.f14688d = valueOf2.minVersionCode <= i11 ? valueOf2 : enumC6646l;
    }

    /* renamed from: b */
    private String m19381b(Map<String, Object> map, String str, String str2) {
        Object obj = map.get(str);
        return obj != null ? obj.toString() : str2;
    }

    /* renamed from: a */
    public InterfaceC6643i m19382a(Context context) {
        return this.f14688d.storageCipher.mo19379a(context, this.f14687c.keyCipher.mo19362a(context));
    }

    /* renamed from: c */
    public InterfaceC6643i m19383c(Context context) {
        return this.f14686b.storageCipher.mo19379a(context, this.f14685a.keyCipher.mo19362a(context));
    }

    /* renamed from: d */
    public void m19384d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    /* renamed from: e */
    public boolean m19385e() {
        return (this.f14685a == this.f14687c && this.f14686b == this.f14688d) ? false : true;
    }

    /* renamed from: f */
    public void m19386f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f14687c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f14688d.name());
    }
}
