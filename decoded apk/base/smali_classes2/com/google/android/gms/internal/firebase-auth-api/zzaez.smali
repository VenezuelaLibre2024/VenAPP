.class public final enum Lcom/google/android/gms/internal/firebase-auth-api/zzaez;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaez;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

.field private static final enum zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

.field private static final synthetic zzc:[Lcom/google/android/gms/internal/firebase-auth-api/zzaez;


# instance fields
.field private final zzd:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    const-string v1, "refresh_token"

    const-string v2, "REFRESH_TOKEN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    const-string v2, "authorization_code"

    const-string v4, "AUTHORIZATION_CODE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zzc:[Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/firebase-auth-api/zzaez;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zzc:[Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/firebase-auth-api/zzaez;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaez;->zzd:Ljava/lang/String;

    return-object v0
.end method
