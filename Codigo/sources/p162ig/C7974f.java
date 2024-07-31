package p162ig;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p066dg.EnumC6940a;

/* renamed from: ig.f */
/* loaded from: classes2.dex */
public final class C7974f {

    /* renamed from: a */
    private static final Pattern f19369a = Pattern.compile(",");

    /* renamed from: b */
    static final Set<EnumC6940a> f19370b;

    /* renamed from: c */
    static final Set<EnumC6940a> f19371c;

    /* renamed from: d */
    private static final Set<EnumC6940a> f19372d;

    /* renamed from: e */
    static final Set<EnumC6940a> f19373e;

    /* renamed from: f */
    static final Set<EnumC6940a> f19374f;

    /* renamed from: g */
    static final Set<EnumC6940a> f19375g;

    /* renamed from: h */
    static final Set<EnumC6940a> f19376h;

    /* renamed from: i */
    private static final Map<String, Set<EnumC6940a>> f19377i;

    static {
        EnumSet of2 = EnumSet.of(EnumC6940a.QR_CODE);
        f19373e = of2;
        EnumSet of3 = EnumSet.of(EnumC6940a.DATA_MATRIX);
        f19374f = of3;
        EnumSet of4 = EnumSet.of(EnumC6940a.AZTEC);
        f19375g = of4;
        EnumSet of5 = EnumSet.of(EnumC6940a.PDF_417);
        f19376h = of5;
        EnumSet of6 = EnumSet.of(EnumC6940a.UPC_A, EnumC6940a.UPC_E, EnumC6940a.EAN_13, EnumC6940a.EAN_8, EnumC6940a.RSS_14, EnumC6940a.RSS_EXPANDED);
        f19370b = of6;
        EnumSet of7 = EnumSet.of(EnumC6940a.CODE_39, EnumC6940a.CODE_93, EnumC6940a.CODE_128, EnumC6940a.ITF, EnumC6940a.CODABAR);
        f19371c = of7;
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        f19372d = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f19377i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }

    /* renamed from: a */
    public static Set<EnumC6940a> m24514a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m24515b(stringExtra != null ? Arrays.asList(f19369a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    private static Set<EnumC6940a> m24515b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC6940a.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(EnumC6940a.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f19377i.get(str);
        }
        return null;
    }
}
