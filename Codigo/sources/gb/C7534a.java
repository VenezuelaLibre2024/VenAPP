package gb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: gb.a */
/* loaded from: classes2.dex */
public final class C7534a {

    /* renamed from: a */
    static final BigInteger f17807a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    private static final double f17808b = Math.log(10.0d);

    /* renamed from: c */
    private static final double f17809c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m22879a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
