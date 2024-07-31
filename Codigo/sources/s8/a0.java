package s8;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public final int f25187d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25188e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f25189f;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f25190r;

    public a0(int i10, String str, IOException iOException, Map<String, List<String>> map, n nVar, byte[] bArr) {
        super("Response code: " + i10, iOException, nVar, AdError.INTERNAL_ERROR_2004, 1);
        this.f25187d = i10;
        this.f25188e = str;
        this.f25189f = map;
        this.f25190r = bArr;
    }
}
