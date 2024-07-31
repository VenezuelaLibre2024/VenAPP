package vc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p442xc.AbstractC12426f0;

/* renamed from: vc.g */
/* loaded from: classes.dex */
class C11835g implements InterfaceC11832e0 {

    /* renamed from: a */
    private final byte[] f31236a;

    /* renamed from: b */
    private final String f31237b;

    /* renamed from: c */
    private final String f31238c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11835g(String str, String str2, byte[] bArr) {
        this.f31237b = str;
        this.f31238c = str2;
        this.f31236a = bArr;
    }

    /* renamed from: c */
    private byte[] m37706c() {
        if (m37707d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f31236a);
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

    /* renamed from: d */
    private boolean m37707d() {
        byte[] bArr = this.f31236a;
        return bArr == null || bArr.length == 0;
    }

    @Override // vc.InterfaceC11832e0
    /* renamed from: a */
    public AbstractC12426f0.d.b mo37669a() {
        byte[] m37706c = m37706c();
        if (m37706c == null) {
            return null;
        }
        return AbstractC12426f0.d.b.m40194a().mo40198b(m37706c).mo40199c(this.f31237b).mo40197a();
    }

    @Override // vc.InterfaceC11832e0
    /* renamed from: b */
    public String mo37670b() {
        return this.f31238c;
    }

    @Override // vc.InterfaceC11832e0
    /* renamed from: h */
    public InputStream mo37671h() {
        if (m37707d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f31236a);
    }
}
