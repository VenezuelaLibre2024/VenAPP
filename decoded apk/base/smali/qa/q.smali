.class public final enum Lqa/q;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqa/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/q;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final enum ABORT_ERR:Lqa/q;

.field public static final enum ATTESTATION_NOT_PRIVATE_ERR:Lqa/q;

.field public static final enum CONSTRAINT_ERR:Lqa/q;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum DATA_ERR:Lqa/q;

.field public static final enum ENCODING_ERR:Lqa/q;

.field public static final enum INVALID_STATE_ERR:Lqa/q;

.field public static final enum NETWORK_ERR:Lqa/q;

.field public static final enum NOT_ALLOWED_ERR:Lqa/q;

.field public static final enum NOT_SUPPORTED_ERR:Lqa/q;

.field public static final enum SECURITY_ERR:Lqa/q;

.field public static final enum TIMEOUT_ERR:Lqa/q;

.field public static final enum UNKNOWN_ERR:Lqa/q;

.field private static final synthetic zza:[Lqa/q;


# instance fields
.field private final zzb:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lqa/q;

    const-string v1, "NOT_SUPPORTED_ERR"

    const/4 v2, 0x0

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa/q;->NOT_SUPPORTED_ERR:Lqa/q;

    new-instance v1, Lqa/q;

    const-string v4, "INVALID_STATE_ERR"

    const/4 v5, 0x1

    const/16 v6, 0xb

    invoke-direct {v1, v4, v5, v6}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa/q;->INVALID_STATE_ERR:Lqa/q;

    new-instance v4, Lqa/q;

    const/16 v7, 0x12

    const-string v8, "SECURITY_ERR"

    const/4 v9, 0x2

    invoke-direct {v4, v8, v9, v7}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqa/q;->SECURITY_ERR:Lqa/q;

    new-instance v7, Lqa/q;

    const/16 v8, 0x13

    const-string v10, "NETWORK_ERR"

    const/4 v11, 0x3

    invoke-direct {v7, v10, v11, v8}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lqa/q;->NETWORK_ERR:Lqa/q;

    new-instance v8, Lqa/q;

    const/16 v10, 0x14

    const-string v12, "ABORT_ERR"

    const/4 v13, 0x4

    invoke-direct {v8, v12, v13, v10}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lqa/q;->ABORT_ERR:Lqa/q;

    new-instance v10, Lqa/q;

    const/16 v12, 0x17

    const-string v14, "TIMEOUT_ERR"

    const/4 v15, 0x5

    invoke-direct {v10, v14, v15, v12}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lqa/q;->TIMEOUT_ERR:Lqa/q;

    new-instance v12, Lqa/q;

    const/16 v14, 0x1b

    const-string v15, "ENCODING_ERR"

    const/4 v13, 0x6

    invoke-direct {v12, v15, v13, v14}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lqa/q;->ENCODING_ERR:Lqa/q;

    new-instance v14, Lqa/q;

    const/16 v15, 0x1c

    const-string v13, "UNKNOWN_ERR"

    const/4 v11, 0x7

    invoke-direct {v14, v13, v11, v15}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lqa/q;->UNKNOWN_ERR:Lqa/q;

    new-instance v13, Lqa/q;

    const/16 v15, 0x1d

    const-string v11, "CONSTRAINT_ERR"

    const/16 v9, 0x8

    invoke-direct {v13, v11, v9, v15}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lqa/q;->CONSTRAINT_ERR:Lqa/q;

    new-instance v11, Lqa/q;

    const-string v15, "DATA_ERR"

    const/16 v9, 0x1e

    invoke-direct {v11, v15, v3, v9}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lqa/q;->DATA_ERR:Lqa/q;

    new-instance v9, Lqa/q;

    const/16 v15, 0x23

    const-string v3, "NOT_ALLOWED_ERR"

    const/16 v5, 0xa

    invoke-direct {v9, v3, v5, v15}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lqa/q;->NOT_ALLOWED_ERR:Lqa/q;

    new-instance v3, Lqa/q;

    const-string v15, "ATTESTATION_NOT_PRIVATE_ERR"

    const/16 v5, 0x24

    invoke-direct {v3, v15, v6, v5}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqa/q;->ATTESTATION_NOT_PRIVATE_ERR:Lqa/q;

    const/16 v5, 0xc

    new-array v5, v5, [Lqa/q;

    aput-object v0, v5, v2

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v4, v5, v0

    const/4 v0, 0x3

    aput-object v7, v5, v0

    const/4 v0, 0x4

    aput-object v8, v5, v0

    const/4 v0, 0x5

    aput-object v10, v5, v0

    const/4 v0, 0x6

    aput-object v12, v5, v0

    const/4 v0, 0x7

    aput-object v14, v5, v0

    const/16 v0, 0x8

    aput-object v13, v5, v0

    const/16 v0, 0x9

    aput-object v11, v5, v0

    const/16 v0, 0xa

    aput-object v9, v5, v0

    aput-object v3, v5, v6

    sput-object v5, Lqa/q;->zza:[Lqa/q;

    new-instance v0, Lqa/f2;

    invoke-direct {v0}, Lqa/f2;-><init>()V

    sput-object v0, Lqa/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqa/q;->zzb:I

    return-void
.end method

.method public static h(I)Lqa/q;
    .locals 5

    invoke-static {}, Lqa/q;->values()[Lqa/q;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lqa/q;->zzb:I

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lqa/q$a;

    invoke-direct {v0, p0}, Lqa/q$a;-><init>(I)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/q;
    .locals 1

    const-class v0, Lqa/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/q;

    return-object p0
.end method

.method public static values()[Lqa/q;
    .locals 1

    sget-object v0, Lqa/q;->zza:[Lqa/q;

    invoke-virtual {v0}, [Lqa/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/q;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lqa/q;->zzb:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lqa/q;->zzb:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
