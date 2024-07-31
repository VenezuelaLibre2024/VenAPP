package com.facebook.ads.redexgen.uinode;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P6 */
/* loaded from: assets/audience_network.dex */
public class C3740P6 extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ C3745PB A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public C3740P6(C3745PB c3745pb) {
        this.A00 = c3745pb;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C3377JA c3377ja;
        C3732Oy c3732Oy;
        C4337Yn c4337Yn;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c3377ja = this.A00.A0D;
            c3377ja.A04(EnumC3376J9.A0N, null);
            c3732Oy = this.A00.A0E;
            c3732Oy.A04(AbstractC27248A.A14, jSONObject2);
            c4337Yn = this.A00.A0B;
            c4337Yn.A0E().A5K(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
