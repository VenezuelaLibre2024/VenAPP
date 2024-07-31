package wi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.grpc.internal.o2;
import io.grpc.internal.p2;

/* loaded from: classes3.dex */
class p implements p2 {
    @Override // io.grpc.internal.p2
    public o2 a(int i10) {
        return new o(new dm.b(), Math.min(1048576, Math.max(RecognitionOptions.AZTEC, i10)));
    }
}
