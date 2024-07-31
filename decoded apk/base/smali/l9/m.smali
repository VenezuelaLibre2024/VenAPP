.class public final Ll9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/android/gms/internal/ads/zzebb;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzebb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/m;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll9/m;->b:Lcom/google/android/gms/internal/ads/zzebb;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 2

    iget-object v0, p0, Ll9/m;->b:Lcom/google/android/gms/internal/ads/zzebb;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbze;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzebb;->zzb(Lcom/google/android/gms/internal/ads/zzbze;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ll9/l;

    invoke-direct {v1, p1}, Ll9/l;-><init>(Lcom/google/android/gms/internal/ads/zzbze;)V

    iget-object p1, p0, Ll9/m;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzgen;->zzn(Lcom/google/common/util/concurrent/f;Lcom/google/android/gms/internal/ads/zzgdu;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
