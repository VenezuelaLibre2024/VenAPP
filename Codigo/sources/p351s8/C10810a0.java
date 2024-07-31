package p351s8;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: s8.a0 */
/* loaded from: classes.dex */
public final class C10810a0 extends C10847y {

    /* renamed from: d */
    public final int f27306d;

    /* renamed from: e */
    public final String f27307e;

    /* renamed from: f */
    public final Map<String, List<String>> f27308f;

    /* renamed from: r */
    public final byte[] f27309r;

    public C10810a0(int i10, String str, IOException iOException, Map<String, List<String>> map, C10835n c10835n, byte[] bArr) {
        super("Response code: " + i10, iOException, c10835n, AdError.INTERNAL_ERROR_2004, 1);
        this.f27306d = i10;
        this.f27307e = str;
        this.f27308f = map;
        this.f27309r = bArr;
    }
}
