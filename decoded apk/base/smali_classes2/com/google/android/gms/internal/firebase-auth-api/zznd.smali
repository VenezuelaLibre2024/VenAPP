.class public final Lcom/google/android/gms/internal/firebase-auth-api/zznd;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzbt;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzos;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzbt;-><init>()V

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzos;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzng;->zza:[I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzos;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzuy$zza;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzcs;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)Lcom/google/android/gms/internal/firebase-auth-api/zzcs;

    :goto_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)Lcom/google/android/gms/internal/firebase-auth-api/zzos;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzos;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzos;Lcom/google/android/gms/internal/firebase-auth-api/zzcs;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzos;

    return-object p1
.end method

.method public final zza()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzos;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzos;->zze()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
