.class public final Lcom/google/android/gms/internal/ads/zzexf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzexq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgey;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcei;

.field private final zzd:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgey;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcei;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzexf;->zza:Lcom/google/android/gms/internal/ads/zzgey;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzc:Lcom/google/android/gms/internal/ads/zzcei;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method

.method public final zzb()Lcom/google/common/util/concurrent/f;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzexe;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzexe;-><init>(Lcom/google/android/gms/internal/ads/zzexf;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzexf;->zza:Lcom/google/android/gms/internal/ads/zzgey;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzgey;->zzb(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method final synthetic zzc()Lcom/google/android/gms/internal/ads/zzexg;
    .locals 11

    new-instance v9, Lcom/google/android/gms/internal/ads/zzexg;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzb:Landroid/content/Context;

    invoke-static {v0}, Lna/e;->a(Landroid/content/Context;)Lna/d;

    move-result-object v0

    invoke-virtual {v0}, Lna/d;->g()Z

    move-result v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzb:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/j2;->d(Landroid/content/Context;)Z

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzc:Lcom/google/android/gms/internal/ads/zzcei;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzcei;->zza:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/j2;->e()Z

    move-result v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzb:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    :goto_0
    move v5, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzb:Landroid/content/Context;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzexf;->zzd:Ljava/lang/String;

    const-string v6, "com.google.android.gms.ads.dynamite"

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    invoke-static {v0, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v10

    move-object v0, v9

    move v6, v7

    move v7, v10

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzexg;-><init>(ZZLjava/lang/String;ZIIILjava/lang/String;)V

    return-object v9
.end method
