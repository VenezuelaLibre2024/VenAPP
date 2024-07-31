package androidx.camera.camera2.internal;

import androidx.camera.core.impl.AbstractC0612d2;
import androidx.camera.core.impl.C0608c2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.i2 */
/* loaded from: classes.dex */
public final class C0500i2 {
    /* renamed from: a */
    public static List<C0608c2> m2416a(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m2421f());
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            arrayList.addAll(m2423h());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(m2420e());
        }
        if (z10) {
            arrayList.addAll(m2424i());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(m2418c());
        }
        if (i10 == 3) {
            arrayList.addAll(m2422g());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C0608c2> m2417b() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.PREVIEW;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.JPEG;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        AbstractC0612d2.a aVar3 = AbstractC0612d2.a.RECORD;
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar3));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar3));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar3));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar3, aVar3));
        arrayList.add(c0608c28);
        return arrayList;
    }

    /* renamed from: c */
    public static List<C0608c2> m2418c() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.PREVIEW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c23);
        return arrayList;
    }

    /* renamed from: d */
    public static List<C0608c2> m2419d() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.YUV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.s1440p;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.PRIV;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.JPEG;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.s720p;
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c28);
        C0608c2 c0608c29 = new C0608c2();
        c0608c29.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c29.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c29);
        return arrayList;
    }

    /* renamed from: e */
    public static List<C0608c2> m2420e() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.PREVIEW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c24.m3013a(AbstractC0612d2.m3026a(AbstractC0612d2.b.JPEG, aVar2));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        AbstractC0612d2.a aVar3 = AbstractC0612d2.a.VGA;
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c26);
        return arrayList;
    }

    /* renamed from: f */
    public static List<C0608c2> m2421f() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.JPEG;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.YUV;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.PREVIEW;
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        arrayList.add(c0608c28);
        return arrayList;
    }

    /* renamed from: g */
    public static List<C0608c2> m2422g() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.PREVIEW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.VGA;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        AbstractC0612d2.a aVar3 = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.RAW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar3, aVar3));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        c0608c22.m3013a(AbstractC0612d2.m3026a(AbstractC0612d2.b.JPEG, aVar3));
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar3, aVar3));
        arrayList.add(c0608c22);
        return arrayList;
    }

    /* renamed from: h */
    public static List<C0608c2> m2423h() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.PREVIEW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.RECORD;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar2));
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.JPEG;
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar3, AbstractC0612d2.a.MAXIMUM));
        arrayList.add(c0608c26);
        return arrayList;
    }

    /* renamed from: i */
    public static List<C0608c2> m2424i() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.RAW;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.PREVIEW;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.YUV;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        AbstractC0612d2.b bVar4 = AbstractC0612d2.b.JPEG;
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar3, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        arrayList.add(c0608c28);
        return arrayList;
    }

    /* renamed from: j */
    public static List<C0608c2> m2425j() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.s1440p;
        c0608c2.m3013a(AbstractC0612d2.m3027b(bVar, aVar, 4L));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.YUV;
        c0608c22.m3013a(AbstractC0612d2.m3027b(bVar2, aVar, 4L));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.RECORD;
        c0608c23.m3013a(AbstractC0612d2.m3027b(bVar, aVar2, 3L));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3027b(bVar2, aVar2, 3L));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.JPEG;
        AbstractC0612d2.a aVar3 = AbstractC0612d2.a.MAXIMUM;
        c0608c25.m3013a(AbstractC0612d2.m3027b(bVar3, aVar3, 2L));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3027b(bVar2, aVar3, 2L));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        AbstractC0612d2.a aVar4 = AbstractC0612d2.a.PREVIEW;
        c0608c27.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c27.m3013a(AbstractC0612d2.m3027b(bVar3, aVar3, 2L));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c28.m3013a(AbstractC0612d2.m3027b(bVar2, aVar3, 2L));
        arrayList.add(c0608c28);
        C0608c2 c0608c29 = new C0608c2();
        c0608c29.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c29.m3013a(AbstractC0612d2.m3027b(bVar, aVar2, 3L));
        arrayList.add(c0608c29);
        C0608c2 c0608c210 = new C0608c2();
        c0608c210.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c210.m3013a(AbstractC0612d2.m3027b(bVar2, aVar2, 3L));
        arrayList.add(c0608c210);
        C0608c2 c0608c211 = new C0608c2();
        c0608c211.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c211.m3013a(AbstractC0612d2.m3027b(bVar2, aVar4, 1L));
        arrayList.add(c0608c211);
        C0608c2 c0608c212 = new C0608c2();
        c0608c212.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c212.m3013a(AbstractC0612d2.m3027b(bVar, aVar2, 3L));
        c0608c212.m3013a(AbstractC0612d2.m3027b(bVar3, aVar2, 2L));
        arrayList.add(c0608c212);
        C0608c2 c0608c213 = new C0608c2();
        c0608c213.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c213.m3013a(AbstractC0612d2.m3027b(bVar2, aVar2, 3L));
        c0608c213.m3013a(AbstractC0612d2.m3027b(bVar3, aVar2, 2L));
        arrayList.add(c0608c213);
        C0608c2 c0608c214 = new C0608c2();
        c0608c214.m3013a(AbstractC0612d2.m3027b(bVar, aVar4, 1L));
        c0608c214.m3013a(AbstractC0612d2.m3027b(bVar2, aVar4, 1L));
        c0608c214.m3013a(AbstractC0612d2.m3027b(bVar3, aVar3, 2L));
        arrayList.add(c0608c214);
        return arrayList;
    }

    /* renamed from: k */
    public static List<C0608c2> m2426k() {
        ArrayList arrayList = new ArrayList();
        C0608c2 c0608c2 = new C0608c2();
        AbstractC0612d2.b bVar = AbstractC0612d2.b.YUV;
        AbstractC0612d2.a aVar = AbstractC0612d2.a.ULTRA_MAXIMUM;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        AbstractC0612d2.b bVar2 = AbstractC0612d2.b.PRIV;
        AbstractC0612d2.a aVar2 = AbstractC0612d2.a.PREVIEW;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        AbstractC0612d2.a aVar3 = AbstractC0612d2.a.RECORD;
        c0608c2.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        arrayList.add(c0608c2);
        C0608c2 c0608c22 = new C0608c2();
        AbstractC0612d2.b bVar3 = AbstractC0612d2.b.JPEG;
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c22.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        arrayList.add(c0608c22);
        C0608c2 c0608c23 = new C0608c2();
        AbstractC0612d2.b bVar4 = AbstractC0612d2.b.RAW;
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c23.m3013a(AbstractC0612d2.m3026a(bVar2, aVar3));
        arrayList.add(c0608c23);
        C0608c2 c0608c24 = new C0608c2();
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        AbstractC0612d2.a aVar4 = AbstractC0612d2.a.MAXIMUM;
        c0608c24.m3013a(AbstractC0612d2.m3026a(bVar3, aVar4));
        arrayList.add(c0608c24);
        C0608c2 c0608c25 = new C0608c2();
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c25.m3013a(AbstractC0612d2.m3026a(bVar3, aVar4));
        arrayList.add(c0608c25);
        C0608c2 c0608c26 = new C0608c2();
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c26.m3013a(AbstractC0612d2.m3026a(bVar3, aVar4));
        arrayList.add(c0608c26);
        C0608c2 c0608c27 = new C0608c2();
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c27.m3013a(AbstractC0612d2.m3026a(bVar, aVar4));
        arrayList.add(c0608c27);
        C0608c2 c0608c28 = new C0608c2();
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c28.m3013a(AbstractC0612d2.m3026a(bVar, aVar4));
        arrayList.add(c0608c28);
        C0608c2 c0608c29 = new C0608c2();
        c0608c29.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c29.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c29.m3013a(AbstractC0612d2.m3026a(bVar, aVar4));
        arrayList.add(c0608c29);
        C0608c2 c0608c210 = new C0608c2();
        c0608c210.m3013a(AbstractC0612d2.m3026a(bVar, aVar));
        c0608c210.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c210.m3013a(AbstractC0612d2.m3026a(bVar4, aVar4));
        arrayList.add(c0608c210);
        C0608c2 c0608c211 = new C0608c2();
        c0608c211.m3013a(AbstractC0612d2.m3026a(bVar3, aVar));
        c0608c211.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c211.m3013a(AbstractC0612d2.m3026a(bVar4, aVar4));
        arrayList.add(c0608c211);
        C0608c2 c0608c212 = new C0608c2();
        c0608c212.m3013a(AbstractC0612d2.m3026a(bVar4, aVar));
        c0608c212.m3013a(AbstractC0612d2.m3026a(bVar2, aVar2));
        c0608c212.m3013a(AbstractC0612d2.m3026a(bVar4, aVar4));
        arrayList.add(c0608c212);
        return arrayList;
    }
}
