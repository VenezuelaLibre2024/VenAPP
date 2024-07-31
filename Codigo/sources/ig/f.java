package ig;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f17706a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    static final Set<dg.a> f17707b;

    /* renamed from: c, reason: collision with root package name */
    static final Set<dg.a> f17708c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<dg.a> f17709d;

    /* renamed from: e, reason: collision with root package name */
    static final Set<dg.a> f17710e;

    /* renamed from: f, reason: collision with root package name */
    static final Set<dg.a> f17711f;

    /* renamed from: g, reason: collision with root package name */
    static final Set<dg.a> f17712g;

    /* renamed from: h, reason: collision with root package name */
    static final Set<dg.a> f17713h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, Set<dg.a>> f17714i;

    static {
        EnumSet of2 = EnumSet.of(dg.a.QR_CODE);
        f17710e = of2;
        EnumSet of3 = EnumSet.of(dg.a.DATA_MATRIX);
        f17711f = of3;
        EnumSet of4 = EnumSet.of(dg.a.AZTEC);
        f17712g = of4;
        EnumSet of5 = EnumSet.of(dg.a.PDF_417);
        f17713h = of5;
        EnumSet of6 = EnumSet.of(dg.a.UPC_A, dg.a.UPC_E, dg.a.EAN_13, dg.a.EAN_8, dg.a.RSS_14, dg.a.RSS_EXPANDED);
        f17707b = of6;
        EnumSet of7 = EnumSet.of(dg.a.CODE_39, dg.a.CODE_93, dg.a.CODE_128, dg.a.ITF, dg.a.CODABAR);
        f17708c = of7;
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        f17709d = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f17714i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }

    public static Set<dg.a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f17706a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<dg.a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(dg.a.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(dg.a.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f17714i.get(str);
        }
        return null;
    }
}
