.class public final synthetic Lcom/google/android/gms/ads/internal/client/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/client/d3;

.field public final synthetic b:Lcom/google/android/gms/dynamic/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/d3;Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/a3;->a:Lcom/google/android/gms/ads/internal/client/d3;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/a3;->b:Lcom/google/android/gms/dynamic/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/a3;->a:Lcom/google/android/gms/ads/internal/client/d3;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/a3;->b:Lcom/google/android/gms/dynamic/b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/d3;->o(Lcom/google/android/gms/dynamic/b;)V

    return-void
.end method
