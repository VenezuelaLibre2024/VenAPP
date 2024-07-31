package p153i5;

import android.content.Context;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import mk.C9609i;
import p131h5.C7630a;
import p173j5.C8986a;
import p214l5.C9398a;
import p233m5.InterfaceC9546a;
import p288p5.C10060a;

/* renamed from: i5.c */
/* loaded from: classes.dex */
public final class C7844c extends AbstractC7848g {

    /* renamed from: f */
    private final MethodCall f18808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7844c(MethodCall call, MethodChannel.Result result) {
        super(result);
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        this.f18808f = call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m24132h(C7844c this$0, Context context) {
        int i10;
        byte[] m28601a;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(context, "$context");
        Object obj = this$0.f18808f.arguments;
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        int i11 = 0;
        Object obj2 = list.get(0);
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
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
        Object obj11 = list.get(9);
        C9322n.m27779c(obj11, "null cannot be cast to non-null type kotlin.Int");
        int intValue7 = ((Integer) obj11).intValue();
        InterfaceC9546a m27986a = C9398a.f22801a.m27986a(intValue5);
        if (m27986a == null) {
            C10060a.m30005a("No support format.");
            this$0.m24142c(null);
            return;
        }
        if (booleanValue) {
            m28601a = C9609i.m28601a(new File(str));
            i11 = C8986a.f21535a.m26377b(m28601a);
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
                m27986a.mo28434b(context, str, byteArrayOutputStream, intValue2, i10, intValue3, i12, booleanValue2, intValue6, intValue7);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m24133j(p153i5.C7844c r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153i5.C7844c.m24133j(i5.c, android.content.Context):void");
    }

    /* renamed from: g */
    public final void m24134g(final Context context) {
        C9322n.m27781e(context, "context");
        AbstractC7848g.f18814c.m24143a().execute(new Runnable() { // from class: i5.a
            @Override // java.lang.Runnable
            public final void run() {
                C7844c.m24132h(C7844c.this, context);
            }
        });
    }

    /* renamed from: i */
    public final void m24135i(final Context context) {
        C9322n.m27781e(context, "context");
        AbstractC7848g.f18814c.m24143a().execute(new Runnable() { // from class: i5.b
            @Override // java.lang.Runnable
            public final void run() {
                C7844c.m24133j(C7844c.this, context);
            }
        });
    }
}
