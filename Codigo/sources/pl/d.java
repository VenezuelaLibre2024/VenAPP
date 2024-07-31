package pl;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class d extends PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    private final BinaryMessenger f23294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BinaryMessenger messenger) {
        super(StandardMessageCodec.INSTANCE);
        n.e(messenger, "messenger");
        this.f23294a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        n.c(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        HashMap hashMap = (HashMap) obj;
        if (context != null) {
            return new c(context, this.f23294a, i10, hashMap);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
