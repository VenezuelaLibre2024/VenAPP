package pl;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;
import kotlin.jvm.internal.C9322n;

/* renamed from: pl.d */
/* loaded from: classes3.dex */
public final class C10207d extends PlatformViewFactory {

    /* renamed from: a */
    private final BinaryMessenger f25233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10207d(BinaryMessenger messenger) {
        super(StandardMessageCodec.INSTANCE);
        C9322n.m27781e(messenger, "messenger");
        this.f25233a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        C9322n.m27779c(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        if (context != null) {
            return new C10206c(context, this.f25233a, i10, hashMap);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
