.class public final Lcom/google/android/gms/internal/ads/zzhfz;
.super Lcom/google/android/gms/internal/ads/zzgzu;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbf;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhfz;


# instance fields
.field private zzA:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzB:Lcom/google/android/gms/internal/ads/zzheh;

.field private zzC:Ljava/lang/String;

.field private zzD:Lcom/google/android/gms/internal/ads/zzhdz;

.field private zzE:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzF:Lcom/google/android/gms/internal/ads/zzhfa;

.field private zzG:I

.field private zzH:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzI:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzJ:J

.field private zzK:Lcom/google/android/gms/internal/ads/zzhfy;

.field private zzL:B

.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/gms/internal/ads/zzhed;

.field private zzk:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzl:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzm:Ljava/lang/String;

.field private zzn:Lcom/google/android/gms/internal/ads/zzhfj;

.field private zzo:Z

.field private zzp:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzq:Ljava/lang/String;

.field private zzr:Z

.field private zzs:Z

.field private zzt:Lcom/google/android/gms/internal/ads/zzgyl;

.field private zzu:Lcom/google/android/gms/internal/ads/zzhfr;

.field private zzv:Z

.field private zzw:Ljava/lang/String;

.field private zzx:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzy:Lcom/google/android/gms/internal/ads/zzhad;

