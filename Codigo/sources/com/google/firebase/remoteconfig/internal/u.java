package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, u> f12547c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f12548a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12549b;

    private u(Context context, String str) {
        this.f12548a = context;
        this.f12549b = str;
    }

    public static synchronized u c(Context context, String str) {
        u uVar;
        synchronized (u.class) {
            Map<String, u> map = f12547c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
            uVar = map.get(str);
        }
        return uVar;
    }

    public synchronized Void a() {
        this.f12548a.deleteFile(this.f12549b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f12549b;
    }

    public synchronized g d() {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f12548a.openFileInput(this.f12549b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            g b10 = g.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b10;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th2;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream openFileOutput = this.f12548a.openFileOutput(this.f12549b, 0);
        try {
            openFileOutput.write(gVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
