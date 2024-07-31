package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.u */
/* loaded from: classes2.dex */
public class C6365u {

    /* renamed from: c */
    private static final Map<String, C6365u> f13779c = new HashMap();

    /* renamed from: a */
    private final Context f13780a;

    /* renamed from: b */
    private final String f13781b;

    private C6365u(Context context, String str) {
        this.f13780a = context;
        this.f13781b = str;
    }

    /* renamed from: c */
    public static synchronized C6365u m17746c(Context context, String str) {
        C6365u c6365u;
        synchronized (C6365u.class) {
            Map<String, C6365u> map = f13779c;
            if (!map.containsKey(str)) {
                map.put(str, new C6365u(context, str));
            }
            c6365u = map.get(str);
        }
        return c6365u;
    }

    /* renamed from: a */
    public synchronized Void m17747a() {
        this.f13780a.deleteFile(this.f13781b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m17748b() {
        return this.f13781b;
    }

    /* renamed from: d */
    public synchronized C6351g m17749d() {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f13780a.openFileInput(this.f13781b);
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
            C6351g m17626b = C6351g.m17626b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return m17626b;
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

    /* renamed from: e */
    public synchronized Void m17750e(C6351g c6351g) {
        FileOutputStream openFileOutput = this.f13780a.openFileOutput(this.f13781b, 0);
        try {
            openFileOutput.write(c6351g.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
