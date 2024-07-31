package p425wi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.C7056b;
import io.grpc.internal.InterfaceC8884o2;
import io.grpc.internal.InterfaceC8888p2;

/* renamed from: wi.p */
/* loaded from: classes3.dex */
class C12215p implements InterfaceC8888p2 {
    @Override // io.grpc.internal.InterfaceC8888p2
    /* renamed from: a */
    public InterfaceC8884o2 mo25743a(int i10) {
        return new C12214o(new C7056b(), Math.min(1048576, Math.max(RecognitionOptions.AZTEC, i10)));
    }
}
