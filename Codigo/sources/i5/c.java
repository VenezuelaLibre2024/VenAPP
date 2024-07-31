package i5;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;
import mk.i;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: f, reason: collision with root package name */
    private final MethodCall f17148f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MethodCall call, MethodChannel.Result result) {
        super(result);
        n.e(call, "call");
        n.e(result, "result");
        this.f17148f = call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(c this$0, Context context) {
        int i10;
        byte[] a10;
        n.e(this$0, "this$0");
        n.e(context, "$context");
        Object obj = this$0.f17148f.arguments;
        n.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int i11 = 0;
        Object obj2 = list.get(0);
        n.c(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
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
        Object obj11 = list.get(9);
        n.c(obj11, "null cannot be cast to non-null type kotlin.Int");
        int intValue7 = ((Integer) obj11).intValue();
        m5.a a11 = l5.a.f20979a.a(intValue5);
        if (a11 == null) {
            p5.a.a("No support format.");
            this$0.c(null);
            return;
        }
        if (booleanValue) {
            a10 = i.a(new File(str));
            i11 = j5.a.f19756a.b(a10);
        }
        if (i11 == 90 || i11 == 270) {
            i10 = intValue;
        } else {
            i10 = intValue2;
            intValue2 = intValue;
        }
        int i12 = intValue4 + i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                a11.b(context, str, byteArrayOutputStream, intValue2, i10, intValue3, i12, booleanValue2, intValue6, intValue7);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(i5.c r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.c.j(i5.c, android.content.Context):void");
    }

    public final void g(final Context context) {
        n.e(context, "context");
        g.f17154c.a().execute(new Runnable() { // from class: i5.a
            @Override // java.lang.Runnable
            public final void run() {
                c.h(c.this, context);
            }
        });
    }

    public final void i(final Context context) {
        n.e(context, "context");
        g.f17154c.a().execute(new Runnable() { // from class: i5.b
            @Override // java.lang.Runnable
            public final void run() {
                c.j(c.this, context);
            }
        });
    }
}
