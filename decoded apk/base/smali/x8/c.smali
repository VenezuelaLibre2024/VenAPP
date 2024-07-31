.class public final enum Lx8/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx8/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum APP_OPEN_AD:Lx8/c;

.field public static final enum BANNER:Lx8/c;

.field public static final enum INTERSTITIAL:Lx8/c;

.field public static final enum NATIVE:Lx8/c;

.field public static final enum REWARDED:Lx8/c;

.field public static final enum REWARDED_INTERSTITIAL:Lx8/c;

.field private static final synthetic zza:[Lx8/c;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lx8/c;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx8/c;->BANNER:Lx8/c;

    new-instance v1, Lx8/c;

    const-string v3, "INTERSTITIAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx8/c;->INTERSTITIAL:Lx8/c;

    new-instance v3, Lx8/c;

    const-string v5, "REWARDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lx8/c;->REWARDED:Lx8/c;

    new-instance v5, Lx8/c;

    const-string v7, "REWARDED_INTERSTITIAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lx8/c;->REWARDED_INTERSTITIAL:Lx8/c;

    new-instance v7, Lx8/c;

    const-string v9, "NATIVE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lx8/c;->NATIVE:Lx8/c;

    new-instance v9, Lx8/c;

    const-string v11, "APP_OPEN_AD"

    const/4 v12, 0x5

    const/4 v13, 0x6

    invoke-direct {v9, v11, v12, v13}, Lx8/c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lx8/c;->APP_OPEN_AD:Lx8/c;

    new-array v11, v13, [Lx8/c;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lx8/c;->zza:[Lx8/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lx8/c;->zzb:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx8/c;
    .locals 1

    const-class v0, Lx8/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx8/c;

    return-object p0
.end method

.method public static values()[Lx8/c;
    .locals 1

    sget-object v0, Lx8/c;->zza:[Lx8/c;

    invoke-virtual {v0}, [Lx8/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx8/c;

    return-object v0
.end method
