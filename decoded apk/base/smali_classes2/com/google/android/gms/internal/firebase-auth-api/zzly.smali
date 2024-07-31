.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzly;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbg;

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzbg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbg;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbp;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzbp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbg;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbp;

    return-void
.end method


# virtual methods
.method public final zza([B[B)[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzbg;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbg;->zza([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzly;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbp;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzbp;->zza([B[B)[B

    move-result-object p1

    return-object p1
.end method
