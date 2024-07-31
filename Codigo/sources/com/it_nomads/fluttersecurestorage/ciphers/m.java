package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    private static final d f13409e = d.RSA_ECB_PKCS1Padding;

    /* renamed from: f, reason: collision with root package name */
    private static final l f13410f = l.AES_CBC_PKCS7Padding;

    /* renamed from: a, reason: collision with root package name */
    private final d f13411a;

    /* renamed from: b, reason: collision with root package name */
    private final l f13412b;

    /* renamed from: c, reason: collision with root package name */
    private final d f13413c;

    /* renamed from: d, reason: collision with root package name */
    private final l f13414d;

    public m(SharedPreferences sharedPreferences, Map<String, Object> map) {
        d dVar = f13409e;
        this.f13411a = d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", dVar.name()));
        l lVar = f13410f;
        this.f13412b = l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", lVar.name()));
        d valueOf = d.valueOf(b(map, "keyCipherAlgorithm", dVar.name()));
        int i10 = valueOf.minVersionCode;
        int i11 = Build.VERSION.SDK_INT;
        this.f13413c = i10 <= i11 ? valueOf : dVar;
        l valueOf2 = l.valueOf(b(map, "storageCipherAlgorithm", lVar.name()));
        this.f13414d = valueOf2.minVersionCode <= i11 ? valueOf2 : lVar;
    }

    private String b(Map<String, Object> map, String str, String str2) {
        Object obj = map.get(str);
        return obj != null ? obj.toString() : str2;
    }

    public i a(Context context) {
        return this.f13414d.storageCipher.a(context, this.f13413c.keyCipher.a(context));
    }

    public i c(Context context) {
        return this.f13412b.storageCipher.a(context, this.f13411a.keyCipher.a(context));
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        return (this.f13411a == this.f13413c && this.f13412b == this.f13414d) ? false : true;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f13413c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f13414d.name());
    }
}
