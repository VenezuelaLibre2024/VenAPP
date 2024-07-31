package vc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import xc.f0;

/* loaded from: classes.dex */
class a0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final File f28780a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28781b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28782c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, String str2, File file) {
        this.f28781b = str;
        this.f28782c = str2;
        this.f28780a = file;
    }

    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream h10 = h();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (h10 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (h10 != null) {
                            h10.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = h10.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                h10.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // vc.e0
    public f0.d.b a() {
        byte[] c10 = c();
        if (c10 != null) {
            return f0.d.b.a().b(c10).c(this.f28781b).a();
        }
        return null;
    }

    @Override // vc.e0
    public String b() {
        return this.f28782c;
    }

    @Override // vc.e0
    public InputStream h() {
        if (this.f28780a.exists() && this.f28780a.isFile()) {
            try {
                return new FileInputStream(this.f28780a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
