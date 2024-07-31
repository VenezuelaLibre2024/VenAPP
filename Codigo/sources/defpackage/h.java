package defpackage;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
final class h extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final h f16345a = new h();

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer buffer) {
        n.e(buffer, "buffer");
        if (b10 == Byte.MIN_VALUE) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return b.f5964b.a(list);
            }
            return null;
        }
        if (b10 != -127) {
            return super.readValueOfType(b10, buffer);
        }
        Object readValue2 = readValue(buffer);
        List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
        if (list2 != null) {
            return d.f13671b.a(list2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        List<Object> b10;
        n.e(stream, "stream");
        if (obj instanceof b) {
            stream.write(RecognitionOptions.ITF);
            b10 = ((b) obj).a();
        } else if (!(obj instanceof d)) {
            super.writeValue(stream, obj);
            return;
        } else {
            stream.write(129);
            b10 = ((d) obj).b();
        }
        writeValue(stream, b10);
    }
}
