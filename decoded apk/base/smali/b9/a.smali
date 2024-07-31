.class public final Lb9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zzbol;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb9/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbol;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbol;-><init>(Landroid/content/Context;Lb9/b;)V

    iput-object v0, p0, Lb9/a;->a:Lcom/google/android/gms/internal/ads/zzbol;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lb9/a;->a:Lcom/google/android/gms/internal/ads/zzbol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbol;->zza()V

    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lb9/a;->a:Lcom/google/android/gms/internal/ads/zzbol;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbol;->zzb(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
