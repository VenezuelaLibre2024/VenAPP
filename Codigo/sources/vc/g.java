package vc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import xc.f0;

/* loaded from: classes.dex */
class g implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f28802a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28803b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, String str2, byte[] bArr) {
        this.f28803b = str;
        this.f28804c = str2;
        this.f28802a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f28802a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f28802a;
        return bArr == null || bArr.length == 0;
    }

    @Override // vc.e0
    public f0.d.b a() {
        byte[] c10 = c();
        if (c10 == null) {
            return null;
        }
        return f0.d.b.a().b(c10).c(this.f28803b).a();
    }

    @Override // vc.e0
    public String b() {
        return this.f28804c;
    }

    @Override // vc.e0
    public InputStream h() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f28802a);
    }
}