.field private zzz:Lcom/google/android/gms/internal/ads/zzhfv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhfz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhfz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    const-class v1, Lcom/google/android/gms/internal/ads/zzhfz;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgzu;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgzu;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzL:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzk:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzl:Lcom/google/android/gms/internal/ads/zzhad;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzm:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzp:Lcom/google/android/gms/internal/ads/zzhad;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzq:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgyl;->zzb:Lcom/google/android/gms/internal/ads/zzgyl;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzt:Lcom/google/android/gms/internal/ads/zzgyl;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzw:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzx:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzy:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzA:Lcom/google/android/gms/internal/ads/zzhad;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzC:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzE:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzH:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaN()Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzI:Lcom/google/android/gms/internal/ads/zzhad;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzheb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaA()Lcom/google/android/gms/internal/ads/zzgzp;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzheb;

    return-object v0
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzhfz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/ads/zzhfz;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzg:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/ads/zzhfz;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzh:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/ads/zzhfz;Lcom/google/android/gms/internal/ads/zzhed;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzj:Lcom/google/android/gms/internal/ads/zzhed;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    return-void
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/ads/zzhfz;Lcom/google/android/gms/internal/ads/zzhfp;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzk:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhad;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaO(Lcom/google/android/gms/internal/ads/zzhad;)Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzk:Lcom/google/android/gms/internal/ads/zzhad;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzk:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic zzk(Lcom/google/android/gms/internal/ads/zzhfz;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzm:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/gms/internal/ads/zzhfz;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhfz;->zzm:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzm:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzm(Lcom/google/android/gms/internal/ads/zzhfz;Lcom/google/android/gms/internal/ads/zzhfj;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzn:Lcom/google/android/gms/internal/ads/zzhfj;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    return-void
.end method

.method static synthetic zzn(Lcom/google/android/gms/internal/ads/zzhfz;Lcom/google/android/gms/internal/ads/zzhfr;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzu:Lcom/google/android/gms/internal/ads/zzhfr;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    return-void
.end method

.method static synthetic zzo(Lcom/google/android/gms/internal/ads/zzhfz;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzx:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhad;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaO(Lcom/google/android/gms/internal/ads/zzhad;)Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzx:Lcom/google/android/gms/internal/ads/zzhad;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzx:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgxt;->zzav(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic zzp(Lcom/google/android/gms/internal/ads/zzhfz;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzy:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhad;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaO(Lcom/google/android/gms/internal/ads/zzhad;)Lcom/google/android/gms/internal/ads/zzhad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzy:Lcom/google/android/gms/internal/ads/zzhad;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzy:Lcom/google/android/gms/internal/ads/zzhad;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgxt;->zzav(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic zzq(Lcom/google/android/gms/internal/ads/zzhfz;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zze:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzd:I

    return-void
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzL:B

    return-object v3

    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzheb;

    invoke-direct {p1, v3}, Lcom/google/android/gms/internal/ads/zzheb;-><init>(Lcom/google/android/gms/internal/ads/zzhdp;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhfz;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzhfz;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x2b

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-string p2, "zzh"

    aput-object p2, p1, v4

    const-string p2, "zzi"

    aput-object p2, p1, v3

    const-string p2, "zzk"

    aput-object p2, p1, v2

    const-class p2, Lcom/google/android/gms/internal/ads/zzhfp;

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zze"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    sget-object p3, Lcom/google/android/gms/internal/ads/zzhfk;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    sget-object p3, Lcom/google/android/gms/internal/ads/zzhea;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-class p3, Lcom/google/android/gms/internal/ads/zzhgd;

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-string p3, "zzz"

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    const-string p3, "zzA"

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-class p3, Lcom/google/android/gms/internal/ads/zzhgj;

    aput-object p3, p1, p2

    const/16 p2, 0x1d

    const-string p3, "zzB"

    aput-object p3, p1, p2

    const/16 p2, 0x1e

    const-string p3, "zzC"

    aput-object p3, p1, p2

    const/16 p2, 0x1f

    const-string p3, "zzD"

    aput-object p3, p1, p2

    const/16 p2, 0x20

    const-string p3, "zzE"

    aput-object p3, p1, p2

    const/16 p2, 0x21

    const-class p3, Lcom/google/android/gms/internal/ads/zzhel;

    aput-object p3, p1, p2

    const/16 p2, 0x22

    const-string p3, "zzF"

    aput-object p3, p1, p2

    const/16 p2, 0x23

    const-string p3, "zzG"

    aput-object p3, p1, p2

    const/16 p2, 0x24

    sget-object p3, Lcom/google/android/gms/internal/ads/zzhft;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    aput-object p3, p1, p2

    const/16 p2, 0x25

    const-string p3, "zzH"

    aput-object p3, p1, p2

    const/16 p2, 0x26

    const-class p3, Lcom/google/android/gms/internal/ads/zzhfd;

    aput-object p3, p1, p2

    const/16 p2, 0x27

    const-string p3, "zzI"

    aput-object p3, p1, p2

    const/16 p2, 0x28

    const-class p3, Lcom/google/android/gms/internal/ads/zzhfg;

    aput-object p3, p1, p2

    const/16 p2, 0x29

    const-string p3, "zzJ"

    aput-object p3, p1, p2

    const/16 p2, 0x2a

    const-string p3, "zzK"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzhfz;->zzb:Lcom/google/android/gms/internal/ads/zzhfz;

    const-string p3, "\u0001!\u0000\u0001\u0001!!\u0000\t\u0001\u0001\u1008\u0002\u0002\u1008\u0003\u0003\u1008\u0004\u0004\u041b\u0005\u1007\u0008\u0006\u001a\u0007\u1008\t\u0008\u1007\n\t\u1007\u000b\n\u180c\u0000\u000b\u180c\u0001\u000c\u1009\u0005\r\u1008\u0006\u000e\u1009\u0007\u000f\u100a\u000c\u0010\u001b\u0011\u1009\r\u0012\u1007\u000e\u0013\u1008\u000f\u0014\u001a\u0015\u001a\u0016\u1009\u0010\u0017\u001b\u0018\u1009\u0011\u0019\u1008\u0012\u001a\u1009\u0013\u001b\u001b\u001c\u1009\u0014\u001d\u180c\u0015\u001e\u001b\u001f\u001b \u1002\u0016!\u1009\u0017"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzgzu;->zzaR(Lcom/google/android/gms/internal/ads/zzhbe;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzL:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzm:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final zzf()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhfz;->zzk:Lcom/google/android/gms/internal/ads/zzhad;

    return-object v0
.end method
