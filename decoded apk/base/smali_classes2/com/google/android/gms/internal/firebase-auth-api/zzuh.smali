.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzuh;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzajc;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzakp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzajc<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzuh;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;",
        ">;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakp;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

.field private static volatile zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakw<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzuh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzajc;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc;-><init>()V

    return-void
.end method

.method private final zza(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzf:I

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzub;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzub;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zze:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzuh;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zza(I)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzuh;Lcom/google/android/gms/internal/firebase-auth-api/zzub;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzub;)V

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc;->zzm()Lcom/google/android/gms/internal/firebase-auth-api/zzajc$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;

    return-object v0
.end method

.method static synthetic zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzuh;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/firebase-auth-api/zzuh;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzf:I

    return v0
.end method

.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakw;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakw;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzajc$zzc;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc$zzc;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzajc;)V

    sput-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakw;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002\u000b"

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzakn;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzuh$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzui;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzub;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzuh;->zze:I

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzub;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzub;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzub;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzub;

    :cond_0
    return-object v0
.end method