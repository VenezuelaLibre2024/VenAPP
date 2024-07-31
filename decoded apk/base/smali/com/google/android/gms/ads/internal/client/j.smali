.class final Lcom/google/android/gms/ads/internal/client/j;
.super Lcom/google/android/gms/ads/internal/client/w;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/google/android/gms/internal/ads/zzbsv;

.field final synthetic d:Lb9/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/v;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;Lb9/b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/j;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/j;->c:Lcom/google/android/gms/internal/ads/zzbsv;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/j;->d:Lb9/b;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic a()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzboo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzboo;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/f1;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/j;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbob;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/j;->d:Lb9/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzbob;-><init>(Lb9/b;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/j;->c:Lcom/google/android/gms/internal/ads/zzbsv;

    const v3, 0xe52bf80

    invoke-interface {p1, v0, v2, v3, v1}, Lcom/google/android/gms/ads/internal/client/f1;->e0(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;ILcom/google/android/gms/internal/ads/zzboe;)Lcom/google/android/gms/internal/ads/zzboh;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/j;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/j;->b:Landroid/content/Context;

    const-string v2, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl"

    sget-object v3, Lcom/google/android/gms/ads/internal/client/i;->a:Lcom/google/android/gms/ads/internal/client/i;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzceg;->zzb(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcee;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzbok;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/j;->c:Lcom/google/android/gms/internal/ads/zzbsv;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzbob;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/client/j;->d:Lb9/b;

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzbob;-><init>(Lb9/b;)V

    const v4, 0xe52bf80

    invoke-interface {v1, v0, v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzbok;->zze(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbsv;ILcom/google/android/gms/internal/ads/zzboe;)Lcom/google/android/gms/internal/ads/zzboh;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzcef; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
