.class public final Lcom/google/android/gms/internal/ads/zzfnk;
.super Lcom/google/android/gms/internal/ads/zzgzu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbf;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzfnk;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/ads/zzhad;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfnk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfnk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfnk;->zzb:Lcom/google/android/gms/internal/ads/zzfnk;

    const-class v1, Lcom/google/android/gms/internal/ads/zzfnk;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgzu;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgzu;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/ads/zzfnh;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfnk;->zzb:Lcom/google/android/gms/internal/ads/zzfnk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaA()Lcom/google/android/gms/internal/ads/zzgzp;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfnh;

    return-object v0
.end method

.method static synthetic zzd()Lcom/google/android/gms/internal/ads/zzfnk;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfnk;->zzb:Lcom/google/android/gms/internal/ads/zzfnk;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzfnk;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    return-void
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/ads/zzfnk;Lcom/google/android/gms/internal/ads/zzfnj;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhad;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaO(Lcom/google/android/gms/internal/ads/zzhad;)Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnk;->zzd:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfnk;->zzb:Lcom/google/android/gms/internal/ads/zzfnk;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfnh;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzfnh;-><init>(Lcom/google/android/gms/internal/ads/zzfng;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfnk;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfnk;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, Lcom/google/android/gms/internal/ads/zzfnj;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzfnk;->zzb:Lcom/google/android/gms/internal/ads/zzfnk;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaR(Lcom/google/android/gms/internal/ads/zzhbe;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
