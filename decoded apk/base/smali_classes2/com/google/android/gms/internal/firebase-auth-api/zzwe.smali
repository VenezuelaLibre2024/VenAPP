.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzwe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzbg;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

.field private final zzc:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxt;->zza([B)Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;-><init>([BLcom/google/android/gms/internal/firebase-auth-api/zzxt;)V

    return-void
.end method

.method private constructor <init>([BLcom/google/android/gms/internal/firebase-auth-api/zzxt;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzif$zza;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzht;-><init>([BZ)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzxt;->zzb()[B

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzc:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final zza([B[B)[B
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzc:[B

    array-length v1, v0

    const/16 v2, 0xc

    if-nez v1, :cond_0

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzht;->zza([B[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpf;->zza([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzc:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzht;->zza([B[B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb([B[B)[B
    .locals 4

    const/16 v0, 0xc

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzou;->zza(I)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzc:[B

    array-length v2, v1

    if-nez v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzht;->zzb([B[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v2, 0x2

    new-array v2, v2, [[B

    const/4 v3, 0x0

    aput-object v1, v2, v3

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzwe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzht;

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzht;->zzb([B[B[B)[B

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzwg;->zza([[B)[B

    move-result-object p1

    return-object p1
.end method
