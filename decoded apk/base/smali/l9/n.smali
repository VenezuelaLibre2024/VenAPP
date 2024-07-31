.class public final Ll9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhhd;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zzhhu;

.field private final b:Lcom/google/android/gms/internal/ads/zzhhu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhhu;Lcom/google/android/gms/internal/ads/zzhhu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/n;->a:Lcom/google/android/gms/internal/ads/zzhhu;

    iput-object p2, p0, Ll9/n;->b:Lcom/google/android/gms/internal/ads/zzhhu;

    return-void
.end method


# virtual methods
.method public final a()Ll9/m;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcep;->zza:Lcom/google/android/gms/internal/ads/zzgey;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhhl;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ll9/n;->b:Lcom/google/android/gms/internal/ads/zzhhu;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzebc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzebc;->zza()Lcom/google/android/gms/internal/ads/zzebb;

    move-result-object v1

    new-instance v2, Ll9/m;

    invoke-direct {v2, v0, v1}, Ll9/m;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzebb;)V

    return-object v2
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll9/n;->a()Ll9/m;

    move-result-object v0

    return-object v0
.end method
