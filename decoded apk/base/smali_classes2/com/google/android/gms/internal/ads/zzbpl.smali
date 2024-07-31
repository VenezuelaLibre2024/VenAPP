.class public final Lcom/google/android/gms/internal/ads/zzbpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/a;


# instance fields
.field private final zza:Le9/a$a;

.field private final zzb:Ljava/lang/String;

.field private final zzc:I


# direct methods
.method public constructor <init>(Le9/a$a;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zza:Le9/a$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zzb:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zzc:I

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitializationState()Le9/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zza:Le9/a$a;

    return-object v0
.end method

.method public final getLatency()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbpl;->zzc:I

    return v0
.end method
