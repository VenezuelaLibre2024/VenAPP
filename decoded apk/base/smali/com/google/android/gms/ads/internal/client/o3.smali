.class public final Lcom/google/android/gms/ads/internal/client/o3;
.super Lcom/google/android/gms/ads/internal/client/w1;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/w1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/o3;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/o3;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/o3;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/o3;->b:Ljava/lang/String;

    return-object v0
.end method