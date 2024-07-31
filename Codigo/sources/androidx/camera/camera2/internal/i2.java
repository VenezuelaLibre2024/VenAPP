package androidx.camera.camera2.internal;

import androidx.camera.core.impl.d2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i2 {
    public static List<androidx.camera.core.impl.c2> a(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f());
        if (i10 == 0 || i10 == 1 || i10 == 3) {
            arrayList.addAll(h());
        }
        if (i10 == 1 || i10 == 3) {
            arrayList.addAll(e());
        }
        if (z10) {
            arrayList.addAll(i());
        }
        if (z11 && i10 == 0) {
            arrayList.addAll(c());
        }
        if (i10 == 3) {
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> b() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar2 = d2.b.YUV;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.a aVar2 = d2.a.PREVIEW;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        d2.b bVar3 = d2.b.JPEG;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        d2.a aVar3 = d2.a.RECORD;
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar3));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar3));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar3));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar3, aVar3));
        arrayList.add(c2Var8);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> c() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.PREVIEW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.a aVar2 = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.b bVar2 = d2.b.YUV;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var3);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> d() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.YUV;
        d2.a aVar = d2.a.s1440p;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar2 = d2.b.PRIV;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.b bVar3 = d2.b.JPEG;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        d2.a aVar2 = d2.a.s720p;
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var8);
        androidx.camera.core.impl.c2 c2Var9 = new androidx.camera.core.impl.c2();
        c2Var9.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var9.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var9);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> e() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.PREVIEW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.a aVar2 = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.b bVar2 = d2.b.YUV;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var4.a(androidx.camera.core.impl.d2.a(d2.b.JPEG, aVar2));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        d2.a aVar3 = d2.a.VGA;
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var6);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> f() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar2 = d2.b.JPEG;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.b bVar3 = d2.b.YUV;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        d2.a aVar2 = d2.a.PREVIEW;
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        arrayList.add(c2Var8);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> g() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.PREVIEW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.a aVar2 = d2.a.VGA;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        d2.b bVar2 = d2.b.YUV;
        d2.a aVar3 = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        d2.b bVar3 = d2.b.RAW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar3, aVar3));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        c2Var2.a(androidx.camera.core.impl.d2.a(d2.b.JPEG, aVar3));
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar3, aVar3));
        arrayList.add(c2Var2);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> h() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.PREVIEW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.a aVar2 = d2.a.RECORD;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.b bVar2 = d2.b.YUV;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar2));
        d2.b bVar3 = d2.b.JPEG;
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar3, d2.a.MAXIMUM));
        arrayList.add(c2Var6);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> i() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.RAW;
        d2.a aVar = d2.a.MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar2 = d2.b.PRIV;
        d2.a aVar2 = d2.a.PREVIEW;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.b bVar3 = d2.b.YUV;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        d2.b bVar4 = d2.b.JPEG;
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar3, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        arrayList.add(c2Var8);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> j() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.PRIV;
        d2.a aVar = d2.a.s1440p;
        c2Var.a(androidx.camera.core.impl.d2.b(bVar, aVar, 4L));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar2 = d2.b.YUV;
        c2Var2.a(androidx.camera.core.impl.d2.b(bVar2, aVar, 4L));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.a aVar2 = d2.a.RECORD;
        c2Var3.a(androidx.camera.core.impl.d2.b(bVar, aVar2, 3L));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.b(bVar2, aVar2, 3L));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        d2.b bVar3 = d2.b.JPEG;
        d2.a aVar3 = d2.a.MAXIMUM;
        c2Var5.a(androidx.camera.core.impl.d2.b(bVar3, aVar3, 2L));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.b(bVar2, aVar3, 2L));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        d2.a aVar4 = d2.a.PREVIEW;
        c2Var7.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var7.a(androidx.camera.core.impl.d2.b(bVar3, aVar3, 2L));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var8.a(androidx.camera.core.impl.d2.b(bVar2, aVar3, 2L));
        arrayList.add(c2Var8);
        androidx.camera.core.impl.c2 c2Var9 = new androidx.camera.core.impl.c2();
        c2Var9.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var9.a(androidx.camera.core.impl.d2.b(bVar, aVar2, 3L));
        arrayList.add(c2Var9);
        androidx.camera.core.impl.c2 c2Var10 = new androidx.camera.core.impl.c2();
        c2Var10.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var10.a(androidx.camera.core.impl.d2.b(bVar2, aVar2, 3L));
        arrayList.add(c2Var10);
        androidx.camera.core.impl.c2 c2Var11 = new androidx.camera.core.impl.c2();
        c2Var11.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var11.a(androidx.camera.core.impl.d2.b(bVar2, aVar4, 1L));
        arrayList.add(c2Var11);
        androidx.camera.core.impl.c2 c2Var12 = new androidx.camera.core.impl.c2();
        c2Var12.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var12.a(androidx.camera.core.impl.d2.b(bVar, aVar2, 3L));
        c2Var12.a(androidx.camera.core.impl.d2.b(bVar3, aVar2, 2L));
        arrayList.add(c2Var12);
        androidx.camera.core.impl.c2 c2Var13 = new androidx.camera.core.impl.c2();
        c2Var13.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var13.a(androidx.camera.core.impl.d2.b(bVar2, aVar2, 3L));
        c2Var13.a(androidx.camera.core.impl.d2.b(bVar3, aVar2, 2L));
        arrayList.add(c2Var13);
        androidx.camera.core.impl.c2 c2Var14 = new androidx.camera.core.impl.c2();
        c2Var14.a(androidx.camera.core.impl.d2.b(bVar, aVar4, 1L));
        c2Var14.a(androidx.camera.core.impl.d2.b(bVar2, aVar4, 1L));
        c2Var14.a(androidx.camera.core.impl.d2.b(bVar3, aVar3, 2L));
        arrayList.add(c2Var14);
        return arrayList;
    }

    public static List<androidx.camera.core.impl.c2> k() {
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.c2 c2Var = new androidx.camera.core.impl.c2();
        d2.b bVar = d2.b.YUV;
        d2.a aVar = d2.a.ULTRA_MAXIMUM;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        d2.b bVar2 = d2.b.PRIV;
        d2.a aVar2 = d2.a.PREVIEW;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        d2.a aVar3 = d2.a.RECORD;
        c2Var.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        arrayList.add(c2Var);
        androidx.camera.core.impl.c2 c2Var2 = new androidx.camera.core.impl.c2();
        d2.b bVar3 = d2.b.JPEG;
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var2.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        arrayList.add(c2Var2);
        androidx.camera.core.impl.c2 c2Var3 = new androidx.camera.core.impl.c2();
        d2.b bVar4 = d2.b.RAW;
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var3.a(androidx.camera.core.impl.d2.a(bVar2, aVar3));
        arrayList.add(c2Var3);
        androidx.camera.core.impl.c2 c2Var4 = new androidx.camera.core.impl.c2();
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        d2.a aVar4 = d2.a.MAXIMUM;
        c2Var4.a(androidx.camera.core.impl.d2.a(bVar3, aVar4));
        arrayList.add(c2Var4);
        androidx.camera.core.impl.c2 c2Var5 = new androidx.camera.core.impl.c2();
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var5.a(androidx.camera.core.impl.d2.a(bVar3, aVar4));
        arrayList.add(c2Var5);
        androidx.camera.core.impl.c2 c2Var6 = new androidx.camera.core.impl.c2();
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var6.a(androidx.camera.core.impl.d2.a(bVar3, aVar4));
        arrayList.add(c2Var6);
        androidx.camera.core.impl.c2 c2Var7 = new androidx.camera.core.impl.c2();
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var7.a(androidx.camera.core.impl.d2.a(bVar, aVar4));
        arrayList.add(c2Var7);
        androidx.camera.core.impl.c2 c2Var8 = new androidx.camera.core.impl.c2();
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var8.a(androidx.camera.core.impl.d2.a(bVar, aVar4));
        arrayList.add(c2Var8);
        androidx.camera.core.impl.c2 c2Var9 = new androidx.camera.core.impl.c2();
        c2Var9.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var9.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var9.a(androidx.camera.core.impl.d2.a(bVar, aVar4));
        arrayList.add(c2Var9);
        androidx.camera.core.impl.c2 c2Var10 = new androidx.camera.core.impl.c2();
        c2Var10.a(androidx.camera.core.impl.d2.a(bVar, aVar));
        c2Var10.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var10.a(androidx.camera.core.impl.d2.a(bVar4, aVar4));
        arrayList.add(c2Var10);
        androidx.camera.core.impl.c2 c2Var11 = new androidx.camera.core.impl.c2();
        c2Var11.a(androidx.camera.core.impl.d2.a(bVar3, aVar));
        c2Var11.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var11.a(androidx.camera.core.impl.d2.a(bVar4, aVar4));
        arrayList.add(c2Var11);
        androidx.camera.core.impl.c2 c2Var12 = new androidx.camera.core.impl.c2();
        c2Var12.a(androidx.camera.core.impl.d2.a(bVar4, aVar));
        c2Var12.a(androidx.camera.core.impl.d2.a(bVar2, aVar2));
        c2Var12.a(androidx.camera.core.impl.d2.a(bVar4, aVar4));
        arrayList.add(c2Var12);
        return arrayList;
    }
}
