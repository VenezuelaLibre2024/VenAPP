.class public final synthetic Lcom/google/android/gms/ads/internal/util/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/d2;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/internal/util/j2;->l:Lcom/google/android/gms/internal/ads/zzftt;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->r()Lcom/google/android/gms/ads/internal/util/j2;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/d2;->a:Landroid/net/Uri;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/j2;->o(Landroid/net/Uri;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
