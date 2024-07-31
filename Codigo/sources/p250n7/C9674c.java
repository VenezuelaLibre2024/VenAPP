package p250n7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: n7.c */
/* loaded from: classes.dex */
public final class C9674c {

    /* renamed from: a */
    private final ByteArrayOutputStream f23767a;

    /* renamed from: b */
    private final DataOutputStream f23768b;

    public C9674c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecognitionOptions.UPC_A);
        this.f23767a = byteArrayOutputStream;
        this.f23768b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m28984b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m28985a(C9672a c9672a) {
        this.f23767a.reset();
        try {
            m28984b(this.f23768b, c9672a.f23761a);
            String str = c9672a.f23762b;
            if (str == null) {
                str = "";
            }
            m28984b(this.f23768b, str);
            this.f23768b.writeLong(c9672a.f23763c);
            this.f23768b.writeLong(c9672a.f23764d);
            this.f23768b.write(c9672a.f23765e);
            this.f23768b.flush();
            return this.f23767a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
