package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.RZ */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC3893RZ {
    boolean ABU(C3891RX c3891rx);

    HttpURLConnection ADo(String str, Proxy proxy) throws IOException;

    InputStream ADp(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ADq(HttpURLConnection httpURLConnection) throws IOException;

    void AE6(HttpURLConnection httpURLConnection, EnumC3889RV enumC3889RV, String str) throws IOException;

    byte[] AEO(InputStream inputStream) throws IOException;

    void AHG(OutputStream outputStream, byte[] bArr) throws IOException;
}
