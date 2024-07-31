package p153i5;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p131h5.C7630a;
import p173j5.C8986a;
import p214l5.C9398a;
import p233m5.InterfaceC9546a;
import p288p5.C10060a;

/* renamed from: i5.e */
/* loaded from: classes.dex */
public final class C7846e extends AbstractC7848g {

    /* renamed from: f */
    private final MethodCall f18811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7846e(MethodCall call, MethodChannel.Result result) {
        super(result);
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        this.f18811f = call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m24137g(C7846e this$0, Context context) {
        int i10;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(context, "$context");
        Object obj = this$0.f18811f.arguments;
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
        byte[] bArr = (byte[]) obj2;
        Object obj3 = list.get(1);
        C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        C9322n.m27779c(obj4, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj4).intValue();
        Object obj5 = list.get(3);
        C9322n.m27779c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue3 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        C9322n.m27779c(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue4 = ((Integer) obj6).intValue();
        Object obj7 = list.get(5);
        C9322n.m27779c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj7).booleanValue();
        Object obj8 = list.get(6);
        C9322n.m27779c(obj8, "null cannot be cast to non-null type kotlin.Int");
        int intValue5 = ((Integer) obj8).intValue();
        Object obj9 = list.get(7);
        C9322n.m27779c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue2 = ((Boolean) obj9).booleanValue();
        Object obj10 = list.get(8);
        C9322n.m27779c(obj10, "null cannot be cast to non-null type kotlin.Int");
        int intValue6 = ((Integer) obj10).intValue();
        int m26377b = booleanValue ? C8986a.f21535a.m26377b(bArr) : 0;
        if (m26377b == 90 || m26377b == 270) {
            i10 = intValue2;
        } else {
            i10 = intValue;
            intValue = intValue2;
        }
        InterfaceC9546a m27986a = C9398a.f22801a.m27986a(intValue5);
        if (m27986a == null) {
            C10060a.m30005a("No support format.");
            this$0.m24142c(null);
            return;
        }
        int i11 = intValue4 + m26377b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                m27986a.mo28433a(context, bArr, byteArrayOutputStream, i10, intValue, intValue3, i11, booleanValue2, intValue6);
                this$0.m24142c(byteArrayOutputStream.toByteArray());
            } catch (Exception e10) {
                if (C7630a.f18015c.m23158a()) {
                    e10.printStackTrace();
                }
                this$0.m24142c(null);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: f */
    public final void m24138f(final Context context) {
        C9322n.m27781e(context, "context");
        AbstractC7848g.f18814c.m24143a().execute(new Runnable() { // from class: i5.d
            @Override // java.lang.Runnable
            public final void run() {
                C7846e.m24137g(C7846e.this, context);
            }
        });
    }
}
