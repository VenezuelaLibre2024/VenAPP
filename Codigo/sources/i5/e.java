package i5;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: f, reason: collision with root package name */
    private final MethodCall f17151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MethodCall call, MethodChannel.Result result) {
        super(result);
        n.e(call, "call");
        n.e(result, "result");
        this.f17151f = call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e this$0, Context context) {
        int i10;
        n.e(this$0, "this$0");
        n.e(context, "$context");
        Object obj = this$0.f17151f.arguments;
        n.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        n.c(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
        byte[] bArr = (byte[]) obj2;
        Object obj3 = list.get(1);
        n.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        n.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj4).intValue();
        Object obj5 = list.get(3);
        n.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        n.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue4 = ((Integer) obj6).intValue();
        Object obj7 = list.get(5);
        n.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        Object obj8 = list.get(6);
        n.c(obj8, "null cannot be cast to non-null type kotlin.Int");
        int intValue5 = ((Integer) obj8).intValue();
        Object obj9 = list.get(7);
        n.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue2 = ((Boolean) obj9).booleanValue();
        Object obj10 = list.get(8);
        n.c(obj10, "null cannot be cast to non-null type kotlin.Int");
        int intValue6 = ((Integer) obj10).intValue();
        int b10 = booleanValue ? j5.a.f19756a.b(bArr) : 0;
        if (b10 == 90 || b10 == 270) {
            i10 = intValue2;
        } else {
            i10 = intValue;
            intValue = intValue2;
        }
        m5.a a10 = l5.a.f20979a.a(intValue5);
        if (a10 == null) {
            p5.a.a("No support format.");
            this$0.c(null);
            return;
        }
        int i11 = intValue4 + b10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                a10.a(context, bArr, byteArrayOutputStream, i10, intValue, intValue3, i11, booleanValue2, intValue6);
                this$0.c(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                if (h5.a.f16378c.a()) {
                    e10.printStackTrace();
                }
                this$0.c(null);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public final void f(final Context context) {
        n.e(context, "context");
        g.f17154c.a().execute(new Runnable() { // from class: i5.d
            @Override // java.lang.Runnable
            public final void run() {
                e.g(e.this, context);
            }
        });
    }
}
