.class public final Lcom/google/android/gms/internal/ads/zzbcx;
.super Lcom/google/android/gms/internal/ads/zzgzu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbf;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzbcx;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/ads/zzben;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/ads/zzbep;

.field private zzi:I

.field private zzj:I

.field private zzk:I

.field private zzl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbcx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbcx;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbcx;->zzb:Lcom/google/android/gms/internal/ads/zzbcx;

    const-class v1, Lcom/google/android/gms/internal/ads/zzbcx;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgzu;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgzu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zze:Ljava/lang/String;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzk:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzl:I

    return-void
.end method

.method static synthetic zza()Lcom/google/android/gms/internal/ads/zzbcx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcx;->zzb:Lcom/google/android/gms/internal/ads/zzbcx;

    return-object v0
.end method

.method public static zzc()Lcom/google/android/gms/internal/ads/zzbcx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcx;->zzb:Lcom/google/android/gms/internal/ads/zzbcx;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzbcx;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zze:Ljava/lang/String;

    return-void
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzbcx;Lcom/google/android/gms/internal/ads/zzbep;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzh:Lcom/google/android/gms/internal/ads/zzbep;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzd:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbcx;->zzd:I

    return-void
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbcx;->zzb:Lcom/google/android/gms/internal/ads/zzbcx;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbcw;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbcw;-><init>(Lcom/google/android/gms/internal/ads/zzbbw;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbcx;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbcx;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xc

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbdc;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const/16 p3, 0x8

    const-string v0, "zzk"

    aput-object v0, p1, p3

    const/16 p3, 0x9

    aput-object p2, p1, p3

    const/16 p3, 0xa

    const-string v0, "zzl"

    aput-object v0, p1, p3

    const/16 p3, 0xb

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbcx;->zzb:Lcom/google/android/gms/internal/ads/zzbcx;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1004\u0002\u0004\u1009\u0003\u0005\u1004\u0004\u0006\u180c\u0005\u0007\u180c\u0006\u0008\u180c\u0007"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaR(Lcom/google/android/gms/internal/ads/zzhbe;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
