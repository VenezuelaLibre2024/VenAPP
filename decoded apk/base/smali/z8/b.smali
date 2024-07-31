.class public final synthetic Lz8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx8/h;

.field public final synthetic d:Lz8/a$a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lz8/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lz8/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lz8/b;->c:Lx8/h;

    iput-object p4, p0, Lz8/b;->d:Lz8/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v6, p0, Lz8/b;->a:Landroid/content/Context;

    iget-object v2, p0, Lz8/b;->b:Ljava/lang/String;

    iget-object v0, p0, Lz8/b;->c:Lx8/h;

    iget-object v5, p0, Lz8/b;->d:Lz8/a$a;

    :try_start_0
    new-instance v7, Lcom/google/android/gms/internal/ads/zzbar;

    invoke-virtual {v0}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object v3

    const/4 v4, 0x3

    move-object v0, v7

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzbar;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/z2;ILz8/a$a;)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzbar;->zza()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v1

    const-string v2, "AppOpenAd.load"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
