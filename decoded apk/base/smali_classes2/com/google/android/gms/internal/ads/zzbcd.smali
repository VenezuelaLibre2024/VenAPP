.class public final Lcom/google/android/gms/internal/ads/zzbcd;
.super Lcom/google/android/gms/internal/ads/zzgzu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbf;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzbcd;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/ads/zzbch;

.field private zzg:Lcom/google/android/gms/internal/ads/zzbcj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbcd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbcd;->zzb:Lcom/google/android/gms/internal/ads/zzbcd;

    const-class v1, Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgzu;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgzu;-><init>()V

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzbcc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcd;->zzb:Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaA()Lcom/google/android/gms/internal/ads/zzgzp;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbcc;

    return-object v0
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzbcd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcd;->zzb:Lcom/google/android/gms/internal/ads/zzbcd;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzbcd;Lcom/google/android/gms/internal/ads/zzbch;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzf:Lcom/google/android/gms/internal/ads/zzbch;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    return-void
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzbcd;Lcom/google/android/gms/internal/ads/zzbcj;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzg:Lcom/google/android/gms/internal/ads/zzbcj;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    return-void
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/ads/zzbcd;I)V
    .locals 1

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zze:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbcd;->zzd:I

    return-void
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbcd;->zzb:Lcom/google/android/gms/internal/ads/zzbcd;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbcc;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbcc;-><init>(Lcom/google/android/gms/internal/ads/zzbbw;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbcd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbcd;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbcf;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbcd;->zzb:Lcom/google/android/gms/internal/ads/zzbcd;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1009\u0002"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaR(Lcom/google/android/gms/internal/ads/zzhbe;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
