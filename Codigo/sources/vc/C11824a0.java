package vc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p442xc.AbstractC12426f0;

/* renamed from: vc.a0 */
/* loaded from: classes.dex */
class C11824a0 implements InterfaceC11832e0 {

    /* renamed from: a */
    private final File f31214a;

    /* renamed from: b */
    private final String f31215b;

    /* renamed from: c */
    private final String f31216c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11824a0(String str, String str2, File file) {
        this.f31215b = str;
        this.f31216c = str2;
        this.f31214a = file;
    }

    /* renamed from: c */
    private byte[] m37668c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo37671h = mo37671h();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (mo37671h == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (mo37671h != null) {
                            mo37671h.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = mo37671h.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                mo37671h.close();
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

    @Override // vc.InterfaceC11832e0
    /* renamed from: a */
    public AbstractC12426f0.d.b mo37669a() {
        byte[] m37668c = m37668c();
        if (m37668c != null) {
            return AbstractC12426f0.d.b.m40194a().mo40198b(m37668c).mo40199c(this.f31215b).mo40197a();
        }
        return null;
    }

    @Override // vc.InterfaceC11832e0
    /* renamed from: b */
    public String mo37670b() {
        return this.f31216c;
    }

    @Override // vc.InterfaceC11832e0
    /* renamed from: h */
    public InputStream mo37671h() {
        if (this.f31214a.exists() && this.f31214a.isFile()) {
            try {
                return new FileInputStream(this.f31214a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
