.class public final synthetic Lcom/google/android/gms/ads/internal/client/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/client/m3;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/m3;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g3;->a:Lcom/google/android/gms/ads/internal/client/m3;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/g3;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g3;->a:Lcom/google/android/gms/ads/internal/client/m3;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g3;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/m3;->p(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method