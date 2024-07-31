.class final Lcom/google/android/gms/ads/internal/util/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbhb;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/zzbhd;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/util/j2;Lcom/google/android/gms/internal/ads/zzbhd;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/util/e2;->a:Lcom/google/android/gms/internal/ads/zzbhd;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/util/e2;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/util/e2;->c:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/e2;->a:Lcom/google/android/gms/internal/ads/zzbhd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhd;->zza()Landroidx/browser/customtabs/i;

    move-result-object v0

    new-instance v1, Landroidx/browser/customtabs/d$b;

    invoke-direct {v1, v0}, Landroidx/browser/customtabs/d$b;-><init>(Landroidx/browser/customtabs/i;)V

    invoke-virtual {v1}, Landroidx/browser/customtabs/d$b;->b()Landroidx/browser/customtabs/d;

    move-result-object v0

    iget-object v1, v0, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/util/e2;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhhv;->zza(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/util/e2;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/util/e2;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroidx/browser/customtabs/d;->b(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/e2;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/util/e2;->a:Lcom/google/android/gms/internal/ads/zzbhd;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhd;->zzf(Landroid/app/Activity;)V

    return-void
.end method
