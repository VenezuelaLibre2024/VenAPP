package n7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f21834a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f21835b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecognitionOptions.UPC_A);
        this.f21834a = byteArrayOutputStream;
        this.f21835b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f21834a.reset();
        try {
            b(this.f21835b, aVar.f21828a);
            String str = aVar.f21829b;
            if (str == null) {
                str = "";
            }
            b(this.f21835b, str);
            this.f21835b.writeLong(aVar.f21830c);
            this.f21835b.writeLong(aVar.f21831d);
            this.f21835b.write(aVar.f21832e);
            this.f21835b.flush();
            return this.f21834a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
