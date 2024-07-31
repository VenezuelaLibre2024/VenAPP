package p246n3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p129h3.C7624h;
import p129h3.InterfaceC7620d;
import p193k3.InterfaceC9139b;

/* renamed from: n3.v */
/* loaded from: classes.dex */
public class C9656v implements InterfaceC7620d<InputStream> {

    /* renamed from: a */
    private final InterfaceC9139b f23715a;

    public C9656v(InterfaceC9139b interfaceC9139b) {
        this.f23715a = interfaceC9139b;
    }

    @Override // p129h3.InterfaceC7620d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo23137b(InputStream inputStream, File file, C7624h c7624h) {
        byte[] bArr = (byte[]) this.f23715a.mo26943c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f23715a.put(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f23715a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f23715a.put(bArr);
                return true;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
