package p000;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: h */
/* loaded from: classes2.dex */
final class C7604h extends StandardMessageCodec {

    /* renamed from: a */
    public static final C7604h f17982a = new C7604h();

    private C7604h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer buffer) {
        C9322n.m27781e(buffer, "buffer");
        if (b10 == Byte.MIN_VALUE) {
            Object readValue = readValue(buffer);
            List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return C1589b.f6819b.m8828a(list);
            }
            return null;
        }
        if (b10 != -127) {
            return super.readValueOfType(b10, buffer);
        }
        Object readValue2 = readValue(buffer);
        List<? extends Object> list2 = readValue2 instanceof List ? (List) readValue2 : null;
        if (list2 != null) {
            return C6803d.f15025b.m19683a(list2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        List<Object> m19682b;
        C9322n.m27781e(stream, "stream");
        if (obj instanceof C1589b) {
            stream.write(RecognitionOptions.ITF);
            m19682b = ((C1589b) obj).m8827a();
        } else if (!(obj instanceof C6803d)) {
            super.writeValue(stream, obj);
            return;
        } else {
            stream.write(129);
            m19682b = ((C6803d) obj).m19682b();
        }
        writeValue(stream, m19682b);
    }
}
