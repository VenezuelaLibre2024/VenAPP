.class public Lcom/google/android/gms/ads/internal/ClientApi;
.super Lcom/google/android/gms/ads/internal/client/e1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public final D(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/ads/internal/client/l2;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzclg;->zzl()Lcom/google/android/gms/internal/ads/zzdzx;

    move-result-object p1

    return-object p1
.end method

.method public final P0(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzcct;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzclg;->zzp()Ll9/c;

    move-result-object p1

    return-object p1
.end method

.method public final R(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/dynamic/b;)Lcom/google/android/gms/internal/ads/zzbjq;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdnw;

    const v1, 0xe52bf80

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzdnw;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;I)V

    return-object v0
.end method

.method public final R1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzbwm;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzclg;->zzm()Lcom/google/android/gms/internal/ads/zzehs;

    move-result-object p1

    return-object p1
.end method

.method public final W0(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/ads/internal/client/u0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzclg;->zzs()Lcom/google/android/gms/internal/ads/zzfbm;

    move-result-object p2

    invoke-interface {p2, p3}, Lcom/google/android/gms/internal/ads/zzfbm;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfbm;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzfbm;->zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfbm;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzfbm;->zzc()Lcom/google/android/gms/internal/ads/zzfbn;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbgc;->zzfh:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-lt p5, p2, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfbn;->zza()Lcom/google/android/gms/internal/ads/zzfcs;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/ads/internal/client/z3;

    invoke-direct {p1}, Lcom/google/android/gms/ads/internal/client/z3;-><init>()V

    return-object p1
.end method

.method public final e0(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;ILcom/google/android/gms/internal/ads/zzboe;)Lcom/google/android/gms/internal/ads/zzboh;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzclg;->zzj()Lcom/google/android/gms/internal/ads/zzdxo;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzdxo;->zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdxo;

    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/ads/zzdxo;->zza(Lcom/google/android/gms/internal/ads/zzboe;)Lcom/google/android/gms/internal/ads/zzdxo;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzdxo;->zzc()Lcom/google/android/gms/internal/ads/zzdxp;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdxp;->zzd()Lcom/google/android/gms/internal/ads/zzdxm;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/google/android/gms/dynamic/b;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzcan;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzv()Lcom/google/android/gms/internal/ads/zzfgf;

    move-result-object p3

    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/zzfgf;->zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfgf;

    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzfgf;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfgf;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzfgf;->zzc()Lcom/google/android/gms/internal/ads/zzfgg;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfgg;->zza()Lcom/google/android/gms/internal/ads/zzfgd;

    move-result-object p1

    return-object p1
.end method

.method public final j1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/ads/internal/client/u0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzclg;->zzt()Lcom/google/android/gms/internal/ads/zzfda;

    move-result-object p4

    invoke-interface {p4, p1}, Lcom/google/android/gms/internal/ads/zzfda;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfda;

    invoke-interface {p4, p2}, Lcom/google/android/gms/internal/ads/zzfda;->zza(Lcom/google/android/gms/ads/internal/client/z4;)Lcom/google/android/gms/internal/ads/zzfda;

    invoke-interface {p4, p3}, Lcom/google/android/gms/internal/ads/zzfda;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfda;

    invoke-interface {p4}, Lcom/google/android/gms/internal/ads/zzfda;->zzd()Lcom/google/android/gms/internal/ads/zzfdb;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfdb;->zza()Lcom/google/android/gms/internal/ads/zzepk;

    move-result-object p1

    return-object p1
.end method

.method public final o1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;I)Lcom/google/android/gms/ads/internal/client/u0;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcei;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v3, 0xe52bf80

    invoke-direct {v0, v3, p4, v1, v2}, Lcom/google/android/gms/internal/ads/zzcei;-><init>(IIZZ)V

    new-instance p4, Lcom/google/android/gms/ads/internal/s;

    invoke-direct {p4, p1, p2, p3, v0}, Lcom/google/android/gms/ads/internal/s;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcei;)V

    return-object p4
.end method

.method public final t1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzbzx;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzclg;->zzv()Lcom/google/android/gms/internal/ads/zzfgf;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzfgf;->zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfgf;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzfgf;->zzc()Lcom/google/android/gms/internal/ads/zzfgg;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfgg;->zzb()Lcom/google/android/gms/internal/ads/zzfgj;

    move-result-object p1

    return-object p1
.end method

.method public final u1(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/dynamic/b;)Lcom/google/android/gms/internal/ads/zzbjw;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    invoke-static {p3}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdnu;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdnu;-><init>(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-object v0
.end method

.method public final v1(Lcom/google/android/gms/dynamic/b;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/ads/internal/client/q0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p3

    new-instance p4, Lcom/google/android/gms/internal/ads/zzeph;

    invoke-direct {p4, p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzeph;-><init>(Lcom/google/android/gms/internal/ads/zzclg;Landroid/content/Context;Ljava/lang/String;)V

    return-object p4
.end method

.method public final x0(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/ads/internal/client/u0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzclg;->zzu()Lcom/google/android/gms/internal/ads/zzfer;

    move-result-object p4

    invoke-interface {p4, p1}, Lcom/google/android/gms/internal/ads/zzfer;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfer;

    invoke-interface {p4, p2}, Lcom/google/android/gms/internal/ads/zzfer;->zza(Lcom/google/android/gms/ads/internal/client/z4;)Lcom/google/android/gms/internal/ads/zzfer;

    invoke-interface {p4, p3}, Lcom/google/android/gms/internal/ads/zzfer;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfer;

    invoke-interface {p4}, Lcom/google/android/gms/internal/ads/zzfer;->zzd()Lcom/google/android/gms/internal/ads/zzfes;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfes;->zza()Lcom/google/android/gms/internal/ads/zzeqm;

    move-result-object p1

    return-object p1
.end method

.method public final zzg(Lcom/google/android/gms/dynamic/b;I)Lcom/google/android/gms/ads/internal/client/p1;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzclg;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;I)Lcom/google/android/gms/internal/ads/zzclg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzclg;->zzc()Lcom/google/android/gms/internal/ads/zzcpv;

    move-result-object p1

    return-object p1
.end method

.method public final zzm(Lcom/google/android/gms/dynamic/b;)Lcom/google/android/gms/internal/ads/zzbwt;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->u1(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lg9/b0;

    invoke-direct {v0, p1}, Lg9/b0;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    iget v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->v:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v0, 0x5

    if-eq v1, v0, :cond_1

    new-instance v0, Lg9/b0;

    invoke-direct {v0, p1}, Lg9/b0;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lg9/e;

    invoke-direct {v0, p1}, Lg9/e;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lg9/g0;

    invoke-direct {v1, p1, v0}, Lg9/g0;-><init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    new-instance v0, Lg9/h;

    invoke-direct {v0, p1}, Lg9/h;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lg9/g;

    invoke-direct {v0, p1}, Lg9/g;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lg9/a0;

    invoke-direct {v0, p1}, Lg9/a0;-><init>(Landroid/app/Activity;)V

    :goto_0
    return-object v0
.end method
