.class final Lcom/google/android/gms/internal/ads/zzenj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdkw;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdtk;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfhh;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcei;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfgm;

.field private final zzf:Lcom/google/common/util/concurrent/f;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcjk;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzbni;

.field private final zzi:Z

.field private final zzj:Lcom/google/android/gms/internal/ads/zzehs;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdtk;Lcom/google/android/gms/internal/ads/zzfhh;Lcom/google/android/gms/internal/ads/zzcei;Lcom/google/android/gms/internal/ads/zzfgm;Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzcjk;Lcom/google/android/gms/internal/ads/zzbni;ZLcom/google/android/gms/internal/ads/zzehs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzenj;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzb:Lcom/google/android/gms/internal/ads/zzdtk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzc:Lcom/google/android/gms/internal/ads/zzfhh;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzd:Lcom/google/android/gms/internal/ads/zzcei;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzenj;->zze:Lcom/google/android/gms/internal/ads/zzfgm;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzf:Lcom/google/common/util/concurrent/f;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzg:Lcom/google/android/gms/internal/ads/zzcjk;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzh:Lcom/google/android/gms/internal/ads/zzbni;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzi:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzenj;->zzj:Lcom/google/android/gms/internal/ads/zzehs;

    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdbk;)V
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzf:Lcom/google/common/util/concurrent/f;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgen;->zzq(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdsp;

    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zze:Lcom/google/android/gms/internal/ads/zzfgm;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzg:Lcom/google/android/gms/internal/ads/zzcjk;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjk;->zzaD()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzg:Lcom/google/android/gms/internal/ads/zzcjk;

    move-object v11, v2

    goto :goto_2

    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbgc;->zzaM:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzb:Lcom/google/android/gms/internal/ads/zzdtk;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzc:Lcom/google/android/gms/internal/ads/zzfhh;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfhh;->zze:Lcom/google/android/gms/ads/internal/client/z4;

    invoke-virtual {v3, v6, v5, v5}, Lcom/google/android/gms/internal/ads/zzdtk;->zza(Lcom/google/android/gms/ads/internal/client/z4;Lcom/google/android/gms/internal/ads/zzfgm;Lcom/google/android/gms/internal/ads/zzfgp;)Lcom/google/android/gms/internal/ads/zzcjk;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdsp;->zzg()Lcom/google/android/gms/internal/ads/zzdjd;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzbnx;->zzb(Lcom/google/android/gms/internal/ads/zzcjk;Lcom/google/android/gms/internal/ads/zzbnw;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzdto;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzdto;-><init>()V

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzenj;->zza:Landroid/content/Context;

    move-object v8, v3

    check-cast v8, Landroid/view/View;

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/ads/zzdto;->zza(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdsp;->zzl()Lcom/google/android/gms/internal/ads/zzdtj;

    move-result-object v7

    iget-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzi:Z

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzh:Lcom/google/android/gms/internal/ads/zzbni;

    goto :goto_1

    :cond_2
    move-object v8, v5

    :goto_1
    invoke-virtual {v7, v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzdtj;->zzi(Lcom/google/android/gms/internal/ads/zzcjk;ZLcom/google/android/gms/internal/ads/zzbni;)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjk;->zzN()Lcom/google/android/gms/internal/ads/zzcky;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/zzenh;

    invoke-direct {v8, v6, v3}, Lcom/google/android/gms/internal/ads/zzenh;-><init>(Lcom/google/android/gms/internal/ads/zzdto;Lcom/google/android/gms/internal/ads/zzcjk;)V

    invoke-interface {v7, v8}, Lcom/google/android/gms/internal/ads/zzcky;->zzB(Lcom/google/android/gms/internal/ads/zzckw;)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjk;->zzN()Lcom/google/android/gms/internal/ads/zzcky;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/zzeni;

    invoke-direct {v7, v3}, Lcom/google/android/gms/internal/ads/zzeni;-><init>(Lcom/google/android/gms/internal/ads/zzcjk;)V

    invoke-interface {v6, v7}, Lcom/google/android/gms/internal/ads/zzcky;->zzH(Lcom/google/android/gms/internal/ads/zzckx;)V

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfgm;->zzt:Lcom/google/android/gms/internal/ads/zzfgr;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzfgr;->zzb:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfgr;->zza:Ljava/lang/String;

    invoke-interface {v3, v6, v2, v5}, Lcom/google/android/gms/internal/ads/zzcjk;->zzac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzcjw; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    :goto_2
    invoke-interface {v11, v4}, Lcom/google/android/gms/internal/ads/zzcjk;->zzao(Z)V

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzi:Z

    new-instance v3, Lcom/google/android/gms/ads/internal/j;

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzh:Lcom/google/android/gms/internal/ads/zzbni;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzbni;->zze(Z)Z

    move-result v2

    move v13, v2

    goto :goto_3

    :cond_3
    move v13, v6

    :goto_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zza:Landroid/content/Context;

    iget-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzi:Z

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/j2;->h(Landroid/content/Context;)Z

    move-result v14

    if-eqz v7, :cond_4

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzh:Lcom/google/android/gms/internal/ads/zzbni;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbni;->zzd()Z

    move-result v2

    move v15, v2

    goto :goto_4

    :cond_4
    move v15, v6

    :goto_4
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzi:Z

    if-eqz v2, :cond_5

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzh:Lcom/google/android/gms/internal/ads/zzbni;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbni;->zza()F

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    move/from16 v16, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzenj;->zze:Lcom/google/android/gms/internal/ads/zzfgm;

    const/16 v17, -0x1

    iget-boolean v6, v2, Lcom/google/android/gms/internal/ads/zzfgm;->zzP:Z

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzfgm;->zzQ:Z

    move-object v12, v3

    move/from16 v18, p1

    move/from16 v19, v6

    move/from16 v20, v2

    invoke-direct/range {v12 .. v20}, Lcom/google/android/gms/ads/internal/j;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_6

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzdbk;->zzf()V

    :cond_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->k()Lg9/v;

    new-instance v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdsp;->zzh()Lcom/google/android/gms/internal/ads/zzdkl;

    move-result-object v9

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzenj;->zze:Lcom/google/android/gms/internal/ads/zzfgm;

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzd:Lcom/google/android/gms/internal/ads/zzcei;

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzfgm;->zzR:I

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzfgm;->zzC:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzfgm;->zzt:Lcom/google/android/gms/internal/ads/zzfgr;

    iget-object v15, v6, Lcom/google/android/gms/internal/ads/zzfgr;->zzb:Ljava/lang/String;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfgr;->zza:Ljava/lang/String;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzc:Lcom/google/android/gms/internal/ads/zzfhh;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzfgm;->zzaj:Z

    if-eqz v0, :cond_7

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzenj;->zzj:Lcom/google/android/gms/internal/ads/zzehs;

    :cond_7
    move-object/from16 v20, v5

    const/4 v8, 0x0

    const/4 v10, 0x0

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/zzfhh;->zzf:Ljava/lang/String;

    move-object v7, v2

    move-object v5, v15

    move-object v15, v3

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v18, v0

    move-object/from16 v19, p3

    invoke-direct/range {v7 .. v20}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/a;Lg9/w;Lg9/b;Lcom/google/android/gms/internal/ads/zzcjk;ILcom/google/android/gms/internal/ads/zzcei;Ljava/lang/String;Lcom/google/android/gms/ads/internal/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdbk;Lcom/google/android/gms/internal/ads/zzbwm;)V

    move-object/from16 v0, p2

    invoke-static {v0, v2, v4}, Lg9/v;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
